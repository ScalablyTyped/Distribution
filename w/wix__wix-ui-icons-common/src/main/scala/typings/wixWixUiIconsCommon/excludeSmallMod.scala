package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excludeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ExcludeSmall", JSImport.Default)
  @js.native
  val default: FC[ExcludeSmallProps] = js.native
  
  trait ExcludeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExcludeSmallProps {
    
    inline def apply(): ExcludeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeSmallProps]
    }
    
    extension [Self <: ExcludeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExcludeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `excludeSmallMod.foo` */
  override def _to: FC[ExcludeSmallProps] = default
}
