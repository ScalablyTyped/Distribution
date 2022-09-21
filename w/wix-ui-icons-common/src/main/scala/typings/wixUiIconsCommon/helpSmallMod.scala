package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpSmall", JSImport.Default)
  @js.native
  val default: FC[HelpSmallProps] = js.native
  
  trait HelpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HelpSmallProps {
    
    inline def apply(): HelpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpSmallProps]
    }
    
    extension [Self <: HelpSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HelpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpSmallMod.foo` */
  override def _to: FC[HelpSmallProps] = default
}
