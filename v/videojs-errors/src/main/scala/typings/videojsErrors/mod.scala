package typings.videojsErrors

import org.scalablytyped.runtime.Shortcut
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.videojsErrors.anon.Code
import typings.videojsErrors.videojsErrorsStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("videojs-errors", JSImport.Namespace)
  @js.native
  val ^ : VideoJSErrorsPlugin = js.native
  
  trait CustomError extends StObject {
    
    var headline: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CustomError {
    
    inline def apply(headline: String): CustomError = {
      val __obj = js.Dynamic.literal(headline = headline.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomError]
    }
    
    extension [Self <: CustomError](x: Self) {
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type CustomMediaError = Code & (Partial[
    Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.MediaError */ Any, 
      code
    ]
  ])
  
  trait Options extends StObject {
    
    var backgroundTimeout: js.UndefOr[Double] = js.undefined
    
    var errors: js.UndefOr[Record[String | Double, CustomError]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackgroundTimeout(value: Double): Self = StObject.set(x, "backgroundTimeout", value.asInstanceOf[js.Any])
      
      inline def setBackgroundTimeoutUndefined: Self = StObject.set(x, "backgroundTimeout", js.undefined)
      
      inline def setErrors(value: Record[String | Double, CustomError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait VideoJSErrorsPlugin extends StObject {
    
    def apply(): Unit = js.native
    def apply(options: Options): Unit = js.native
    
    val VERSION: String = js.native
    
    def backgroundTimeout[T /* <: js.UndefOr[Double] */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? undefined : number */ js.Any = js.native
    def backgroundTimeout[T /* <: js.UndefOr[Double] */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? undefined : number */ js.Any = js.native
    
    def extend(options: Record[String | Double, CustomError]): Unit = js.native
    
    def getAll(): Record[String | Double, CustomError] = js.native
    
    def timeout[T /* <: js.UndefOr[Double] */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? undefined : number */ js.Any = js.native
    def timeout[T /* <: js.UndefOr[Double] */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? undefined : number */ js.Any = js.native
  }
  
  type _To = VideoJSErrorsPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VideoJSErrorsPlugin = ^
  
  /* augmented module */
  object videoJsAugmentingMod {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify videojs.Component * / any */ @js.native
    trait VideoJsPlayer extends StObject {
      
      def error(): Unit = js.native
      def error(err: String): Unit = js.native
      def error(err: Double): Unit = js.native
      def error(err: CustomMediaError): Unit = js.native
      
      def errors(): Unit = js.native
      def errors(options: Options): Unit = js.native
      @JSName("errors")
      var errors_Original: VideoJSErrorsPlugin = js.native
    }
  }
}
