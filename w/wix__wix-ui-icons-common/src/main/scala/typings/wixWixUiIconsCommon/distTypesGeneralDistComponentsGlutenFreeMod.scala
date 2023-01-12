package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsGlutenFreeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/GlutenFree", JSImport.Default)
  @js.native
  val default: FC[GlutenFreeProps] = js.native
  
  trait GlutenFreeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GlutenFreeProps {
    
    inline def apply(): GlutenFreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlutenFreeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlutenFreeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GlutenFreeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsGlutenFreeMod.foo` */
  override def _to: FC[GlutenFreeProps] = default
}
