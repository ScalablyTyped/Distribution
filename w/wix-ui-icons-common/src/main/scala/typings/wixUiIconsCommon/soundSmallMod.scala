package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SoundSmall", JSImport.Default)
  @js.native
  val default: SFC[SoundSmallProps] = js.native
  
  trait SoundSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SoundSmallProps {
    
    inline def apply(): SoundSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundSmallProps]
    }
    
    extension [Self <: SoundSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SoundSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundSmallMod.foo` */
  override def _to: SFC[SoundSmallProps] = default
}
