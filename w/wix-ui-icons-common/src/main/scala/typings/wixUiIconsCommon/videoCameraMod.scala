package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoCameraMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VideoCamera", JSImport.Default)
  @js.native
  val default: SFC[VideoCameraProps] = js.native
  
  @js.native
  trait VideoCameraProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VideoCameraProps {
    
    @scala.inline
    def apply(): VideoCameraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoCameraProps]
    }
    
    @scala.inline
    implicit class VideoCameraPropsMutableBuilder[Self <: VideoCameraProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VideoCameraProps]
  
  /* This means you don't have to write `default`, but can instead just say `videoCameraMod.foo` */
  override def _to: SFC[VideoCameraProps] = default
}
