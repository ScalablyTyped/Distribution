package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAlignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignLeft", JSImport.Default)
  @js.native
  val default: FC[AlignLeftProps] = js.native
  
  trait AlignLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignLeftProps {
    
    inline def apply(): AlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignLeftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignLeftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAlignLeftMod.foo` */
  override def _to: FC[AlignLeftProps] = default
}
