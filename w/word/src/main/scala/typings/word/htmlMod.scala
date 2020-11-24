package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("word/dist/typings/codecs/HTML", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  
  @JSName("parse_str")
  def parseStr(data: String): WJSDoc = js.native
  
  def read(data: Buffer): WJSDoc = js.native
}
