package typings.webpackEnv.WebpackModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Ignore changes made to declined modules.
    */
  var ignoreDeclined: js.UndefOr[Boolean] = js.native
  /**
    *  Ignore errors throw in accept handlers, error handlers and while reevaluating module.
    */
  var ignoreErrored: js.UndefOr[Boolean] = js.native
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: js.UndefOr[Boolean] = js.native
  /**
    * Notifier for accepted modules.
    */
  var onAccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for declined modules.
    */
  var onDeclined: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for disposed modules.
    */
  var onDisposed: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for errors.
    */
  var onErrored: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for unaccepted modules.
    */
  var onUnaccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit class AcceptOptionsOps[Self <: AcceptOptions] (val x: Self) extends AnyVal {
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
    def setAutoApply(value: Boolean): Self = this.set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApply: Self = this.set("autoApply", js.undefined)
    @scala.inline
    def setIgnoreDeclined(value: Boolean): Self = this.set("ignoreDeclined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDeclined: Self = this.set("ignoreDeclined", js.undefined)
    @scala.inline
    def setIgnoreErrored(value: Boolean): Self = this.set("ignoreErrored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreErrored: Self = this.set("ignoreErrored", js.undefined)
    @scala.inline
    def setIgnoreUnaccepted(value: Boolean): Self = this.set("ignoreUnaccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnaccepted: Self = this.set("ignoreUnaccepted", js.undefined)
    @scala.inline
    def setOnAccepted(value: /* info */ HotNotifierInfo => Unit): Self = this.set("onAccepted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAccepted: Self = this.set("onAccepted", js.undefined)
    @scala.inline
    def setOnDeclined(value: /* info */ HotNotifierInfo => Unit): Self = this.set("onDeclined", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeclined: Self = this.set("onDeclined", js.undefined)
    @scala.inline
    def setOnDisposed(value: /* info */ HotNotifierInfo => Unit): Self = this.set("onDisposed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDisposed: Self = this.set("onDisposed", js.undefined)
    @scala.inline
    def setOnErrored(value: /* info */ HotNotifierInfo => Unit): Self = this.set("onErrored", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnErrored: Self = this.set("onErrored", js.undefined)
    @scala.inline
    def setOnUnaccepted(value: /* info */ HotNotifierInfo => Unit): Self = this.set("onUnaccepted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnaccepted: Self = this.set("onUnaccepted", js.undefined)
  }
  
}

