package typings
package atUifabricUtilitiesLib.libSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/selection/Selection", "Selection")
@js.native
class Selection ()
  extends atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.ISelection {
  def this(options: ISelectionOptions) = this()
  var _anchoredIndex: js.Any = js.native
  var _canSelectItem: js.Any = js.native
  var _change: js.Any = js.native
  var _changeEventSuppressionCount: js.Any = js.native
  var _exemptedCount: js.Any = js.native
  var _exemptedIndices: js.Any = js.native
  var _getKey: js.Any = js.native
  var _hasChanged: js.Any = js.native
  var _isAllSelected: js.Any = js.native
  var _isModal: js.Any = js.native
  var _items: js.Any = js.native
  var _keyToIndexMap: js.Any = js.native
  var _onSelectionChanged: js.Any = js.native
  var _selectedIndices: js.Any = js.native
  var _selectedItems: js.Any = js.native
  var _setAllSelected: js.Any = js.native
  var _unselectableCount: js.Any = js.native
  var _unselectableIndices: js.Any = js.native
  var _updateCount: js.Any = js.native
  def getKey(item: atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey): java.lang.String = js.native
  def getKey(item: atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey, index: scala.Double): java.lang.String = js.native
  @JSName("isModal")
  def isModal_MSelection(): scala.Boolean = js.native
  /**
    * Selection needs the items, call this method to set them. If the set
    * of items is the same, this will re-evaluate selection and index maps.
    * Otherwise, shouldClear should be set to true, so that selection is
    * cleared.
    */
  def setItems(items: js.Array[atUifabricUtilitiesLib.libSelectionSelectionDotTypesMod.IObjectWithKey]): scala.Unit = js.native
  @JSName("setModal")
  def setModal_MSelection(isModal: scala.Boolean): scala.Unit = js.native
}

