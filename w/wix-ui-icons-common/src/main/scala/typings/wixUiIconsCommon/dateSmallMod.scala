package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateSmall", JSImport.Default)
  @js.native
  val default: FC[DateSmallProps] = js.native
  
  trait DateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateSmallProps {
    
    inline def apply(): DateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateSmallProps]
    }
    
    extension [Self <: DateSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateSmallMod.foo` */
  override def _to: FC[DateSmallProps] = default
}
