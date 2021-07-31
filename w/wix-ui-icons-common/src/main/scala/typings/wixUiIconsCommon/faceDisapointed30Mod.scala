package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceDisapointed30Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FaceDisapointed30", JSImport.Default)
  @js.native
  val default: SFC[FaceDisapointed30Props] = js.native
  
  trait FaceDisapointed30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FaceDisapointed30Props {
    
    @scala.inline
    def apply(): FaceDisapointed30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceDisapointed30Props]
    }
    
    @scala.inline
    implicit class FaceDisapointed30PropsMutableBuilder[Self <: FaceDisapointed30Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FaceDisapointed30Props]
  
  /* This means you don't have to write `default`, but can instead just say `faceDisapointed30Mod.foo` */
  override def _to: SFC[FaceDisapointed30Props] = default
}
