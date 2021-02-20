package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ThumbsUp", JSImport.Default)
  @js.native
  val default: SFC[ThumbsUpProps] = js.native
  
  @js.native
  trait ThumbsUpProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ThumbsUpProps {
    
    @scala.inline
    def apply(): ThumbsUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpProps]
    }
    
    @scala.inline
    implicit class ThumbsUpPropsMutableBuilder[Self <: ThumbsUpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ThumbsUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpMod.foo` */
  override def _to: SFC[ThumbsUpProps] = default
}
