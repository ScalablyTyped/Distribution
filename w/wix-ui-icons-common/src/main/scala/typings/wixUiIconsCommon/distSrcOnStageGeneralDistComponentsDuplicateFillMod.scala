package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsDuplicateFillMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/DuplicateFill", JSImport.Default)
  @js.native
  val default: FC[DuplicateFillProps] = js.native
  
  trait DuplicateFillProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DuplicateFillProps {
    
    inline def apply(): DuplicateFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplicateFillProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplicateFillProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DuplicateFillProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsDuplicateFillMod.foo` */
  override def _to: FC[DuplicateFillProps] = default
}
