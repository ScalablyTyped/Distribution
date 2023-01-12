package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVerticalRatioCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatioChecked", JSImport.Default)
  @js.native
  val default: FC[VerticalRatioCheckedProps] = js.native
  
  trait VerticalRatioCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VerticalRatioCheckedProps {
    
    inline def apply(): VerticalRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioCheckedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerticalRatioCheckedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VerticalRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVerticalRatioCheckedMod.foo` */
  override def _to: FC[VerticalRatioCheckedProps] = default
}
