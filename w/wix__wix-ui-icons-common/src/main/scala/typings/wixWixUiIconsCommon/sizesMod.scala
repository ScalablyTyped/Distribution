package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixWixUiIconsCommon.typesMod.IconDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/system-category-list-base/Sizes", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var sizes: js.Array[IconDescriptor]
  }
  object Props {
    
    inline def apply(sizes: js.Array[IconDescriptor]): Props = {
      val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setSizes(value: js.Array[IconDescriptor]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: IconDescriptor*): Self = StObject.set(x, "sizes", js.Array(value*))
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `sizesMod.foo` */
  override def _to: FC[Props] = default
}
