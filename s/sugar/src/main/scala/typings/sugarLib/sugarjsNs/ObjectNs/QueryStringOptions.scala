package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryStringOptions[T, U] extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
}

