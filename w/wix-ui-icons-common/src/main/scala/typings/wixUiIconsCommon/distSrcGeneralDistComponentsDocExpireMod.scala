package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDocExpireMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocExpire", JSImport.Default)
  @js.native
  val default: FC[DocExpireProps] = js.native
  
  trait DocExpireProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocExpireProps {
    
    inline def apply(): DocExpireProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocExpireProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocExpireProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocExpireProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDocExpireMod.foo` */
  override def _to: FC[DocExpireProps] = default
}
