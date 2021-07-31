package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Undo", JSImport.Default)
  @js.native
  val default: SFC[UndoProps] = js.native
  
  trait UndoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UndoProps {
    
    @scala.inline
    def apply(): UndoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndoProps]
    }
    
    @scala.inline
    implicit class UndoPropsMutableBuilder[Self <: UndoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UndoProps]
  
  /* This means you don't have to write `default`, but can instead just say `undoMod.foo` */
  override def _to: SFC[UndoProps] = default
}
