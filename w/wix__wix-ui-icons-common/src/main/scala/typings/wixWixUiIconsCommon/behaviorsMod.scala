package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Behaviors", JSImport.Default)
  @js.native
  val default: FC[BehaviorsProps] = js.native
  
  trait BehaviorsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BehaviorsProps {
    
    inline def apply(): BehaviorsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BehaviorsProps]
    }
    
    extension [Self <: BehaviorsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BehaviorsProps]
  
  /* This means you don't have to write `default`, but can instead just say `behaviorsMod.foo` */
  override def _to: FC[BehaviorsProps] = default
}
