package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerDetails")
@js.native
open class ApplicationTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerDetails {
  
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  /* CompleteClass */
  var arguments: ValueSet = js.native
}
