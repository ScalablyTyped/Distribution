package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.Tech.SourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  /**
    *
    * @param src
    * @param next
    */
  def setSource(
    src: SourceObject,
    next: js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]
  ): Unit = js.native
}

object Middleware {
  @scala.inline
  def apply(
    setSource: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Unit
  ): Middleware = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction2(setSource))
    __obj.asInstanceOf[Middleware]
  }
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetSource(
      value: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Unit
    ): Self = this.set("setSource", js.Any.fromFunction2(value))
  }
  
}

