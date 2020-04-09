package typings.webpackbar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you plan to provide your own reporter,
  * don't forget to setting fancy and basic options to false to prevent conflicts.
  * A reporter should be instance of a class or plain object and functions for special hooks.
  * It is not necessary to implement all functions, webpackbar only calls those that exists
  */
trait Reporter extends js.Object {
  var afterAllDone: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called when _all_ compiles finished
    */
  var allDone: js.UndefOr[ReporterContextFunc] = js.undefined
  var beforeAllDone: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called when a file changed on watch mode
    */
  var change: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called when compile finished
    */
  var done: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called when build progress updated
    */
  var progress: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called when (re)compile is started
    */
  var start: js.UndefOr[ReporterContextFunc] = js.undefined
  /**
    * Called after each progress update
    */
  var update: js.UndefOr[ReporterContextFunc] = js.undefined
}

object Reporter {
  @scala.inline
  def apply(
    afterAllDone: /* context */ WebpackBar => Unit = null,
    allDone: /* context */ WebpackBar => Unit = null,
    beforeAllDone: /* context */ WebpackBar => Unit = null,
    change: /* context */ WebpackBar => Unit = null,
    done: /* context */ WebpackBar => Unit = null,
    progress: /* context */ WebpackBar => Unit = null,
    start: /* context */ WebpackBar => Unit = null,
    update: /* context */ WebpackBar => Unit = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    if (afterAllDone != null) __obj.updateDynamic("afterAllDone")(js.Any.fromFunction1(afterAllDone))
    if (allDone != null) __obj.updateDynamic("allDone")(js.Any.fromFunction1(allDone))
    if (beforeAllDone != null) __obj.updateDynamic("beforeAllDone")(js.Any.fromFunction1(beforeAllDone))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1(done))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[Reporter]
  }
}

