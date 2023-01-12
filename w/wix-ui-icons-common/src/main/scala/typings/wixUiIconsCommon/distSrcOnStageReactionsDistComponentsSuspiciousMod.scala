package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageReactionsDistComponentsSuspiciousMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/Suspicious", JSImport.Default)
  @js.native
  val default: FC[SuspiciousProps] = js.native
  
  trait SuspiciousProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SuspiciousProps {
    
    inline def apply(): SuspiciousProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuspiciousProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuspiciousProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SuspiciousProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageReactionsDistComponentsSuspiciousMod.foo` */
  override def _to: FC[SuspiciousProps] = default
}
