package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/AdminFill", JSImport.Default)
  @js.native
  val default: FC[AdminFillProps] = js.native
  
  trait AdminFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AdminFillProps {
    
    inline def apply(): AdminFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminFillProps]
    }
    
    extension [Self <: AdminFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AdminFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `adminFillMod.foo` */
  override def _to: FC[AdminFillProps] = default
}
