package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents ratios used in media operations. */
@js.native
trait MediaRatio extends StObject {
  
  /** The denominator of the MediaRatio. */
  var denominator: Double = js.native
  
  /** The numerator of the MediaRatio. */
  var numerator: Double = js.native
}
object MediaRatio {
  
  @scala.inline
  def apply(denominator: Double, numerator: Double): MediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRatio]
  }
  
  @scala.inline
  implicit class MediaRatioMutableBuilder[Self <: MediaRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
  }
}
