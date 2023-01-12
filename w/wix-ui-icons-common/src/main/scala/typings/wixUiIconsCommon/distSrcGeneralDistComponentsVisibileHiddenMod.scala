package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVisibileHiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VisibileHidden", JSImport.Default)
  @js.native
  val default: FC[VisibileHiddenProps] = js.native
  
  trait VisibileHiddenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VisibileHiddenProps {
    
    inline def apply(): VisibileHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibileHiddenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisibileHiddenProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VisibileHiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVisibileHiddenMod.foo` */
  override def _to: FC[VisibileHiddenProps] = default
}
