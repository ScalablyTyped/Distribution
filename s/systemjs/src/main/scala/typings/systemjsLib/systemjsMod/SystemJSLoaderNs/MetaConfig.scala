package typings
package systemjsLib.systemjsMod.SystemJSLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetaConfig extends js.Object {
  /**
           * A truthy value enables sending credentials to the server on every request. Additionally, a string value adds
           * an "Authorization" header with that value to all requests.
           */
  var authorization: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * To ignore resources that shouldn't be traced as part of the build.
           * Use with the SystemJS Builder. (https://github.com/systemjs/builder#ignore-resources)
           */
  var build: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When scripts are loaded from a different domain (e.g. CDN) the global error handler (window.onerror)
           * has very limited information about errors to prevent unintended leaking. In order to mitigate this,
           * the <script> tags need to set crossorigin attribute and the server needs to enable CORS.
           * The valid values are "anonymous" and "use-credentials".
           */
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Dependencies to load before this module. Goes through regular paths and map normalization.
           * Only supported for the cjs, amd and global formats.
           */
  var deps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * When loading a module that is not an ECMAScript Module, we set the module as the default export,
           * but then also iterate the module object and copy named exports for it a well.
           * Use this option to disable this iteration and copying of the exports.
           */
  var esmExports: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * For the global format, when automatic detection of exports is not enough, a custom exports meta value can be set.
           * This tells the loader what global name to use as the module's export value.
           */
  var exports: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets in what format the module is loaded.
           */
  var format: js.UndefOr[ModuleFormat] = js.undefined
  /**
           * A map of global names to module names that should be defined only for the execution of this module.
           * Enables use of legacy code that expects certain globals to be present.
           * Referenced modules automatically becomes dependencies. Only supported for the cjs and global formats.
           */
  var globals: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The subresource integrity attribute corresponding to the script integrity,
           * describing the expected hash of the final code to be executed.
           * For example, System.config({ meta: { 'src/example.js': { integrity: 'sha256-e3b0c44...' }});
           * would throw an error if the translated source of src/example.js doesn't match the expected hash.
           */
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set a loader for this meta path.
           */
  var loader: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The nonce attribute to use when loading the script as a way to enable CSP.
           * This should correspond to the "nonce-" attribute set in the Content-Security-Policy header.
           */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Load the module using <script> tag injection.
           */
  var scriptLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * For plugin transpilers to set the source map of their transpilation.
           */
  var sourceMap: js.UndefOr[js.Any] = js.undefined
}

