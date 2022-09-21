package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMobileBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/MobileBold", JSImport.Default)
  @js.native
  val default: FC[MobileBoldProps] = js.native
  
  trait MobileBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MobileBoldProps {
    
    inline def apply(): MobileBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileBoldProps]
    }
    
    extension [Self <: MobileBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MobileBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsMobileBoldMod.foo` */
  override def _to: FC[MobileBoldProps] = default
}
