package typings.word

import typings.cfb.mod.CFBContainer
import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs", JSImport.Namespace)
@js.native
object codecsMod extends js.Object {
  
  @JSName("parse_cfb")
  def parseCfb(file: CFBContainer): WJSDoc = js.native
  
  @JSName("parse_zip")
  def parseZip(file: CFBContainer): WJSDoc = js.native
  
  def read(data: Buffer): WJSDoc = js.native
  
  def readFile(path: String): WJSDoc = js.native
  
  @JSName("read_str")
  def readStr(data: String): WJSDoc = js.native
}
