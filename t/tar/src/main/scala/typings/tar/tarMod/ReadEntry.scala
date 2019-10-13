package typings.tar.tarMod

import typings.minipass.minipassMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadEntry
  extends ^
     with HeaderProperties {
  /** The number of 512-byte blocks remaining to be written into the stream. */
  var blockRemain: Double = js.native
  /** The extended metadata object provided to the constructor. */
  var extended: js.Any = js.native
  /** The global extended metadata object provided to the constructor. */
  var globalExtended: js.Any = js.native
  /** Whether this entry should be ignored. */
  var ignore: Boolean = js.native
  /**
    * True if this represents metadata about the next entry, false if it
    * represents a filesystem object.
    */
  var meta: Boolean = js.native
  /** The number of bytes remaining to be written into the stream. */
  var remain: Double = js.native
}

