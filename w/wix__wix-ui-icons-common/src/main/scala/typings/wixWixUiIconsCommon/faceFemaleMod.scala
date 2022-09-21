package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceFemaleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FaceFemale", JSImport.Default)
  @js.native
  val default: FC[FaceFemaleProps] = js.native
  
  trait FaceFemaleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceFemaleProps {
    
    inline def apply(): FaceFemaleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFemaleProps]
    }
    
    extension [Self <: FaceFemaleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceFemaleProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceFemaleMod.foo` */
  override def _to: FC[FaceFemaleProps] = default
}
