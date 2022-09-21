package typings.uuidParse

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(id: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: js.Array[Any], offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def unparse(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(buffer: Buffer, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
}
