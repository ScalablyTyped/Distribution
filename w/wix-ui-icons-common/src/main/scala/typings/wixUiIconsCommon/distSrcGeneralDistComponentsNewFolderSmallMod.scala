package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsNewFolderSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NewFolderSmall", JSImport.Default)
  @js.native
  val default: FC[NewFolderSmallProps] = js.native
  
  trait NewFolderSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NewFolderSmallProps {
    
    inline def apply(): NewFolderSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewFolderSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewFolderSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NewFolderSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsNewFolderSmallMod.foo` */
  override def _to: FC[NewFolderSmallProps] = default
}
