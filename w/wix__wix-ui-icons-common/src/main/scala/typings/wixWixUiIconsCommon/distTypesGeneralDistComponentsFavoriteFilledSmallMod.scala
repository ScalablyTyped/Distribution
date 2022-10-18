package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFavoriteFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FavoriteFilledSmall", JSImport.Default)
  @js.native
  val default: FC[FavoriteFilledSmallProps] = js.native
  
  trait FavoriteFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FavoriteFilledSmallProps {
    
    inline def apply(): FavoriteFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteFilledSmallProps]
    }
    
    extension [Self <: FavoriteFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FavoriteFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFavoriteFilledSmallMod.foo` */
  override def _to: FC[FavoriteFilledSmallProps] = default
}
