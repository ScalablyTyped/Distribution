package typings.word

import typings.node.bufferMod.global.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("word/dist/typings/codecs/HTML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseStr(data: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_str")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def read(data: Buffer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
}
