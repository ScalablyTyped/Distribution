package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Boolean", JSImport.Default)
  @js.native
  val default: FC[BooleanProps] = js.native
  
  trait BooleanProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BooleanProps {
    
    inline def apply(): BooleanProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BooleanProps]
    }
    
    extension [Self <: BooleanProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BooleanProps]
  
  /* This means you don't have to write `default`, but can instead just say `booleanMod.foo` */
  override def _to: FC[BooleanProps] = default
}
