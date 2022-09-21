package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ChevronUpBold", JSImport.Default)
  @js.native
  val default: FC[ChevronUpBoldProps] = js.native
  
  trait ChevronUpBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpBoldProps {
    
    inline def apply(): ChevronUpBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpBoldProps]
    }
    
    extension [Self <: ChevronUpBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpBoldMod.foo` */
  override def _to: FC[ChevronUpBoldProps] = default
}
