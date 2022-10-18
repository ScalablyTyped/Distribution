package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPlayFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PlayFilledSmall", JSImport.Default)
  @js.native
  val default: FC[PlayFilledSmallProps] = js.native
  
  trait PlayFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlayFilledSmallProps {
    
    inline def apply(): PlayFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayFilledSmallProps]
    }
    
    extension [Self <: PlayFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlayFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPlayFilledSmallMod.foo` */
  override def _to: FC[PlayFilledSmallProps] = default
}
