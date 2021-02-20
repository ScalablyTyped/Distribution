package typings.webicon

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgCumulativeIconSetMod {
  
  @js.native
  trait SvgCumulativeIconSet extends SvgIcon {
    
    /**
      * A value indicating whether the icons are loaded separately.
      */
    var cumulative: `true` = js.native
    
    /**
      * The number of miliseconds to wait before downloading the icons.
      */
    var waitDuration: js.UndefOr[Double] = js.native
  }
  object SvgCumulativeIconSet {
    
    @scala.inline
    def apply(cumulative: `true`): SvgCumulativeIconSet = {
      val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
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
