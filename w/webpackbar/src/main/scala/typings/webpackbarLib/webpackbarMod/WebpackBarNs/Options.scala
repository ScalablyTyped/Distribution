package typings
package webpackbarLib.webpackbarMod.WebpackBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** Color output of the progress bar */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Show compiled in time */
  var compiledIn: js.UndefOr[scala.Boolean] = js.undefined
  /** Function called when all builds are finished */
  var done: js.UndefOr[
    js.Function2[
      /* sharedState */ SharedState, 
      /* ctx */ webpackbarLib.webpackbarMod.WebpackBar, 
      scala.Unit
    ]
  ] = js.undefined
  /** Minimal output */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /** Display name */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Enable the profiler for files and loaders */
  var profile: js.UndefOr[scala.Boolean] = js.undefined
  /** Stream to rwite to */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
}

