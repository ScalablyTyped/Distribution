package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkroomMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Checkroom", JSImport.Default)
  @js.native
  val default: FC[CheckroomProps] = js.native
  
  trait CheckroomProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CheckroomProps {
    
    inline def apply(): CheckroomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckroomProps]
    }
    
    extension [Self <: CheckroomProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckroomProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkroomMod.foo` */
  override def _to: FC[CheckroomProps] = default
}
