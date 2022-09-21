package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNumericListRightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/NumericListRight", JSImport.Default)
  @js.native
  val default: FC[NumericListRightProps] = js.native
  
  trait NumericListRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NumericListRightProps {
    
    inline def apply(): NumericListRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericListRightProps]
    }
    
    extension [Self <: NumericListRightProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NumericListRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsNumericListRightMod.foo` */
  override def _to: FC[NumericListRightProps] = default
}
