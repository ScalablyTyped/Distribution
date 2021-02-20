package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceGriningMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceGrining", JSImport.Default)
  @js.native
  val default: SFC[FaceGriningProps] = js.native
  
  @js.native
  trait FaceGriningProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceGriningProps {
    
    @scala.inline
    def apply(): FaceGriningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceGriningProps]
    }
    
    @scala.inline
    implicit class FaceGriningPropsMutableBuilder[Self <: FaceGriningProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FaceGriningProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceGriningMod.foo` */
  override def _to: SFC[FaceGriningProps] = default
}
