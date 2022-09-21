package typings.xml2js

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml2js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xml2js", "Builder")
  @js.native
  open class Builder () extends StObject {
    def this(options: BuilderOptions) = this()
    
    def buildObject(rootObj: Any): String = js.native
  }
  
  @JSImport("xml2js", "Parser")
  @js.native
  open class Parser () extends EventEmitter {
    def this(options: ParserOptions) = this()
    
    def parseString(str: convertableToString): Unit = js.native
    def parseString(str: convertableToString, cb: js.Function2[/* error */ js.Error | Null, /* result */ Any, Unit]): Unit = js.native
    
    def parseStringPromise(str: convertableToString): js.Promise[Any] = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("xml2js", "ValidationError")
  @js.native
  open class ValidationError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object defaults {
    
    @JSImport("xml2js", "defaults.0.1")
    @js.native
    val `01`: Options = js.native
    
    @JSImport("xml2js", "defaults.0.2")
    @js.native
    val `02`: OptionsV2 = js.native
  }
  
  inline def parseString(
    str: convertableToString,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(str.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseString(
    str: convertableToString,
    options: ParserOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseStringPromise(str: convertableToString): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringPromise")(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseStringPromise(str: convertableToString, options: ParserOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringPromise")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  object processors {
    
    @JSImport("xml2js", "processors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def firstCharLowerCase(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("firstCharLowerCase")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseBooleans(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBooleans")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def parseNumbers(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumbers")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def stripPrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripPrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait BuilderOptions extends StObject {
    
    var allowSurrogateChars: js.UndefOr[Boolean] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var cdata: js.UndefOr[Boolean] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var doctype: js.UndefOr[Any] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var renderOpts: js.UndefOr[RenderOptions] = js.undefined
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var xmldec: js.UndefOr[XmlDeclarationAttributes] = js.undefined
  }
  object BuilderOptions {
    
    inline def apply(): BuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOptions]
    }
    
    extension [Self <: BuilderOptions](x: Self) {
      
      inline def setAllowSurrogateChars(value: Boolean): Self = StObject.set(x, "allowSurrogateChars", value.asInstanceOf[js.Any])
      
      inline def setAllowSurrogateCharsUndefined: Self = StObject.set(x, "allowSurrogateChars", js.undefined)
      
      inline def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      inline def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      inline def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      inline def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      inline def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      inline def setDoctype(value: Any): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setRenderOpts(value: RenderOptions): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      inline def setRenderOptsUndefined: Self = StObject.set(x, "renderOpts", js.undefined)
      
      inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      inline def setXmldec(value: XmlDeclarationAttributes): Self = StObject.set(x, "xmldec", value.asInstanceOf[js.Any])
      
      inline def setXmldecUndefined: Self = StObject.set(x, "xmldec", js.undefined)
    }
  }
  
  /* Inlined std.Omit<xml2js.xml2js.ParserOptions, 'preserveChildrenOrder' | 'chunkSize'> */
  trait Options extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, Any]]] = js.undefined
    
    var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, Any]]] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var charsAsChildren: js.UndefOr[Boolean] = js.undefined
    
    var childkey: js.UndefOr[String] = js.undefined
    
    var emptyTag: js.UndefOr[js.Function0[Any] | String] = js.undefined
    
    var explicitArray: js.UndefOr[Boolean] = js.undefined
    
    var explicitCharkey: js.UndefOr[Boolean] = js.undefined
    
    var explicitChildren: js.UndefOr[Boolean] = js.undefined
    
    var explicitRoot: js.UndefOr[Boolean] = js.undefined
    
    var ignoreAttrs: js.UndefOr[Boolean] = js.undefined
    
    var includeWhiteChars: js.UndefOr[Boolean] = js.undefined
    
    var mergeAttrs: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var normalizeTags: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, Any]]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function] = js.undefined
    
    var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, Any]]] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, Any]]): Self = StObject.set(x, "attrNameProcessors", value.asInstanceOf[js.Any])
      
      inline def setAttrNameProcessorsUndefined: Self = StObject.set(x, "attrNameProcessors", js.undefined)
      
      inline def setAttrNameProcessorsVarargs(value: (js.Function1[/* name */ String, Any])*): Self = StObject.set(x, "attrNameProcessors", js.Array(value*))
      
      inline def setAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, Any]]): Self = StObject.set(x, "attrValueProcessors", value.asInstanceOf[js.Any])
      
      inline def setAttrValueProcessorsUndefined: Self = StObject.set(x, "attrValueProcessors", js.undefined)
      
      inline def setAttrValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, Any])*): Self = StObject.set(x, "attrValueProcessors", js.Array(value*))
      
      inline def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      inline def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      inline def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      inline def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      inline def setCharsAsChildren(value: Boolean): Self = StObject.set(x, "charsAsChildren", value.asInstanceOf[js.Any])
      
      inline def setCharsAsChildrenUndefined: Self = StObject.set(x, "charsAsChildren", js.undefined)
      
      inline def setChildkey(value: String): Self = StObject.set(x, "childkey", value.asInstanceOf[js.Any])
      
      inline def setChildkeyUndefined: Self = StObject.set(x, "childkey", js.undefined)
      
      inline def setEmptyTag(value: js.Function0[Any] | String): Self = StObject.set(x, "emptyTag", value.asInstanceOf[js.Any])
      
      inline def setEmptyTagFunction0(value: () => Any): Self = StObject.set(x, "emptyTag", js.Any.fromFunction0(value))
      
      inline def setEmptyTagUndefined: Self = StObject.set(x, "emptyTag", js.undefined)
      
      inline def setExplicitArray(value: Boolean): Self = StObject.set(x, "explicitArray", value.asInstanceOf[js.Any])
      
      inline def setExplicitArrayUndefined: Self = StObject.set(x, "explicitArray", js.undefined)
      
      inline def setExplicitCharkey(value: Boolean): Self = StObject.set(x, "explicitCharkey", value.asInstanceOf[js.Any])
      
      inline def setExplicitCharkeyUndefined: Self = StObject.set(x, "explicitCharkey", js.undefined)
      
      inline def setExplicitChildren(value: Boolean): Self = StObject.set(x, "explicitChildren", value.asInstanceOf[js.Any])
      
      inline def setExplicitChildrenUndefined: Self = StObject.set(x, "explicitChildren", js.undefined)
      
      inline def setExplicitRoot(value: Boolean): Self = StObject.set(x, "explicitRoot", value.asInstanceOf[js.Any])
      
      inline def setExplicitRootUndefined: Self = StObject.set(x, "explicitRoot", js.undefined)
      
      inline def setIgnoreAttrs(value: Boolean): Self = StObject.set(x, "ignoreAttrs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttrsUndefined: Self = StObject.set(x, "ignoreAttrs", js.undefined)
      
      inline def setIncludeWhiteChars(value: Boolean): Self = StObject.set(x, "includeWhiteChars", value.asInstanceOf[js.Any])
      
      inline def setIncludeWhiteCharsUndefined: Self = StObject.set(x, "includeWhiteChars", js.undefined)
      
      inline def setMergeAttrs(value: Boolean): Self = StObject.set(x, "mergeAttrs", value.asInstanceOf[js.Any])
      
      inline def setMergeAttrsUndefined: Self = StObject.set(x, "mergeAttrs", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeTags(value: Boolean): Self = StObject.set(x, "normalizeTags", value.asInstanceOf[js.Any])
      
      inline def setNormalizeTagsUndefined: Self = StObject.set(x, "normalizeTags", js.undefined)
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTagNameProcessors(value: js.Array[js.Function1[/* name */ String, Any]]): Self = StObject.set(x, "tagNameProcessors", value.asInstanceOf[js.Any])
      
      inline def setTagNameProcessorsUndefined: Self = StObject.set(x, "tagNameProcessors", js.undefined)
      
      inline def setTagNameProcessorsVarargs(value: (js.Function1[/* name */ String, Any])*): Self = StObject.set(x, "tagNameProcessors", js.Array(value*))
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setValidator(value: js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, Any]]): Self = StObject.set(x, "valueProcessors", value.asInstanceOf[js.Any])
      
      inline def setValueProcessorsUndefined: Self = StObject.set(x, "valueProcessors", js.undefined)
      
      inline def setValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, Any])*): Self = StObject.set(x, "valueProcessors", js.Array(value*))
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xml2js.mod.BuilderOptions because var conflicts: attrkey, charkey. Inlined rootName, renderOpts, xmldec, doctype, headless, allowSurrogateChars, cdata */ trait OptionsV2
    extends StObject
       with ParserOptions {
    
    var allowSurrogateChars: js.UndefOr[Boolean] = js.undefined
    
    var cdata: js.UndefOr[Boolean] = js.undefined
    
    var doctype: js.UndefOr[Any] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var renderOpts: js.UndefOr[RenderOptions] = js.undefined
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var xmldec: js.UndefOr[XmlDeclarationAttributes] = js.undefined
  }
  object OptionsV2 {
    
    inline def apply(): OptionsV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsV2]
    }
    
    extension [Self <: OptionsV2](x: Self) {
      
      inline def setAllowSurrogateChars(value: Boolean): Self = StObject.set(x, "allowSurrogateChars", value.asInstanceOf[js.Any])
      
      inline def setAllowSurrogateCharsUndefined: Self = StObject.set(x, "allowSurrogateChars", js.undefined)
      
      inline def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      inline def setDoctype(value: Any): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setRenderOpts(value: RenderOptions): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      inline def setRenderOptsUndefined: Self = StObject.set(x, "renderOpts", js.undefined)
      
      inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      inline def setXmldec(value: XmlDeclarationAttributes): Self = StObject.set(x, "xmldec", value.asInstanceOf[js.Any])
      
      inline def setXmldecUndefined: Self = StObject.set(x, "xmldec", js.undefined)
    }
  }
  
  trait ParserOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, Any]]] = js.undefined
    
    var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, Any]]] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var charsAsChildren: js.UndefOr[Boolean] = js.undefined
    
    var childkey: js.UndefOr[String] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var emptyTag: js.UndefOr[js.Function0[Any] | String] = js.undefined
    
    var explicitArray: js.UndefOr[Boolean] = js.undefined
    
    var explicitCharkey: js.UndefOr[Boolean] = js.undefined
    
    var explicitChildren: js.UndefOr[Boolean] = js.undefined
    
    var explicitRoot: js.UndefOr[Boolean] = js.undefined
    
    var ignoreAttrs: js.UndefOr[Boolean] = js.undefined
    
    var includeWhiteChars: js.UndefOr[Boolean] = js.undefined
    
    var mergeAttrs: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var normalizeTags: js.UndefOr[Boolean] = js.undefined
    
    var preserveChildrenOrder: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, Any]]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function] = js.undefined
    
    var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, Any]]] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, Any]]): Self = StObject.set(x, "attrNameProcessors", value.asInstanceOf[js.Any])
      
      inline def setAttrNameProcessorsUndefined: Self = StObject.set(x, "attrNameProcessors", js.undefined)
      
      inline def setAttrNameProcessorsVarargs(value: (js.Function1[/* name */ String, Any])*): Self = StObject.set(x, "attrNameProcessors", js.Array(value*))
      
      inline def setAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, Any]]): Self = StObject.set(x, "attrValueProcessors", value.asInstanceOf[js.Any])
      
      inline def setAttrValueProcessorsUndefined: Self = StObject.set(x, "attrValueProcessors", js.undefined)
      
      inline def setAttrValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, Any])*): Self = StObject.set(x, "attrValueProcessors", js.Array(value*))
      
      inline def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      inline def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      inline def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      inline def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      inline def setCharsAsChildren(value: Boolean): Self = StObject.set(x, "charsAsChildren", value.asInstanceOf[js.Any])
      
      inline def setCharsAsChildrenUndefined: Self = StObject.set(x, "charsAsChildren", js.undefined)
      
      inline def setChildkey(value: String): Self = StObject.set(x, "childkey", value.asInstanceOf[js.Any])
      
      inline def setChildkeyUndefined: Self = StObject.set(x, "childkey", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setEmptyTag(value: js.Function0[Any] | String): Self = StObject.set(x, "emptyTag", value.asInstanceOf[js.Any])
      
      inline def setEmptyTagFunction0(value: () => Any): Self = StObject.set(x, "emptyTag", js.Any.fromFunction0(value))
      
      inline def setEmptyTagUndefined: Self = StObject.set(x, "emptyTag", js.undefined)
      
      inline def setExplicitArray(value: Boolean): Self = StObject.set(x, "explicitArray", value.asInstanceOf[js.Any])
      
      inline def setExplicitArrayUndefined: Self = StObject.set(x, "explicitArray", js.undefined)
      
      inline def setExplicitCharkey(value: Boolean): Self = StObject.set(x, "explicitCharkey", value.asInstanceOf[js.Any])
      
      inline def setExplicitCharkeyUndefined: Self = StObject.set(x, "explicitCharkey", js.undefined)
      
      inline def setExplicitChildren(value: Boolean): Self = StObject.set(x, "explicitChildren", value.asInstanceOf[js.Any])
      
      inline def setExplicitChildrenUndefined: Self = StObject.set(x, "explicitChildren", js.undefined)
      
      inline def setExplicitRoot(value: Boolean): Self = StObject.set(x, "explicitRoot", value.asInstanceOf[js.Any])
      
      inline def setExplicitRootUndefined: Self = StObject.set(x, "explicitRoot", js.undefined)
      
      inline def setIgnoreAttrs(value: Boolean): Self = StObject.set(x, "ignoreAttrs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAttrsUndefined: Self = StObject.set(x, "ignoreAttrs", js.undefined)
      
      inline def setIncludeWhiteChars(value: Boolean): Self = StObject.set(x, "includeWhiteChars", value.asInstanceOf[js.Any])
      
      inline def setIncludeWhiteCharsUndefined: Self = StObject.set(x, "includeWhiteChars", js.undefined)
      
      inline def setMergeAttrs(value: Boolean): Self = StObject.set(x, "mergeAttrs", value.asInstanceOf[js.Any])
      
      inline def setMergeAttrsUndefined: Self = StObject.set(x, "mergeAttrs", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeTags(value: Boolean): Self = StObject.set(x, "normalizeTags", value.asInstanceOf[js.Any])
      
      inline def setNormalizeTagsUndefined: Self = StObject.set(x, "normalizeTags", js.undefined)
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setPreserveChildrenOrder(value: Boolean): Self = StObject.set(x, "preserveChildrenOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveChildrenOrderUndefined: Self = StObject.set(x, "preserveChildrenOrder", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTagNameProcessors(value: js.Array[js.Function1[/* name */ String, Any]]): Self = StObject.set(x, "tagNameProcessors", value.asInstanceOf[js.Any])
      
      inline def setTagNameProcessorsUndefined: Self = StObject.set(x, "tagNameProcessors", js.undefined)
      
      inline def setTagNameProcessorsVarargs(value: (js.Function1[/* name */ String, Any])*): Self = StObject.set(x, "tagNameProcessors", js.Array(value*))
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setValidator(value: js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, Any]]): Self = StObject.set(x, "valueProcessors", value.asInstanceOf[js.Any])
      
      inline def setValueProcessorsUndefined: Self = StObject.set(x, "valueProcessors", js.undefined)
      
      inline def setValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, Any])*): Self = StObject.set(x, "valueProcessors", js.Array(value*))
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  trait RenderOptions extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var newline: js.UndefOr[String] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
  
  trait XmlDeclarationAttributes extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var version: String
  }
  object XmlDeclarationAttributes {
    
    inline def apply(version: String): XmlDeclarationAttributes = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlDeclarationAttributes]
    }
    
    extension [Self <: XmlDeclarationAttributes](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait convertableToString extends StObject
}
