package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideStateModel extends StObject {
  
  var hidden: Boolean
}
object HideStateModel {
  
  @scala.inline
  def apply(hidden: Boolean): HideStateModel = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideStateModel]
  }
  
  @scala.inline
  implicit class HideStateModelMutableBuilder[Self <: HideStateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
