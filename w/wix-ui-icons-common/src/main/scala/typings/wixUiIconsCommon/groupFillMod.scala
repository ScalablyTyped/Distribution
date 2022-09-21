package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/GroupFill", JSImport.Default)
  @js.native
  val default: FC[GroupFillProps] = js.native
  
  trait GroupFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GroupFillProps {
    
    inline def apply(): GroupFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupFillProps]
    }
    
    extension [Self <: GroupFillProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GroupFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `groupFillMod.foo` */
  override def _to: FC[GroupFillProps] = default
}
