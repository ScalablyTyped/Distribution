package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pauseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PauseSmall", JSImport.Default)
  @js.native
  val default: SFC[PauseSmallProps] = js.native
  
  trait PauseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PauseSmallProps {
    
    inline def apply(): PauseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseSmallProps]
    }
    
    extension [Self <: PauseSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PauseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pauseSmallMod.foo` */
  override def _to: SFC[PauseSmallProps] = default
}
