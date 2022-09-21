package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/SelectLarge", JSImport.Default)
  @js.native
  val default: FC[SelectLargeProps] = js.native
  
  trait SelectLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SelectLargeProps {
    
    inline def apply(): SelectLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectLargeProps]
    }
    
    extension [Self <: SelectLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SelectLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectLargeMod.foo` */
  override def _to: FC[SelectLargeProps] = default
}
