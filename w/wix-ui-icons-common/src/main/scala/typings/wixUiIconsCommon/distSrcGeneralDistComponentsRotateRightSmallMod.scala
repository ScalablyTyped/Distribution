package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsRotateRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateRightSmall", JSImport.Default)
  @js.native
  val default: FC[RotateRightSmallProps] = js.native
  
  trait RotateRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RotateRightSmallProps {
    
    inline def apply(): RotateRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateRightSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotateRightSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RotateRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsRotateRightSmallMod.foo` */
  override def _to: FC[RotateRightSmallProps] = default
}
