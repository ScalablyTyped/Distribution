package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /** When used in tandem with output.library and output.libraryTarget, this option allows users to insert comments within the export wrapper. */
  var auxiliaryComment: js.UndefOr[java.lang.String | AuxiliaryCommentObject] = js.undefined
  /** The filename of non-entry chunks as relative path inside the output.path directory. */
  var chunkFilename: js.UndefOr[java.lang.String] = js.undefined
  /** Number of milliseconds before chunk request expires, defaults to 120,000. */
  var chunkLoadTimeout: js.UndefOr[scala.Double] = js.undefined
  /** This option enables cross-origin loading of chunks. */
  var crossOriginLoading: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /** Similar to output.devtoolModuleFilenameTemplate, but used in the case of duplicate module identifiers. */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[
    java.lang.String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, java.lang.String])
  ] = js.undefined
  /**
    * Enable line to line mapped mode for all/specified modules.
    * Line to line mapped mode uses a simple SourceMap where each line of the generated source is mapped to the same line of the original source.
    * It’s a performance optimization. Only use it if your performance need to be better and you are sure that input lines match which generated lines.
    * true enables it for all modules (not recommended)
    */
  var devtoolLineToLine: js.UndefOr[scala.Boolean] = js.undefined
  /** Filename template string of function for the sources array in a generated SourceMap. */
  var devtoolModuleFilenameTemplate: js.UndefOr[
    java.lang.String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, java.lang.String])
  ] = js.undefined
  /** This option determines the modules namespace used with the output.devtoolModuleFilenameTemplate. */
  var devtoolNamespace: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the entry chunk as relative path inside the output.path directory. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tells webpack to use the future version of asset emitting logic, which allows freeing memory of assets after emitting. It could break plugins which
    * assume that assets are still readable after they were emitted.
    */
  var futureEmitAssets: js.UndefOr[scala.Boolean] = js.undefined
  /** An expression which is used to address the global object/scope in runtime code. */
  var globalObject: js.UndefOr[java.lang.String] = js.undefined
  /** The encoding to use when generating the hash, defaults to 'hex' */
  var hashDigest: js.UndefOr[
    webpackLib.webpackLibStrings.hex | webpackLib.webpackLibStrings.latin1 | webpackLib.webpackLibStrings.base64
  ] = js.undefined
  /** The prefix length of the hash digest to use, defaults to 20. */
  var hashDigestLength: js.UndefOr[scala.Double] = js.undefined
  /** Algorithm used for generation the hash (see node.js crypto package) */
  var hashFunction: js.UndefOr[
    java.lang.String | (js.Function2[/* algorithm */ java.lang.String, /* options */ js.UndefOr[js.Any], _])
  ] = js.undefined
  /** An optional salt to update the hash via Node.JS' hash.update. */
  var hashSalt: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the Hot Update Chunks. They are inside the output.path directory. */
  var hotUpdateChunkFilename: js.UndefOr[java.lang.String] = js.undefined
  /** The JSONP function used by webpack for async loading of hot update chunks. */
  var hotUpdateFunction: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the Hot Update Main File. It is inside the output.path directory. */
  var hotUpdateMainFilename: js.UndefOr[java.lang.String] = js.undefined
  /** The JSONP function used by webpack for asnyc loading of chunks. */
  var jsonpFunction: js.UndefOr[java.lang.String] = js.undefined
  /** Allows customization of the script type webpack injects script tags into the DOM to download async chunks. */
  var jsonpScriptType: js.UndefOr[
    webpackLib.webpackLibStrings.`text/javascript` | webpackLib.webpackLibStrings.module
  ] = js.undefined
  /** If set, export the bundle as library. output.library is the name. */
  var library: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Configure which module or modules will be exposed via the `libraryTarget` */
  var libraryExport: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
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
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Include comments with information about the modules. */
  var pathinfo: js.UndefOr[scala.Boolean] = js.undefined
  /** The output.path from the view of the Javascript / HTML page. */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /** The filename of the SourceMaps for the JavaScript files. They are inside the output.path directory. */
  var sourceMapFilename: js.UndefOr[java.lang.String] = js.undefined
  /** Prefixes every line of the source in the bundle with this string. */
  var sourcePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** If output.libraryTarget is set to umd and output.library is set, setting this to true will name the AMD module. */
  var umdNamedDefine: js.UndefOr[scala.Boolean] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    auxiliaryComment: java.lang.String | AuxiliaryCommentObject = null,
    chunkFilename: java.lang.String = null,
    chunkLoadTimeout: scala.Int | scala.Double = null,
    crossOriginLoading: java.lang.String | scala.Boolean = null,
    devtoolFallbackModuleFilenameTemplate: java.lang.String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, java.lang.String]) = null,
    devtoolLineToLine: js.UndefOr[scala.Boolean] = js.undefined,
    devtoolModuleFilenameTemplate: java.lang.String | (js.Function1[/* info */ DevtoolModuleFilenameTemplateInfo, java.lang.String]) = null,
    devtoolNamespace: java.lang.String = null,
    filename: java.lang.String = null,
    futureEmitAssets: js.UndefOr[scala.Boolean] = js.undefined,
    globalObject: java.lang.String = null,
    hashDigest: webpackLib.webpackLibStrings.hex | webpackLib.webpackLibStrings.latin1 | webpackLib.webpackLibStrings.base64 = null,
    hashDigestLength: scala.Int | scala.Double = null,
    hashFunction: java.lang.String | (js.Function2[/* algorithm */ java.lang.String, /* options */ js.UndefOr[js.Any], _]) = null,
    hashSalt: java.lang.String = null,
    hotUpdateChunkFilename: java.lang.String = null,
    hotUpdateFunction: java.lang.String = null,
    hotUpdateMainFilename: java.lang.String = null,
    jsonpFunction: java.lang.String = null,
    jsonpScriptType: webpackLib.webpackLibStrings.`text/javascript` | webpackLib.webpackLibStrings.module = null,
    library: java.lang.String | js.Array[java.lang.String] = null,
    libraryExport: java.lang.String | js.Array[java.lang.String] = null,
    libraryTarget: LibraryTarget = null,
    path: java.lang.String = null,
    pathinfo: js.UndefOr[scala.Boolean] = js.undefined,
    publicPath: java.lang.String = null,
    sourceMapFilename: java.lang.String = null,
    sourcePrefix: java.lang.String = null,
    umdNamedDefine: js.UndefOr[scala.Boolean] = js.undefined
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryComment != null) __obj.updateDynamic("auxiliaryComment")(auxiliaryComment.asInstanceOf[js.Any])
    if (chunkFilename != null) __obj.updateDynamic("chunkFilename")(chunkFilename)
    if (chunkLoadTimeout != null) __obj.updateDynamic("chunkLoadTimeout")(chunkLoadTimeout.asInstanceOf[js.Any])
    if (crossOriginLoading != null) __obj.updateDynamic("crossOriginLoading")(crossOriginLoading.asInstanceOf[js.Any])
    if (devtoolFallbackModuleFilenameTemplate != null) __obj.updateDynamic("devtoolFallbackModuleFilenameTemplate")(devtoolFallbackModuleFilenameTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(devtoolLineToLine)) __obj.updateDynamic("devtoolLineToLine")(devtoolLineToLine)
    if (devtoolModuleFilenameTemplate != null) __obj.updateDynamic("devtoolModuleFilenameTemplate")(devtoolModuleFilenameTemplate.asInstanceOf[js.Any])
    if (devtoolNamespace != null) __obj.updateDynamic("devtoolNamespace")(devtoolNamespace)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(futureEmitAssets)) __obj.updateDynamic("futureEmitAssets")(futureEmitAssets)
    if (globalObject != null) __obj.updateDynamic("globalObject")(globalObject)
    if (hashDigest != null) __obj.updateDynamic("hashDigest")(hashDigest.asInstanceOf[js.Any])
    if (hashDigestLength != null) __obj.updateDynamic("hashDigestLength")(hashDigestLength.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    if (hashSalt != null) __obj.updateDynamic("hashSalt")(hashSalt)
    if (hotUpdateChunkFilename != null) __obj.updateDynamic("hotUpdateChunkFilename")(hotUpdateChunkFilename)
    if (hotUpdateFunction != null) __obj.updateDynamic("hotUpdateFunction")(hotUpdateFunction)
    if (hotUpdateMainFilename != null) __obj.updateDynamic("hotUpdateMainFilename")(hotUpdateMainFilename)
    if (jsonpFunction != null) __obj.updateDynamic("jsonpFunction")(jsonpFunction)
    if (jsonpScriptType != null) __obj.updateDynamic("jsonpScriptType")(jsonpScriptType.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (libraryExport != null) __obj.updateDynamic("libraryExport")(libraryExport.asInstanceOf[js.Any])
    if (libraryTarget != null) __obj.updateDynamic("libraryTarget")(libraryTarget)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(pathinfo)) __obj.updateDynamic("pathinfo")(pathinfo)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (sourceMapFilename != null) __obj.updateDynamic("sourceMapFilename")(sourceMapFilename)
    if (sourcePrefix != null) __obj.updateDynamic("sourcePrefix")(sourcePrefix)
    if (!js.isUndefined(umdNamedDefine)) __obj.updateDynamic("umdNamedDefine")(umdNamedDefine)
    __obj.asInstanceOf[Output]
  }
}

