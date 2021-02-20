package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
@js.native
trait ApplicationTriggerDetails extends StObject {
  
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  var arguments: ValueSet = js.native
}
object ApplicationTriggerDetails {
  
  @scala.inline
  def apply(arguments: ValueSet): ApplicationTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTriggerDetails]
  }
  
  @scala.inline
  implicit class ApplicationTriggerDetailsMutableBuilder[Self <: ApplicationTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: ValueSet): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
