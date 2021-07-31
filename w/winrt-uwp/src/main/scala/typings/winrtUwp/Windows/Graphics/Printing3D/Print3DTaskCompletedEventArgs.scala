package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the Completed event of the 3D print request. */
trait Print3DTaskCompletedEventArgs extends StObject {
  
  /** Gets the status of the 3D print request. */
  var completion: Print3DTaskCompletion
  
  /** Gets the type of error encountered during the 3D print request. */
  var extendedStatus: Print3DTaskDetail
}
object Print3DTaskCompletedEventArgs {
  
  @scala.inline
  def apply(completion: Print3DTaskCompletion, extendedStatus: Print3DTaskDetail): Print3DTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], extendedStatus = extendedStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskCompletedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskCompletedEventArgsMutableBuilder[Self <: Print3DTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: Print3DTaskCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: Print3DTaskDetail): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
  }
}
