package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsAutomationsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/AutomationsSmall", JSImport.Default)
  @js.native
  val default: FC[AutomationsSmallProps] = js.native
  
  trait AutomationsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AutomationsSmallProps {
    
    inline def apply(): AutomationsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutomationsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AutomationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsAutomationsSmallMod.foo` */
  override def _to: FC[AutomationsSmallProps] = default
}
