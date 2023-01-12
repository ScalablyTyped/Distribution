package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAdmissionAreaSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AdmissionAreaSmall", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdmissionAreaSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AdmissionAreaSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAdmissionAreaSmallMod.foo` */
  override def _to: FC[AdmissionAreaSmallProps] = default
}
