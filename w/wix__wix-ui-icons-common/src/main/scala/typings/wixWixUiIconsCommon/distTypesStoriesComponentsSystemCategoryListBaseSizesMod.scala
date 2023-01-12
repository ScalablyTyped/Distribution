package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesComponentsSystemCategoryListBaseSizesMod extends Shortcut {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setSizes(value: js.Array[IconDescriptor]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesVarargs(value: IconDescriptor*): Self = StObject.set(x, "sizes", js.Array(value*))
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesStoriesComponentsSystemCategoryListBaseSizesMod.foo` */
  override def _to: FC[Props] = default
}
