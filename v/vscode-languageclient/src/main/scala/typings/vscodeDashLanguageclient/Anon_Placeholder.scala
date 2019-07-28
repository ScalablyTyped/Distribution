package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Placeholder extends js.Object {
  var placeholder: String
  var range: Range
}

object Anon_Placeholder {
  @scala.inline
  def apply(placeholder: String, range: Range): Anon_Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder, range = range)
  
    __obj.asInstanceOf[Anon_Placeholder]
  }
}

