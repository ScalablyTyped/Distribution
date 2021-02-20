package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object txtMod {
  
  @JSImport("word/dist/typings/codecs/TXT", "parse_str")
  @js.native
  def parseStr(data: String): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs/TXT", "write_buf")
  @js.native
  def writeBuf(doc: WJSDoc): Buffer = js.native
  @JSImport("word/dist/typings/codecs/TXT", "write_buf")
  @js.native
  def writeBuf(doc: WJSDoc, opts: js.Any): Buffer = js.native
  
  @JSImport("word/dist/typings/codecs/TXT", "write_str")
  @js.native
  def writeStr(doc: WJSDoc): String = js.native
  @JSImport("word/dist/typings/codecs/TXT", "write_str")
  @js.native
  def writeStr(doc: WJSDoc, opts: js.Any): String = js.native
}
