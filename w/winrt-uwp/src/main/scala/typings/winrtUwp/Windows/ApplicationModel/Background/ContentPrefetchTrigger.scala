package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to run custom handlers when prefetching web resources. */
@js.native
trait ContentPrefetchTrigger extends StObject {
  
  /** Retrieves the time interval for prefetching web content. */
  var waitInterval: Double = js.native
}
object ContentPrefetchTrigger {
  
  @scala.inline
  def apply(waitInterval: Double): ContentPrefetchTrigger = {
    val __obj = js.Dynamic.literal(waitInterval = waitInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPrefetchTrigger]
  }
  
  @scala.inline
  implicit class ContentPrefetchTriggerMutableBuilder[Self <: ContentPrefetchTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaitInterval(value: Double): Self = StObject.set(x, "waitInterval", value.asInstanceOf[js.Any])
  }
}
