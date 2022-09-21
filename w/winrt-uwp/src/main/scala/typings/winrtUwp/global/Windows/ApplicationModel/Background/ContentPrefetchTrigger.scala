package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to run custom handlers when prefetching web resources. */
@JSGlobal("Windows.ApplicationModel.Background.ContentPrefetchTrigger")
@js.native
/** Initializes a new instance of the ContentPrefetchTrigger class. */
open class ContentPrefetchTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.ContentPrefetchTrigger {
  /**
    * Initializes a new instance of the ContentPrefetchTrigger class using a specified time interval.
    * @param waitInterval Interval before next allowed content prefetch.
    */
  def this(waitInterval: Double) = this()
  
  /** Retrieves the time interval for prefetching web content. */
  /* CompleteClass */
  var waitInterval: Double = js.native
}
