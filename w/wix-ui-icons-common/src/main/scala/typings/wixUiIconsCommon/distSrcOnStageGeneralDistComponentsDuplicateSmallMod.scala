package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsDuplicateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/DuplicateSmall", JSImport.Default)
  @js.native
  val default: FC[DuplicateSmallProps] = js.native
  
  trait DuplicateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DuplicateSmallProps {
    
    inline def apply(): DuplicateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplicateSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplicateSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DuplicateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsDuplicateSmallMod.foo` */
  override def _to: FC[DuplicateSmallProps] = default
}
