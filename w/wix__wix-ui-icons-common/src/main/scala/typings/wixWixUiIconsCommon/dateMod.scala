package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Date", JSImport.Default)
  @js.native
  val default: FC[DateProps] = js.native
  
  trait DateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateProps {
    
    inline def apply(): DateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateProps]
    }
    
    extension [Self <: DateProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateMod.foo` */
  override def _to: FC[DateProps] = default
}
