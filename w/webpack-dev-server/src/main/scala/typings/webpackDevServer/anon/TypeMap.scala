package typings.webpackDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMap extends js.Object {
  var typeMap: js.UndefOr[Dictkey] = js.undefined
}

object TypeMap {
  @scala.inline
  def apply(typeMap: Dictkey = null): TypeMap = {
    val __obj = js.Dynamic.literal()
    if (typeMap != null) __obj.updateDynamic("typeMap")(typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeMap]
  }
}

