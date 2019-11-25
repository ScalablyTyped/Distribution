package typings.vision.visionMod

import typings.hapi.hapiMod.Request
import typings.vision.visionStrings.async
import typings.vision.visionStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler} > options for the list of attributes it can not have (isCached, partialsPath, helpersPath)
  */
trait ViewHandlerOrReplyOptions extends js.Object {
  /** if set to true, allows absolute template paths passed to reply.view(). Defaults to false. */
  var allowAbsolutePaths: js.UndefOr[Boolean] = js.undefined
  /** if set to true, allows template paths passed to reply.view() to contain '../'. Defaults to false. */
  var allowInsecureAccess: js.UndefOr[Boolean] = js.undefined
  /** specify whether the engine compile() method is 'sync' or 'async'. Defaults to 'sync'. */
  var compileMode: js.UndefOr[sync | async] = js.undefined
  /** options object passed to the engine's compile function. Defaults to empty options {}. */
  var compileOptions: js.UndefOr[CompileOptions] = js.undefined
  /** the content type of the engine results. Defaults to 'text/html'. */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * A global context used with all templates.
    * The global context option can be either an object or a function that takes the request as its only argument and returns a context object.
    * The request object is only provided when using the view handler or reply.view().
    * When using server.render() or request.render(), the request argument will be null.
    * When rendering views, the global context will be merged with any context object specified on the handler or using reply.view().
    * When multiple context objects are used, values from the global context always have lowest precedence.
    */
  var context: js.UndefOr[js.Object | (js.Function1[/* request */ Request, js.Object])] = js.undefined
  /** the text encoding used by the templates when reading the files and outputting the result. Defaults to 'utf8'. */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * If set to true or a layout filename, layout support is enabled.
    * A layout is a single template file used as the parent template for other view templates in the same engine.
    * If true, the layout template name must be 'layout.ext' where 'ext' is the engine's extension.
    * Otherwise, the provided filename is suffixed with the engine's extension and loaded.
    * Disable layout when using Jade as it will handle including any layout files independently.
    * Defaults to false.
    */
  var layout: js.UndefOr[Boolean | String] = js.undefined
  /** the key used by the template engine to denote where primary template content should go. Defaults to 'content'. */
  var layoutKeyword: js.UndefOr[String] = js.undefined
  /** the root file path, or array of file paths, where layout templates are located (using the relativeTo prefix if present). Defaults to path. */
  var layoutPath: js.UndefOr[String | js.Array[String]] = js.undefined
  /** the root file path, or array of file paths, used to resolve and load the templates identified when calling reply.view(). Defaults to current working directory. */
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * a base path used as prefix for path and partialsPath. No default.
    */
  var relativeTo: js.UndefOr[String] = js.undefined
  /** options object passed to the returned function from the compile operation. Defaults to empty options {}. */
  var runtimeOptions: js.UndefOr[RuntimeOptions] = js.undefined
}

object ViewHandlerOrReplyOptions {
  @scala.inline
  def apply(
    allowAbsolutePaths: js.UndefOr[Boolean] = js.undefined,
    allowInsecureAccess: js.UndefOr[Boolean] = js.undefined,
    compileMode: sync | async = null,
    compileOptions: CompileOptions = null,
    contentType: String = null,
    context: js.Object | (js.Function1[/* request */ Request, js.Object]) = null,
    encoding: String = null,
    layout: Boolean | String = null,
    layoutKeyword: String = null,
    layoutPath: String | js.Array[String] = null,
    path: String | js.Array[String] = null,
    relativeTo: String = null,
    runtimeOptions: RuntimeOptions = null
  ): ViewHandlerOrReplyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAbsolutePaths)) __obj.updateDynamic("allowAbsolutePaths")(allowAbsolutePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsecureAccess)) __obj.updateDynamic("allowInsecureAccess")(allowInsecureAccess.asInstanceOf[js.Any])
    if (compileMode != null) __obj.updateDynamic("compileMode")(compileMode.asInstanceOf[js.Any])
    if (compileOptions != null) __obj.updateDynamic("compileOptions")(compileOptions.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutKeyword != null) __obj.updateDynamic("layoutKeyword")(layoutKeyword.asInstanceOf[js.Any])
    if (layoutPath != null) __obj.updateDynamic("layoutPath")(layoutPath.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (runtimeOptions != null) __obj.updateDynamic("runtimeOptions")(runtimeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewHandlerOrReplyOptions]
  }
}

