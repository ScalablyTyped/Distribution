package typings
package webpackLib.webpackMod.webpackNs.DllPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
               * The context of requests in the manifest file.
               *
               * Defaults to the webpack context.
               */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The name of the exposed DLL function (keep consistent with `output.library`).
               */
  var name: java.lang.String
  /**
               * The absolute path to the manifest json file (output).
               */
  var path: java.lang.String
}

