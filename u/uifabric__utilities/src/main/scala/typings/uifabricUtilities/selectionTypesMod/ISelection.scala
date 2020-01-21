package typings.uifabricUtilities.selectionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelection[TItem] extends js.Object {
  var count: Double = js.native
  var isModal: js.UndefOr[js.Function0[Boolean]] = js.native
  var mode: SelectionMode = js.native
  var setModal: js.UndefOr[js.Function1[/* isModal */ Boolean, Unit]] = js.native
  def canSelectItem(item: TItem): Boolean = js.native
  def canSelectItem(item: TItem, index: Double): Boolean = js.native
  def getItems(): js.Array[TItem] = js.native
  def getSelectedCount(): Double = js.native
  def getSelectedIndices(): js.Array[Double] = js.native
  def getSelection(): js.Array[TItem] = js.native
  def isAllSelected(): Boolean = js.native
  def isIndexSelected(index: Double): Boolean = js.native
  def isKeySelected(key: String): Boolean = js.native
  def isRangeSelected(fromIndex: Double, count: Double): Boolean = js.native
  def selectToIndex(index: Double): Unit = js.native
  def selectToIndex(index: Double, clearSelection: Boolean): Unit = js.native
  def selectToKey(key: String): Unit = js.native
  def selectToKey(key: String, clearSelection: Boolean): Unit = js.native
  def setAllSelected(isAllSelected: Boolean): Unit = js.native
  def setChangeEvents(isEnabled: Boolean): Unit = js.native
  def setChangeEvents(isEnabled: Boolean, suppressChange: Boolean): Unit = js.native
  def setIndexSelected(index: Double, isSelected: Boolean, shouldAnchor: Boolean): Unit = js.native
  def setItems(items: js.Array[TItem], shouldClear: Boolean): Unit = js.native
  def setKeySelected(key: String, isSelected: Boolean, shouldAnchor: Boolean): Unit = js.native
  def toggleAllSelected(): Unit = js.native
  def toggleIndexSelected(index: Double): Unit = js.native
  def toggleKeySelected(key: String): Unit = js.native
  def toggleRangeSelected(fromIndex: Double, count: Double): Unit = js.native
}

