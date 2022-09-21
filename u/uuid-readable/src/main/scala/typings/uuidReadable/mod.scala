package typings.uuidReadable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-readable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(readable: String, uuid: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(readable.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(uuid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(uuid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inverse(readable: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(readable.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def short(uuid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(uuid.asInstanceOf[js.Any]).asInstanceOf[String]
}
