package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AbortController extends js.Object {
  /**
       * Returns the AbortSignal object associated with this object.
       */
  val signal: AbortSignal
  /**
       * Invoking this method will set this object's AbortSignal's aborted flag and
       * signal to any observers that the associated activity is to be aborted.
       */
  def abort(): scala.Unit
}

@JSGlobal("AbortController")
@js.native
object AbortController
  extends ScalablyTyped.runtime.Instantiable0[AbortController]

