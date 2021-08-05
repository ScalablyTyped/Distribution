package typings.swaggerNodeRunner

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.expressServeStaticCore.mod.global.Express.Application
import typings.expressServeStaticCore.mod.global.Express.Request
import typings.expressServeStaticCore.mod.global.Express.Response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.OutgoingHttpHeaders
import typings.restify.mod.Server
import typings.std.Error
import typings.swaggerNodeRunner.anon.Register
import typings.swaggerNodeRunner.anon.Swagger
import typings.swaggerNodeRunner.anon.SwaggerMetadata
import typings.swaggerSchemaOfficial.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-node-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(config: Config, cb: js.Function2[/* err */ js.UndefOr[Error], /* runner */ Runner, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    /**
      *  Path to app
      */
    var appRoot: String
    
    /**
      * Used for Bagpipes library
      *
      * @se @link{https://github.com/apigee-127/bagpipes|Github Source}
      */
    var bagpipes: js.UndefOr[js.Any] = js.undefined
    
    /**
      *  Sets `NODE_CONFIG_DIR` env if not set yet
      */
    var configDir: js.UndefOr[String] = js.undefined
    
    /**
      * Swagger controller directories
      *
      * default is array with `/api/controllers` relative to `appRoot`
      */
    var controllersDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  default is `null`
      */
    var defaultPipe: js.UndefOr[String] = js.undefined
    
    /**
      * Used for Bagpipes library
      *
      * default is `[api/fittings]`
      */
    var fittingsDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Swagger mock controller directories
      *
      * default is array with `/api/mocks` relative to `appRoot`
      */
    var mockControllersDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If `true` API is in mock mode
      *
      * default is `false`
      */
    var mockMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is `swagger_controllers`
      */
    var swaggerControllerPipe: js.UndefOr[String] = js.undefined
    
    /**
      * Absolute path to swagger.yml file, if not set default value is used.
      */
    var swaggerFile: js.UndefOr[String] = js.undefined
    
    /**
      * Define Middleware for using Swagger security information to authenticate requests. Part of _swagger-tools_
      *
      * default is `undefined`
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-security.js|Github Source}
      */
    var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.undefined
    
    /**
      * If `true` resonse is validated
      *
      * default is `true`
      */
    var validateResponse: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(appRoot: String): Config = {
      val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAppRoot(value: String): Self = StObject.set(x, "appRoot", value.asInstanceOf[js.Any])
      
      inline def setBagpipes(value: js.Any): Self = StObject.set(x, "bagpipes", value.asInstanceOf[js.Any])
      
      inline def setBagpipesUndefined: Self = StObject.set(x, "bagpipes", js.undefined)
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      inline def setControllersDirs(value: js.Array[String]): Self = StObject.set(x, "controllersDirs", value.asInstanceOf[js.Any])
      
      inline def setControllersDirsUndefined: Self = StObject.set(x, "controllersDirs", js.undefined)
      
      inline def setControllersDirsVarargs(value: String*): Self = StObject.set(x, "controllersDirs", js.Array(value :_*))
      
      inline def setDefaultPipe(value: String): Self = StObject.set(x, "defaultPipe", value.asInstanceOf[js.Any])
      
      inline def setDefaultPipeUndefined: Self = StObject.set(x, "defaultPipe", js.undefined)
      
      inline def setFittingsDirs(value: js.Array[String]): Self = StObject.set(x, "fittingsDirs", value.asInstanceOf[js.Any])
      
      inline def setFittingsDirsUndefined: Self = StObject.set(x, "fittingsDirs", js.undefined)
      
      inline def setFittingsDirsVarargs(value: String*): Self = StObject.set(x, "fittingsDirs", js.Array(value :_*))
      
      inline def setMockControllersDirs(value: js.Array[String]): Self = StObject.set(x, "mockControllersDirs", value.asInstanceOf[js.Any])
      
      inline def setMockControllersDirsUndefined: Self = StObject.set(x, "mockControllersDirs", js.undefined)
      
      inline def setMockControllersDirsVarargs(value: String*): Self = StObject.set(x, "mockControllersDirs", js.Array(value :_*))
      
      inline def setMockMode(value: Boolean): Self = StObject.set(x, "mockMode", value.asInstanceOf[js.Any])
      
      inline def setMockModeUndefined: Self = StObject.set(x, "mockMode", js.undefined)
      
      inline def setSwaggerControllerPipe(value: String): Self = StObject.set(x, "swaggerControllerPipe", value.asInstanceOf[js.Any])
      
      inline def setSwaggerControllerPipeUndefined: Self = StObject.set(x, "swaggerControllerPipe", js.undefined)
      
      inline def setSwaggerFile(value: String): Self = StObject.set(x, "swaggerFile", value.asInstanceOf[js.Any])
      
      inline def setSwaggerFileUndefined: Self = StObject.set(x, "swaggerFile", js.undefined)
      
      inline def setSwaggerSecurityHandlers(value: SwaggerSecurityHandlers): Self = StObject.set(x, "swaggerSecurityHandlers", value.asInstanceOf[js.Any])
      
      inline def setSwaggerSecurityHandlersUndefined: Self = StObject.set(x, "swaggerSecurityHandlers", js.undefined)
      
      inline def setValidateResponse(value: Boolean): Self = StObject.set(x, "validateResponse", value.asInstanceOf[js.Any])
      
      inline def setValidateResponseUndefined: Self = StObject.set(x, "validateResponse", js.undefined)
    }
  }
  
  trait ConfigInternal extends StObject {
    
    /** Config of SwaggerNodeRunner  */
    var swagger: js.UndefOr[Config] = js.undefined
  }
  object ConfigInternal {
    
    inline def apply(): ConfigInternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigInternal]
    }
    
    extension [Self <: ConfigInternal](x: Self) {
      
      inline def setSwagger(value: Config): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
    }
  }
  
  trait ConnectMiddleware
    extends StObject
       with Middleware {
    
    def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
    
    /** Register this Middleware with `app`  */
    def register(app: Application): Unit
  }
  object ConnectMiddleware {
    
    inline def apply(
      middleware: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
      register: Application => Unit,
      runner: Runner
    ): ConnectMiddleware = {
      val __obj = js.Dynamic.literal(middleware = js.Any.fromFunction0(middleware), register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectMiddleware]
    }
    
    extension [Self <: ConnectMiddleware](x: Self) {
      
      inline def setMiddleware(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = StObject.set(x, "middleware", js.Any.fromFunction0(value))
      
      inline def setRegister(value: Application => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  type ExpressMiddleware = ConnectMiddleware
  
  trait HapiMiddleware
    extends StObject
       with Middleware {
    
    /** Back-reference to Config object of `Runner` that has created this middleware */
    var config: ConfigInternal
    
    /** Hapi Plugin */
    var plugin: Register
  }
  object HapiMiddleware {
    
    inline def apply(config: ConfigInternal, plugin: Register, runner: Runner): HapiMiddleware = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[HapiMiddleware]
    }
    
    extension [Self <: HapiMiddleware](x: Self) {
      
      inline def setConfig(value: ConfigInternal): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: Register): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Middleware extends StObject {
    
    /** Back-reference to `swagger-node-runner`s `Runner` that has created this middleware */
    var runner: Runner
  }
  object Middleware {
    
    inline def apply(runner: Runner): Middleware = {
      val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    extension [Self <: Middleware](x: Self) {
      
      inline def setRunner(value: Runner): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestifyMiddleware
    extends StObject
       with Middleware {
    
    /** Register this Middleware with `app`  */
    def register(app: Server): Unit
  }
  object RestifyMiddleware {
    
    inline def apply(register: Server => Unit, runner: Runner): RestifyMiddleware = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestifyMiddleware]
    }
    
    extension [Self <: RestifyMiddleware](x: Self) {
      
      inline def setRegister(value: Server => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Runner extends EventEmitter {
    
    /**
      * Nested Key Value description for _backpipes_ module
      * @see {@link https://github.com/apigee-127/bagpipes#pipes|Github Source}
      */
    var bagpipes: StringDictionary[js.Any] = js.native
    
    var config: ConfigInternal = js.native
    
    /** Create new Connect middleware */
    def connectMiddleware(): ConnectMiddleware = js.native
    
    def defaultErrorHandler(): js.Any = js.native
    
    /** Create new Express middleware */
    def expressMiddleware(): ExpressMiddleware = js.native
    
    /** Fetch a _bagpipe_ pipe */
    def getPipe(req: Swagger): js.Any = js.native
    
    /** Create new Hapi middleware */
    def hapiMiddleware(): HapiMiddleware = js.native
    
    /** Resolves path (relative to `config.appRoot`) */
    def resolveAppPath(to: js.Any*): String = js.native
    
    /** Create new Restify middleware */
    def restifyMiddleware(): RestifyMiddleware = js.native
    
    /** Create new Sails middleware */
    def sailsMiddleware(): SailsMiddleware = js.native
    
    /**
      * Current OpenAPI Specification (formaly known as Swagger RESTful API Documentation Specification)
      * @see {@link http://swagger.io/specification/|Swagger Specs}
      */
    var swagger: Spec = js.native
    
    var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
    
    /**
      * References to Swagger Tools Midleware (from _swagger-tools_ module)     *
      * @see {@link https://github.com/apigee-127/swagger-tools|Github Source}
      */
    var swaggerTools: SwaggerMetadata = js.native
  }
  
  trait SailsMiddleware
    extends StObject
       with Middleware {
    
    /** Express style middleware */
    def chain(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
  }
  object SailsMiddleware {
    
    inline def apply(
      chain: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit],
      runner: Runner
    ): SailsMiddleware = {
      val __obj = js.Dynamic.literal(chain = js.Any.fromFunction0(chain), runner = runner.asInstanceOf[js.Any])
      __obj.asInstanceOf[SailsMiddleware]
    }
    
    extension [Self <: SailsMiddleware](x: Self) {
      
      inline def setChain(value: () => js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]): Self = StObject.set(x, "chain", js.Any.fromFunction0(value))
    }
  }
  
  type SwaggerSecurityHandlers = StringDictionary[SwaggerToolsSecurityHandler]
  
  type SwaggerToolsMiddleware = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ js.Any, js.Any]
  
  type SwaggerToolsSecurityHandler = js.Function4[
    /* request */ js.Any, 
    /* securityDefinition */ js.Any, 
    /* scopes */ js.Any, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[Error | SwaggerToolsSecurityHandlerCallbackError], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
  
  trait SwaggerToolsSecurityHandlerCallbackError extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object SwaggerToolsSecurityHandlerCallbackError {
    
    inline def apply(): SwaggerToolsSecurityHandlerCallbackError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwaggerToolsSecurityHandlerCallbackError]
    }
    
    extension [Self <: SwaggerToolsSecurityHandlerCallbackError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
