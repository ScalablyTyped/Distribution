package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.CompletionItemTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueSetArray extends js.Object {
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[CompletionItemTag]
}

object AnonValueSetArray {
  @scala.inline
  def apply(valueSet: js.Array[CompletionItemTag]): AnonValueSetArray = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueSetArray]
  }
}

