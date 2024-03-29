package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsWixForumSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixForumSmall", JSImport.Default)
  @js.native
  val default: FC[WixForumSmallProps] = js.native
  
  trait WixForumSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixForumSmallProps {
    
    inline def apply(): WixForumSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixForumSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixForumSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixForumSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsWixForumSmallMod.foo` */
  override def _to: FC[WixForumSmallProps] = default
}
