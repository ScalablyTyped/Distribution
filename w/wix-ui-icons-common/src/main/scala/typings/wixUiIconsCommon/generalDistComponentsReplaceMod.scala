package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalDistComponentsReplaceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/Replace", JSImport.Default)
  @js.native
  val default: FC[ReplaceProps] = js.native
  
  trait ReplaceProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReplaceProps {
    
    inline def apply(): ReplaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceProps]
    }
    
    extension [Self <: ReplaceProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReplaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `generalDistComponentsReplaceMod.foo` */
  override def _to: FC[ReplaceProps] = default
}
