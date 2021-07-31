package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UndoSmall", JSImport.Default)
  @js.native
  val default: SFC[UndoSmallProps] = js.native
  
  trait UndoSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UndoSmallProps {
    
    @scala.inline
    def apply(): UndoSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndoSmallProps]
    }
    
    @scala.inline
    implicit class UndoSmallPropsMutableBuilder[Self <: UndoSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UndoSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `undoSmallMod.foo` */
  override def _to: SFC[UndoSmallProps] = default
}
