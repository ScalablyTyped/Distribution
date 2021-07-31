package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PlayFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[PlayFilledSmallProps] = js.native
  
  trait PlayFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PlayFilledSmallProps {
    
    @scala.inline
    def apply(): PlayFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayFilledSmallProps]
    }
    
    @scala.inline
    implicit class PlayFilledSmallPropsMutableBuilder[Self <: PlayFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PlayFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `playFilledSmallMod.foo` */
  override def _to: SFC[PlayFilledSmallProps] = default
}
