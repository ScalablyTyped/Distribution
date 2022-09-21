package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDistributeVerticalCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/DistributeVerticalCenter", JSImport.Default)
  @js.native
  val default: FC[DistributeVerticalCenterProps] = js.native
  
  trait DistributeVerticalCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeVerticalCenterProps {
    
    inline def apply(): DistributeVerticalCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeVerticalCenterProps]
    }
    
    extension [Self <: DistributeVerticalCenterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeVerticalCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDistributeVerticalCenterMod.foo` */
  override def _to: FC[DistributeVerticalCenterProps] = default
}
