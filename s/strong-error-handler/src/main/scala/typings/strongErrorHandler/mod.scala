package typings.strongErrorHandler

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import typings.strongErrorHandler.strongErrorHandlerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a middleware function for error-handling
    * @param options Options for error handler settings
    */
  inline def apply(): StrongErrorHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[StrongErrorHandler]
  inline def apply(options: ErrorHandlerOptions): StrongErrorHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StrongErrorHandler]
  
  @JSImport("strong-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Writes thrown error to response
    * @param err Error to handle
    * @param req Incoming request
    * @param res Response
    * @param options Options for error handler settings
    */
  inline def writeErrorToResponse(
    err: js.Error,
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    res: Response_[Any, Record[String, Any]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeErrorToResponse")(err.asInstanceOf[js.Any], req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeErrorToResponse(
    err: js.Error,
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    res: Response_[Any, Record[String, Any]],
    options: ErrorWriterOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeErrorToResponse")(err.asInstanceOf[js.Any], req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Options for error-handling
    */
  trait ErrorHandlerOptions
    extends StObject
       with ErrorWriterOptions {
    
    var log: js.UndefOr[Boolean] = js.undefined
  }
  object ErrorHandlerOptions {
    
    inline def apply(): ErrorHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  /**
    * Options for writing errors to the response
    */
  trait ErrorWriterOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var defaultType: js.UndefOr[String] = js.undefined
    
    var negotiateContentType: js.UndefOr[Boolean] = js.undefined
    
    var rootProperty: js.UndefOr[String | `false`] = js.undefined
    
    var safeFields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ErrorWriterOptions {
    
    inline def apply(): ErrorWriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorWriterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorWriterOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultType(value: String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
      
      inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      
      inline def setNegotiateContentType(value: Boolean): Self = StObject.set(x, "negotiateContentType", value.asInstanceOf[js.Any])
      
      inline def setNegotiateContentTypeUndefined: Self = StObject.set(x, "negotiateContentType", js.undefined)
      
      inline def setRootProperty(value: String | `false`): Self = StObject.set(x, "rootProperty", value.asInstanceOf[js.Any])
      
      inline def setRootPropertyUndefined: Self = StObject.set(x, "rootProperty", js.undefined)
      
      inline def setSafeFields(value: js.Array[String]): Self = StObject.set(x, "safeFields", value.asInstanceOf[js.Any])
      
      inline def setSafeFieldsUndefined: Self = StObject.set(x, "safeFields", js.undefined)
      
      inline def setSafeFieldsVarargs(value: String*): Self = StObject.set(x, "safeFields", js.Array(value*))
    }
  }
  
  /**
    * Error-handling middleware function. Includes server-side logging
    */
  type StrongErrorHandler = js.Function4[
    /* err */ js.Error, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]
}
