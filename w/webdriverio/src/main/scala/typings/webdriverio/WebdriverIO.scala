package typings.webdriverio

import typings.std.Error
import typings.std.Map
import typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebdriverIO {
  
  @js.native
  trait Browser extends StObject {
    
    /**
      * execute any async action within your test spec
      */
    def call[T](callback: js.Function1[/* repeated */ js.Any, js.Promise[T]]): js.Promise[T] = js.native
    
    var emit: js.Function = js.native
    
    /**
      * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
      * The executed script is assumed to be synchronous and the result of evaluating the script is returned to
      * the client.
      */
    def execute[T](script: String, arguments: js.Any*): js.Promise[T] = js.native
    def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): js.Promise[T] = js.native
    /**
      * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
      * The executed script is assumed to be synchronous and the result of evaluating the script is returned to
      * the client.
      */
    def execute[T, U /* <: js.Array[js.Any] */, V /* <: U */](
      script: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type U is not an array type */ arguments: U
    ): js.Promise[T] = js.native
    def execute[T, U /* <: js.Array[js.Any] */, V /* <: U */](
      script: js.Function1[/* arguments */ V, T],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type U is not an array type */ arguments: U
    ): js.Promise[T] = js.native
    
    // there is no way to add callback as last parameter after `...args`.
    // https://github.com/Microsoft/TypeScript/issues/1360
    // executeAsync: <T>(script: string | ((...arguments: any[], callback: (result: T) => void) => void), ...arguments: any[]) => Promise<T>;
    /**
      * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
      * The executed script is assumed to be asynchronous and must signal that is done by invoking
      * the provided callback, which is always provided as the final argument to the function. The value
      * to this callback will be returned to the client.
      */
    def executeAsync[U /* <: js.Array[js.Any] */, V /* <: U */](
      script: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type U is not an array type */ arguments: U
    ): js.Promise[js.Any] = js.native
    def executeAsync[U /* <: js.Array[js.Any] */, V /* <: U */](
      script: js.Function1[/* arguments */ V, Unit],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type U is not an array type */ arguments: U
    ): js.Promise[js.Any] = js.native
    
    var puppeteer: js.UndefOr[js.Any] = js.native
    
    var strategies: Map[String, js.Function0[ElementReference | js.Array[ElementReference]]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.ClientOptions * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.ClientAsync * / any */ @js.native
  trait BrowserObject
    extends StObject
       with Browser
  
  /* Inlined std.Record<webdriverio.WebdriverIO.ElementReferenceId, string> */
  trait ElementReference extends StObject {
    
    var `element-6066-11e4-a52e-4f735466cecf`: String
  }
  object ElementReference {
    
    inline def apply(`element-6066-11e4-a52e-4f735466cecf`: String): ElementReference = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("element-6066-11e4-a52e-4f735466cecf")(`element-6066-11e4-a52e-4f735466cecf`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementReference]
    }
    
    extension [Self <: ElementReference](x: Self) {
      
      inline def `setElement-6066-11e4-a52e-4f735466cecf`(value: String): Self = StObject.set(x, "element-6066-11e4-a52e-4f735466cecf", value.asInstanceOf[js.Any])
    }
  }
  
  type ElementReferenceId = `element-6066-11e4-a52e-4f735466cecf`
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.ClientOptions * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.ClientAsync * / any */ @js.native
  trait MultiRemoteBrowser
    extends StObject
       with Browser
  
  /**
    * Error to be thrown when a severe error was encountered when a Service is being ran.
    */
  type SevereServiceError = Error
}
