package typings.tstl.tstlModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "Singleton")
@js.native
class Singleton[T] protected ()
  extends typings.tstl.tstlThreadMod.Singleton[T] {
  /**
    * Initializer Constructor.
    *
    * Create a new `Singleton` instance with the *lazy consturctor*.
    *
    * @param lazyConstructor Lazy constructor function returning the promised value.
    */
  def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
}

