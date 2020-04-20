package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a range of indexes or keys in an ISelection.
  **/
trait ISelectionRange extends js.Object {
  //#region Properties
  /**
    * Gets or sets the index of the first item in the range.
    **/
  var firstIndex: Double
  /**
    * Gets or sets the key of the first item in the range.
    **/
  var firstKey: js.Any
  /**
    * Gets or sets the index of the last item in the range.
    **/
  var lastIndex: Double
  /**
    * Gets or sets of the key of the last item in the range.
    **/
  var lastKey: js.Any
}

object ISelectionRange {
  @scala.inline
  def apply(firstIndex: Double, firstKey: js.Any, lastIndex: Double, lastKey: js.Any): ISelectionRange = {
    val __obj = js.Dynamic.literal(firstIndex = firstIndex.asInstanceOf[js.Any], firstKey = firstKey.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], lastKey = lastKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionRange]
  }
}

