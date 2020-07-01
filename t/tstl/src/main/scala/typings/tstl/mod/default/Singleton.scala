package typings.tstl.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Singleton")
@js.native
class Singleton[T] protected ()
  extends typings.tstl.tstlModuleMod.Singleton[T] {
  /**
    * Initializer Constructor.
    *
    * Create a new `Singleton` instance with the *lazy consturctor*.
    *
    * @param lazyConstructor Lazy constructor function returning the promised value.
    */
  def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
}

