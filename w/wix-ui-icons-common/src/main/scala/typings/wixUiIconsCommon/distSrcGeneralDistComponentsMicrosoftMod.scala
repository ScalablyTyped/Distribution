package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsMicrosoftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Microsoft", JSImport.Default)
  @js.native
  val default: FC[MicrosoftProps] = js.native
  
  trait MicrosoftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MicrosoftProps {
    
    inline def apply(): MicrosoftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrosoftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MicrosoftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MicrosoftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsMicrosoftMod.foo` */
  override def _to: FC[MicrosoftProps] = default
}
