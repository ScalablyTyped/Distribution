package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskArchiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskArchiveSmall", JSImport.Default)
  @js.native
  val default: SFC[TaskArchiveSmallProps] = js.native
  
  trait TaskArchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TaskArchiveSmallProps {
    
    @scala.inline
    def apply(): TaskArchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskArchiveSmallProps]
    }
    
    @scala.inline
    implicit class TaskArchiveSmallPropsMutableBuilder[Self <: TaskArchiveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TaskArchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskArchiveSmallMod.foo` */
  override def _to: SFC[TaskArchiveSmallProps] = default
}
