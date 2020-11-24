package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/XML", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  
  @JSName("parse_str")
  def parseStr(data: String): WJSDoc = js.native
  
  def read(data: Buffer): WJSDoc = js.native
}
