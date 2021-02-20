package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object favoriteFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FavoriteFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[FavoriteFilledSmallProps] = js.native
  
  @js.native
  trait FavoriteFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FavoriteFilledSmallProps {
    
    @scala.inline
    def apply(): FavoriteFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteFilledSmallProps]
    }
    
    @scala.inline
    implicit class FavoriteFilledSmallPropsMutableBuilder[Self <: FavoriteFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FavoriteFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `favoriteFilledSmallMod.foo` */
  override def _to: SFC[FavoriteFilledSmallProps] = default
}
