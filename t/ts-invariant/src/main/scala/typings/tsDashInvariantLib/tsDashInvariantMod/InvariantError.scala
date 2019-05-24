package typings
package tsDashInvariantLib.tsDashInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-invariant", "InvariantError")
@js.native
class InvariantError ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: scala.Double) = this()
  var framesToPop: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

