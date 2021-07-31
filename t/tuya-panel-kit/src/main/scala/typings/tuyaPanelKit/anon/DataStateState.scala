package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStateState[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var data: StateState[State]
}
object DataStateState {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](data: StateState[State]): DataStateState[State] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStateState[State]]
  }
  
  @scala.inline
  implicit class DataStateStateMutableBuilder[Self <: DataStateState[?], State /* <: NavigationState[ParamListBase] */] (val x: Self & DataStateState[State]) extends AnyVal {
    
    @scala.inline
    def setData(value: StateState[State]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
