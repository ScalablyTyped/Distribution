package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/Stack", JSImport.Default)
  @js.native
  val default: FC[StackProps] = js.native
  
  trait StackProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StackProps {
    
    inline def apply(): StackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackProps]
    }
    
    extension [Self <: StackProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StackProps]
  
  /* This means you don't have to write `default`, but can instead just say `stackMod.foo` */
  override def _to: FC[StackProps] = default
}
