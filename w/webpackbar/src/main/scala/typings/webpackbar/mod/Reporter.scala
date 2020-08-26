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
@js.native
trait Reporter extends js.Object {
  var afterAllDone: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when _all_ compiles finished
    */
  var allDone: js.UndefOr[ReporterContextFunc] = js.native
  var beforeAllDone: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when a file changed on watch mode
    */
  var change: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when compile finished
    */
  var done: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when build progress updated
    */
  var progress: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called when (re)compile is started
    */
  var start: js.UndefOr[ReporterContextFunc] = js.native
  /**
    * Called after each progress update
    */
  var update: js.UndefOr[ReporterContextFunc] = js.native
}

object Reporter {
  @scala.inline
  def apply(): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterAllDone(value: /* context */ WebpackBar => Unit): Self = this.set("afterAllDone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterAllDone: Self = this.set("afterAllDone", js.undefined)
    @scala.inline
    def setAllDone(value: /* context */ WebpackBar => Unit): Self = this.set("allDone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAllDone: Self = this.set("allDone", js.undefined)
    @scala.inline
    def setBeforeAllDone(value: /* context */ WebpackBar => Unit): Self = this.set("beforeAllDone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeAllDone: Self = this.set("beforeAllDone", js.undefined)
    @scala.inline
    def setChange(value: /* context */ WebpackBar => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDone(value: /* context */ WebpackBar => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setProgress(value: /* context */ WebpackBar => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setStart(value: /* context */ WebpackBar => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setUpdate(value: /* context */ WebpackBar => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

