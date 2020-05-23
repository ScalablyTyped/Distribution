package typings.tap.mod.Options

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends Assert {
  var autoend: js.UndefOr[Boolean] = js.undefined
  var bail: js.UndefOr[Boolean] = js.undefined
  var buffered: js.UndefOr[Boolean] = js.undefined
  var grep: js.UndefOr[js.Array[RegExp]] = js.undefined
  var jobs: js.UndefOr[Double] = js.undefined
  var only: js.UndefOr[Boolean] = js.undefined
  var runOnly: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Test {
  @scala.inline
  def apply(
    autoend: js.UndefOr[Boolean] = js.undefined,
    bail: js.UndefOr[Boolean] = js.undefined,
    buffered: js.UndefOr[Boolean] = js.undefined,
    diagnostic: js.UndefOr[Boolean] = js.undefined,
    grep: js.Array[RegExp] = null,
    jobs: js.UndefOr[Double] = js.undefined,
    only: js.UndefOr[Boolean] = js.undefined,
    runOnly: js.UndefOr[Boolean] = js.undefined,
    skip: Boolean | String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    todo: Boolean | String = null
  ): Test = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoend)) __obj.updateDynamic("autoend")(autoend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnostic)) __obj.updateDynamic("diagnostic")(diagnostic.get.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(jobs)) __obj.updateDynamic("jobs")(jobs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnly)) __obj.updateDynamic("runOnly")(runOnly.get.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (todo != null) __obj.updateDynamic("todo")(todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

