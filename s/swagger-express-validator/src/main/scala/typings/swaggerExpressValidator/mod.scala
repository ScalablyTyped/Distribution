package typings.swaggerExpressValidator

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("swagger-express-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validator(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("validator")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  trait Options extends StObject {
    
    var allowNullable: js.UndefOr[Boolean] = js.undefined
    
    var requestValidationFn: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* data */ Any, 
          /* errors */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var responseValidationFn: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* data */ Any, 
          /* errors */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var schema: Any
    
    var validateRequest: js.UndefOr[Boolean] = js.undefined
    
    var validateResponse: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(schema: Any): Options = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowNullable(value: Boolean): Self = StObject.set(x, "allowNullable", value.asInstanceOf[js.Any])
      
      inline def setAllowNullableUndefined: Self = StObject.set(x, "allowNullable", js.undefined)
      
      inline def setRequestValidationFn(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* data */ Any, /* errors */ Any) => Unit
      ): Self = StObject.set(x, "requestValidationFn", js.Any.fromFunction3(value))
      
      inline def setRequestValidationFnUndefined: Self = StObject.set(x, "requestValidationFn", js.undefined)
      
      inline def setResponseValidationFn(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* data */ Any, /* errors */ Any) => Unit
      ): Self = StObject.set(x, "responseValidationFn", js.Any.fromFunction3(value))
      
      inline def setResponseValidationFnUndefined: Self = StObject.set(x, "responseValidationFn", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setValidateRequest(value: Boolean): Self = StObject.set(x, "validateRequest", value.asInstanceOf[js.Any])
      
      inline def setValidateRequestUndefined: Self = StObject.set(x, "validateRequest", js.undefined)
      
      inline def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      inline def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
}
