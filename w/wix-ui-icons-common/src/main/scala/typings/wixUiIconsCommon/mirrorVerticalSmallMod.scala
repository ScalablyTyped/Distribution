package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorVerticalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MirrorVerticalSmall", JSImport.Default)
  @js.native
  val default: SFC[MirrorVerticalSmallProps] = js.native
  
  @js.native
  trait MirrorVerticalSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MirrorVerticalSmallProps {
    
    @scala.inline
    def apply(): MirrorVerticalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorVerticalSmallProps]
    }
    
    @scala.inline
    implicit class MirrorVerticalSmallPropsMutableBuilder[Self <: MirrorVerticalSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MirrorVerticalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `mirrorVerticalSmallMod.foo` */
  override def _to: SFC[MirrorVerticalSmallProps] = default
}
