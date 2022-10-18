package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsOnlineProgramsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OnlinePrograms", JSImport.Default)
  @js.native
  val default: FC[OnlineProgramsProps] = js.native
  
  trait OnlineProgramsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OnlineProgramsProps {
    
    inline def apply(): OnlineProgramsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnlineProgramsProps]
    }
    
    extension [Self <: OnlineProgramsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OnlineProgramsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsOnlineProgramsMod.foo` */
  override def _to: FC[OnlineProgramsProps] = default
}
