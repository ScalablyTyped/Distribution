package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents timeline properties of the SystemMediaTransportControls . Pass an instance of this class to the UpdateTimelineProperties method to update the properties. */
@JSGlobal("Windows.Media.SystemMediaTransportControlsTimelineProperties")
@js.native
/** Initializes a new instance of the SystemMediaTransportControlsTimelineProperties class. */
open class SystemMediaTransportControlsTimelineProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Media.SystemMediaTransportControlsTimelineProperties {
  
  /** Gets or sets a value representing the end time of the currently playing media item. */
  /* CompleteClass */
  var endTime: Double = js.native
  
  /** Gets or sets a value indicating the latest time within the currently playing media item to which the user can seek. */
  /* CompleteClass */
  var maxSeekTime: Double = js.native
  
  /** Gets or sets a value indicating the earliest time within the currently playing media item to which the user can seek. */
  /* CompleteClass */
  var minSeekTime: Double = js.native
  
  /** Gets or sets a value representing the current playback position within the currently playing media item. */
  /* CompleteClass */
  var position: Double = js.native
  
  /** Gets or sets a value representing the start time of the currently playing media item. */
  /* CompleteClass */
  var startTime: Double = js.native
}
