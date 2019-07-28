package typings.systemjs.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaConfig extends js.Object {
  /**
    * A truthy value enables sending credentials to the server on every request. Additionally, a string value adds
    * an "Authorization" header with that value to all requests.
    */
  var authorization: js.UndefOr[String | Boolean] = js.undefined
  /**
    * To ignore resources that shouldn't be traced as part of the build.
    * Use with the SystemJS Builder. (https://github.com/systemjs/builder#ignore-resources)
    */
  var build: js.UndefOr[Boolean] = js.undefined
  /**
    * When scripts are loaded from a different domain (e.g. CDN) the global error handler (window.onerror)
    * has very limited information about errors to prevent unintended leaking. In order to mitigate this,
    * the <script> tags need to set crossorigin attribute and the server needs to enable CORS.
    * The valid values are "anonymous" and "use-credentials".
    */
  var crossOrigin: js.UndefOr[String] = js.undefined
  /**
    * Dependencies to load before this module. Goes through regular paths and map normalization.
    * Only supported for the cjs, amd and global formats.
    */
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When loading a module that is not an ECMAScript Module, we set the module as the default export,
    * but then also iterate the module object and copy named exports for it a well.
    * Use this option to disable this iteration and copying of the exports.
    */
  var esmExports: js.UndefOr[Boolean] = js.undefined
  /**
    * For the global format, when automatic detection of exports is not enough, a custom exports meta value can be set.
    * This tells the loader what global name to use as the module's export value.
    */
  var exports: js.UndefOr[String] = js.undefined
  /**
    * Sets in what format the module is loaded.
    */
  var format: js.UndefOr[ModuleFormat] = js.undefined
  /**
    * A map of global names to module names that should be defined only for the execution of this module.
    * Enables use of legacy code that expects certain globals to be present.
    * Referenced modules automatically becomes dependencies. Only supported for the cjs and global formats.
    */
  var globals: js.UndefOr[String] = js.undefined
  /**
    * The subresource integrity attribute corresponding to the script integrity,
    * describing the expected hash of the final code to be executed.
    * For example, System.config({ meta: { 'src/example.js': { integrity: 'sha256-e3b0c44...' }});
    * would throw an error if the translated source of src/example.js doesn't match the expected hash.
    */
  var integrity: js.UndefOr[String] = js.undefined
  /**
    * Set a loader for this meta path.
    */
  var loader: js.UndefOr[String] = js.undefined
  /**
    * The nonce attribute to use when loading the script as a way to enable CSP.
    * This should correspond to the "nonce-" attribute set in the Content-Security-Policy header.
    */
  var nonce: js.UndefOr[String] = js.undefined
  /**
    * Load the module using <script> tag injection.
    */
  var scriptLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * For plugin transpilers to set the source map of their transpilation.
    */
  var sourceMap: js.UndefOr[js.Any] = js.undefined
}

object MetaConfig {
  @scala.inline
  def apply(
    authorization: String | Boolean = null,
    build: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String = null,
    deps: js.Array[String] = null,
    esmExports: js.UndefOr[Boolean] = js.undefined,
    exports: String = null,
    format: ModuleFormat = null,
    globals: String = null,
    integrity: String = null,
    loader: String = null,
    nonce: String = null,
    scriptLoad: js.UndefOr[Boolean] = js.undefined,
    sourceMap: js.Any = null
  ): MetaConfig = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (!js.isUndefined(build)) __obj.updateDynamic("build")(build)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(esmExports)) __obj.updateDynamic("esmExports")(esmExports)
    if (exports != null) __obj.updateDynamic("exports")(exports)
    if (format != null) __obj.updateDynamic("format")(format)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(scriptLoad)) __obj.updateDynamic("scriptLoad")(scriptLoad)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[MetaConfig]
  }
}

