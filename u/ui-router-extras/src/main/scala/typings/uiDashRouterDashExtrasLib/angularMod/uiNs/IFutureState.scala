package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `FutureState` object is a placeholder for full a UI-Router `state`
  */
trait IFutureState
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The placeholder state name (fully qualified).
    * Attempted transitions to this state (or any substates) will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var stateName: java.lang.String
  /**
    * The type of FutureState. This is a used to select a registered StateFactory which is then used to build the full UI-Router `state`
    */
  var `type`: java.lang.String
  /**
    * The placeholder url path fragment (the fragment is the URL prefix which the state will be accessed on, not the URL of the state's source code).
    * Attempted navigations to a URL starting with this fragment will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var url: java.lang.String
}

object IFutureState {
  @scala.inline
  def apply(
    stateName: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IFutureState = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("stateName")(stateName)
    __obj.updateDynamic("url")(url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFutureState]
  }
}

