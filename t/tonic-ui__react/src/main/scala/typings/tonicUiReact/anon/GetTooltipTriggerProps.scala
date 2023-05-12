package typings.tonicUiReact.anon

import typings.std.HTMLDivElement
import typings.tonicUiReact.mod.TonicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTooltipTriggerProps extends StObject {
  
  def getTooltipTriggerProps(): TonicProps[HTMLDivElement]
}
object GetTooltipTriggerProps {
  
  inline def apply(getTooltipTriggerProps: () => TonicProps[HTMLDivElement]): GetTooltipTriggerProps = {
    val __obj = js.Dynamic.literal(getTooltipTriggerProps = js.Any.fromFunction0(getTooltipTriggerProps))
    __obj.asInstanceOf[GetTooltipTriggerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTooltipTriggerProps] (val x: Self) extends AnyVal {
    
    inline def setGetTooltipTriggerProps(value: () => TonicProps[HTMLDivElement]): Self = StObject.set(x, "getTooltipTriggerProps", js.Any.fromFunction0(value))
  }
}
