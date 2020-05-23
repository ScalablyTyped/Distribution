package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxItems extends js.Object {
  /**
    * Maximum number of items.
    * @defaultValue 100
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of items.
    * @defaultValue 1
    */
  var minItems: js.UndefOr[Double] = js.undefined
  var numberOfItems: Double
  def onNumberOfItemsChange(newNumber: Double): Unit
}

object MaxItems {
  @scala.inline
  def apply(
    numberOfItems: Double,
    onNumberOfItemsChange: Double => Unit,
    maxItems: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined
  ): MaxItems = {
    val __obj = js.Dynamic.literal(numberOfItems = numberOfItems.asInstanceOf[js.Any], onNumberOfItemsChange = js.Any.fromFunction1(onNumberOfItemsChange))
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxItems]
  }
}

