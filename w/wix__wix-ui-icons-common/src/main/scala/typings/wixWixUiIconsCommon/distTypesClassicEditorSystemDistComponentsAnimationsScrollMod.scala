package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsAnimationsScrollMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/AnimationsScroll", JSImport.Default)
  @js.native
  val default: FC[AnimationsScrollProps] = js.native
  
  trait AnimationsScrollProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AnimationsScrollProps {
    
    inline def apply(): AnimationsScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationsScrollProps]
    }
    
    extension [Self <: AnimationsScrollProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AnimationsScrollProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsAnimationsScrollMod.foo` */
  override def _to: FC[AnimationsScrollProps] = default
}
