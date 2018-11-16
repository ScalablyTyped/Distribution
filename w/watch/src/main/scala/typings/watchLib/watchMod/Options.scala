package typings
package watchLib.watchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function2[/* path */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean]
  ] = js.undefined
  var ignoreDirectoryPattern: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDotFiles: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreNotPermitted: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnreadableDir: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
}

