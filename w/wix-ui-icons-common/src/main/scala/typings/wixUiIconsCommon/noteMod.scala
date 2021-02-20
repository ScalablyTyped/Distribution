package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Note", JSImport.Default)
  @js.native
  val default: SFC[NoteProps] = js.native
  
  @js.native
  trait NoteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object NoteProps {
    
    @scala.inline
    def apply(): NoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoteProps]
    }
    
    @scala.inline
    implicit class NotePropsMutableBuilder[Self <: NoteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[NoteProps]
  
  /* This means you don't have to write `default`, but can instead just say `noteMod.foo` */
  override def _to: SFC[NoteProps] = default
}
