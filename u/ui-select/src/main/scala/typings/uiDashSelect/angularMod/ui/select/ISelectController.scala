package typings.uiDashSelect.angularMod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectController extends js.Object {
  var activeIndex: Double = js.native
  var clickTriggeredSelect: Boolean = js.native
  var closeOnSelect: Boolean = js.native
  var disabled: Boolean = js.native
  var dropdownPosition: String = js.native
  var focus: Boolean = js.native
  var isGrouped: js.UndefOr[Boolean] = js.native
  var itemProperty: js.UndefOr[String] = js.native
  var open: Boolean = js.native
  var parserResult: js.UndefOr[IRepeatExpression] = js.native
  var paste: js.UndefOr[IPasteFn] = js.native
  var placeholder: String = js.native
  var refreshDelay: Double = js.native
  var refreshing: Boolean = js.native
  var removeSelected: Boolean = js.native
  var resetSearchInput: Boolean = js.native
  var search: String = js.native
  var searchEnabled: Boolean = js.native
  var skipFocusser: Boolean = js.native
  var sortable: Boolean = js.native
  var spinnerClass: String = js.native
  var spinnerEnabled: Boolean = js.native
  def close(): Unit = js.native
  def close(skipFocusser: Boolean): Unit = js.native
  def isEmpty(): Boolean = js.native
  def isLocked(): Boolean = js.native
  def setFocus(): Unit = js.native
  def sizeSearchInput(): Unit = js.native
}

