package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDateAndTimeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateAndTimeSmall", JSImport.Default)
  @js.native
  val default: FC[DateAndTimeSmallProps] = js.native
  
  trait DateAndTimeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateAndTimeSmallProps {
    
    inline def apply(): DateAndTimeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateAndTimeSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateAndTimeSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateAndTimeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDateAndTimeSmallMod.foo` */
  override def _to: FC[DateAndTimeSmallProps] = default
}
