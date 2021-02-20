package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BackgroundSmall", JSImport.Default)
  @js.native
  val default: SFC[BackgroundSmallProps] = js.native
  
  @js.native
  trait BackgroundSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BackgroundSmallProps {
    
    @scala.inline
    def apply(): BackgroundSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundSmallProps]
    }
    
    @scala.inline
    implicit class BackgroundSmallPropsMutableBuilder[Self <: BackgroundSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BackgroundSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `backgroundSmallMod.foo` */
  override def _to: SFC[BackgroundSmallProps] = default
}
