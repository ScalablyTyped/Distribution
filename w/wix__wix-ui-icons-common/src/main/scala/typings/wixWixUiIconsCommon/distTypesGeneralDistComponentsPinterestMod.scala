package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPinterestMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Pinterest", JSImport.Default)
  @js.native
  val default: FC[PinterestProps] = js.native
  
  trait PinterestProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PinterestProps {
    
    inline def apply(): PinterestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinterestProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinterestProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PinterestProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPinterestMod.foo` */
  override def _to: FC[PinterestProps] = default
}
