package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PlaySmall", JSImport.Default)
  @js.native
  val default: SFC[PlaySmallProps] = js.native
  
  trait PlaySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PlaySmallProps {
    
    @scala.inline
    def apply(): PlaySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaySmallProps]
    }
    
    @scala.inline
    implicit class PlaySmallPropsMutableBuilder[Self <: PlaySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PlaySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `playSmallMod.foo` */
  override def _to: SFC[PlaySmallProps] = default
}
