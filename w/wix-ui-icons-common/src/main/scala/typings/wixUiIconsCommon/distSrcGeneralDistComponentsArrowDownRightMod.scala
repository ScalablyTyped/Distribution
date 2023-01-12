package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsArrowDownRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowDownRight", JSImport.Default)
  @js.native
  val default: FC[ArrowDownRightProps] = js.native
  
  trait ArrowDownRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownRightProps {
    
    inline def apply(): ArrowDownRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownRightProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowDownRightProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsArrowDownRightMod.foo` */
  override def _to: FC[ArrowDownRightProps] = default
}
