package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAscendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Ascend", JSImport.Default)
  @js.native
  val default: FC[AscendProps] = js.native
  
  trait AscendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AscendProps {
    
    inline def apply(): AscendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AscendProps]
    }
    
    extension [Self <: AscendProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AscendProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsAscendMod.foo` */
  override def _to: FC[AscendProps] = default
}
