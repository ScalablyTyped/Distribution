package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMoveToSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MoveToSmall", JSImport.Default)
  @js.native
  val default: FC[MoveToSmallProps] = js.native
  
  trait MoveToSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoveToSmallProps {
    
    inline def apply(): MoveToSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveToSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoveToSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMoveToSmallMod.foo` */
  override def _to: FC[MoveToSmallProps] = default
}
