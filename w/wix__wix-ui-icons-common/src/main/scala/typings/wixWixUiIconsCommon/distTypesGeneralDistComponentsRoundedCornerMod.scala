package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRoundedCornerMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/RoundedCorner", JSImport.Default)
  @js.native
  val default: FC[RoundedCornerProps] = js.native
  
  trait RoundedCornerProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RoundedCornerProps {
    
    inline def apply(): RoundedCornerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoundedCornerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoundedCornerProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RoundedCornerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRoundedCornerMod.foo` */
  override def _to: FC[RoundedCornerProps] = default
}
