package typings.wixUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-ui-core.wix-ui-core/src/components/dropdown-option.Option> */
trait PartialOption extends StObject {
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var isSelectable: js.UndefOr[Boolean] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* value */ ReactNode, ReactNode]] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PartialOption {
  
  @scala.inline
  def apply(): PartialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOption]
  }
  
  @scala.inline
  implicit class PartialOptionMutableBuilder[Self <: PartialOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    @scala.inline
    def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectableUndefined: Self = StObject.set(x, "isSelectable", js.undefined)
    
    @scala.inline
    def setRender(value: /* value */ ReactNode => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
