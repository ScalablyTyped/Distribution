package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsToggleOnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOnSmall", JSImport.Default)
  @js.native
  val default: FC[ToggleOnSmallProps] = js.native
  
  trait ToggleOnSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ToggleOnSmallProps {
    
    inline def apply(): ToggleOnSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOnSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleOnSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ToggleOnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsToggleOnSmallMod.foo` */
  override def _to: FC[ToggleOnSmallProps] = default
}
