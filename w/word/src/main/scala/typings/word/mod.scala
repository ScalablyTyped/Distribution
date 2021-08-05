package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(data: Buffer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def readFile(path: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def toText(doc: WJSDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("to_text")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toText(doc: WJSDoc, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("to_text")(doc.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
