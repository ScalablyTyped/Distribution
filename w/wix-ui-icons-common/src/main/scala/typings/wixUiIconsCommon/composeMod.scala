package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Compose", JSImport.Default)
  @js.native
  val default: SFC[ComposeProps] = js.native
  
  trait ComposeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ComposeProps {
    
    @scala.inline
    def apply(): ComposeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeProps]
    }
    
    @scala.inline
    implicit class ComposePropsMutableBuilder[Self <: ComposeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ComposeProps]
  
  /* This means you don't have to write `default`, but can instead just say `composeMod.foo` */
  override def _to: SFC[ComposeProps] = default
}
