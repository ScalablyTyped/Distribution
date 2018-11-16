package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

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
  var default: js.UndefOr[java.lang.String | IRedirectParams] = js.undefined
  /*
               * A callback function that determines whether or not the redirect should actually occur, or changes the redirect to some other state.
              * Return an object: IRedirectParams to change the redirect
               */
  var fn: js.UndefOr[
    js.Function1[/* $dsr$ */ uiDashRouterDashExtrasLib.Anon_To, scala.Boolean | IRedirectParams]
  ] = js.undefined
  /*
               * Specify params: true if your DSR state takes parameters.
               * If only a subset of the parameters should be included in the parameter grouping for recording deep states,
               * specify an array of parameter names.
               */
  var params: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

