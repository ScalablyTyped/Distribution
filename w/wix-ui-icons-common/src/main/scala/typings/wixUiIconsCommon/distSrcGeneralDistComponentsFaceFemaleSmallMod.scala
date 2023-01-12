package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFaceFemaleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceFemaleSmall", JSImport.Default)
  @js.native
  val default: FC[FaceFemaleSmallProps] = js.native
  
  trait FaceFemaleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaceFemaleSmallProps {
    
    inline def apply(): FaceFemaleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFemaleSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaceFemaleSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaceFemaleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFaceFemaleSmallMod.foo` */
  override def _to: FC[FaceFemaleSmallProps] = default
}
