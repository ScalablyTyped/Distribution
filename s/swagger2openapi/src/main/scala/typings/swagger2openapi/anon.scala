package typings.swagger2openapi

import typings.node.nodeColonstreamMod.Readable
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import typings.swagger2openapi.mod.ConvertInputOptions
import typings.swagger2openapi.mod.ConvertOutputOptions
import typings.swagger2openapi.mod.S2OError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait FnCallFilenameOptionsCallback extends StObject {
    
    def apply(filename: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = js.native
    def apply(
      filename: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallReadableOptionsCallback extends StObject {
    
    def apply(readable: Readable, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = js.native
    def apply(
      readable: Readable,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallSchemaOptionsCallback extends StObject {
    
    def apply(schema: Document[js.Object], options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = js.native
    def apply(
      schema: Document[js.Object],
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallStrOptionsCallback extends StObject {
    
    def apply(str: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = js.native
    def apply(
      str: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallUrlOptionsCallback extends StObject {
    
    def apply(url: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = js.native
    def apply(
      url: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = js.native
  }
  
  /* Inlined std.Partial<swagger2openapi.swagger2openapi.ConvertInputOptions> */
  trait PartialConvertInputOption extends StObject {
    
    var agent: js.UndefOr[js.Object] = js.undefined
    
    var anchors: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[js.Object] = js.undefined
    
    var components: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var direct: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var expectFailure: js.UndefOr[Boolean] = js.undefined
    
    var fail: js.UndefOr[Boolean] = js.undefined
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    var fetchOptions: js.UndefOr[js.Object] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var filters: js.UndefOr[
        js.Array[
          js.Function2[
            /* data */ Document[js.Object], 
            /* options */ ConvertInputOptions, 
            Document[js.Object]
          ]
        ]
      ] = js.undefined
    
    var handlers: js.UndefOr[js.Object] = js.undefined
    
    var help: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIOErrors: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var isCallback: js.UndefOr[Boolean] = js.undefined
    
    var laxDefaults: js.UndefOr[Boolean] = js.undefined
    
    var laxurls: js.UndefOr[Boolean] = js.undefined
    
    var lint: js.UndefOr[Boolean] = js.undefined
    
    var lintLimit: js.UndefOr[Double] = js.undefined
    
    var lintSkip: js.UndefOr[js.Array[Any]] = js.undefined
    
    var linter: js.UndefOr[Any] = js.undefined
    
    var linterResults: js.UndefOr[Any] = js.undefined
    
    var mediatype: js.UndefOr[Boolean] = js.undefined
    
    var nopatch: js.UndefOr[Boolean] = js.undefined
    
    var origin: js.UndefOr[Boolean | String] = js.undefined
    
    var outfile: js.UndefOr[String] = js.undefined
    
    var output: js.UndefOr[Boolean] = js.undefined
    
    var patch: js.UndefOr[Boolean] = js.undefined
    
    var preserveMiro: js.UndefOr[Boolean] = js.undefined
    
    var prevalidate: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var rbname: js.UndefOr[String] = js.undefined
    
    var refSiblings: js.UndefOr[String] = js.undefined
    
    var resolve: js.UndefOr[Boolean] = js.undefined
    
    var resolveInternal: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var stop: js.UndefOr[Boolean] = js.undefined
    
    var targetVersion: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var throws: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[Boolean] = js.undefined
    
    var warnOnly: js.UndefOr[Boolean] = js.undefined
    
    var warnProperty: js.UndefOr[String] = js.undefined
    
    var whatwg: js.UndefOr[Boolean] = js.undefined
    
    var yaml: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConvertInputOption {
    
    inline def apply(): PartialConvertInputOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConvertInputOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConvertInputOption] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: js.Object): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAnchors(value: Boolean): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      inline def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
      
      inline def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setComponents(value: Boolean): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      inline def setDirectUndefined: Self = StObject.set(x, "direct", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExpectFailure(value: Boolean): Self = StObject.set(x, "expectFailure", value.asInstanceOf[js.Any])
      
      inline def setExpectFailureUndefined: Self = StObject.set(x, "expectFailure", js.undefined)
      
      inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchOptions(value: js.Object): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFilters(
        value: js.Array[
              js.Function2[
                /* data */ Document[js.Object], 
                /* options */ ConvertInputOptions, 
                Document[js.Object]
              ]
            ]
      ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(
        value: (js.Function2[
              /* data */ Document[js.Object], 
              /* options */ ConvertInputOptions, 
              Document[js.Object]
            ])*
      ): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setHandlers(value: js.Object): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setIgnoreIOErrors(value: Boolean): Self = StObject.set(x, "ignoreIOErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIOErrorsUndefined: Self = StObject.set(x, "ignoreIOErrors", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIsCallback(value: Boolean): Self = StObject.set(x, "isCallback", value.asInstanceOf[js.Any])
      
      inline def setIsCallbackUndefined: Self = StObject.set(x, "isCallback", js.undefined)
      
      inline def setLaxDefaults(value: Boolean): Self = StObject.set(x, "laxDefaults", value.asInstanceOf[js.Any])
      
      inline def setLaxDefaultsUndefined: Self = StObject.set(x, "laxDefaults", js.undefined)
      
      inline def setLaxurls(value: Boolean): Self = StObject.set(x, "laxurls", value.asInstanceOf[js.Any])
      
      inline def setLaxurlsUndefined: Self = StObject.set(x, "laxurls", js.undefined)
      
      inline def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
      
      inline def setLintLimit(value: Double): Self = StObject.set(x, "lintLimit", value.asInstanceOf[js.Any])
      
      inline def setLintLimitUndefined: Self = StObject.set(x, "lintLimit", js.undefined)
      
      inline def setLintSkip(value: js.Array[Any]): Self = StObject.set(x, "lintSkip", value.asInstanceOf[js.Any])
      
      inline def setLintSkipUndefined: Self = StObject.set(x, "lintSkip", js.undefined)
      
      inline def setLintSkipVarargs(value: Any*): Self = StObject.set(x, "lintSkip", js.Array(value*))
      
      inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
      
      inline def setLinter(value: Any): Self = StObject.set(x, "linter", value.asInstanceOf[js.Any])
      
      inline def setLinterResults(value: Any): Self = StObject.set(x, "linterResults", value.asInstanceOf[js.Any])
      
      inline def setLinterResultsUndefined: Self = StObject.set(x, "linterResults", js.undefined)
      
      inline def setLinterUndefined: Self = StObject.set(x, "linter", js.undefined)
      
      inline def setMediatype(value: Boolean): Self = StObject.set(x, "mediatype", value.asInstanceOf[js.Any])
      
      inline def setMediatypeUndefined: Self = StObject.set(x, "mediatype", js.undefined)
      
      inline def setNopatch(value: Boolean): Self = StObject.set(x, "nopatch", value.asInstanceOf[js.Any])
      
      inline def setNopatchUndefined: Self = StObject.set(x, "nopatch", js.undefined)
      
      inline def setOrigin(value: Boolean | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOutfile(value: String): Self = StObject.set(x, "outfile", value.asInstanceOf[js.Any])
      
      inline def setOutfileUndefined: Self = StObject.set(x, "outfile", js.undefined)
      
      inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPreserveMiro(value: Boolean): Self = StObject.set(x, "preserveMiro", value.asInstanceOf[js.Any])
      
      inline def setPreserveMiroUndefined: Self = StObject.set(x, "preserveMiro", js.undefined)
      
      inline def setPrevalidate(value: Boolean): Self = StObject.set(x, "prevalidate", value.asInstanceOf[js.Any])
      
      inline def setPrevalidateUndefined: Self = StObject.set(x, "prevalidate", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRbname(value: String): Self = StObject.set(x, "rbname", value.asInstanceOf[js.Any])
      
      inline def setRbnameUndefined: Self = StObject.set(x, "rbname", js.undefined)
      
      inline def setRefSiblings(value: String): Self = StObject.set(x, "refSiblings", value.asInstanceOf[js.Any])
      
      inline def setRefSiblingsUndefined: Self = StObject.set(x, "refSiblings", js.undefined)
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveInternal(value: Boolean): Self = StObject.set(x, "resolveInternal", value.asInstanceOf[js.Any])
      
      inline def setResolveInternalUndefined: Self = StObject.set(x, "resolveInternal", js.undefined)
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
      
      inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      inline def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWarnOnly(value: Boolean): Self = StObject.set(x, "warnOnly", value.asInstanceOf[js.Any])
      
      inline def setWarnOnlyUndefined: Self = StObject.set(x, "warnOnly", js.undefined)
      
      inline def setWarnProperty(value: String): Self = StObject.set(x, "warnProperty", value.asInstanceOf[js.Any])
      
      inline def setWarnPropertyUndefined: Self = StObject.set(x, "warnProperty", js.undefined)
      
      inline def setWhatwg(value: Boolean): Self = StObject.set(x, "whatwg", value.asInstanceOf[js.Any])
      
      inline def setWhatwgUndefined: Self = StObject.set(x, "whatwg", js.undefined)
      
      inline def setYaml(value: Boolean): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
      
      inline def setYamlUndefined: Self = StObject.set(x, "yaml", js.undefined)
    }
  }
}
