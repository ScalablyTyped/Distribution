package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/Move", JSImport.Default)
  @js.native
  val default: SFC[MoveProps] = js.native
  
  @js.native
  trait MoveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MoveProps {
    
    @scala.inline
    def apply(): MoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveProps]
    }
    
    @scala.inline
    implicit class MovePropsMutableBuilder[Self <: MoveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveMod.foo` */
  override def _to: SFC[MoveProps] = default
}
