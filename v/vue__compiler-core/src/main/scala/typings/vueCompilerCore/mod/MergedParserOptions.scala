package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreStrings.condense
import typings.vueCompilerCore.vueCompilerCoreStrings.preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Required<@vue/compiler-core.@vue/compiler-core.ParserOptions>, @vue/compiler-core.@vue/compiler-core.OptionalOptions> & std.Pick<@vue/compiler-core.@vue/compiler-core.ParserOptions, @vue/compiler-core.@vue/compiler-core.OptionalOptions> */
trait MergedParserOptions extends StObject {
  
  var comments: Boolean
  
  var compatConfig: js.UndefOr[CompilerCompatConfig] = js.undefined
  
  def decodeEntities(rawText: String, asAttr: Boolean): String
  @JSName("decodeEntities")
  var decodeEntities_Original: js.Function2[/* rawText */ String, /* asAttr */ Boolean, String]
  
  var delimiters: js.Tuple2[String, String]
  
  def getNamespace(tag: String): Namespace
  def getNamespace(tag: String, parent: ElementNode): Namespace
  @JSName("getNamespace")
  var getNamespace_Original: js.Function2[/* tag */ String, /* parent */ js.UndefOr[ElementNode], Namespace]
  
  def getTextMode(node: ElementNode): TextModes
  def getTextMode(node: ElementNode, parent: ElementNode): TextModes
  @JSName("getTextMode")
  var getTextMode_Original: js.Function2[/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode], TextModes]
  
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.undefined
  
  def isCustomElement(tag: String): Boolean | Unit
  @JSName("isCustomElement")
  var isCustomElement_Original: js.Function1[/* tag */ String, Boolean | Unit]
  
  var isNativeTag: js.UndefOr[js.Function1[/* tag */ String, Boolean]] = js.undefined
  
  def isPreTag(tag: String): Boolean
  @JSName("isPreTag")
  var isPreTag_Original: js.Function1[/* tag */ String, Boolean]
  
  def isVoidTag(tag: String): Boolean
  @JSName("isVoidTag")
  var isVoidTag_Original: js.Function1[/* tag */ String, Boolean]
  
  def onError(error: CompilerError): Unit
  @JSName("onError")
  var onError_Original: js.Function1[/* error */ CompilerError, Unit]
  
  def onWarn(warning: CompilerError): Unit
  @JSName("onWarn")
  var onWarn_Original: js.Function1[/* warning */ CompilerError, Unit]
  
  var whitespace: js.UndefOr[preserve | condense] = js.undefined
}
object MergedParserOptions {
  
  inline def apply(
    comments: Boolean,
    decodeEntities: (/* rawText */ String, /* asAttr */ Boolean) => String,
    delimiters: js.Tuple2[String, String],
    getNamespace: (/* tag */ String, /* parent */ js.UndefOr[ElementNode]) => Namespace,
    getTextMode: (/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode]) => TextModes,
    isCustomElement: /* tag */ String => Boolean | Unit,
    isPreTag: /* tag */ String => Boolean,
    isVoidTag: /* tag */ String => Boolean,
    onError: /* error */ CompilerError => Unit,
    onWarn: /* warning */ CompilerError => Unit
  ): MergedParserOptions = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], decodeEntities = js.Any.fromFunction2(decodeEntities), delimiters = delimiters.asInstanceOf[js.Any], getNamespace = js.Any.fromFunction2(getNamespace), getTextMode = js.Any.fromFunction2(getTextMode), isCustomElement = js.Any.fromFunction1(isCustomElement), isPreTag = js.Any.fromFunction1(isPreTag), isVoidTag = js.Any.fromFunction1(isVoidTag), onError = js.Any.fromFunction1(onError), onWarn = js.Any.fromFunction1(onWarn))
    __obj.asInstanceOf[MergedParserOptions]
  }
  
  extension [Self <: MergedParserOptions](x: Self) {
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCompatConfig(value: CompilerCompatConfig): Self = StObject.set(x, "compatConfig", value.asInstanceOf[js.Any])
    
    inline def setCompatConfigUndefined: Self = StObject.set(x, "compatConfig", js.undefined)
    
    inline def setDecodeEntities(value: (/* rawText */ String, /* asAttr */ Boolean) => String): Self = StObject.set(x, "decodeEntities", js.Any.fromFunction2(value))
    
    inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setGetNamespace(value: (/* tag */ String, /* parent */ js.UndefOr[ElementNode]) => Namespace): Self = StObject.set(x, "getNamespace", js.Any.fromFunction2(value))
    
    inline def setGetTextMode(value: (/* node */ ElementNode, /* parent */ js.UndefOr[ElementNode]) => TextModes): Self = StObject.set(x, "getTextMode", js.Any.fromFunction2(value))
    
    inline def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = StObject.set(x, "isBuiltInComponent", js.Any.fromFunction1(value))
    
    inline def setIsBuiltInComponentUndefined: Self = StObject.set(x, "isBuiltInComponent", js.undefined)
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsNativeTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isNativeTag", js.Any.fromFunction1(value))
    
    inline def setIsNativeTagUndefined: Self = StObject.set(x, "isNativeTag", js.undefined)
    
    inline def setIsPreTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isPreTag", js.Any.fromFunction1(value))
    
    inline def setIsVoidTag(value: /* tag */ String => Boolean): Self = StObject.set(x, "isVoidTag", js.Any.fromFunction1(value))
    
    inline def setOnError(value: /* error */ CompilerError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnWarn(value: /* warning */ CompilerError => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction1(value))
    
    inline def setWhitespace(value: preserve | condense): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
