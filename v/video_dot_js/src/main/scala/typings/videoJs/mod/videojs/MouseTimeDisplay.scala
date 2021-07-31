package typings.videoJs.mod.videojs

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link MouseTimeDisplay} component tracks mouse movement over the
  * {@link ProgressControl}. It displays an indicator and a {@link TimeTooltip}
  * indicating the time which is represented by a given point in the
  * {@link ProgressControl}.
  */
@js.native
trait MouseTimeDisplay
  extends StObject
     with Component {
  
  /**
    * Enqueues updates to its own DOM as well as the DOM of its
    * {@link TimeTooltip} child.
    *
    * @param seekBarRect
    *        The `ClientRect` for the {@link SeekBar} element.
    *
    * @param seekBarPoint
    *        A number from 0 to 1, representing a horizontal reference point
    *        from the left edge of the {@link SeekBar}
    */
  def update(seekBarRect: ClientRect, seekBarPoint: Double): Unit = js.native
}
