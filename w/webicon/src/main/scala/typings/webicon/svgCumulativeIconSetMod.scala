package typings.webicon

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgCumulativeIconSetMod {
  
  trait SvgCumulativeIconSet
    extends StObject
       with SvgIcon {
    
    /**
      * A value indicating whether the icons are loaded separately.
      */
    var cumulative: `true`
    
    /**
      * The number of miliseconds to wait before downloading the icons.
      */
    var waitDuration: js.UndefOr[Double] = js.undefined
  }
  object SvgCumulativeIconSet {
    
    @scala.inline
    def apply(): SvgCumulativeIconSet = {
      val __obj = js.Dynamic.literal(cumulative = true)
      __obj.asInstanceOf[SvgCumulativeIconSet]
    }
    
    @scala.inline
    implicit class SvgCumulativeIconSetMutableBuilder[Self <: SvgCumulativeIconSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCumulative(value: `true`): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDuration(value: Double): Self = StObject.set(x, "waitDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDurationUndefined: Self = StObject.set(x, "waitDuration", js.undefined)
    }
  }
}
