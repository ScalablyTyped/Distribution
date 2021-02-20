package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenerySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ScenerySmall", JSImport.Default)
  @js.native
  val default: SFC[ScenerySmallProps] = js.native
  
  @js.native
  trait ScenerySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ScenerySmallProps {
    
    @scala.inline
    def apply(): ScenerySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScenerySmallProps]
    }
    
    @scala.inline
    implicit class ScenerySmallPropsMutableBuilder[Self <: ScenerySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ScenerySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `scenerySmallMod.foo` */
  override def _to: SFC[ScenerySmallProps] = default
}
