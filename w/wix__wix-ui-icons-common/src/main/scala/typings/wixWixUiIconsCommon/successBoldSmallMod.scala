package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object successBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/SuccessBoldSmall", JSImport.Default)
  @js.native
  val default: FC[SuccessBoldSmallProps] = js.native
  
  trait SuccessBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SuccessBoldSmallProps {
    
    inline def apply(): SuccessBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessBoldSmallProps]
    }
    
    extension [Self <: SuccessBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SuccessBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `successBoldSmallMod.foo` */
  override def _to: FC[SuccessBoldSmallProps] = default
}
