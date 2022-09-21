package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Interactions", JSImport.Default)
  @js.native
  val default: FC[InteractionsProps] = js.native
  
  trait InteractionsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InteractionsProps {
    
    inline def apply(): InteractionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionsProps]
    }
    
    extension [Self <: InteractionsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InteractionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `interactionsMod.foo` */
  override def _to: FC[InteractionsProps] = default
}
