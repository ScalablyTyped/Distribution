package typings.tsmonad.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriterPatterns[S, T, U] extends js.Object {
  def writer(story: js.Array[S], value: T): U = js.native
}

object WriterPatterns {
  @scala.inline
  def apply[S, T, U](writer: (js.Array[S], T) => U): WriterPatterns[S, T, U] = {
    val __obj = js.Dynamic.literal(writer = js.Any.fromFunction2(writer))
    __obj.asInstanceOf[WriterPatterns[S, T, U]]
  }
  @scala.inline
  implicit class WriterPatternsOps[Self <: WriterPatterns[_, _, _], S, T, U] (val x: Self with (WriterPatterns[S, T, U])) extends AnyVal {
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
    def setWriter(value: (js.Array[S], T) => U): Self = this.set("writer", js.Any.fromFunction2(value))
  }
  
}

