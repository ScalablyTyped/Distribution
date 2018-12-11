package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  /**
       * Returns "utf-8".
       */
  val encoding: java.lang.String = js.native
  /**
       * Returns the result of running UTF-8's encoder.
       */
  def encode(): stdLib.Uint8Array = js.native
  /**
       * Returns the result of running UTF-8's encoder.
       */
  def encode(input: java.lang.String): stdLib.Uint8Array = js.native
}

@JSGlobal("TextEncoder")
@js.native
object TextEncoder
  extends ScalablyTyped.runtime.Instantiable0[TextEncoder]

