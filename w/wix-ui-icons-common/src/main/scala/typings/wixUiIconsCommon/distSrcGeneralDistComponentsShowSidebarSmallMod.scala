package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsShowSidebarSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ShowSidebarSmall", JSImport.Default)
  @js.native
  val default: FC[ShowSidebarSmallProps] = js.native
  
  trait ShowSidebarSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShowSidebarSmallProps {
    
    inline def apply(): ShowSidebarSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowSidebarSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowSidebarSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShowSidebarSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsShowSidebarSmallMod.foo` */
  override def _to: FC[ShowSidebarSmallProps] = default
}
