package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DataSource")
@js.native
class DataSource () extends js.Object {
  /** Gets an array of Fields associated with the DataSource. */
  def getFields(): js.Array[Field] = js.native
  /** Indicates whether this DataSource is a primary or a secondary data source. */
  def getIsPrimary(): scala.Boolean = js.native
  /** The name of the DataSource as seen in the UI. */
  def getName(): java.lang.String = js.native
}

