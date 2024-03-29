package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsTableRoundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TableRound", JSImport.Default)
  @js.native
  val default: FC[TableRoundProps] = js.native
  
  trait TableRoundProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TableRoundProps {
    
    inline def apply(): TableRoundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRoundProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRoundProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TableRoundProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsTableRoundMod.foo` */
  override def _to: FC[TableRoundProps] = default
}
