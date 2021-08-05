package typings.webicon

import typings.webicon.iconSetOptionsMod.IconSetOptions
import typings.webicon.webiconBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgCumulativeIconSetOptionsMod {
  
  trait SvgCumulativeIconSetOptions
    extends StObject
       with IconSetOptions {
    
    @JSName("cumulative")
    var cumulative_SvgCumulativeIconSetOptions: `true`
    
    /**
      * The amount of miliseconds to wait before downloading the icons.
      */
    var waitDuration: js.UndefOr[Double] = js.undefined
  }
  object SvgCumulativeIconSetOptions {
    
    inline def apply(): SvgCumulativeIconSetOptions = {
      val __obj = js.Dynamic.literal(cumulative = true)
      __obj.asInstanceOf[SvgCumulativeIconSetOptions]
    }
    
    extension [Self <: SvgCumulativeIconSetOptions](x: Self) {
      
      inline def setCumulative(value: `true`): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setWaitDuration(value: Double): Self = StObject.set(x, "waitDuration", value.asInstanceOf[js.Any])
      
      inline def setWaitDurationUndefined: Self = StObject.set(x, "waitDuration", js.undefined)
    }
  }
}
