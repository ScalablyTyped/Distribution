package typings.uiRouterExtras.mod.ui

import typings.uiRouterExtras.anon.Redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
  */
@js.native
trait IDeepStateRedirectConfig extends js.Object {
  /*
    * If no deep state has been recorded, DSR will instead redirect to the default substate and params that you specify.
    * If default is a string it is interpreted as the substate.
    */
  var default: js.UndefOr[String | IRedirectParams] = js.native
  /*
    * A callback function that determines whether or not the redirect should actually occur, or changes the redirect to some other state.
    * Return an object: IRedirectParams to change the redirect
    */
  var fn: js.UndefOr[js.Function1[/* $dsr$ */ Redirect, Boolean | IRedirectParams]] = js.native
  /*
    * Specify params: true if your DSR state takes parameters.
    * If only a subset of the parameters should be included in the parameter grouping for recording deep states,
    * specify an array of parameter names.
    */
  var params: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object IDeepStateRedirectConfig {
  @scala.inline
  def apply(): IDeepStateRedirectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeepStateRedirectConfig]
  }
  @scala.inline
  implicit class IDeepStateRedirectConfigOps[Self <: IDeepStateRedirectConfig] (val x: Self) extends AnyVal {
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
    def setDefault(value: String | IRedirectParams): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFn(value: /* $dsr$ */ Redirect => Boolean | IRedirectParams): Self = this.set("fn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: Boolean | js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

