package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FiltersSmall", JSImport.Default)
  @js.native
  val default: SFC[FiltersSmallProps] = js.native
  
  @js.native
  trait FiltersSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FiltersSmallProps {
    
    @scala.inline
    def apply(): FiltersSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FiltersSmallProps]
    }
    
    @scala.inline
    implicit class FiltersSmallPropsMutableBuilder[Self <: FiltersSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FiltersSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `filtersSmallMod.foo` */
  override def _to: SFC[FiltersSmallProps] = default
}
