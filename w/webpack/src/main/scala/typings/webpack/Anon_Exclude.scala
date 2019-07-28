package typings.webpack

import typings.webpack.webpackMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  var include: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
  var test: js.UndefOr[Condition | js.Array[Condition]] = js.undefined
}

object Anon_Exclude {
  @scala.inline
  def apply(
    exclude: Condition | js.Array[Condition] = null,
    include: Condition | js.Array[Condition] = null,
    test: Condition | js.Array[Condition] = null
  ): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exclude]
  }
}

