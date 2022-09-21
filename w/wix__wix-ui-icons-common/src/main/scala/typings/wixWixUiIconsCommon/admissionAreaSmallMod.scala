package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionAreaSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/AdmissionAreaSmall", JSImport.Default)
  @js.native
  val default: FC[AdmissionAreaSmallProps] = js.native
  
  trait AdmissionAreaSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AdmissionAreaSmallProps {
    
    inline def apply(): AdmissionAreaSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdmissionAreaSmallProps]
    }
    
    extension [Self <: AdmissionAreaSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AdmissionAreaSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `admissionAreaSmallMod.foo` */
  override def _to: FC[AdmissionAreaSmallProps] = default
}
