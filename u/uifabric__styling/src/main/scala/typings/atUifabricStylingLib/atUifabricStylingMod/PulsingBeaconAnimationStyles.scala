package typings
package atUifabricStylingLib.atUifabricStylingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling", "PulsingBeaconAnimationStyles")
@js.native
object PulsingBeaconAnimationStyles extends js.Object {
  var continuousPulseAnimationDouble: js.Function5[
    /* beaconColorOne */ java.lang.String, 
    /* beaconColorTwo */ java.lang.String, 
    /* innerDimension */ java.lang.String, 
    /* outerDimension */ java.lang.String, 
    /* borderWidth */ java.lang.String, 
    java.lang.String
  ] = js.native
  var continuousPulseAnimationSingle: js.Function5[
    /* beaconColorOne */ java.lang.String, 
    /* beaconColorTwo */ java.lang.String, 
    /* innerDimension */ java.lang.String, 
    /* outerDimension */ java.lang.String, 
    /* borderWidth */ java.lang.String, 
    java.lang.String
  ] = js.native
  var createDefaultAnimation: js.Function2[
    /* animationName */ java.lang.String, 
    /* delayLength */ js.UndefOr[java.lang.String], 
    atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
  ] = js.native
}

