package typings.uiRouterExtras.mod.ui

import typings.uiRouterExtras.anon.Redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
  */
trait IDeepStateRedirectConfig extends js.Object {
  /*
    * If no deep state has been recorded, DSR will instead redirect to the default substate and params that you specify.
    * If default is a string it is interpreted as the substate.
    */
  var default: js.UndefOr[String | IRedirectParams] = js.undefined
  /*
    * A callback function that determines whether or not the redirect should actually occur, or changes the redirect to some other state.
    * Return an object: IRedirectParams to change the redirect
    */
  var fn: js.UndefOr[js.Function1[/* $dsr$ */ Redirect, Boolean | IRedirectParams]] = js.undefined
  /*
    * Specify params: true if your DSR state takes parameters.
    * If only a subset of the parameters should be included in the parameter grouping for recording deep states,
    * specify an array of parameter names.
    */
  var params: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object IDeepStateRedirectConfig {
  @scala.inline
  def apply(
    default: String | IRedirectParams = null,
    fn: /* $dsr$ */ Redirect => Boolean | IRedirectParams = null,
    params: Boolean | js.Array[String] = null
  ): IDeepStateRedirectConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeepStateRedirectConfig]
  }
}

