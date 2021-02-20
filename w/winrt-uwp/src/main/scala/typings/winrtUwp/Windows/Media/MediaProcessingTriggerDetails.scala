package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
@js.native
trait MediaProcessingTriggerDetails extends StObject {
  
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  var arguments: ValueSet = js.native
}
object MediaProcessingTriggerDetails {
  
  @scala.inline
  def apply(arguments: ValueSet): MediaProcessingTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProcessingTriggerDetails]
  }
  
  @scala.inline
  implicit class MediaProcessingTriggerDetailsMutableBuilder[Self <: MediaProcessingTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: ValueSet): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
