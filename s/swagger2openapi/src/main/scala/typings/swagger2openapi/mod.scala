package typings.swagger2openapi

import org.scalablytyped.runtime.Instantiable0
import typings.node.nodeColonstreamMod.Readable
import typings.openapiTypes.mod.OpenAPIV2.Document
import typings.std.Error
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import typings.swagger2openapi.anon.FnCall
import typings.swagger2openapi.anon.FnCallFilenameOptionsCallback
import typings.swagger2openapi.anon.FnCallReadableOptionsCallback
import typings.swagger2openapi.anon.FnCallSchemaOptionsCallback
import typings.swagger2openapi.anon.FnCallStrOptionsCallback
import typings.swagger2openapi.anon.FnCallUrlOptionsCallback
import typings.swagger2openapi.anon.PartialConvertInputOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger2openapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("swagger2openapi", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swagger2openapi", "default.S2OError")
    @js.native
    def S2OError: Instantiable0[typings.swagger2openapi.mod.S2OError] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("swagger2openapi", "default.S2OError")
    @js.native
    open class S2OErrorCls () extends S2OError
    
    inline def S2OError_=(x: Instantiable0[S2OError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S2OError")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.convert")
    @js.native
    def convert: FnCallSchemaOptionsCallback = js.native
    inline def convert(schema: Document[js.Object], options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convert(
      schema: Document[js.Object],
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("swagger2openapi", "default.convertFile")
    @js.native
    def convertFile: FnCallFilenameOptionsCallback = js.native
    inline def convertFile(filename: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convertFile(
      filename: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertFile_=(x: FnCallFilenameOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertFile")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.convertObj")
    @js.native
    def convertObj: FnCallSchemaOptionsCallback = js.native
    inline def convertObj(schema: Document[js.Object], options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertObj")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convertObj(
      schema: Document[js.Object],
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertObj")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertObj_=(x: FnCallSchemaOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertObj")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.convertStr")
    @js.native
    def convertStr: FnCallStrOptionsCallback = js.native
    inline def convertStr(str: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStr")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convertStr(
      str: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStr")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertStr_=(x: FnCallStrOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertStr")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.convertStream")
    @js.native
    def convertStream: FnCallReadableOptionsCallback = js.native
    inline def convertStream(readable: Readable, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(readable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convertStream(
      readable: Readable,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(readable.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertStream_=(x: FnCallReadableOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertStream")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.convertUrl")
    @js.native
    def convertUrl: FnCallUrlOptionsCallback = js.native
    inline def convertUrl(url: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
    inline def convertUrl(
      url: String,
      options: PartialConvertInputOption,
      callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertUrl_=(x: FnCallUrlOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertUrl")(x.asInstanceOf[js.Any])
    
    inline def convert_=(x: FnCallSchemaOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convert")(x.asInstanceOf[js.Any])
    
    @JSImport("swagger2openapi", "default.targetVersion")
    @js.native
    def targetVersion: String = js.native
    inline def targetVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("swagger2openapi", "S2OError")
  @js.native
  open class S2OError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def convert(schema: Document[js.Object], options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convert(
    schema: Document[js.Object],
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertFile(filename: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convertFile(
    filename: String,
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertObj(schema: Document[js.Object], options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertObj")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convertObj(
    schema: Document[js.Object],
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertObj")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertStr(str: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStr")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convertStr(
    str: String,
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStr")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertStream(readable: Readable, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(readable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convertStream(
    readable: Readable,
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(readable.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertUrl(url: String, options: PartialConvertInputOption): js.Promise[ConvertOutputOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConvertOutputOptions]]
  inline def convertUrl(
    url: String,
    options: PartialConvertInputOption,
    callback: js.Function2[/* err */ js.UndefOr[S2OError], /* options */ ConvertOutputOptions, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("swagger2openapi", "targetVersion")
  @js.native
  val targetVersion: String = js.native
  
  trait ConvertBaseOptions extends StObject {
    
    /** Both If not already a truthy value, will be set to the input text of the conversion */
    var text: String
  }
  object ConvertBaseOptions {
    
    inline def apply(text: String): ConvertBaseOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertBaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertBaseOptions] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertInputOptions
    extends StObject
       with ConvertBaseOptions {
    
    /** Input Optional http(s).Agent to be used when fetching resources */
    var agent: js.Object
    
    /** Input Allow use of YAML anchors/aliases. May break things */
    var anchors: Boolean
    
    /** Input Optional cache of external resources */
    var cache: js.Object
    
    /** Input Command-line flag to indicate unresolve information should be displayed */
    var components: Boolean
    
    /** Input Flag to enable debug mode, adds specification-extensions */
    var debug: Boolean
    
    /** Input Flag to indicate that only the converted OpenApi definition should be returned, not wrapped in options */
    var direct: Boolean
    
    /** Input Encoding to use when reading/writing files */
    var encoding: String
    
    /** Input Flag to invert the status of a validation step */
    var expectFailure: Boolean
    
    /** Input Command-line flag used by testRunner */
    var fail: Boolean
    
    /** Input Treat ENOTFOUND and 404 errors as fatal during resolution, otherwise returns empty objects */
    var fatal: Boolean
    
    /** Input Used to override the internal fetch implementation */
    def fetch(input: RequestInfo): js.Promise[Response]
    /** Input Used to override the internal fetch implementation */
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response]
    /** Input Used to override the internal fetch implementation */
    def fetch(input: URL): js.Promise[Response]
    /** Input Used to override the internal fetch implementation */
    def fetch(input: URL, init: RequestInit): js.Promise[Response]
    
    /** Input Additional options to be passed to fetch calls */
    var fetchOptions: js.Object
    
    /** Input Used to override the internal fetch implementation */
    @JSName("fetch")
    var fetch_Original: FnCall
    
    /** Input Used to pass filename back to testRunner */
    var file: String
    
    /** Input Input filters for the resolver (e.g. to convert JSON schema dialects) */
    var filters: js.Array[
        js.Function2[/* data */ Document[js.Object], /* options */ this.type, Document[js.Object]]
      ]
    
    /** Input Map of additional protocol/scheme handlers, must be functions which return a Promise */
    var handlers: js.Object
    
    /** Reserved Command-line flag to display help */
    var help: Boolean
    
    /** Input Set to true to ignore IO errors when resolving */
    var ignoreIOErrors: Boolean
    
    /** Input Command-line flag to control JSON indenting */
    var indent: String
    
    /** Input Hint to the linter that we are within a callback object */
    var isCallback: Boolean
    
    /** Input Flag to validation step to ignore default/type mismatches */
    var laxDefaults: Boolean
    
    /** Input Flag to validation step to ignore empty URLs and # ? in paths */
    var laxurls: Boolean
    
    /** Input Whether to lint the document during validation */
    var lint: Boolean
    
    /** Input Controls how many linter warnings are logged in verbose mode */
    var lintLimit: Double
    
    /** Input A list of lint rule names which will not be tested */
    var lintSkip: js.Array[Any]
    
    /** Input A linter plugin to use in place of the default linter */
    var linter: Any
    
    /** Input A function to return the set of linter warnings */
    var linterResults: Any
    
    /** Input Flag to validation step to check media-type strings against RFC pattern */
    var mediatype: Boolean
    
    /** Input Command-line flag by testRunner to unset patch */
    var nopatch: Boolean
    
    /** Input true or a URL, to indicate an x-origin extension should be added to the converted output */
    var origin: Boolean | String
    
    /** Input The output file to write to */
    var outfile: String
    
    /** Input Internal flag to testRunner to write output openapi.yaml files */
    var output: Boolean
    
    /** Input Flag to fix-up minor errors in the source definition during conversion */
    var patch: Boolean
    
    /** Input Flag to resolver as to whether to preserve old value of $ref in x-miro, default: false */
    var preserveMiro: Boolean
    
    /** Input Whether to validate each externally $refd file separately */
    var prevalidate: Boolean
    
    /** Input Command-line flag used by testRunner */
    var quiet: Boolean
    
    /** Input The name of the vendor extension to use to preserve body parameter names (e.g. x-codegen-request-body-name) */
    var rbname: String
    
    /** Input Controls handling of $ref which has sibling properties. */
    var refSiblings: String
    
    /** Input Flag to enable resolution of external $refs */
    var resolve: Boolean
    
    /** Input Flag to enable resolution of internal $refs. Also disables deduplication of requestBodies */
    var resolveInternal: Boolean
    
    /** Reserved Used by tools such as Speccy to skip linter rules */
    var skip: Boolean
    
    /** Input The source filename or url of the definition, used by the resolver */
    var source: String
    
    /** Input Command-line flag used by testRunner */
    var stop: Boolean
    
    /** Input Used to override the default target OpenAPI version of 3.0.0 */
    var targetVersion: String
    
    /** Input Used by tests only to indicate the fixture should throw an exception */
    var throws: Boolean
    
    /** Input URL of the original definition, used when reading a file to create x-origin extension */
    var url: String
    
    /** Input Increase verbosity, e.g. show HTTP GET requests */
    var verbose: Boolean
    
    /** Input Command-line flag to show version information */
    var version: Boolean
    
    /** Input Do not throw on non-patchable errors, add warning extensions */
    var warnOnly: Boolean
    
    /** Input Property name to use for warning extensions, default x-s2o-warning */
    var warnProperty: String
    
    /** Input Ignored (enable WHATWG URL parsing in validation step, now the default) */
    var whatwg: Boolean
    
    /** Input Flag to write YAML, default JSON (overridden by --outfile filepath extension) */
    var yaml: Boolean
  }
  object ConvertInputOptions {
    
    inline def apply(
      agent: js.Object,
      anchors: Boolean,
      cache: js.Object,
      components: Boolean,
      debug: Boolean,
      direct: Boolean,
      encoding: String,
      expectFailure: Boolean,
      fail: Boolean,
      fatal: Boolean,
      fetch: FnCall,
      fetchOptions: js.Object,
      file: String,
      filters: js.Array[
          js.Function2[/* data */ Document[js.Object], ConvertInputOptions, Document[js.Object]]
        ],
      handlers: js.Object,
      help: Boolean,
      ignoreIOErrors: Boolean,
      indent: String,
      isCallback: Boolean,
      laxDefaults: Boolean,
      laxurls: Boolean,
      lint: Boolean,
      lintLimit: Double,
      lintSkip: js.Array[Any],
      linter: Any,
      linterResults: Any,
      mediatype: Boolean,
      nopatch: Boolean,
      origin: Boolean | String,
      outfile: String,
      output: Boolean,
      patch: Boolean,
      preserveMiro: Boolean,
      prevalidate: Boolean,
      quiet: Boolean,
      rbname: String,
      refSiblings: String,
      resolve: Boolean,
      resolveInternal: Boolean,
      skip: Boolean,
      source: String,
      stop: Boolean,
      targetVersion: String,
      text: String,
      throws: Boolean,
      url: String,
      verbose: Boolean,
      version: Boolean,
      warnOnly: Boolean,
      warnProperty: String,
      whatwg: Boolean,
      yaml: Boolean
    ): ConvertInputOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], anchors = anchors.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], direct = direct.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], expectFailure = expectFailure.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], fetchOptions = fetchOptions.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], ignoreIOErrors = ignoreIOErrors.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], isCallback = isCallback.asInstanceOf[js.Any], laxDefaults = laxDefaults.asInstanceOf[js.Any], laxurls = laxurls.asInstanceOf[js.Any], lint = lint.asInstanceOf[js.Any], lintLimit = lintLimit.asInstanceOf[js.Any], lintSkip = lintSkip.asInstanceOf[js.Any], linter = linter.asInstanceOf[js.Any], linterResults = linterResults.asInstanceOf[js.Any], mediatype = mediatype.asInstanceOf[js.Any], nopatch = nopatch.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], outfile = outfile.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], preserveMiro = preserveMiro.asInstanceOf[js.Any], prevalidate = prevalidate.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rbname = rbname.asInstanceOf[js.Any], refSiblings = refSiblings.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolveInternal = resolveInternal.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], throws = throws.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], warnOnly = warnOnly.asInstanceOf[js.Any], warnProperty = warnProperty.asInstanceOf[js.Any], whatwg = whatwg.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertInputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertInputOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: js.Object): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAnchors(value: Boolean): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      inline def setCache(value: js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: Boolean): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDirect(value: Boolean): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setExpectFailure(value: Boolean): Self = StObject.set(x, "expectFailure", value.asInstanceOf[js.Any])
      
      inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchOptions(value: js.Object): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFilters(
        value: js.Array[
              js.Function2[/* data */ Document[js.Object], ConvertInputOptions, Document[js.Object]]
            ]
      ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: (js.Function2[/* data */ Document[js.Object], ConvertInputOptions, Document[js.Object]])*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setHandlers(value: js.Object): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIOErrors(value: Boolean): Self = StObject.set(x, "ignoreIOErrors", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIsCallback(value: Boolean): Self = StObject.set(x, "isCallback", value.asInstanceOf[js.Any])
      
      inline def setLaxDefaults(value: Boolean): Self = StObject.set(x, "laxDefaults", value.asInstanceOf[js.Any])
      
      inline def setLaxurls(value: Boolean): Self = StObject.set(x, "laxurls", value.asInstanceOf[js.Any])
      
      inline def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
      
      inline def setLintLimit(value: Double): Self = StObject.set(x, "lintLimit", value.asInstanceOf[js.Any])
      
      inline def setLintSkip(value: js.Array[Any]): Self = StObject.set(x, "lintSkip", value.asInstanceOf[js.Any])
      
      inline def setLintSkipVarargs(value: Any*): Self = StObject.set(x, "lintSkip", js.Array(value*))
      
      inline def setLinter(value: Any): Self = StObject.set(x, "linter", value.asInstanceOf[js.Any])
      
      inline def setLinterResults(value: Any): Self = StObject.set(x, "linterResults", value.asInstanceOf[js.Any])
      
      inline def setMediatype(value: Boolean): Self = StObject.set(x, "mediatype", value.asInstanceOf[js.Any])
      
      inline def setNopatch(value: Boolean): Self = StObject.set(x, "nopatch", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Boolean | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOutfile(value: String): Self = StObject.set(x, "outfile", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPreserveMiro(value: Boolean): Self = StObject.set(x, "preserveMiro", value.asInstanceOf[js.Any])
      
      inline def setPrevalidate(value: Boolean): Self = StObject.set(x, "prevalidate", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setRbname(value: String): Self = StObject.set(x, "rbname", value.asInstanceOf[js.Any])
      
      inline def setRefSiblings(value: String): Self = StObject.set(x, "refSiblings", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveInternal(value: Boolean): Self = StObject.set(x, "resolveInternal", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
      
      inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWarnOnly(value: Boolean): Self = StObject.set(x, "warnOnly", value.asInstanceOf[js.Any])
      
      inline def setWarnProperty(value: String): Self = StObject.set(x, "warnProperty", value.asInstanceOf[js.Any])
      
      inline def setWhatwg(value: Boolean): Self = StObject.set(x, "whatwg", value.asInstanceOf[js.Any])
      
      inline def setYaml(value: Boolean): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertInternalOptions extends StObject {
    
    /** Internal Cache of scopes by securityScheme for validation */
    var allScopes: js.Object
    
    /** Internal When prevalidate is true, holds the entire object representing an externally $refd file */
    var externalRef: js.Object
    
    /** Internal Used to track resolved external references */
    var externalRefs: js.Object
    
    /** Internal object containing resolve and reject functions for the converter */
    var promise: js.Object
    
    /** Internal Used as a mapping between old and new $refs */
    var refmap: js.Object
    
    /** Internal Used by the resolver to track outstanding resolutions */
    var resolver: js.Object
  }
  object ConvertInternalOptions {
    
    inline def apply(
      allScopes: js.Object,
      externalRef: js.Object,
      externalRefs: js.Object,
      promise: js.Object,
      refmap: js.Object,
      resolver: js.Object
    ): ConvertInternalOptions = {
      val __obj = js.Dynamic.literal(allScopes = allScopes.asInstanceOf[js.Any], externalRef = externalRef.asInstanceOf[js.Any], externalRefs = externalRefs.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], refmap = refmap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertInternalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertInternalOptions] (val x: Self) extends AnyVal {
      
      inline def setAllScopes(value: js.Object): Self = StObject.set(x, "allScopes", value.asInstanceOf[js.Any])
      
      inline def setExternalRef(value: js.Object): Self = StObject.set(x, "externalRef", value.asInstanceOf[js.Any])
      
      inline def setExternalRefs(value: js.Object): Self = StObject.set(x, "externalRefs", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Object): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setRefmap(value: js.Object): Self = StObject.set(x, "refmap", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: js.Object): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertOutputOptions
    extends StObject
       with ConvertBaseOptions
       with ConvertInternalOptions {
    
    /** Output The context stack of associated with errors in a validation step, you normally want the last entry only */
    var context: js.Array[Any]
    
    /** Output Information required to unresolve a resolved definition back into its component parts */
    var externals: js.Array[Any]
    
    /** Output Used by the validator, if options.text is a string, will have a property lines containing the number of lines in the input document. */
    var metadata: js.Object
    
    /** Output The OpenApi 3.x definition returned from a conversion step */
    var openapi: typings.openapiTypes.mod.OpenAPIV3.Document[js.Object]
    
    /** Output Used by validation to track uniqueness of operationIds */
    var operationIds: js.Array[String]
    
    /** Bi-directional Used by testRunner to round-trip the original definition, set by non-object ConvertXXX methods */
    var original: Document[js.Object]
    
    /** Output Count of number of patches applied during conversion */
    var patches: Double
    
    /** Output Flag set if the source string, URL or stream contained a YAML formatted definition */
    var sourceYaml: Boolean
    
    /** Output The result of a validation step */
    var valid: Boolean
    
    /** Output Warnings generated by a validation step */
    var warnings: js.Array[Any]
  }
  object ConvertOutputOptions {
    
    inline def apply(
      allScopes: js.Object,
      context: js.Array[Any],
      externalRef: js.Object,
      externalRefs: js.Object,
      externals: js.Array[Any],
      metadata: js.Object,
      openapi: typings.openapiTypes.mod.OpenAPIV3.Document[js.Object],
      operationIds: js.Array[String],
      original: Document[js.Object],
      patches: Double,
      promise: js.Object,
      refmap: js.Object,
      resolver: js.Object,
      sourceYaml: Boolean,
      text: String,
      valid: Boolean,
      warnings: js.Array[Any]
    ): ConvertOutputOptions = {
      val __obj = js.Dynamic.literal(allScopes = allScopes.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], externalRef = externalRef.asInstanceOf[js.Any], externalRefs = externalRefs.asInstanceOf[js.Any], externals = externals.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], operationIds = operationIds.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], patches = patches.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], refmap = refmap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], sourceYaml = sourceYaml.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertOutputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertOutputOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: js.Array[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextVarargs(value: Any*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setExternals(value: js.Array[Any]): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      inline def setExternalsVarargs(value: Any*): Self = StObject.set(x, "externals", js.Array(value*))
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setOpenapi(value: typings.openapiTypes.mod.OpenAPIV3.Document[js.Object]): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
      
      inline def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
      
      inline def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value*))
      
      inline def setOriginal(value: Document[js.Object]): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setPatches(value: Double): Self = StObject.set(x, "patches", value.asInstanceOf[js.Any])
      
      inline def setSourceYaml(value: Boolean): Self = StObject.set(x, "sourceYaml", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[Any]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: Any*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
