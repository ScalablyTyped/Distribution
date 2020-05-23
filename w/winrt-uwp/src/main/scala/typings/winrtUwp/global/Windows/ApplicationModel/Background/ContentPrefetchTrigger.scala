package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to run custom handlers when prefetching web resources. */
@JSGlobal("Windows.ApplicationModel.Background.ContentPrefetchTrigger")
@js.native
/** Initializes a new instance of the ContentPrefetchTrigger class. */
class ContentPrefetchTrigger ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.ContentPrefetchTrigger {
  /**
    * Initializes a new instance of the ContentPrefetchTrigger class using a specified time interval.
    * @param waitInterval Interval before next allowed content prefetch.
    */
  def this(waitInterval: Double) = this()
  /** Retrieves the time interval for prefetching web content. */
  /* CompleteClass */
  override var waitInterval: Double = js.native
}

