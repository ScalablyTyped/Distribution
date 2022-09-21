package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/Inspector", JSImport.Default)
  @js.native
  val default: FC[InspectorProps] = js.native
  
  trait InspectorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InspectorProps {
    
    inline def apply(): InspectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectorProps]
    }
    
    extension [Self <: InspectorProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InspectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `inspectorMod.foo` */
  override def _to: FC[InspectorProps] = default
}
