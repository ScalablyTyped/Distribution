package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onlineProgramsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OnlineProgramsSmall", JSImport.Default)
  @js.native
  val default: FC[OnlineProgramsSmallProps] = js.native
  
  trait OnlineProgramsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OnlineProgramsSmallProps {
    
    inline def apply(): OnlineProgramsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnlineProgramsSmallProps]
    }
    
    extension [Self <: OnlineProgramsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OnlineProgramsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onlineProgramsSmallMod.foo` */
  override def _to: FC[OnlineProgramsSmallProps] = default
}
