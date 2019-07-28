package typings.vueDashSelect.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownClasses extends js.Object {
  var disabled: Boolean
  var loading: Boolean
  var open: Boolean
  var rtl: Boolean
  var searchable: Boolean
  var searching: Boolean
  var single: Boolean
  var unsearchable: Boolean
}

object DropdownClasses {
  @scala.inline
  def apply(
    disabled: Boolean,
    loading: Boolean,
    open: Boolean,
    rtl: Boolean,
    searchable: Boolean,
    searching: Boolean,
    single: Boolean,
    unsearchable: Boolean
  ): DropdownClasses = {
    val __obj = js.Dynamic.literal(disabled = disabled, loading = loading, open = open, rtl = rtl, searchable = searchable, searching = searching, single = single, unsearchable = unsearchable)
  
    __obj.asInstanceOf[DropdownClasses]
  }
}

