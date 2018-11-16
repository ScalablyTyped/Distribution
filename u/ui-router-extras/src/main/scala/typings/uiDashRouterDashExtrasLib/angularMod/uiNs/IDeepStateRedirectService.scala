package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
         * $deepStateRedirect
         */
@js.native
trait IDeepStateRedirectService extends js.Object {
  /*
               * This method resets stored $deepStateRedirect data so following transitions will behave like there have not been previous transitions.
               * @param stateParams Can be passed in to select specific states to reset:
               *  {
               *    'paramName': 'paramvalue' | ['list', 'of', 'possible', 'paramvalues']
               *  }
               */
  def reset(stateName: java.lang.String): scala.Unit = js.native
  /*
               * This method resets stored $deepStateRedirect data so following transitions will behave like there have not been previous transitions.
               * @param stateParams Can be passed in to select specific states to reset:
               *  {
               *    'paramName': 'paramvalue' | ['list', 'of', 'possible', 'paramvalues']
               *  }
               */
  def reset(
    stateName: java.lang.String,
    stateParams: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): scala.Unit = js.native
}

