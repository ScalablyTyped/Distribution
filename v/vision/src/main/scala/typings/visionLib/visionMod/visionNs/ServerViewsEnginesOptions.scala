package typings
package visionLib.visionMod.visionNs

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
    engines: org.scalablytyped.runtime.StringDictionary[NpmModule] | ServerViewsEnginesOptions,
    module: NpmModule,
    allowAbsolutePaths: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsecureAccess: js.UndefOr[scala.Boolean] = js.undefined,
    compileMode: visionLib.visionLibStrings.sync | visionLib.visionLibStrings.async = null,
    compileOptions: CompileOptions = null,
    contentType: java.lang.String = null,
    context: js.Object | (js.Function1[/* request */ hapiLib.hapiMod.Request, js.Object]) = null,
    defaultExtension: java.lang.String = null,
    encoding: java.lang.String = null,
    helpersPath: java.lang.String | js.Array[java.lang.String] = null,
    isCached: js.UndefOr[scala.Boolean] = js.undefined,
    layout: scala.Boolean | java.lang.String = null,
    layoutKeyword: java.lang.String = null,
    layoutPath: java.lang.String | js.Array[java.lang.String] = null,
    partialsPath: java.lang.String | js.Array[java.lang.String] = null,
    path: java.lang.String | js.Array[java.lang.String] = null,
    relativeTo: java.lang.String = null,
    runtimeOptions: RuntimeOptions = null
  ): ServerViewsEnginesOptions = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], module = module)
    if (!js.isUndefined(allowAbsolutePaths)) __obj.updateDynamic("allowAbsolutePaths")(allowAbsolutePaths)
    if (!js.isUndefined(allowInsecureAccess)) __obj.updateDynamic("allowInsecureAccess")(allowInsecureAccess)
    if (compileMode != null) __obj.updateDynamic("compileMode")(compileMode.asInstanceOf[js.Any])
    if (compileOptions != null) __obj.updateDynamic("compileOptions")(compileOptions)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (helpersPath != null) __obj.updateDynamic("helpersPath")(helpersPath.asInstanceOf[js.Any])
    if (!js.isUndefined(isCached)) __obj.updateDynamic("isCached")(isCached)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutKeyword != null) __obj.updateDynamic("layoutKeyword")(layoutKeyword)
    if (layoutPath != null) __obj.updateDynamic("layoutPath")(layoutPath.asInstanceOf[js.Any])
    if (partialsPath != null) __obj.updateDynamic("partialsPath")(partialsPath.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (runtimeOptions != null) __obj.updateDynamic("runtimeOptions")(runtimeOptions)
    __obj.asInstanceOf[ServerViewsEnginesOptions]
  }
}

