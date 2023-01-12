package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFaceFrowning30Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FaceFrowning30", JSImport.Default)
  @js.native
  val default: FC[FaceFrowning30Props] = js.native
  
  trait FaceFrowning30Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceFrowning30Props {
    
    inline def apply(): FaceFrowning30Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFrowning30Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaceFrowning30Props] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceFrowning30Props]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFaceFrowning30Mod.foo` */
  override def _to: FC[FaceFrowning30Props] = default
}
