package typings
package webpackDashDevDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var path: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: java.lang.String | js.Array[java.lang.String] = null,
    path: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

