package typings.tonicUiReact.anon

import typings.std.HTMLDivElement
import typings.tonicUiReact.mod.TonicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPopoverTriggerProps extends StObject {
  
  def getPopoverTriggerProps(): TonicProps[HTMLDivElement]
}
object GetPopoverTriggerProps {
  
  inline def apply(getPopoverTriggerProps: () => TonicProps[HTMLDivElement]): GetPopoverTriggerProps = {
    val __obj = js.Dynamic.literal(getPopoverTriggerProps = js.Any.fromFunction0(getPopoverTriggerProps))
    __obj.asInstanceOf[GetPopoverTriggerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPopoverTriggerProps] (val x: Self) extends AnyVal {
    
    inline def setGetPopoverTriggerProps(value: () => TonicProps[HTMLDivElement]): Self = StObject.set(x, "getPopoverTriggerProps", js.Any.fromFunction0(value))
  }
}
