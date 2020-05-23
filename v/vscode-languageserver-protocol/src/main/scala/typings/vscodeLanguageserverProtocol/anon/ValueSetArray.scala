package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.CompletionItemTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSetArray extends js.Object {
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[CompletionItemTag]
}

object ValueSetArray {
  @scala.inline
  def apply(valueSet: js.Array[CompletionItemTag]): ValueSetArray = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetArray]
  }
}

