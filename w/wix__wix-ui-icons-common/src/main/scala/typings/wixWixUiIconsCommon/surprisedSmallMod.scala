package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object surprisedSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/SurprisedSmall", JSImport.Default)
  @js.native
  val default: FC[SurprisedSmallProps] = js.native
  
  trait SurprisedSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SurprisedSmallProps {
    
    inline def apply(): SurprisedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurprisedSmallProps]
    }
    
    extension [Self <: SurprisedSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SurprisedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `surprisedSmallMod.foo` */
  override def _to: FC[SurprisedSmallProps] = default
}
