package typings.word

import typings.cfb.mod.CFBContainer
import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/DOC", JSImport.Namespace)
@js.native
object docMod extends js.Object {
  
  @JSName("parse_cfb")
  def parseCfb(file: CFBContainer): WJSDoc = js.native
  
  def read(data: Buffer): WJSDoc = js.native
  
  def readFile(filePath: String): WJSDoc = js.native
}
