package typings.vizJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface defines the shape of an object that is held by the caller.
  * This `Module` was created by emscripten, and is therefore largely arcane.
  * This currently just lists a subset of what is defined in `Module`.
  */
trait Module extends js.Object {
  def run(): Unit
}

object Module {
  @scala.inline
  def apply(run: () => Unit): Module = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Module]
  }
}

