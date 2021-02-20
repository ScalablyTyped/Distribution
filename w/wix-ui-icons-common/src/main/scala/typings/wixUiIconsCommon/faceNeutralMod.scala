package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceNeutralMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceNeutral", JSImport.Default)
  @js.native
  val default: SFC[FaceNeutralProps] = js.native
  
  @js.native
  trait FaceNeutralProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceNeutralProps {
    
    @scala.inline
    def apply(): FaceNeutralProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceNeutralProps]
    }
    
    @scala.inline
    implicit class FaceNeutralPropsMutableBuilder[Self <: FaceNeutralProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FaceNeutralProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceNeutralMod.foo` */
  override def _to: SFC[FaceNeutralProps] = default
}
