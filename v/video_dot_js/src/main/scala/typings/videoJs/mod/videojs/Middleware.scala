package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.Tech.SourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
    *
    * @param src
    * @param next
    */
  def setSource(
    src: SourceObject,
    next: js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]
  ): Unit
}

object Middleware {
  @scala.inline
  def apply(
    setSource: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Unit
  ): Middleware = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction2(setSource))
  
    __obj.asInstanceOf[Middleware]
  }
}

