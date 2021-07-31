package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskAdd", JSImport.Default)
  @js.native
  val default: SFC[TaskAddProps] = js.native
  
  trait TaskAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TaskAddProps {
    
    @scala.inline
    def apply(): TaskAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskAddProps]
    }
    
    @scala.inline
    implicit class TaskAddPropsMutableBuilder[Self <: TaskAddProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TaskAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskAddMod.foo` */
  override def _to: SFC[TaskAddProps] = default
}
