package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDocSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocSendSmall", JSImport.Default)
  @js.native
  val default: FC[DocSendSmallProps] = js.native
  
  trait DocSendSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocSendSmallProps {
    
    inline def apply(): DocSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocSendSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocSendSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDocSendSmallMod.foo` */
  override def _to: FC[DocSendSmallProps] = default
}
