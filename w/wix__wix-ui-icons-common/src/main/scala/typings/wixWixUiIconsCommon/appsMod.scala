package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/Apps", JSImport.Default)
  @js.native
  val default: FC[AppsProps] = js.native
  
  trait AppsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AppsProps {
    
    inline def apply(): AppsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppsProps]
    }
    
    extension [Self <: AppsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AppsProps]
  
  /* This means you don't have to write `default`, but can instead just say `appsMod.foo` */
  override def _to: FC[AppsProps] = default
}
