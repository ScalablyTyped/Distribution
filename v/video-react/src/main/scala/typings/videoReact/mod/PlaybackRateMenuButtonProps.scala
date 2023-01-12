package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRateMenuButtonProps extends StObject {
  
  /**
    * The direction where Volume Bar popup, default:
    * `[2, 1.5, 1.25, 1, 0.5, 0.25]`
    */
  var rates: js.UndefOr[js.Array[Double]] = js.undefined
}
object PlaybackRateMenuButtonProps {
  
  inline def apply(): PlaybackRateMenuButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackRateMenuButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackRateMenuButtonProps] (val x: Self) extends AnyVal {
    
    inline def setRates(value: js.Array[Double]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesUndefined: Self = StObject.set(x, "rates", js.undefined)
    
    inline def setRatesVarargs(value: Double*): Self = StObject.set(x, "rates", js.Array(value*))
  }
}
