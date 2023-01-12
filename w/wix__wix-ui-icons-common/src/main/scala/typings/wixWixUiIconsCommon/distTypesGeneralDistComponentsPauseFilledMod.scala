package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPauseFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PauseFilled", JSImport.Default)
  @js.native
  val default: FC[PauseFilledProps] = js.native
  
  trait PauseFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PauseFilledProps {
    
    inline def apply(): PauseFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PauseFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PauseFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPauseFilledMod.foo` */
  override def _to: FC[PauseFilledProps] = default
}
