package typings.word

import typings.node.Buffer
import typings.word.typesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("word/dist/typings/codecs/HTML", "parse_str")
  @js.native
  def parseStr(data: String): WJSDoc = js.native
  
  @JSImport("word/dist/typings/codecs/HTML", "read")
  @js.native
  def read(data: Buffer): WJSDoc = js.native
}
