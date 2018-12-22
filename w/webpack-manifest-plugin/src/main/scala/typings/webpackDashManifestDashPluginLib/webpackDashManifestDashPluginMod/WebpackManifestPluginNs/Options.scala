package typings
package webpackDashManifestDashPluginLib.webpackDashManifestDashPluginMod.WebpackManifestPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * A path prefix for all keys. Useful for including your output path in the manifest.
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
  var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, scala.Boolean]] = js.undefined
  /**
           * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify.
           */
  var generate: js.UndefOr[
    js.Function2[/* seed */ js.Object, /* files */ js.Array[FileDescriptor], js.Object]
  ] = js.undefined
  /**
           * Modify files details before the manifest is created.
           */
  var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.undefined
  /**
           * A path prefix that will be added to values of the manifest.
           * Default: output.publicPath
           */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
           * or may be used to combine manifests across compilations in multi-compiler mode.
           * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
           * Default: {}
           */
  var seed: js.UndefOr[js.Object] = js.undefined
  /**
           * Output manifest file in different format then json (i.e. yaml).
           */
  var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, java.lang.String]] = js.undefined
  /**
           * Sort files before they are passed to generate.
           */
  var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, scala.Double]] = js.undefined
  /**
           * If set to true will emit to build folder and memory in combination with webpack-dev-server
           * Default: false
           */
  var writeToFileEmit: js.UndefOr[scala.Boolean] = js.undefined
}

