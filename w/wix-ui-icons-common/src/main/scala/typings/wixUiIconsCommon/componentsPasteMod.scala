package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPasteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Paste", JSImport.Default)
  @js.native
  val default: FC[PasteProps] = js.native
  
  trait PasteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PasteProps {
    
    inline def apply(): PasteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteProps]
    }
    
    extension [Self <: PasteProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PasteProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsPasteMod.foo` */
  override def _to: FC[PasteProps] = default
}
