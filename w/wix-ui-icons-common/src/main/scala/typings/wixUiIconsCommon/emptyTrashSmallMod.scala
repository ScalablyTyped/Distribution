package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyTrashSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmptyTrashSmall", JSImport.Default)
  @js.native
  val default: FC[EmptyTrashSmallProps] = js.native
  
  trait EmptyTrashSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmptyTrashSmallProps {
    
    inline def apply(): EmptyTrashSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyTrashSmallProps]
    }
    
    extension [Self <: EmptyTrashSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmptyTrashSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emptyTrashSmallMod.foo` */
  override def _to: FC[EmptyTrashSmallProps] = default
}
