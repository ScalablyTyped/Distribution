package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsBehaviorsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Behaviors", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BehaviorsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BehaviorsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsBehaviorsMod.foo` */
  override def _to: FC[BehaviorsProps] = default
}
