package typings.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `FutureState` object is a placeholder for full a UI-Router `state`
  */
trait IFutureState
  extends /* key */ StringDictionary[js.Any] {
  /**
    * The placeholder state name (fully qualified).
    * Attempted transitions to this state (or any substates) will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var stateName: String
  /**
    * The type of FutureState. This is a used to select a registered StateFactory which is then used to build the full UI-Router `state`
    */
  var `type`: String
  /**
    * The placeholder url path fragment (the fragment is the URL prefix which the state will be accessed on, not the URL of the state's source code).
    * Attempted navigations to a URL starting with this fragment will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var url: String
}

object IFutureState {
  @scala.inline
  def apply(
    stateName: String,
    `type`: String,
    url: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): IFutureState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFutureState]
  }
}

