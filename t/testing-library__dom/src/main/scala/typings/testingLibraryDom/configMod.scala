package typings.testingLibraryDom

import typings.std.Error
import typings.std.HTMLElement
import typings.testingLibraryDom.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@testing-library/dom/types/config", "configure")
  @js.native
  def configure(configDelta: PartialConfig): Unit = js.native
  @JSImport("@testing-library/dom/types/config", "configure")
  @js.native
  def configure(configDelta: ConfigFn): Unit = js.native
  
  @JSImport("@testing-library/dom/types/config", "getConfig")
  @js.native
  def getConfig(): Config = js.native
  
  @js.native
  trait Config extends StObject {
    
    var asyncUtilTimeout: Double = js.native
    
    def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_] = js.native
    
    var computedStyleSupportsPseudoElements: Boolean = js.native
    
    var defaultHidden: Boolean = js.native
    
    def eventWrapper(cb: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    
    def getElementError(message: String, container: HTMLElement): Error = js.native
    
    var showOriginalStackTrace: Boolean = js.native
    
    var testIdAttribute: String = js.native
    
    var throwSuggestions: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
      asyncUtilTimeout: Double,
      asyncWrapper: js.Function1[/* repeated */ js.Any, _] => js.Promise[_],
      computedStyleSupportsPseudoElements: Boolean,
      defaultHidden: Boolean,
      eventWrapper: js.Function1[/* repeated */ js.Any, _] => Unit,
      getElementError: (String, HTMLElement) => Error,
      showOriginalStackTrace: Boolean,
      testIdAttribute: String,
      throwSuggestions: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(asyncUtilTimeout = asyncUtilTimeout.asInstanceOf[js.Any], asyncWrapper = js.Any.fromFunction1(asyncWrapper), computedStyleSupportsPseudoElements = computedStyleSupportsPseudoElements.asInstanceOf[js.Any], defaultHidden = defaultHidden.asInstanceOf[js.Any], eventWrapper = js.Any.fromFunction1(eventWrapper), getElementError = js.Any.fromFunction2(getElementError), showOriginalStackTrace = showOriginalStackTrace.asInstanceOf[js.Any], testIdAttribute = testIdAttribute.asInstanceOf[js.Any], throwSuggestions = throwSuggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncUtilTimeout(value: Double): Self = StObject.set(x, "asyncUtilTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncWrapper(value: js.Function1[/* repeated */ js.Any, _] => js.Promise[_]): Self = StObject.set(x, "asyncWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputedStyleSupportsPseudoElements(value: Boolean): Self = StObject.set(x, "computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHidden(value: Boolean): Self = StObject.set(x, "defaultHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventWrapper(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = StObject.set(x, "eventWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementError(value: (String, HTMLElement) => Error): Self = StObject.set(x, "getElementError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowOriginalStackTrace(value: Boolean): Self = StObject.set(x, "showOriginalStackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIdAttribute(value: String): Self = StObject.set(x, "testIdAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowSuggestions(value: Boolean): Self = StObject.set(x, "throwSuggestions", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigFn = js.Function1[/* existingConfig */ Config, PartialConfig]
}
