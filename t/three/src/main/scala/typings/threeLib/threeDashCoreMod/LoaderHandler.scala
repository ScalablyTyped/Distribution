package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHandler extends js.Object {
  var handlers: js.Array[stdLib.RegExp | AnyLoader]
  def add(regex: stdLib.RegExp, loader: AnyLoader): scala.Unit
  def get(file: java.lang.String): AnyLoader | scala.Null
}

object LoaderHandler {
  @scala.inline
  def apply(
    add: js.Function2[stdLib.RegExp, AnyLoader, scala.Unit],
    get: js.Function1[java.lang.String, AnyLoader | scala.Null],
    handlers: js.Array[stdLib.RegExp | AnyLoader]
  ): LoaderHandler = {
    val __obj = js.Dynamic.literal(add = add, get = get, handlers = handlers)
  
    __obj.asInstanceOf[LoaderHandler]
  }
}

