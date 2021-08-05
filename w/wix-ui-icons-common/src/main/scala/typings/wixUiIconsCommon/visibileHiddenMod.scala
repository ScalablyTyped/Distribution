package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibileHiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VisibileHidden", JSImport.Default)
  @js.native
  val default: SFC[VisibileHiddenProps] = js.native
  
  trait VisibileHiddenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object VisibileHiddenProps {
    
    inline def apply(): VisibileHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibileHiddenProps]
    }
    
    extension [Self <: VisibileHiddenProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VisibileHiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `visibileHiddenMod.foo` */
  override def _to: SFC[VisibileHiddenProps] = default
}
