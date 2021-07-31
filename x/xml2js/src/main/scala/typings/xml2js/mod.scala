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
  class Builder () extends StObject {
    def this(options: BuilderOptions) = this()
    
    def buildObject(rootObj: js.Any): String = js.native
  }
  
  @JSImport("xml2js", "Parser")
  @js.native
  class Parser () extends EventEmitter {
    def this(options: ParserOptions) = this()
    
    def parseString(str: convertableToString): Unit = js.native
    def parseString(str: convertableToString, cb: js.Function): Unit = js.native
    
    def parseStringPromise(str: convertableToString): js.Promise[js.Any] = js.native
    
    def reset(): Unit = js.native
  }
  
  object defaults {
    
    @JSImport("xml2js", "defaults.0.1")
    @js.native
    val `01`: Options = js.native
    
    @JSImport("xml2js", "defaults.0.2")
    @js.native
    val `02`: OptionsV2 = js.native
  }
  
  @scala.inline
  def parseString(str: convertableToString, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(str.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parseString(
    str: convertableToString,
    options: ParserOptions,
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parseStringPromise(str: convertableToString): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringPromise")(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def parseStringPromise(str: convertableToString, options: ParserOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStringPromise")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  object processors {
    
    @JSImport("xml2js", "processors")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def firstCharLowerCase(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("firstCharLowerCase")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def normalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def parseBooleans(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBooleans")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def parseNumbers(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumbers")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def stripPrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripPrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait BuilderOptions extends StObject {
    
    var allowSurrogateChars: js.UndefOr[Boolean] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var cdata: js.UndefOr[Boolean] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var doctype: js.UndefOr[js.Any] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var renderOpts: js.UndefOr[RenderOptions] = js.undefined
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var xmldec: js.UndefOr[XmlDeclarationAttributes] = js.undefined
  }
  object BuilderOptions {
    
    @scala.inline
    def apply(): BuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOptions]
    }
    
    @scala.inline
    implicit class BuilderOptionsMutableBuilder[Self <: BuilderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSurrogateChars(value: Boolean): Self = StObject.set(x, "allowSurrogateChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSurrogateCharsUndefined: Self = StObject.set(x, "allowSurrogateChars", js.undefined)
      
      @scala.inline
      def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      @scala.inline
      def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      @scala.inline
      def setDoctype(value: js.Any): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      @scala.inline
      def setRenderOpts(value: RenderOptions): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderOptsUndefined: Self = StObject.set(x, "renderOpts", js.undefined)
      
      @scala.inline
      def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      @scala.inline
      def setXmldec(value: XmlDeclarationAttributes): Self = StObject.set(x, "xmldec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmldecUndefined: Self = StObject.set(x, "xmldec", js.undefined)
    }
  }
  
  /* Inlined std.Omit<xml2js.xml2js.ParserOptions, 'preserveChildrenOrder' | 'chunkSize'> */
  trait Options extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, js.Any]]] = js.undefined
    
    var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var charsAsChildren: js.UndefOr[Boolean] = js.undefined
    
    var childkey: js.UndefOr[String] = js.undefined
    
    var emptyTag: js.UndefOr[js.Any] = js.undefined
    
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
    
    var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, js.Any]]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function] = js.undefined
    
    var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, js.Any]]): Self = StObject.set(x, "attrNameProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrNameProcessorsUndefined: Self = StObject.set(x, "attrNameProcessors", js.undefined)
      
      @scala.inline
      def setAttrNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = StObject.set(x, "attrNameProcessors", js.Array(value :_*))
      
      @scala.inline
      def setAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]): Self = StObject.set(x, "attrValueProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrValueProcessorsUndefined: Self = StObject.set(x, "attrValueProcessors", js.undefined)
      
      @scala.inline
      def setAttrValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = StObject.set(x, "attrValueProcessors", js.Array(value :_*))
      
      @scala.inline
      def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      @scala.inline
      def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      @scala.inline
      def setCharsAsChildren(value: Boolean): Self = StObject.set(x, "charsAsChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsAsChildrenUndefined: Self = StObject.set(x, "charsAsChildren", js.undefined)
      
      @scala.inline
      def setChildkey(value: String): Self = StObject.set(x, "childkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildkeyUndefined: Self = StObject.set(x, "childkey", js.undefined)
      
      @scala.inline
      def setEmptyTag(value: js.Any): Self = StObject.set(x, "emptyTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTagUndefined: Self = StObject.set(x, "emptyTag", js.undefined)
      
      @scala.inline
      def setExplicitArray(value: Boolean): Self = StObject.set(x, "explicitArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitArrayUndefined: Self = StObject.set(x, "explicitArray", js.undefined)
      
      @scala.inline
      def setExplicitCharkey(value: Boolean): Self = StObject.set(x, "explicitCharkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitCharkeyUndefined: Self = StObject.set(x, "explicitCharkey", js.undefined)
      
      @scala.inline
      def setExplicitChildren(value: Boolean): Self = StObject.set(x, "explicitChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitChildrenUndefined: Self = StObject.set(x, "explicitChildren", js.undefined)
      
      @scala.inline
      def setExplicitRoot(value: Boolean): Self = StObject.set(x, "explicitRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitRootUndefined: Self = StObject.set(x, "explicitRoot", js.undefined)
      
      @scala.inline
      def setIgnoreAttrs(value: Boolean): Self = StObject.set(x, "ignoreAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAttrsUndefined: Self = StObject.set(x, "ignoreAttrs", js.undefined)
      
      @scala.inline
      def setIncludeWhiteChars(value: Boolean): Self = StObject.set(x, "includeWhiteChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeWhiteCharsUndefined: Self = StObject.set(x, "includeWhiteChars", js.undefined)
      
      @scala.inline
      def setMergeAttrs(value: Boolean): Self = StObject.set(x, "mergeAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeAttrsUndefined: Self = StObject.set(x, "mergeAttrs", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeTags(value: Boolean): Self = StObject.set(x, "normalizeTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeTagsUndefined: Self = StObject.set(x, "normalizeTags", js.undefined)
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTagNameProcessors(value: js.Array[js.Function1[/* name */ String, js.Any]]): Self = StObject.set(x, "tagNameProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameProcessorsUndefined: Self = StObject.set(x, "tagNameProcessors", js.undefined)
      
      @scala.inline
      def setTagNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = StObject.set(x, "tagNameProcessors", js.Array(value :_*))
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setValidator(value: js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]): Self = StObject.set(x, "valueProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueProcessorsUndefined: Self = StObject.set(x, "valueProcessors", js.undefined)
      
      @scala.inline
      def setValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = StObject.set(x, "valueProcessors", js.Array(value :_*))
      
      @scala.inline
      def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xml2js.mod.BuilderOptions because var conflicts: attrkey, charkey. Inlined rootName, renderOpts, xmldec, doctype, headless, allowSurrogateChars, cdata */ trait OptionsV2
    extends StObject
       with ParserOptions {
    
    var allowSurrogateChars: js.UndefOr[Boolean] = js.undefined
    
    var cdata: js.UndefOr[Boolean] = js.undefined
    
    var doctype: js.UndefOr[js.Any] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var renderOpts: js.UndefOr[RenderOptions] = js.undefined
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var xmldec: js.UndefOr[XmlDeclarationAttributes] = js.undefined
  }
  object OptionsV2 {
    
    @scala.inline
    def apply(): OptionsV2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsV2]
    }
    
    @scala.inline
    implicit class OptionsV2MutableBuilder[Self <: OptionsV2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSurrogateChars(value: Boolean): Self = StObject.set(x, "allowSurrogateChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSurrogateCharsUndefined: Self = StObject.set(x, "allowSurrogateChars", js.undefined)
      
      @scala.inline
      def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setDoctype(value: js.Any): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      @scala.inline
      def setRenderOpts(value: RenderOptions): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderOptsUndefined: Self = StObject.set(x, "renderOpts", js.undefined)
      
      @scala.inline
      def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      @scala.inline
      def setXmldec(value: XmlDeclarationAttributes): Self = StObject.set(x, "xmldec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmldecUndefined: Self = StObject.set(x, "xmldec", js.undefined)
    }
  }
  
  trait ParserOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, js.Any]]] = js.undefined
    
    var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]] = js.undefined
    
    var attrkey: js.UndefOr[String] = js.undefined
    
    var charkey: js.UndefOr[String] = js.undefined
    
    var charsAsChildren: js.UndefOr[Boolean] = js.undefined
    
    var childkey: js.UndefOr[String] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var emptyTag: js.UndefOr[js.Any] = js.undefined
    
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
    
    var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, js.Any]]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[js.Function] = js.undefined
    
    var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]] = js.undefined
    
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, js.Any]]): Self = StObject.set(x, "attrNameProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrNameProcessorsUndefined: Self = StObject.set(x, "attrNameProcessors", js.undefined)
      
      @scala.inline
      def setAttrNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = StObject.set(x, "attrNameProcessors", js.Array(value :_*))
      
      @scala.inline
      def setAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]): Self = StObject.set(x, "attrValueProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrValueProcessorsUndefined: Self = StObject.set(x, "attrValueProcessors", js.undefined)
      
      @scala.inline
      def setAttrValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = StObject.set(x, "attrValueProcessors", js.Array(value :_*))
      
      @scala.inline
      def setAttrkey(value: String): Self = StObject.set(x, "attrkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrkeyUndefined: Self = StObject.set(x, "attrkey", js.undefined)
      
      @scala.inline
      def setCharkey(value: String): Self = StObject.set(x, "charkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharkeyUndefined: Self = StObject.set(x, "charkey", js.undefined)
      
      @scala.inline
      def setCharsAsChildren(value: Boolean): Self = StObject.set(x, "charsAsChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsAsChildrenUndefined: Self = StObject.set(x, "charsAsChildren", js.undefined)
      
      @scala.inline
      def setChildkey(value: String): Self = StObject.set(x, "childkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildkeyUndefined: Self = StObject.set(x, "childkey", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setEmptyTag(value: js.Any): Self = StObject.set(x, "emptyTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTagUndefined: Self = StObject.set(x, "emptyTag", js.undefined)
      
      @scala.inline
      def setExplicitArray(value: Boolean): Self = StObject.set(x, "explicitArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitArrayUndefined: Self = StObject.set(x, "explicitArray", js.undefined)
      
      @scala.inline
      def setExplicitCharkey(value: Boolean): Self = StObject.set(x, "explicitCharkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitCharkeyUndefined: Self = StObject.set(x, "explicitCharkey", js.undefined)
      
      @scala.inline
      def setExplicitChildren(value: Boolean): Self = StObject.set(x, "explicitChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitChildrenUndefined: Self = StObject.set(x, "explicitChildren", js.undefined)
      
      @scala.inline
      def setExplicitRoot(value: Boolean): Self = StObject.set(x, "explicitRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitRootUndefined: Self = StObject.set(x, "explicitRoot", js.undefined)
      
      @scala.inline
      def setIgnoreAttrs(value: Boolean): Self = StObject.set(x, "ignoreAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAttrsUndefined: Self = StObject.set(x, "ignoreAttrs", js.undefined)
      
      @scala.inline
      def setIncludeWhiteChars(value: Boolean): Self = StObject.set(x, "includeWhiteChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeWhiteCharsUndefined: Self = StObject.set(x, "includeWhiteChars", js.undefined)
      
      @scala.inline
      def setMergeAttrs(value: Boolean): Self = StObject.set(x, "mergeAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeAttrsUndefined: Self = StObject.set(x, "mergeAttrs", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeTags(value: Boolean): Self = StObject.set(x, "normalizeTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeTagsUndefined: Self = StObject.set(x, "normalizeTags", js.undefined)
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setPreserveChildrenOrder(value: Boolean): Self = StObject.set(x, "preserveChildrenOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveChildrenOrderUndefined: Self = StObject.set(x, "preserveChildrenOrder", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTagNameProcessors(value: js.Array[js.Function1[/* name */ String, js.Any]]): Self = StObject.set(x, "tagNameProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameProcessorsUndefined: Self = StObject.set(x, "tagNameProcessors", js.undefined)
      
      @scala.inline
      def setTagNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = StObject.set(x, "tagNameProcessors", js.Array(value :_*))
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setValidator(value: js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, js.Any]]): Self = StObject.set(x, "valueProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueProcessorsUndefined: Self = StObject.set(x, "valueProcessors", js.undefined)
      
      @scala.inline
      def setValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = StObject.set(x, "valueProcessors", js.Array(value :_*))
      
      @scala.inline
      def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  trait RenderOptions extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var newline: js.UndefOr[String] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
  
  trait XmlDeclarationAttributes extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var version: String
  }
  object XmlDeclarationAttributes {
    
    @scala.inline
    def apply(version: String): XmlDeclarationAttributes = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlDeclarationAttributes]
    }
    
    @scala.inline
    implicit class XmlDeclarationAttributesMutableBuilder[Self <: XmlDeclarationAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait convertableToString extends StObject
}
