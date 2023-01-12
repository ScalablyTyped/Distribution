package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsStatusStopFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/StatusStopFilled", JSImport.Default)
  @js.native
  val default: FC[StatusStopFilledProps] = js.native
  
  trait StatusStopFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusStopFilledProps {
    
    inline def apply(): StatusStopFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusStopFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusStopFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsStatusStopFilledMod.foo` */
  override def _to: FC[StatusStopFilledProps] = default
}
