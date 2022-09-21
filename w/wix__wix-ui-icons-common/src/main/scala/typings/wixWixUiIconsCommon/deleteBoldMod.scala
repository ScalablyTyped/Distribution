package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/DeleteBold", JSImport.Default)
  @js.native
  val default: FC[DeleteBoldProps] = js.native
  
  trait DeleteBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DeleteBoldProps {
    
    inline def apply(): DeleteBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBoldProps]
    }
    
    extension [Self <: DeleteBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DeleteBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `deleteBoldMod.foo` */
  override def _to: FC[DeleteBoldProps] = default
}
