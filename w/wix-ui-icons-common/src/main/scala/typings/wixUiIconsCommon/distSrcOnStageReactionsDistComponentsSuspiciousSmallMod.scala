package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageReactionsDistComponentsSuspiciousSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/SuspiciousSmall", JSImport.Default)
  @js.native
  val default: FC[SuspiciousSmallProps] = js.native
  
  trait SuspiciousSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SuspiciousSmallProps {
    
    inline def apply(): SuspiciousSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuspiciousSmallProps]
    }
    
    extension [Self <: SuspiciousSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SuspiciousSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageReactionsDistComponentsSuspiciousSmallMod.foo` */
  override def _to: FC[SuspiciousSmallProps] = default
}
