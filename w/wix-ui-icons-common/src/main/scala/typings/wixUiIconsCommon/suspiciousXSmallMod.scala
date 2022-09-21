package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suspiciousXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/SuspiciousXSmall", JSImport.Default)
  @js.native
  val default: FC[SuspiciousXSmallProps] = js.native
  
  trait SuspiciousXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SuspiciousXSmallProps {
    
    inline def apply(): SuspiciousXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuspiciousXSmallProps]
    }
    
    extension [Self <: SuspiciousXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SuspiciousXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `suspiciousXSmallMod.foo` */
  override def _to: FC[SuspiciousXSmallProps] = default
}
