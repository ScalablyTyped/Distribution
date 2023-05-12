package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsActivitySmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ActivitySmall", JSImport.Default)
  @js.native
  val default: FC[ActivitySmallProps] = js.native
  
  trait ActivitySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ActivitySmallProps {
    
    inline def apply(): ActivitySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivitySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivitySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ActivitySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsActivitySmallMod.foo` */
  override def _to: FC[ActivitySmallProps] = default
}
