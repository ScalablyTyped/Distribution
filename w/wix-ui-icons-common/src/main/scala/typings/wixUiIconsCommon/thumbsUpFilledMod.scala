package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ThumbsUpFilled", JSImport.Default)
  @js.native
  val default: SFC[ThumbsUpFilledProps] = js.native
  
  trait ThumbsUpFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ThumbsUpFilledProps {
    
    @scala.inline
    def apply(): ThumbsUpFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpFilledProps]
    }
    
    @scala.inline
    implicit class ThumbsUpFilledPropsMutableBuilder[Self <: ThumbsUpFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ThumbsUpFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpFilledMod.foo` */
  override def _to: SFC[ThumbsUpFilledProps] = default
}
