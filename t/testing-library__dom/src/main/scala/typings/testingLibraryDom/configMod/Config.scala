package typings.testingLibraryDom.configMod

import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
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
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsyncUtilTimeout(value: Double): Self = this.set("asyncUtilTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncWrapper(value: js.Function1[/* repeated */ js.Any, _] => js.Promise[_]): Self = this.set("asyncWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputedStyleSupportsPseudoElements(value: Boolean): Self = this.set("computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHidden(value: Boolean): Self = this.set("defaultHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapper(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("eventWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementError(value: (String, HTMLElement) => Error): Self = this.set("getElementError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowOriginalStackTrace(value: Boolean): Self = this.set("showOriginalStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdAttribute(value: String): Self = this.set("testIdAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowSuggestions(value: Boolean): Self = this.set("throwSuggestions", value.asInstanceOf[js.Any])
  }
}
