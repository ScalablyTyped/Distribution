package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridLayoutFourOnThreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/GridLayoutFourOnThree", JSImport.Default)
  @js.native
  val default: FC[GridLayoutFourOnThreeProps] = js.native
  
  trait GridLayoutFourOnThreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GridLayoutFourOnThreeProps {
    
    inline def apply(): GridLayoutFourOnThreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridLayoutFourOnThreeProps]
    }
    
    extension [Self <: GridLayoutFourOnThreeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GridLayoutFourOnThreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridLayoutFourOnThreeMod.foo` */
  override def _to: FC[GridLayoutFourOnThreeProps] = default
}
