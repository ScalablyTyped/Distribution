package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStopSmall", JSImport.Default)
  @js.native
  val default: FC[StatusStopSmallProps] = js.native
  
  trait StatusStopSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusStopSmallProps {
    
    inline def apply(): StatusStopSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopSmallProps]
    }
    
    extension [Self <: StatusStopSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusStopSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopSmallMod.foo` */
  override def _to: FC[StatusStopSmallProps] = default
}
