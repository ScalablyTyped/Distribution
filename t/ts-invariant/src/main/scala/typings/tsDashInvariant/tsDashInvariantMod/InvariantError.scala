package typings.tsDashInvariant.tsDashInvariantMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-invariant", "InvariantError")
@js.native
class InvariantError () extends Error {
  def this(message: String) = this()
  def this(message: Double) = this()
  var framesToPop: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

