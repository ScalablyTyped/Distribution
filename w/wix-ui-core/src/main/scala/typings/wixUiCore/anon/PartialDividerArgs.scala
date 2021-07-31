package typings.wixUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-ui-core.wix-ui-core/src/components/dropdown-option/OptionFactory.DividerArgs> */
trait PartialDividerArgs extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[ReactNode] = js.undefined
}
object PartialDividerArgs {
  
  @scala.inline
  def apply(): PartialDividerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDividerArgs]
  }
  
  @scala.inline
  implicit class PartialDividerArgsMutableBuilder[Self <: PartialDividerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
