package typings.webicon

import typings.webicon.iconSvgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconSvgIconSetMod {
  
  trait SvgIconSet
    extends StObject
       with SvgIcon {
    
    /**
      * A value indicating whether the icons are loaded separately.
      */
    var cumulative: js.UndefOr[`false`] = js.undefined
  }
  object SvgIconSet {
    
    inline def apply(): SvgIconSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIconSet]
    }
    
    extension [Self <: SvgIconSet](x: Self) {
      
      inline def setCumulative(value: `false`): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    }
  }
}
