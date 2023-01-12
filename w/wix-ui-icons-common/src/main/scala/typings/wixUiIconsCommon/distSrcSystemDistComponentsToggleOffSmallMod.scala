package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsToggleOffSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOffSmall", JSImport.Default)
  @js.native
  val default: FC[ToggleOffSmallProps] = js.native
  
  trait ToggleOffSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOffSmallProps {
    
    inline def apply(): ToggleOffSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOffSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleOffSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOffSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsToggleOffSmallMod.foo` */
  override def _to: FC[ToggleOffSmallProps] = default
}
