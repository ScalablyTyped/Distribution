package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeGlobeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeGlobeSmall", JSImport.Default)
  @js.native
  val default: SFC[DistributeGlobeSmallProps] = js.native
  
  @js.native
  trait DistributeGlobeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DistributeGlobeSmallProps {
    
    @scala.inline
    def apply(): DistributeGlobeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeSmallProps]
    }
    
    @scala.inline
    implicit class DistributeGlobeSmallPropsMutableBuilder[Self <: DistributeGlobeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DistributeGlobeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeGlobeSmallMod.foo` */
  override def _to: SFC[DistributeGlobeSmallProps] = default
}
