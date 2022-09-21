package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The abilities of the environment where the webpack generated code should run.
  */
trait Environment extends StObject {
  
  /**
  	 * The environment supports arrow functions ('() => { ... }').
  	 */
  var arrowFunction: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports BigInt as literal (123n).
  	 */
  var bigIntLiteral: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports const and let for variable declarations.
  	 */
  var const: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports destructuring ('{ a, b } = obj').
  	 */
  var destructuring: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports an async import() function to import EcmaScript modules.
  	 */
  var dynamicImport: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports 'for of' iteration ('for (const x of array) { ... }').
  	 */
  var forOf: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports EcmaScript Module syntax to import EcmaScript modules (import ... from '...').
  	 */
  var module: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports optional chaining ('obj?.a' or 'obj?.()').
  	 */
  var optionalChaining: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The environment supports template literals.
  	 */
  var templateLiteral: js.UndefOr[Boolean] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setArrowFunction(value: Boolean): Self = StObject.set(x, "arrowFunction", value.asInstanceOf[js.Any])
    
    inline def setArrowFunctionUndefined: Self = StObject.set(x, "arrowFunction", js.undefined)
    
    inline def setBigIntLiteral(value: Boolean): Self = StObject.set(x, "bigIntLiteral", value.asInstanceOf[js.Any])
    
    inline def setBigIntLiteralUndefined: Self = StObject.set(x, "bigIntLiteral", js.undefined)
    
    inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
    
    inline def setDestructuring(value: Boolean): Self = StObject.set(x, "destructuring", value.asInstanceOf[js.Any])
    
    inline def setDestructuringUndefined: Self = StObject.set(x, "destructuring", js.undefined)
    
    inline def setDynamicImport(value: Boolean): Self = StObject.set(x, "dynamicImport", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportUndefined: Self = StObject.set(x, "dynamicImport", js.undefined)
    
    inline def setForOf(value: Boolean): Self = StObject.set(x, "forOf", value.asInstanceOf[js.Any])
    
    inline def setForOfUndefined: Self = StObject.set(x, "forOf", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setOptionalChaining(value: Boolean): Self = StObject.set(x, "optionalChaining", value.asInstanceOf[js.Any])
    
    inline def setOptionalChainingUndefined: Self = StObject.set(x, "optionalChaining", js.undefined)
    
    inline def setTemplateLiteral(value: Boolean): Self = StObject.set(x, "templateLiteral", value.asInstanceOf[js.Any])
    
    inline def setTemplateLiteralUndefined: Self = StObject.set(x, "templateLiteral", js.undefined)
  }
}
