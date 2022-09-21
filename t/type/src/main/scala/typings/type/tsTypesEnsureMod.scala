package typings.`type`

import typings.std.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesEnsureMod {
  
  @JSImport("type/ts-types/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...ValidationDatumList] is not an array type */ args: Array[EnsureOptions | ValidationDatum]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait EnsureBaseOptions extends StObject {
    
    var Error: js.UndefOr[ErrorConstructor] = js.undefined
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object EnsureBaseOptions {
    
    inline def apply(): EnsureBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnsureBaseOptions]
    }
    
    extension [Self <: EnsureBaseOptions](x: Self) {
      
      inline def setError(value: ErrorConstructor): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait EnsureDefault[T] extends StObject {
    
    var default: T
  }
  object EnsureDefault {
    
    inline def apply[T](default: T): EnsureDefault[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnsureDefault[T]]
    }
    
    extension [Self <: EnsureDefault[?], T](x: Self & EnsureDefault[T]) {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnsureFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait EnsureIsOptional extends StObject {
    
    var isOptional: Boolean
  }
  object EnsureIsOptional {
    
    inline def apply(isOptional: Boolean): EnsureIsOptional = {
      val __obj = js.Dynamic.literal(isOptional = isOptional.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnsureIsOptional]
    }
    
    extension [Self <: EnsureIsOptional](x: Self) {
      
      inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnsureOptions
    extends StObject
       with EnsureBaseOptions {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var isOptional: js.UndefOr[Boolean] = js.undefined
  }
  object EnsureOptions {
    
    inline def apply(): EnsureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnsureOptions]
    }
    
    extension [Self <: EnsureOptions](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
      
      inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    }
  }
  
  type ValidationDatum = js.Tuple4[
    /* argumentName */ String, 
    /* inputValue */ Any, 
    /* ensureFunction */ EnsureFunction, 
    /* options */ js.UndefOr[js.Object]
  ]
  
  type ValidationDatumList = js.Array[ValidationDatum]
}
