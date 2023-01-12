package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsGetStartedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/GetStarted", JSImport.Default)
  @js.native
  val default: FC[GetStartedProps] = js.native
  
  trait GetStartedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GetStartedProps {
    
    inline def apply(): GetStartedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStartedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetStartedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GetStartedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsGetStartedMod.foo` */
  override def _to: FC[GetStartedProps] = default
}
