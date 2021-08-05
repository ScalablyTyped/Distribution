package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskCompleteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskCompleteSmall", JSImport.Default)
  @js.native
  val default: SFC[TaskCompleteSmallProps] = js.native
  
  trait TaskCompleteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TaskCompleteSmallProps {
    
    inline def apply(): TaskCompleteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompleteSmallProps]
    }
    
    extension [Self <: TaskCompleteSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TaskCompleteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskCompleteSmallMod.foo` */
  override def _to: SFC[TaskCompleteSmallProps] = default
}
