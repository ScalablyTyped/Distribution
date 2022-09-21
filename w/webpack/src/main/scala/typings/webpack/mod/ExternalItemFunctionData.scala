package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data object passed as argument when a function is set for 'externals'.
  */
trait ExternalItemFunctionData extends StObject {
  
  /**
  	 * The directory in which the request is placed.
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * Contextual information.
  	 */
  var contextInfo: js.UndefOr[ModuleFactoryCreateDataContextInfo] = js.undefined
  
  /**
  	 * The category of the referencing dependencies.
  	 */
  var dependencyType: js.UndefOr[String] = js.undefined
  
  /**
  	 * Get a resolve function with the current resolver options.
  	 */
  var getResolve: js.UndefOr[
    js.Function1[
      /* options */ js.UndefOr[ResolveOptionsWebpackOptions], 
      (js.Function3[
        /* context */ String, 
        /* request */ String, 
        /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit], 
        Unit
      ]) | (js.Function2[/* context */ String, /* request */ String, js.Promise[String]])
    ]
  ] = js.undefined
  
  /**
  	 * The request as written by the user in the require/import expression/statement.
  	 */
  var request: js.UndefOr[String] = js.undefined
}
object ExternalItemFunctionData {
  
  inline def apply(): ExternalItemFunctionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalItemFunctionData]
  }
  
  extension [Self <: ExternalItemFunctionData](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: ModuleFactoryCreateDataContextInfo): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDependencyType(value: String): Self = StObject.set(x, "dependencyType", value.asInstanceOf[js.Any])
    
    inline def setDependencyTypeUndefined: Self = StObject.set(x, "dependencyType", js.undefined)
    
    inline def setGetResolve(
      value: /* options */ js.UndefOr[ResolveOptionsWebpackOptions] => (js.Function3[
          /* context */ String, 
          /* request */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit], 
          Unit
        ]) | (js.Function2[/* context */ String, /* request */ String, js.Promise[String]])
    ): Self = StObject.set(x, "getResolve", js.Any.fromFunction1(value))
    
    inline def setGetResolveUndefined: Self = StObject.set(x, "getResolve", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
