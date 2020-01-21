package typings.videoJs.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "bind")
@js.native
object bind extends js.Object {
  /**
    * Bind (a.k.a proxy or Context). A simple method for changing the context of a function
    * It also stores a unique id on the function so it can be easily removed from events.
    *
    * @param context
    *        The object to bind as scope.
    *
    * @param fn
    *        The function to be bound to a scope.
    *
    * @param [uid]
    *        An optional unique ID for the function to be set
    *
    * @return The new function that will be bound into the context given
    */
  def apply[F /* <: js.Function0[_] */](context: js.Any, fn: F): F = js.native
  def apply[F /* <: js.Function0[_] */](context: js.Any, fn: F, uid: Double): F = js.native
}

