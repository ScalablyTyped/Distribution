package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object successSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/SuccessSmall", JSImport.Default)
  @js.native
  val default: FC[SuccessSmallProps] = js.native
  
  trait SuccessSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SuccessSmallProps {
    
    inline def apply(): SuccessSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessSmallProps]
    }
    
    extension [Self <: SuccessSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SuccessSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `successSmallMod.foo` */
  override def _to: FC[SuccessSmallProps] = default
}
