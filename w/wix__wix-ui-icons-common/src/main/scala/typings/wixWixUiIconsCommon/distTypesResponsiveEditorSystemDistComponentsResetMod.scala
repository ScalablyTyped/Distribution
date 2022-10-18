package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsResetMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/Reset", JSImport.Default)
  @js.native
  val default: FC[ResetProps] = js.native
  
  trait ResetProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ResetProps {
    
    inline def apply(): ResetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetProps]
    }
    
    extension [Self <: ResetProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ResetProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsResetMod.foo` */
  override def _to: FC[ResetProps] = default
}
