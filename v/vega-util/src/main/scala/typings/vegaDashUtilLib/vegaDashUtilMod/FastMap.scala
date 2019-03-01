package typings
package vegaDashUtilLib.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastMap extends js.Object {
  var empty: scala.Double
  var size: scala.Double
  def clean(): scala.Unit
  def delete(f: java.lang.String): scala.Unit
  def get(f: java.lang.String): js.Any
  def has(f: java.lang.String): scala.Boolean
  def set(f: java.lang.String, v: js.Any): scala.Unit
}

object FastMap {
  @scala.inline
  def apply(
    clean: js.Function0[scala.Unit],
    delete: js.Function1[java.lang.String, scala.Unit],
    empty: scala.Double,
    get: js.Function1[java.lang.String, js.Any],
    has: js.Function1[java.lang.String, scala.Boolean],
    set: js.Function2[java.lang.String, js.Any, scala.Unit],
    size: scala.Double
  ): FastMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clean")(clean)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FastMap]
  }
}

