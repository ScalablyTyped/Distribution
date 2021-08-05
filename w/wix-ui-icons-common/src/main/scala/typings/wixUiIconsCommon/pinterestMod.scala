package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinterestMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Pinterest", JSImport.Default)
  @js.native
  val default: SFC[PinterestProps] = js.native
  
  trait PinterestProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PinterestProps {
    
    inline def apply(): PinterestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinterestProps]
    }
    
    extension [Self <: PinterestProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PinterestProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinterestMod.foo` */
  override def _to: SFC[PinterestProps] = default
}
