package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUngroupMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Ungroup", JSImport.Default)
  @js.native
  val default: FC[UngroupProps] = js.native
  
  trait UngroupProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UngroupProps {
    
    inline def apply(): UngroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UngroupProps]
    }
    
    extension [Self <: UngroupProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UngroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsUngroupMod.foo` */
  override def _to: FC[UngroupProps] = default
}
