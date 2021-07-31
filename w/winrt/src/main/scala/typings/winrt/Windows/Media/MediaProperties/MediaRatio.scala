package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRatio
  extends StObject
     with IMediaRatio
object MediaRatio {
  
  @scala.inline
  def apply(denominator: Double, numerator: Double): MediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRatio]
  }
}
