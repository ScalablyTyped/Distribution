package typings.wordsToNumbers

import typings.wordsToNumbers.anon.Fuzzy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("words-to-numbers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(text: String): String | Double | Null = js.native
  def default(text: String, options: Fuzzy): String | Double | Null = js.native
  
  def wordsToNumbers(text: String): String | Double | Null = js.native
  def wordsToNumbers(text: String, options: Fuzzy): String | Double | Null = js.native
}
