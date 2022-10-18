package typings.word

import typings.cfb.mod.CFBContainer
import typings.node.bufferMod.global.Buffer
import typings.word.distTypingsTypesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsCodecsMod {
  
  @JSImport("word/dist/typings/codecs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCfb(file: CFBContainer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_cfb")(file.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def parseZip(file: CFBContainer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_zip")(file.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def read(data: Buffer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def readFile(path: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def readStr(data: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read_str")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
}
