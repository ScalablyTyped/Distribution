package typings.word

import typings.cfb.mod.CFBContainer
import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docMod {
  
  @JSImport("word/dist/typings/codecs/DOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCfb(file: CFBContainer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_cfb")(file.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def read(data: Buffer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def readFile(filePath: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
}
