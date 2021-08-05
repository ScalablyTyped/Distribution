package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Merge", JSImport.Default)
  @js.native
  val default: SFC[MergeProps] = js.native
  
  trait MergeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MergeProps {
    
    inline def apply(): MergeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeProps]
    }
    
    extension [Self <: MergeProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MergeProps]
  
  /* This means you don't have to write `default`, but can instead just say `mergeMod.foo` */
  override def _to: SFC[MergeProps] = default
}
