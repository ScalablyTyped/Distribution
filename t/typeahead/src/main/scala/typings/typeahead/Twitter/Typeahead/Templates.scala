package typings.typeahead.Twitter.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A hash of templates to be used when rendering the dataset. Note a
  * precompiled template is a function that takes a JavaScript object as
  * its first argument and returns a HTML string.
  */
@js.native
trait Templates[T] extends js.Object {
  
  /**
    * Rendered at the bottom of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var footer: js.UndefOr[
    String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
  ] = js.native
  
  /**
    * Rendered at the top of the dataset when suggestions are present. Can be either a HTML string or
    * a precompiled template. If it's a precompiled template, the passed in context will contain
    * query and suggestions.
    */
  var header: js.UndefOr[
    String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
  ] = js.native
  
  /**
    * Rendered when 0 suggestions are available for the given query.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var notFound: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.native
  
  /**
    * Rendered when 0 synchronous suggestions are available but asynchronous suggestions are expected.
    * Can be either a HTML string or a precompiled template.
    * If it's a precompiled template, the passed in context will contain query.
    */
  var pending: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.native
  
  /**
    * Used to render a single suggestion. If set, this has to be a precompiled template.
    * The associated suggestion object will serve as the context.
    * Defaults to the value of display wrapped in a div tag i.e. <div>{{value}}</div>.
    */
  var suggestion: js.UndefOr[js.Function1[/* suggestion */ T, String]] = js.native
}
object Templates {
  
  @scala.inline
  def apply[T](): Templates[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates[T]]
  }
  
  @scala.inline
  implicit class TemplatesOps[Self <: Templates[_], T] (val x: Self with Templates[T]) extends AnyVal {
    
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
    def setFooterFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self = this.set("footer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooter(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeaderFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self = this.set("header", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeader(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setNotFoundFunction1(value: /* query */ String => String): Self = this.set("notFound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotFound(value: String | (js.Function1[/* query */ String, String])): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
    
    @scala.inline
    def setPendingFunction1(value: /* query */ String => String): Self = this.set("pending", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPending(value: String | (js.Function1[/* query */ String, String])): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setSuggestion(value: /* suggestion */ T => String): Self = this.set("suggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
  }
}
