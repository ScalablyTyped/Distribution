package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsConfirmBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ConfirmBold", JSImport.Default)
  @js.native
  val default: FC[ConfirmBoldProps] = js.native
  
  trait ConfirmBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ConfirmBoldProps {
    
    inline def apply(): ConfirmBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmBoldProps]
    }
    
    extension [Self <: ConfirmBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ConfirmBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsConfirmBoldMod.foo` */
  override def _to: FC[ConfirmBoldProps] = default
}
