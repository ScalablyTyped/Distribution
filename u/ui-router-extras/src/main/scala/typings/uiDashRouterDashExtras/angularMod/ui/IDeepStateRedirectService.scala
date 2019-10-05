package typings.uiDashRouterDashExtras.angularMod.ui

import org.scalablytyped.runtime.StringDictionary
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
  def reset(stateName: String): Unit = js.native
  def reset(stateName: String, stateParams: StringDictionary[String | js.Array[String]]): Unit = js.native
}

