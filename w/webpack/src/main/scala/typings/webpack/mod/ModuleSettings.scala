package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSettings extends StObject {
  
  /**
  	 * The options for the module generator.
  	 */
  var generator: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Specifies the layer in which the module should be placed in.
  	 */
  var layer: js.UndefOr[String] = js.undefined
  
  /**
  	 * Options for parsing.
  	 */
  var parser: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Options for the resolver.
  	 */
  var resolve: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
  
  /**
  	 * Flags a module as with or without side effects.
  	 */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Module type to use for the module.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}
object ModuleSettings {
  
  inline def apply(): ModuleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleSettings] (val x: Self) extends AnyVal {
    
    inline def setGenerator(value: StringDictionary[Any]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setParser(value: StringDictionary[Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setResolve(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
