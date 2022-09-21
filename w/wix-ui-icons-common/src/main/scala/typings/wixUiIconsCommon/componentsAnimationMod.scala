package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAnimationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Animation", JSImport.Default)
  @js.native
  val default: FC[AnimationProps] = js.native
  
  trait AnimationProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AnimationProps {
    
    inline def apply(): AnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationProps]
    }
    
    extension [Self <: AnimationProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AnimationProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsAnimationMod.foo` */
  override def _to: FC[AnimationProps] = default
}
