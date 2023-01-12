package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsToggleOffMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOff", JSImport.Default)
  @js.native
  val default: FC[ToggleOffProps] = js.native
  
  trait ToggleOffProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOffProps {
    
    inline def apply(): ToggleOffProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOffProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleOffProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOffProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsToggleOffMod.foo` */
  override def _to: FC[ToggleOffProps] = default
}
