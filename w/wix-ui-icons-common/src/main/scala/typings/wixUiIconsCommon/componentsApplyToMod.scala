package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsApplyToMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ApplyTo", JSImport.Default)
  @js.native
  val default: FC[ApplyToProps] = js.native
  
  trait ApplyToProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ApplyToProps {
    
    inline def apply(): ApplyToProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyToProps]
    }
    
    extension [Self <: ApplyToProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ApplyToProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsApplyToMod.foo` */
  override def _to: FC[ApplyToProps] = default
}
