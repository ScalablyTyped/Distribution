package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeObjectSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/CodeObjectSmall", JSImport.Default)
  @js.native
  val default: FC[CodeObjectSmallProps] = js.native
  
  trait CodeObjectSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CodeObjectSmallProps {
    
    inline def apply(): CodeObjectSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeObjectSmallProps]
    }
    
    extension [Self <: CodeObjectSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CodeObjectSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `codeObjectSmallMod.foo` */
  override def _to: FC[CodeObjectSmallProps] = default
}
