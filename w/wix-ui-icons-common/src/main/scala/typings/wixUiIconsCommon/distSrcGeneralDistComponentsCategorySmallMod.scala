package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsCategorySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CategorySmall", JSImport.Default)
  @js.native
  val default: FC[CategorySmallProps] = js.native
  
  trait CategorySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CategorySmallProps {
    
    inline def apply(): CategorySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CategorySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategorySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CategorySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsCategorySmallMod.foo` */
  override def _to: FC[CategorySmallProps] = default
}
