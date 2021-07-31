package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object favoriteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Favorite", JSImport.Default)
  @js.native
  val default: SFC[FavoriteProps] = js.native
  
  trait FavoriteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FavoriteProps {
    
    @scala.inline
    def apply(): FavoriteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteProps]
    }
    
    @scala.inline
    implicit class FavoritePropsMutableBuilder[Self <: FavoriteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FavoriteProps]
  
  /* This means you don't have to write `default`, but can instead just say `favoriteMod.foo` */
  override def _to: SFC[FavoriteProps] = default
}
