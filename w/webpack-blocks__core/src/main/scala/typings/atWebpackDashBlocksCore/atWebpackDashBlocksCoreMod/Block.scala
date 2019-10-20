package typings.atWebpackDashBlocksCore.atWebpackDashBlocksCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block[T /* <: Context */] extends ConfigSetter[T] {
  var post: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
  var pre: js.UndefOr[ConfigSetter[T] | js.Array[ConfigSetter[T]]] = js.native
}

