package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PublicSmall", JSImport.Default)
  @js.native
  val default: FC[PublicSmallProps] = js.native
  
  trait PublicSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PublicSmallProps {
    
    inline def apply(): PublicSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicSmallProps]
    }
    
    extension [Self <: PublicSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PublicSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `publicSmallMod.foo` */
  override def _to: FC[PublicSmallProps] = default
}
