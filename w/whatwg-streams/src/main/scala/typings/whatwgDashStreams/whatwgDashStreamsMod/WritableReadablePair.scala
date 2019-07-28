package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableReadablePair[T /* <: WritableStream[_] */, U /* <: ReadableStream[_] */] extends js.Object {
  var readable: U
  var writable: T
}

object WritableReadablePair {
  @scala.inline
  def apply[T /* <: WritableStream[_] */, U /* <: ReadableStream[_] */](readable: U, writable: T): WritableReadablePair[T, U] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WritableReadablePair[T, U]]
  }
}

