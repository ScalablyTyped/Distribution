package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsStarMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Star", JSImport.Default)
  @js.native
  val default: FC[StarProps] = js.native
  
  trait StarProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StarProps {
    
    inline def apply(): StarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarProps]
    }
    
    extension [Self <: StarProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsStarMod.foo` */
  override def _to: FC[StarProps] = default
}
