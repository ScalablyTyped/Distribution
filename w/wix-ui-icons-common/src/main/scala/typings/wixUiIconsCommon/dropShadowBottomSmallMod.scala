package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowBottomSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropShadowBottomSmall", JSImport.Default)
  @js.native
  val default: SFC[DropShadowBottomSmallProps] = js.native
  
  trait DropShadowBottomSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DropShadowBottomSmallProps {
    
    @scala.inline
    def apply(): DropShadowBottomSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowBottomSmallProps]
    }
    
    @scala.inline
    implicit class DropShadowBottomSmallPropsMutableBuilder[Self <: DropShadowBottomSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DropShadowBottomSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowBottomSmallMod.foo` */
  override def _to: SFC[DropShadowBottomSmallProps] = default
}
