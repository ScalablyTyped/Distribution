package typings.webicon

import typings.webicon.iconMod.Icon
import typings.webicon.sizeableMod.Sizeable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconMod {
  
  trait SvgIcon
    extends StObject
       with Icon
       with Sizeable {
    
    /**
      * The default viewBox of the icon.
      */
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object SvgIcon {
    
    @scala.inline
    def apply(): SvgIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIcon]
    }
    
    @scala.inline
    implicit class SvgIconMutableBuilder[Self <: SvgIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
