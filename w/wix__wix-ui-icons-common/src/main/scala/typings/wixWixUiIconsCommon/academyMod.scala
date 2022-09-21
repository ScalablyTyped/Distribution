package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object academyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/Academy", JSImport.Default)
  @js.native
  val default: FC[AcademyProps] = js.native
  
  trait AcademyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AcademyProps {
    
    inline def apply(): AcademyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcademyProps]
    }
    
    extension [Self <: AcademyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AcademyProps]
  
  /* This means you don't have to write `default`, but can instead just say `academyMod.foo` */
  override def _to: FC[AcademyProps] = default
}
