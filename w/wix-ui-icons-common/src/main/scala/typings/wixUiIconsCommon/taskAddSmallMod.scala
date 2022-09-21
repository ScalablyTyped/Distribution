package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskAddSmall", JSImport.Default)
  @js.native
  val default: FC[TaskAddSmallProps] = js.native
  
  trait TaskAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TaskAddSmallProps {
    
    inline def apply(): TaskAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskAddSmallProps]
    }
    
    extension [Self <: TaskAddSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TaskAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskAddSmallMod.foo` */
  override def _to: FC[TaskAddSmallProps] = default
}
