package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsHelpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Help", JSImport.Default)
  @js.native
  val default: FC[HelpProps] = js.native
  
  trait HelpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HelpProps {
    
    inline def apply(): HelpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpProps]
    }
    
    extension [Self <: HelpProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsHelpMod.foo` */
  override def _to: FC[HelpProps] = default
}
