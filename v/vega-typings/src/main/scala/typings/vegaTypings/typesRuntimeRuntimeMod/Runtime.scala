package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.Bind
import typings.vegaTypings.typesSpecLocaleMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runtime extends StObject {
  
  /**
    * Contains a list of bindings which map signal names to DOM input elements.
    * When the dom elements are updated, it updates the operator with the signal name
    * the same as the binding
    */
  var bindings: js.Array[Binding]
  
  var description: String
  
  var eventConfig: js.UndefOr[Bind] = js.undefined
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var operators: js.Array[Operator]
  
  /**
    * Event streams vega is listening to, often DOM events.
    */
  var streams: js.Array[Stream]
  
  /**
    * Triggers updates of streams/operations based on other nodes.
    */
  var updates: js.Array[Update]
}
object Runtime {
  
  inline def apply(
    bindings: js.Array[Binding],
    description: String,
    operators: js.Array[Operator],
    streams: js.Array[Stream],
    updates: js.Array[Update]
  ): Runtime = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Runtime] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEventConfig(value: Bind): Self = StObject.set(x, "eventConfig", value.asInstanceOf[js.Any])
    
    inline def setEventConfigUndefined: Self = StObject.set(x, "eventConfig", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOperators(value: js.Array[Operator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: Operator*): Self = StObject.set(x, "operators", js.Array(value*))
    
    inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
    
    inline def setUpdates(value: js.Array[Update]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: Update*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
