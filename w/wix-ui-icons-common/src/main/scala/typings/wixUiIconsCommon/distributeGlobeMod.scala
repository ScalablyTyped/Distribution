package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeGlobeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeGlobe", JSImport.Default)
  @js.native
  val default: SFC[DistributeGlobeProps] = js.native
  
  @js.native
  trait DistributeGlobeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeGlobeProps {
    
    @scala.inline
    def apply(): DistributeGlobeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeProps]
    }
    
    @scala.inline
    implicit class DistributeGlobePropsMutableBuilder[Self <: DistributeGlobeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DistributeGlobeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeGlobeMod.foo` */
  override def _to: SFC[DistributeGlobeProps] = default
}
