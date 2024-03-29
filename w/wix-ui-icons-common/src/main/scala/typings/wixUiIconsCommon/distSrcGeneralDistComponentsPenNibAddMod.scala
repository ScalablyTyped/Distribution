package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPenNibAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNibAdd", JSImport.Default)
  @js.native
  val default: FC[PenNibAddProps] = js.native
  
  trait PenNibAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PenNibAddProps {
    
    inline def apply(): PenNibAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibAddProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PenNibAddProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PenNibAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPenNibAddMod.foo` */
  override def _to: FC[PenNibAddProps] = default
}
