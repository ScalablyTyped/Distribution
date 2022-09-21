package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Bow", JSImport.Default)
  @js.native
  val default: FC[BowProps] = js.native
  
  trait BowProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BowProps {
    
    inline def apply(): BowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BowProps]
    }
    
    extension [Self <: BowProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BowProps]
  
  /* This means you don't have to write `default`, but can instead just say `bowMod.foo` */
  override def _to: FC[BowProps] = default
}
