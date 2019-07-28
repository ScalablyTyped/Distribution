package typings.three.srcLoadersFileLoaderMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHandler extends js.Object {
  var handlers: js.Array[RegExp | AnyLoader]
  def add(regex: RegExp, loader: AnyLoader): Unit
  def get(file: String): AnyLoader | Null
}

object LoaderHandler {
  @scala.inline
  def apply(
    add: (RegExp, AnyLoader) => Unit,
    get: String => AnyLoader | Null,
    handlers: js.Array[RegExp | AnyLoader]
  ): LoaderHandler = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), handlers = handlers)
  
    __obj.asInstanceOf[LoaderHandler]
  }
}

