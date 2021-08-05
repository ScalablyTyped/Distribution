package typings.word

import typings.cfb.mod.CFBContainer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docxMod {
  
  @JSImport("word/dist/typings/codecs/DOCX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCfb(file: CFBContainer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_cfb")(file.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
}
