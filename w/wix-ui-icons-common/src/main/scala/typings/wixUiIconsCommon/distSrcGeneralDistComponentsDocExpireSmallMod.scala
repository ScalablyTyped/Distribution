package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDocExpireSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocExpireSmall", JSImport.Default)
  @js.native
  val default: FC[DocExpireSmallProps] = js.native
  
  trait DocExpireSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocExpireSmallProps {
    
    inline def apply(): DocExpireSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocExpireSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocExpireSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocExpireSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDocExpireSmallMod.foo` */
  override def _to: FC[DocExpireSmallProps] = default
}
