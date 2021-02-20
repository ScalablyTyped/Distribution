package typings.swaggerTools

import typings.swaggerTools.mod.OperationParameter
import typings.swaggerTools.mod.Swagger20Operation
import typings.swaggerTools.mod.SwaggerRequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Api extends StObject {
    
    var api: js.Any = js.native
    
    var apiDeclaration: js.Any = js.native
    
    var apiIndex: Double = js.native
    
    var authorizations: js.UndefOr[js.Any] = js.native
    
    var operation: js.UndefOr[js.Any] = js.native
    
    var operationPath: js.UndefOr[js.Array[String]] = js.native
    
    var params: SwaggerRequestParameters = js.native
    
    var resourceIndex: Double = js.native
    
    var resourceListing: js.Any = js.native
    
    var swaggerVersion: String = js.native
    
    var useStubs: js.UndefOr[Boolean] = js.native
  }
  object Api {
    
    @scala.inline
    def apply(
      api: js.Any,
      apiDeclaration: js.Any,
      apiIndex: Double,
      params: SwaggerRequestParameters,
      resourceIndex: Double,
      resourceListing: js.Any,
      swaggerVersion: String
    ): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], apiDeclaration = apiDeclaration.asInstanceOf[js.Any], apiIndex = apiIndex.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceListing = resourceListing.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiDeclaration(value: js.Any): Self = StObject.set(x, "apiDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIndex(value: Double): Self = StObject.set(x, "apiIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizations(value: js.Any): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationsUndefined: Self = StObject.set(x, "authorizations", js.undefined)
      
      @scala.inline
      def setOperation(value: js.Any): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationPath(value: js.Array[String]): Self = StObject.set(x, "operationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationPathUndefined: Self = StObject.set(x, "operationPath", js.undefined)
      
      @scala.inline
      def setOperationPathVarargs(value: String*): Self = StObject.set(x, "operationPath", js.Array(value :_*))
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setParams(value: SwaggerRequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIndex(value: Double): Self = StObject.set(x, "resourceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceListing(value: js.Any): Self = StObject.set(x, "resourceListing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerVersion(value: String): Self = StObject.set(x, "swaggerVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  @js.native
  trait ApiPath[P /* <: SwaggerRequestParameters */] extends StObject {
    
    var apiPath: String = js.native
    
    var operation: js.UndefOr[Swagger20Operation] = js.native
    
    var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.native
    
    var operationPath: js.UndefOr[js.Array[String]] = js.native
    
    var params: P = js.native
    
    var path: js.Any = js.native
    
    var security: js.Array[_] = js.native
    
    var swaggerObject: js.Any = js.native
    
    var swaggerVersion: String = js.native
    
    var useStubs: js.UndefOr[Boolean] = js.native
  }
  object ApiPath {
    
    @scala.inline
    def apply[P /* <: SwaggerRequestParameters */](
      apiPath: String,
      params: P,
      path: js.Any,
      security: js.Array[_],
      swaggerObject: js.Any,
      swaggerVersion: String
    ): ApiPath[P] = {
      val __obj = js.Dynamic.literal(apiPath = apiPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], swaggerObject = swaggerObject.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiPath[P]]
    }
    
    @scala.inline
    implicit class ApiPathMutableBuilder[Self <: ApiPath[_], P /* <: SwaggerRequestParameters */] (val x: Self with ApiPath[P]) extends AnyVal {
      
      @scala.inline
      def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: Swagger20Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationParameters(value: js.Array[OperationParameter]): Self = StObject.set(x, "operationParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationParametersUndefined: Self = StObject.set(x, "operationParameters", js.undefined)
      
      @scala.inline
      def setOperationParametersVarargs(value: OperationParameter*): Self = StObject.set(x, "operationParameters", js.Array(value :_*))
      
      @scala.inline
      def setOperationPath(value: js.Array[String]): Self = StObject.set(x, "operationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationPathUndefined: Self = StObject.set(x, "operationPath", js.undefined)
      
      @scala.inline
      def setOperationPathVarargs(value: String*): Self = StObject.set(x, "operationPath", js.Array(value :_*))
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurity(value: js.Array[_]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityVarargs(value: js.Any*): Self = StObject.set(x, "security", js.Array(value :_*))
      
      @scala.inline
      def setSwaggerObject(value: js.Any): Self = StObject.set(x, "swaggerObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerVersion(value: String): Self = StObject.set(x, "swaggerVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
}
