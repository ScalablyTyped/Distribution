package typings.testingLibraryDom.anon

import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@testing-library/dom.@testing-library/dom/types/config.Config> */
@js.native
trait PartialConfig extends js.Object {
  
  var asyncUtilTimeout: js.UndefOr[Double] = js.native
  
  var asyncWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], js.Promise[_]]] = js.native
  
  var computedStyleSupportsPseudoElements: js.UndefOr[Boolean] = js.native
  
  var defaultHidden: js.UndefOr[Boolean] = js.native
  
  var eventWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
  
  var getElementError: js.UndefOr[js.Function2[/* message */ String, /* container */ HTMLElement, Error]] = js.native
  
  var showOriginalStackTrace: js.UndefOr[Boolean] = js.native
  
  var testIdAttribute: js.UndefOr[String] = js.native
  
  var throwSuggestions: js.UndefOr[Boolean] = js.native
}
object PartialConfig {
  
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    
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
    def deleteAsyncUtilTimeout: Self = this.set("asyncUtilTimeout", js.undefined)
    
    @scala.inline
    def setAsyncWrapper(value: /* cb */ js.Function1[/* repeated */ js.Any, _] => js.Promise[_]): Self = this.set("asyncWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAsyncWrapper: Self = this.set("asyncWrapper", js.undefined)
    
    @scala.inline
    def setComputedStyleSupportsPseudoElements(value: Boolean): Self = this.set("computedStyleSupportsPseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedStyleSupportsPseudoElements: Self = this.set("computedStyleSupportsPseudoElements", js.undefined)
    
    @scala.inline
    def setDefaultHidden(value: Boolean): Self = this.set("defaultHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHidden: Self = this.set("defaultHidden", js.undefined)
    
    @scala.inline
    def setEventWrapper(value: /* cb */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("eventWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEventWrapper: Self = this.set("eventWrapper", js.undefined)
    
    @scala.inline
    def setGetElementError(value: (/* message */ String, /* container */ HTMLElement) => Error): Self = this.set("getElementError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetElementError: Self = this.set("getElementError", js.undefined)
    
    @scala.inline
    def setShowOriginalStackTrace(value: Boolean): Self = this.set("showOriginalStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOriginalStackTrace: Self = this.set("showOriginalStackTrace", js.undefined)
    
    @scala.inline
    def setTestIdAttribute(value: String): Self = this.set("testIdAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestIdAttribute: Self = this.set("testIdAttribute", js.undefined)
    
    @scala.inline
    def setThrowSuggestions(value: Boolean): Self = this.set("throwSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowSuggestions: Self = this.set("throwSuggestions", js.undefined)
  }
}
