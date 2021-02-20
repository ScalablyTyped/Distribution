package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starFilledTinyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/StarFilledTiny", JSImport.Default)
  @js.native
  val default: SFC[StarFilledTinyProps] = js.native
  
  @js.native
  trait StarFilledTinyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StarFilledTinyProps {
    
    @scala.inline
    def apply(): StarFilledTinyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarFilledTinyProps]
    }
    
    @scala.inline
    implicit class StarFilledTinyPropsMutableBuilder[Self <: StarFilledTinyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StarFilledTinyProps]
  
  /* This means you don't have to write `default`, but can instead just say `starFilledTinyMod.foo` */
  override def _to: SFC[StarFilledTinyProps] = default
}
