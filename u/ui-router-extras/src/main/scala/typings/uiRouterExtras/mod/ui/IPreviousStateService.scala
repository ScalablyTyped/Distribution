package typings.uiRouterExtras.mod.ui

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Previous state service
  */
@js.native
trait IPreviousStateService extends js.Object {
  /**
    * Forget a memorized name
    * @param memoName Memo name
    */
  def forget(memoName: String): Unit = js.native
  /**
    * Get a previous state
    * @param memoName Memo name
    * @return Previous state
    */
  def get(): IPreviousState = js.native
  def get(memoName: String): IPreviousState = js.native
  /**
    * Go to a state
    * @param memoName Memo name
    * @param options State options
    * @return Promise
    */
  def go(memoName: String): IPromise[_] = js.native
  def go(
    memoName: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateOptions */ js.Any
  ): IPromise[_] = js.native
  /**
    * Memorize a state
    * @param memoName Memo name
    * @param defaultStateName Default state name
    * @param defaultStateParams Default state parameters
    */
  def memo(memoName: String): Unit = js.native
  def memo(memoName: String, defaultStateName: js.UndefOr[scala.Nothing], defaultStateParams: js.Object): Unit = js.native
  def memo(memoName: String, defaultStateName: String): Unit = js.native
  def memo(memoName: String, defaultStateName: String, defaultStateParams: js.Object): Unit = js.native
}

