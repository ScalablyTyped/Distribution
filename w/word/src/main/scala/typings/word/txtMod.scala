package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/TXT", JSImport.Namespace)
@js.native
object txtMod extends js.Object {
  
  @JSName("parse_str")
  def parseStr(data: String): WJSDoc = js.native
  
  @JSName("write_buf")
  def writeBuf(doc: WJSDoc): Buffer = js.native
  @JSName("write_buf")
  def writeBuf(doc: WJSDoc, opts: js.Any): Buffer = js.native
  
  @JSName("write_str")
  def writeStr(doc: WJSDoc): String = js.native
  @JSName("write_str")
  def writeStr(doc: WJSDoc, opts: js.Any): String = js.native
}
