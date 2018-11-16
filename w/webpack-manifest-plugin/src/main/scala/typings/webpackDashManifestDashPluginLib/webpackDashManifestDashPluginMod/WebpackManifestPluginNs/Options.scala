package typings
package webpackDashManifestDashPluginLib.webpackDashManifestDashPluginMod.WebpackManifestPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * A path prefix for all file references. Useful for including your output path in the manifest.
           */
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The manifest filename in your output directory.
           * Default: manifest.json
           */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Filter out files.
           */
  var filter: js.UndefOr[js.Function1[/* options */ HooksOptions, scala.Unit]] = js.undefined
  /**
           * Modify files details before the manifest is created.
           */
  var map: js.UndefOr[js.Function1[/* options */ HooksOptions, scala.Unit]] = js.undefined
  /**
           * A path prefix used only on output files, similar to Webpack's output.publicPath. Ignored if basePath was also provided.
           */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify. Use the seed options to populate manifest.
           * Default: (manifest, {name, path}) => ({...manifest, [name]: path})
           */
  var reduce: js.UndefOr[js.Function2[/* manifest */ js.Any, /* options */ HooksOptions, scala.Unit]] = js.undefined
  /**
           * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
           * or may be used to combine manifests across compilations in multi-compiler mode.
           * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
           * Default: {}
           */
  var seed: js.UndefOr[js.Object] = js.undefined
  /**
           * If set to true will emit to build folder and memory in combination with webpack-dev-server
           * Default: false
           */
  var writeToFileEmit: js.UndefOr[scala.Boolean] = js.undefined
}

