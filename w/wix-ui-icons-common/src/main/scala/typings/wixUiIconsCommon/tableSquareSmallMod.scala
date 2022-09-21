package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSquareSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableSquareSmall", JSImport.Default)
  @js.native
  val default: FC[TableSquareSmallProps] = js.native
  
  trait TableSquareSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableSquareSmallProps {
    
    inline def apply(): TableSquareSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSquareSmallProps]
    }
    
    extension [Self <: TableSquareSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableSquareSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableSquareSmallMod.foo` */
  override def _to: FC[TableSquareSmallProps] = default
}
