package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  /**
    * Keep comments in the templates AST, even in production
    */
  var comments: js.UndefOr[Boolean] = js.native
  
  /**
    * Only needed for DOM compilers
    */
  var decodeEntities: js.UndefOr[js.Function2[/* rawText */ String, /* asAttr */ Boolean, String]] = js.native
  
  /**
    * @default ['{{', '}}']
    */
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  /**
    * Get tag namespace
    */
  var getNamespace: js.UndefOr[js.Function2[/* tag */ String, /* parent */ js.UndefOr[ElementNode], Namespace]] = js.native
  
  /**
    * Get text parsing mode for this element
    */
  var getTextMode: js.UndefOr[
    js.Function2[/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode], TextModes]
  ] = js.native
  
  /**
    * Platform-specific built-in components e.g. `<Transition>`
    */
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.native
  
  /**
    * Separate option for end users to extend the native elements list
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean | Unit]] = js.native
  
  /**
    * e.g. platform native elements, e.g. `<div>` for browsers
    */
  var isNativeTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
  
  /**
    * e.g. elements that should preserve whitespace inside, e.g. `<pre>`
    */
  var isPreTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
  
  /**
    * e.g. native elements that can self-close, e.g. `<img>`, `<br>`, `<hr>`
    */
  var isVoidTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ CompilerError, Unit]] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setDecodeEntities(value: (/* rawText */ String, /* asAttr */ Boolean) => String): Self = this.set("decodeEntities", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setDelimiters(value: js.Tuple2[String, String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    
    @scala.inline
    def setGetNamespace(value: (/* tag */ String, /* parent */ js.UndefOr[ElementNode]) => Namespace): Self = this.set("getNamespace", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetNamespace: Self = this.set("getNamespace", js.undefined)
    
    @scala.inline
    def setGetTextMode(value: (/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode]) => TextModes): Self = this.set("getTextMode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetTextMode: Self = this.set("getTextMode", js.undefined)
    
    @scala.inline
    def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = this.set("isBuiltInComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsBuiltInComponent: Self = this.set("isBuiltInComponent", js.undefined)
    
    @scala.inline
    def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = this.set("isCustomElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsCustomElement: Self = this.set("isCustomElement", js.undefined)
    
    @scala.inline
    def setIsNativeTag(value: /* tag */ String => Boolean): Self = this.set("isNativeTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsNativeTag: Self = this.set("isNativeTag", js.undefined)
    
    @scala.inline
    def setIsPreTag(value: /* tag */ String => Boolean): Self = this.set("isPreTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsPreTag: Self = this.set("isPreTag", js.undefined)
    
    @scala.inline
    def setIsVoidTag(value: /* tag */ String => Boolean): Self = this.set("isVoidTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsVoidTag: Self = this.set("isVoidTag", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ CompilerError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
}
