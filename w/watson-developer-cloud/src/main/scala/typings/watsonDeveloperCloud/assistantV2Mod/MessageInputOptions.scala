package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Optional properties that control how the assistant responds. */
trait MessageInputOptions extends StObject {
  
  /** Whether to return more than one intent. Set to `true` to return all matching intents. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to return additional diagnostic information. Set to `true` to return additional information under the `output.debug` key. */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to restart dialog processing at the root of the dialog, regardless of any previously visited nodes. **Note:** This does not affect `turn_count` or any other context variables. */
  var restart: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to return session context with the response. If you specify `true`, the response will include the `context` property. */
  var return_context: js.UndefOr[Boolean] = js.undefined
}
object MessageInputOptions {
  
  inline def apply(): MessageInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageInputOptions] (val x: Self) extends AnyVal {
    
    inline def setAlternate_intents(value: Boolean): Self = StObject.set(x, "alternate_intents", value.asInstanceOf[js.Any])
    
    inline def setAlternate_intentsUndefined: Self = StObject.set(x, "alternate_intents", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    inline def setReturn_context(value: Boolean): Self = StObject.set(x, "return_context", value.asInstanceOf[js.Any])
    
    inline def setReturn_contextUndefined: Self = StObject.set(x, "return_context", js.undefined)
  }
}
