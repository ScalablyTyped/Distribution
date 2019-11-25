package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.`text/javascript`
import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import typings.webpack.webpackStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /** When used in tandem with output.library and output.libraryTarget, this option allows users to insert comments within the export wrapper. */
  var auxiliaryComment: js.UndefOr[String | AuxiliaryCommentObject] = js.undefined
  /** The filename of non-entry chunks as relative path inside the output.path directory. */
  var chunkFilename: js.UndefOr[String] = js.undefined
  /** Number of milliseconds before chunk request expires, defaults to 120,000. */
  var chunkLoadTimeout: js.UndefOr[Double] = js.undefined
  /** This option enables cross-origin loading of chunks. */
  var crossOriginLoading: js.UndefOr[String | Boolean] = js.undefined
  /** Similar to output.devtoolModuleFilenameTemplate, but used in the case of duplicate module identifiers. */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])] = js.undefined
  /**
    * Enable line to line mapped mode for all/specified modules.
    * Line to line mapped mode uses a simple SourceMap where each line of the generated source is mapped to the same line of the original source.
    * It’s a performance optimization. Only use it if your performance need to be better and you are sure that input lines match which generated lines.
    * true enables it for all modules (not recommended)
    */
  var devtoolLineToLine: js.UndefOr[Boolean] = js.undefined
  /** Filename template string of function for the sources array in a generated SourceMap. */
  var devtoolModuleFilenameTemplate: js.UndefOr[String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String])] = js.undefined
  /** This option determines the modules namespace used with the output.devtoolModuleFilenameTemplate. */
  var devtoolNamespace: js.UndefOr[String] = js.undefined
  /** The filename of the entry chunk as relative path inside the output.path directory. */
  var filename: js.UndefOr[String | (js.Function1[/* chunkData */ ChunkData, String])] = js.undefined
  /**
    * Use the future version of asset emitting logic, which allows freeing memory of assets after emitting.
    * It could break plugins which assume that assets are still readable after they were emitted.
    * @deprecated - will be removed in webpack v5.0.0 and this behaviour will become the new default.
    */
  var futureEmitAssets: js.UndefOr[Boolean] = js.undefined
  /** An expression which is used to address the global object/scope in runtime code. */
  var globalObject: js.UndefOr[String] = js.undefined
  /** The encoding to use when generating the hash, defaults to 'hex' */
  var hashDigest: js.UndefOr[hex | latin1 | base64] = js.undefined
  /** The prefix length of the hash digest to use, defaults to 20. */
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  /** Algorithm used for generation the hash (see node.js crypto package) */
  var hashFunction: js.UndefOr[
    String | (js.Function2[/* algorithm */ String, /* options */ js.UndefOr[js.Any], _])
  ] = js.undefined
  /** An optional salt to update the hash via Node.JS' hash.update. */
  var hashSalt: js.UndefOr[String] = js.undefined
  /** The filename of the Hot Update Chunks. They are inside the output.path directory. */
  var hotUpdateChunkFilename: js.UndefOr[String] = js.undefined
  /** The JSONP function used by webpack for async loading of hot update chunks. */
  var hotUpdateFunction: js.UndefOr[String] = js.undefined
  /** The filename of the Hot Update Main File. It is inside the output.path directory. */
  var hotUpdateMainFilename: js.UndefOr[String] = js.undefined
  /** The JSONP function used by webpack for asnyc loading of chunks. */
  var jsonpFunction: js.UndefOr[String] = js.undefined
  /** Allows customization of the script type webpack injects script tags into the DOM to download async chunks. */
  var jsonpScriptType: js.UndefOr[`text/javascript` | module] = js.undefined
  /** If set, export the bundle as library. output.library is the name. */
  var library: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
  /** Configure which module or modules will be exposed via the `libraryTarget` */
  var libraryExport: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Which format to export the library:
    * - "var" - Export by setting a variable: var Library = xxx (default)
    * - "this" - Export by setting a property of this: this["Library"] = xxx
    * - "commonjs" - Export by setting a property of exports: exports["Library"] = xxx
    * - "commonjs2" - Export by setting module.exports: module.exports = xxx
    * - "amd" - Export to AMD (optionally named)
    * - "umd" - Export to AMD, CommonJS2 or as property in root
    * - "window" - Assign to window
    * - "assign" - Assign to a global variable
    * - "jsonp" - Generate Webpack JSONP module
    */
  var libraryTarget: js.UndefOr[LibraryTarget] = js.undefined
  /** The output directory as absolute path. */
  var path: js.UndefOr[String] = js.undefined
  /** Include comments with information about the modules. */
  var pathinfo: js.UndefOr[Boolean] = js.undefined
  /** The output.path from the view of the Javascript / HTML page. */
  var publicPath: js.UndefOr[String] = js.undefined
  /** The filename of the SourceMaps for the JavaScript files. They are inside the output.path directory. */
  var sourceMapFilename: js.UndefOr[String] = js.undefined
  /** Prefixes every line of the source in the bundle with this string. */
  var sourcePrefix: js.UndefOr[String] = js.undefined
  /** If output.libraryTarget is set to umd and output.library is set, setting this to true will name the AMD module. */
  var umdNamedDefine: js.UndefOr[Boolean] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    auxiliaryComment: String | AuxiliaryCommentObject = null,
    chunkFilename: String = null,
    chunkLoadTimeout: Int | Double = null,
    crossOriginLoading: String | Boolean = null,
    devtoolFallbackModuleFilenameTemplate: String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String]) = null,
    devtoolLineToLine: js.UndefOr[Boolean] = js.undefined,
    devtoolModuleFilenameTemplate: String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, String]) = null,
    devtoolNamespace: String = null,
    filename: String | (js.Function1[/* chunkData */ ChunkData, String]) = null,
    futureEmitAssets: js.UndefOr[Boolean] = js.undefined,
    globalObject: String = null,
    hashDigest: hex | latin1 | base64 = null,
    hashDigestLength: Int | Double = null,
    hashFunction: String | (js.Function2[/* algorithm */ String, /* options */ js.UndefOr[js.Any], _]) = null,
    hashSalt: String = null,
    hotUpdateChunkFilename: String = null,
    hotUpdateFunction: String = null,
    hotUpdateMainFilename: String = null,
    jsonpFunction: String = null,
    jsonpScriptType: `text/javascript` | module = null,
    library: String | js.Array[String] | StringDictionary[String] = null,
    libraryExport: String | js.Array[String] = null,
    libraryTarget: LibraryTarget = null,
    path: String = null,
    pathinfo: js.UndefOr[Boolean] = js.undefined,
    publicPath: String = null,
    sourceMapFilename: String = null,
    sourcePrefix: String = null,
    umdNamedDefine: js.UndefOr[Boolean] = js.undefined
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryComment != null) __obj.updateDynamic("auxiliaryComment")(auxiliaryComment.asInstanceOf[js.Any])
    if (chunkFilename != null) __obj.updateDynamic("chunkFilename")(chunkFilename.asInstanceOf[js.Any])
    if (chunkLoadTimeout != null) __obj.updateDynamic("chunkLoadTimeout")(chunkLoadTimeout.asInstanceOf[js.Any])
    if (crossOriginLoading != null) __obj.updateDynamic("crossOriginLoading")(crossOriginLoading.asInstanceOf[js.Any])
    if (devtoolFallbackModuleFilenameTemplate != null) __obj.updateDynamic("devtoolFallbackModuleFilenameTemplate")(devtoolFallbackModuleFilenameTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(devtoolLineToLine)) __obj.updateDynamic("devtoolLineToLine")(devtoolLineToLine.asInstanceOf[js.Any])
    if (devtoolModuleFilenameTemplate != null) __obj.updateDynamic("devtoolModuleFilenameTemplate")(devtoolModuleFilenameTemplate.asInstanceOf[js.Any])
    if (devtoolNamespace != null) __obj.updateDynamic("devtoolNamespace")(devtoolNamespace.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(futureEmitAssets)) __obj.updateDynamic("futureEmitAssets")(futureEmitAssets.asInstanceOf[js.Any])
    if (globalObject != null) __obj.updateDynamic("globalObject")(globalObject.asInstanceOf[js.Any])
    if (hashDigest != null) __obj.updateDynamic("hashDigest")(hashDigest.asInstanceOf[js.Any])
    if (hashDigestLength != null) __obj.updateDynamic("hashDigestLength")(hashDigestLength.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    if (hashSalt != null) __obj.updateDynamic("hashSalt")(hashSalt.asInstanceOf[js.Any])
    if (hotUpdateChunkFilename != null) __obj.updateDynamic("hotUpdateChunkFilename")(hotUpdateChunkFilename.asInstanceOf[js.Any])
    if (hotUpdateFunction != null) __obj.updateDynamic("hotUpdateFunction")(hotUpdateFunction.asInstanceOf[js.Any])
    if (hotUpdateMainFilename != null) __obj.updateDynamic("hotUpdateMainFilename")(hotUpdateMainFilename.asInstanceOf[js.Any])
    if (jsonpFunction != null) __obj.updateDynamic("jsonpFunction")(jsonpFunction.asInstanceOf[js.Any])
    if (jsonpScriptType != null) __obj.updateDynamic("jsonpScriptType")(jsonpScriptType.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (libraryExport != null) __obj.updateDynamic("libraryExport")(libraryExport.asInstanceOf[js.Any])
    if (libraryTarget != null) __obj.updateDynamic("libraryTarget")(libraryTarget.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(pathinfo)) __obj.updateDynamic("pathinfo")(pathinfo.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (sourceMapFilename != null) __obj.updateDynamic("sourceMapFilename")(sourceMapFilename.asInstanceOf[js.Any])
    if (sourcePrefix != null) __obj.updateDynamic("sourcePrefix")(sourcePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(umdNamedDefine)) __obj.updateDynamic("umdNamedDefine")(umdNamedDefine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

