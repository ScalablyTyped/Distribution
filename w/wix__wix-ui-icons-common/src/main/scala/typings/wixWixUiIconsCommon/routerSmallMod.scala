package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/RouterSmall", JSImport.Default)
  @js.native
  val default: FC[RouterSmallProps] = js.native
  
  trait RouterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RouterSmallProps {
    
    inline def apply(): RouterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterSmallProps]
    }
    
    extension [Self <: RouterSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RouterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `routerSmallMod.foo` */
  override def _to: FC[RouterSmallProps] = default
}
