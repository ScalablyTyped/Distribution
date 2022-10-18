package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsDistributeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Distribute", JSImport.Default)
  @js.native
  val default: FC[DistributeProps] = js.native
  
  trait DistributeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeProps {
    
    inline def apply(): DistributeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeProps]
    }
    
    extension [Self <: DistributeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsDistributeMod.foo` */
  override def _to: FC[DistributeProps] = default
}
