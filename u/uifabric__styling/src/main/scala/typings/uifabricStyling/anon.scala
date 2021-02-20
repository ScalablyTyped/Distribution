package typings.uifabricStyling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait EdgeChromiumHighContrastSelector extends StObject
  
  /* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/utilities/icons.IIconOptions> */
  @js.native
  trait PartialIIconOptions extends StObject {
    
    var disableWarnings: js.UndefOr[Boolean] = js.native
    
    var warnOnMissingIcons: js.UndefOr[Boolean] = js.native
  }
  object PartialIIconOptions {
    
    @scala.inline
    def apply(): PartialIIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIIconOptions]
    }
    
    @scala.inline
    implicit class PartialIIconOptionsMutableBuilder[Self <: PartialIIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWarningsUndefined: Self = StObject.set(x, "disableWarnings", js.undefined)
      
      @scala.inline
      def setWarnOnMissingIcons(value: Boolean): Self = StObject.set(x, "warnOnMissingIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnOnMissingIconsUndefined: Self = StObject.set(x, "warnOnMissingIcons", js.undefined)
    }
  }
}
