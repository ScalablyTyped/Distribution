package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsFavoriteSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/FavoriteSmall", JSImport.Default)
  @js.native
  val default: FC[FavoriteSmallProps] = js.native
  
  trait FavoriteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FavoriteSmallProps {
    
    inline def apply(): FavoriteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FavoriteSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FavoriteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsFavoriteSmallMod.foo` */
  override def _to: FC[FavoriteSmallProps] = default
}
