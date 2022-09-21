package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stairsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Stairs", JSImport.Default)
  @js.native
  val default: FC[StairsProps] = js.native
  
  trait StairsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StairsProps {
    
    inline def apply(): StairsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StairsProps]
    }
    
    extension [Self <: StairsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StairsProps]
  
  /* This means you don't have to write `default`, but can instead just say `stairsMod.foo` */
  override def _to: FC[StairsProps] = default
}
