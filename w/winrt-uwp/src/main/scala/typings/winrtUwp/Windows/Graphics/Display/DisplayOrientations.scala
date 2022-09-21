package typings.winrtUwp.Windows.Graphics.Display

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisplayOrientations extends StObject
/** Describes the orientation of a rectangular monitor. */
@JSGlobal("Windows.Graphics.Display.DisplayOrientations")
@js.native
object DisplayOrientations extends StObject {
  
  /** Specifies that the monitor is oriented in landscape mode where the width of the display viewing area is greater than the height. */
  @js.native
  sealed trait landscape
    extends StObject
       with DisplayOrientations
  
  /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 180 degrees) to orient the display in landscape mode where the width of the display viewing area is greater than the height. This landscape mode is flipped 180 degrees from the Landscape mode. */
  @js.native
  sealed trait landscapeFlipped
    extends StObject
       with DisplayOrientations
  
  /** No display orientation is specified. */
  @js.native
  sealed trait none
    extends StObject
       with DisplayOrientations
  
  /** Specifies that the monitor rotated 90 degrees in the clockwise direction to orient the display in portrait mode where the height of the display viewing area is greater than the width. */
  @js.native
  sealed trait portrait
    extends StObject
       with DisplayOrientations
  
  /** Specifies that the monitor rotated another 90 degrees in the clockwise direction (to equal 270 degrees) to orient the display in portrait mode where the height of the display viewing area is greater than the width. This portrait mode is flipped 180 degrees from the Portrait mode. */
  @js.native
  sealed trait portraitFlipped
    extends StObject
       with DisplayOrientations
}
