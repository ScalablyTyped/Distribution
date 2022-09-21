package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/App", JSImport.Default)
  @js.native
  val default: FC[AppProps] = js.native
  
  trait AppProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AppProps {
    
    inline def apply(): AppProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppProps]
    }
    
    extension [Self <: AppProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AppProps]
  
  /* This means you don't have to write `default`, but can instead just say `appMod.foo` */
  override def _to: FC[AppProps] = default
}
