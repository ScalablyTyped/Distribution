package typings.uiRouterExtras.mod.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `FutureState` object is a placeholder for full a UI-Router `state`
  */
@js.native
trait IFutureState
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * The placeholder state name (fully qualified).
    * Attempted transitions to this state (or any substates) will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var stateName: String = js.native
  
  /**
    * The type of FutureState. This is a used to select a registered StateFactory which is then used to build the full UI-Router `state`
    */
  var `type`: String = js.native
  
  /**
    * The placeholder url path fragment (the fragment is the URL prefix which the state will be accessed on, not the URL of the state's source code).
    * Attempted navigations to a URL starting with this fragment will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
    */
  var url: String = js.native
}
object IFutureState {
  
  @scala.inline
  def apply(stateName: String, `type`: String, url: String): IFutureState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFutureState]
  }
  
  @scala.inline
  implicit class IFutureStateOps[Self <: IFutureState] (val x: Self) extends AnyVal {
    
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
    def setStateName(value: String): Self = this.set("stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
