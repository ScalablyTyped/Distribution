package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FlagSmall", JSImport.Default)
  @js.native
  val default: FC[FlagSmallProps] = js.native
  
  trait FlagSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagSmallProps {
    
    inline def apply(): FlagSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagSmallProps]
    }
    
    extension [Self <: FlagSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `flagSmallMod.foo` */
  override def _to: FC[FlagSmallProps] = default
}
