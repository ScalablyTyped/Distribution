package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionList extends js.Object {
  /**
    * This list it not complete. Further typing results in recomputing this list.
    */
  var isIncomplete: Boolean
  /**
    * The completion items.
    */
  var items: js.Array[CompletionItem]
}

object CompletionList {
  @scala.inline
  def apply(isIncomplete: Boolean, items: js.Array[CompletionItem]): CompletionList = {
    val __obj = js.Dynamic.literal(isIncomplete = isIncomplete, items = items)
  
    __obj.asInstanceOf[CompletionList]
  }
}

