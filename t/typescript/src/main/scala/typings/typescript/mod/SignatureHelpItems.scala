package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of signature help items, and the preferred item that should be selected.
  */
@js.native
trait SignatureHelpItems extends js.Object {
  var applicableSpan: TextSpan = js.native
  var argumentCount: Double = js.native
  var argumentIndex: Double = js.native
  var items: js.Array[SignatureHelpItem] = js.native
  var selectedItemIndex: Double = js.native
}

object SignatureHelpItems {
  @scala.inline
  def apply(
    applicableSpan: TextSpan,
    argumentCount: Double,
    argumentIndex: Double,
    items: js.Array[SignatureHelpItem],
    selectedItemIndex: Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan.asInstanceOf[js.Any], argumentCount = argumentCount.asInstanceOf[js.Any], argumentIndex = argumentIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItems]
  }
  @scala.inline
  implicit class SignatureHelpItemsOps[Self <: SignatureHelpItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicableSpan(value: TextSpan): Self = this.set("applicableSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentCount(value: Double): Self = this.set("argumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentIndex(value: Double): Self = this.set("argumentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: SignatureHelpItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SignatureHelpItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
  }
  
}

