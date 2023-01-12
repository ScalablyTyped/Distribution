package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsNumericListLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/NumericListLeft", JSImport.Default)
  @js.native
  val default: FC[NumericListLeftProps] = js.native
  
  trait NumericListLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NumericListLeftProps {
    
    inline def apply(): NumericListLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericListLeftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumericListLeftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NumericListLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsNumericListLeftMod.foo` */
  override def _to: FC[NumericListLeftProps] = default
}
