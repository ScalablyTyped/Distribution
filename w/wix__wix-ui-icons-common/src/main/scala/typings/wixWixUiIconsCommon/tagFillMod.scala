package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagFillMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/TagFill", JSImport.Default)
  @js.native
  val default: FC[TagFillProps] = js.native
  
  trait TagFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TagFillProps {
    
    inline def apply(): TagFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagFillProps]
    }
    
    extension [Self <: TagFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TagFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagFillMod.foo` */
  override def _to: FC[TagFillProps] = default
}
