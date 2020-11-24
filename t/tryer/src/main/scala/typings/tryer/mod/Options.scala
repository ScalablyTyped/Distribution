package typings.tryer.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The function that you want to invoke.
    * If action returns a promise, iterations will not end until the promise is resolved or rejected.
    * Alternatively, action may take a callback argument, done, to signal that it is asynchronous. In that case, you are responsible for calling done when the action is finished.
    *
    * If action is not set, it defaults to an empty function.
    */
  var action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.native
  
  /**
    * fail: The error handler.
    * A function that will be called if limit falsey values are returned by when or until.
    * Defaults to an empty function.
    */
  var fail: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  
  /**
    * interval: The retry interval, in milliseconds.
    * A negative number indicates that each subsequent retry should wait for twice the interval from the preceding iteration (i.e. exponential backoff).
    * The default value is -1000, signifying that the initial retry interval should be one second and that each subsequent attempt should wait for double the length of the previous interval.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * limit: Failure limit, representing the maximum number of falsey returns from when or until that will be permitted before invocation is deemed to have failed.
    * A negative number indicates that the attempt should never fail, instead continuing for as long as when and until have returned truthy values.
    * Defaults to -1.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * pass: Success handler.
    * A function that will be called after until has returned truthily.
    * Defaults to an empty function.
    */
  var pass: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * until: A predicate that tests the post-condition for invoking action.
    * After until returns true (or a truthy value), action will no longer be called.
    * Defaults to a function that immediately returns true.
    */
  var until: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * when: A predicate that tests the pre-condition for invoking action.
    * Until when returns true (or a truthy value), action will not be called.
    * Defaults to a function that immediately returns true.
    */
  var when: js.UndefOr[js.Function0[Boolean]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setActionFunction1(value: /* done */ js.Function0[Unit] => _): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionFunction0(value: () => js.Promise[_]): Self = this.set("action", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAction(value: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ Error => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPass(value: () => Unit): Self = this.set("pass", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setUntil(value: () => Boolean): Self = this.set("until", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
    
    @scala.inline
    def setWhen(value: () => Boolean): Self = this.set("when", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
