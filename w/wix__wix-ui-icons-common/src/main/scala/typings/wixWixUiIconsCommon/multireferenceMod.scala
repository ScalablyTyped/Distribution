package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multireferenceMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Multireference", JSImport.Default)
  @js.native
  val default: FC[MultireferenceProps] = js.native
  
  trait MultireferenceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MultireferenceProps {
    
    inline def apply(): MultireferenceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultireferenceProps]
    }
    
    extension [Self <: MultireferenceProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MultireferenceProps]
  
  /* This means you don't have to write `default`, but can instead just say `multireferenceMod.foo` */
  override def _to: FC[MultireferenceProps] = default
}
