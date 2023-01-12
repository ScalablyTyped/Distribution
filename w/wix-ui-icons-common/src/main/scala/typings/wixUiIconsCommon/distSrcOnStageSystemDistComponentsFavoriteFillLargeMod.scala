package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsFavoriteFillLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/FavoriteFillLarge", JSImport.Default)
  @js.native
  val default: FC[FavoriteFillLargeProps] = js.native
  
  trait FavoriteFillLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FavoriteFillLargeProps {
    
    inline def apply(): FavoriteFillLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FavoriteFillLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FavoriteFillLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FavoriteFillLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsFavoriteFillLargeMod.foo` */
  override def _to: FC[FavoriteFillLargeProps] = default
}
