package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsStatusCompleteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompleteSmall", JSImport.Default)
  @js.native
  val default: FC[StatusCompleteSmallProps] = js.native
  
  trait StatusCompleteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusCompleteSmallProps {
    
    inline def apply(): StatusCompleteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteSmallProps]
    }
    
    extension [Self <: StatusCompleteSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusCompleteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsStatusCompleteSmallMod.foo` */
  override def _to: FC[StatusCompleteSmallProps] = default
}
