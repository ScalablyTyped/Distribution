package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.CollectionChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempt to change properties on a frame source. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs")
@js.native
open class PerceptionFrameSourcePropertiesChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs {
  
  /** Gets the type of change that occurred as a result of the property change request. */
  /* CompleteClass */
  var collectionChange: CollectionChange = js.native
  
  /** Gets a string key indicating the location of the change in the collection. */
  /* CompleteClass */
  var key: String = js.native
}
