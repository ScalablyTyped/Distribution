package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sadSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/SadSmall", JSImport.Default)
  @js.native
  val default: FC[SadSmallProps] = js.native
  
  trait SadSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SadSmallProps {
    
    inline def apply(): SadSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SadSmallProps]
    }
    
    extension [Self <: SadSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SadSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sadSmallMod.foo` */
  override def _to: FC[SadSmallProps] = default
}
