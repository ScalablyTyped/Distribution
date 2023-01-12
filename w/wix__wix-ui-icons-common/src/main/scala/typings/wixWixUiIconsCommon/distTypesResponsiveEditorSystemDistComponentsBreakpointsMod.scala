package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsBreakpointsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/Breakpoints", JSImport.Default)
  @js.native
  val default: FC[BreakpointsProps] = js.native
  
  trait BreakpointsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BreakpointsProps {
    
    inline def apply(): BreakpointsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreakpointsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BreakpointsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsBreakpointsMod.foo` */
  override def _to: FC[BreakpointsProps] = default
}
