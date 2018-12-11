package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorageManager extends js.Object {
  def estimate(): js.Promise[StorageEstimate]
  def persist(): js.Promise[scala.Boolean]
  def persisted(): js.Promise[scala.Boolean]
}

@JSGlobal("StorageManager")
@js.native
object StorageManager
  extends ScalablyTyped.runtime.Instantiable0[StorageManager]

