package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsReactionLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/ReactionLarge", JSImport.Default)
  @js.native
  val default: FC[ReactionLargeProps] = js.native
  
  trait ReactionLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReactionLargeProps {
    
    inline def apply(): ReactionLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactionLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactionLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReactionLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsReactionLargeMod.foo` */
  override def _to: FC[ReactionLargeProps] = default
}
