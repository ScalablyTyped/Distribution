package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCopyBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/CopyBold", JSImport.Default)
  @js.native
  val default: FC[CopyBoldProps] = js.native
  
  trait CopyBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CopyBoldProps {
    
    inline def apply(): CopyBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyBoldProps]
    }
    
    extension [Self <: CopyBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CopyBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsCopyBoldMod.foo` */
  override def _to: FC[CopyBoldProps] = default
}
