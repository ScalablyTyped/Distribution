package typings.swaggerExpressValidator

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("swagger-express-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def validator(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("validator")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  trait Options extends StObject {
    
    var allowNullable: js.UndefOr[Boolean] = js.undefined
    
    var requestValidationFn: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* data */ js.Any, 
          /* errors */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var responseValidationFn: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* data */ js.Any, 
          /* errors */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var schema: String
    
    var validateRequest: js.UndefOr[Boolean] = js.undefined
    
    var validateResponse: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(schema: String): Options = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNullable(value: Boolean): Self = StObject.set(x, "allowNullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNullableUndefined: Self = StObject.set(x, "allowNullable", js.undefined)
      
      @scala.inline
      def setRequestValidationFn(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
      ): Self = StObject.set(x, "requestValidationFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestValidationFnUndefined: Self = StObject.set(x, "requestValidationFn", js.undefined)
      
      @scala.inline
      def setResponseValidationFn(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* data */ js.Any, /* errors */ js.Any) => Unit
      ): Self = StObject.set(x, "responseValidationFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResponseValidationFnUndefined: Self = StObject.set(x, "responseValidationFn", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequest(value: Boolean): Self = StObject.set(x, "validateRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestUndefined: Self = StObject.set(x, "validateRequest", js.undefined)
      
      @scala.inline
      def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
}
