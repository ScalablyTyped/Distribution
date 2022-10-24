package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledMessage extends StObject {
  
  /** Disable the primary action button */
  var disabled: Requireable[Boolean]
  
  /** Message to be displayed when primary action button is disabled */
  var disabledMessage: Requireable[String]
  
  /** Label of primary action button */
  var label: Requireable[ReactNodeLike]
  
  /** On click handler of primary action button and of the whole card */
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object DisabledMessage {
  
  inline def apply(
    disabled: Requireable[Boolean],
    disabledMessage: Requireable[String],
    label: Requireable[ReactNodeLike],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): DisabledMessage = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], disabledMessage = disabledMessage.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledMessage]
  }
  
  extension [Self <: DisabledMessage](x: Self) {
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledMessage(value: Requireable[String]): Self = StObject.set(x, "disabledMessage", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
  }
}
