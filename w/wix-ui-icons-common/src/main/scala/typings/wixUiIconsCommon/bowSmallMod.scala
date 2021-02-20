package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bowSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BowSmall", JSImport.Default)
  @js.native
  val default: SFC[BowSmallProps] = js.native
  
  @js.native
  trait BowSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BowSmallProps {
    
    @scala.inline
    def apply(): BowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BowSmallProps]
    }
    
    @scala.inline
    implicit class BowSmallPropsMutableBuilder[Self <: BowSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `bowSmallMod.foo` */
  override def _to: SFC[BowSmallProps] = default
}
