package typings.tap.mod.Options

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assert extends Bag {
  var diagnostic: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Boolean | String] = js.undefined
  var todo: js.UndefOr[Boolean | String] = js.undefined
}

object Assert {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    diagnostic: js.UndefOr[Boolean] = js.undefined,
    skip: Boolean | String = null,
    todo: Boolean | String = null
  ): Assert = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(diagnostic)) __obj.updateDynamic("diagnostic")(diagnostic.get.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (todo != null) __obj.updateDynamic("todo")(todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assert]
  }
}

