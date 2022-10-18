package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFavoriteFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FavoriteFilled", JSImport.Default)
  @js.native
  val default: FC[FavoriteFilledProps] = js.native
  
  trait FavoriteFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FavoriteFilledProps {
    
    inline def apply(): FavoriteFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteFilledProps]
    }
    
    extension [Self <: FavoriteFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FavoriteFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFavoriteFilledMod.foo` */
  override def _to: FC[FavoriteFilledProps] = default
}
