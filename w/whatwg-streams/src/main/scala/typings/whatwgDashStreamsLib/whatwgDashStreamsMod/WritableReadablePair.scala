package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WritableReadablePair[T /* <: WritableStream[_] */, U /* <: ReadableStream[_] */] extends js.Object {
  var readable: U
  var writable: T
}

