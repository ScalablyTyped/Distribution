package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait local extends js.Object {
  def clear(): scala.Unit
  def get(name: java.lang.String): js.Any
  def put(name: java.lang.String, value: js.Any): scala.Unit
  def remove(name: java.lang.String): scala.Unit
}

object local {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    get: js.Function1[java.lang.String, js.Any],
    put: js.Function2[java.lang.String, js.Any, scala.Unit],
    remove: js.Function1[java.lang.String, scala.Unit]
  ): local = {
    val __obj = js.Dynamic.literal(clear = clear, get = get, put = put, remove = remove)
  
    __obj.asInstanceOf[local]
  }
}

