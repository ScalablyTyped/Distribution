package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rearrangeableMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/Rearrangeable", JSImport.Default)
  @js.native
  val default: FC[RearrangeableProps] = js.native
  
  trait RearrangeableProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RearrangeableProps {
    
    inline def apply(): RearrangeableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RearrangeableProps]
    }
    
    extension [Self <: RearrangeableProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RearrangeableProps]
  
  /* This means you don't have to write `default`, but can instead just say `rearrangeableMod.foo` */
  override def _to: FC[RearrangeableProps] = default
}
