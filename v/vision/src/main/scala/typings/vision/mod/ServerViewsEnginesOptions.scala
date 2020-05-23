package typings.vision.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapi.mod.Request
import typings.vision.visionStrings.async
import typings.vision.visionStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Includes `module` and any of the views options listed below (@see ServerViewsAdditionalOptions) (except defaultExtension) to override the defaults for a specific engine.
  */
trait ServerViewsEnginesOptions extends ServerViewsConfiguration {
  /**
    * The npm module used for rendering the templates. The module object must contain the compile() function
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
    */
  var module: NpmModule
}

object ServerViewsEnginesOptions {
  @scala.inline
  def apply(
    engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions,
    module: NpmModule,
    allowAbsolutePaths: js.UndefOr[Boolean] = js.undefined,
    allowInsecureAccess: js.UndefOr[Boolean] = js.undefined,
    compileMode: sync | async = null,
    compileOptions: CompileOptions = null,
    contentType: String = null,
    context: js.Object | (js.Function1[/* request */ Request, js.Object]) = null,
    defaultExtension: String = null,
    encoding: String = null,
    helpersPath: String | js.Array[String] = null,
    isCached: js.UndefOr[Boolean] = js.undefined,
    layout: Boolean | String = null,
    layoutKeyword: String = null,
    layoutPath: String | js.Array[String] = null,
    partialsPath: String | js.Array[String] = null,
    path: String | js.Array[String] = null,
    relativeTo: String = null,
    runtimeOptions: RuntimeOptions = null
  ): ServerViewsEnginesOptions = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAbsolutePaths)) __obj.updateDynamic("allowAbsolutePaths")(allowAbsolutePaths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsecureAccess)) __obj.updateDynamic("allowInsecureAccess")(allowInsecureAccess.get.asInstanceOf[js.Any])
    if (compileMode != null) __obj.updateDynamic("compileMode")(compileMode.asInstanceOf[js.Any])
    if (compileOptions != null) __obj.updateDynamic("compileOptions")(compileOptions.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (helpersPath != null) __obj.updateDynamic("helpersPath")(helpersPath.asInstanceOf[js.Any])
    if (!js.isUndefined(isCached)) __obj.updateDynamic("isCached")(isCached.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutKeyword != null) __obj.updateDynamic("layoutKeyword")(layoutKeyword.asInstanceOf[js.Any])
    if (layoutPath != null) __obj.updateDynamic("layoutPath")(layoutPath.asInstanceOf[js.Any])
    if (partialsPath != null) __obj.updateDynamic("partialsPath")(partialsPath.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (runtimeOptions != null) __obj.updateDynamic("runtimeOptions")(runtimeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerViewsEnginesOptions]
  }
}

