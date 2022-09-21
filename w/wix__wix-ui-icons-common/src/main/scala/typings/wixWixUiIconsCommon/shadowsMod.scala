package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Shadows", JSImport.Default)
  @js.native
  val default: FC[ShadowsProps] = js.native
  
  trait ShadowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShadowsProps {
    
    inline def apply(): ShadowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowsProps]
    }
    
    extension [Self <: ShadowsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShadowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `shadowsMod.foo` */
  override def _to: FC[ShadowsProps] = default
}
