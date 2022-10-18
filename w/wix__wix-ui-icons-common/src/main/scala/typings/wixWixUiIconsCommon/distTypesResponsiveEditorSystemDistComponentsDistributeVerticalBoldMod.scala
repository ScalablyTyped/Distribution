package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsDistributeVerticalBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/DistributeVerticalBold", JSImport.Default)
  @js.native
  val default: FC[DistributeVerticalBoldProps] = js.native
  
  trait DistributeVerticalBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeVerticalBoldProps {
    
    inline def apply(): DistributeVerticalBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeVerticalBoldProps]
    }
    
    extension [Self <: DistributeVerticalBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeVerticalBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsDistributeVerticalBoldMod.foo` */
  override def _to: FC[DistributeVerticalBoldProps] = default
}
