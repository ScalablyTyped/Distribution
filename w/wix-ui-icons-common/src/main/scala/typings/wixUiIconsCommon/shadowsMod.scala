package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Shadows", JSImport.Default)
  @js.native
  val default: SFC[ShadowsProps] = js.native
  
  trait ShadowsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ShadowsProps {
    
    @scala.inline
    def apply(): ShadowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowsProps]
    }
    
    @scala.inline
    implicit class ShadowsPropsMutableBuilder[Self <: ShadowsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ShadowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `shadowsMod.foo` */
  override def _to: SFC[ShadowsProps] = default
}
