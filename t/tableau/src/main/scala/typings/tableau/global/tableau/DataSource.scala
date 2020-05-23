package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.DataSource")
@js.native
class DataSource ()
  extends typings.tableau.tableau.DataSource {
  /** Gets an array of Fields associated with the DataSource. */
  /* CompleteClass */
  override def getFields(): js.Array[typings.tableau.tableau.Field] = js.native
  /** Indicates whether this DataSource is a primary or a secondary data source. */
  /* CompleteClass */
  override def getIsPrimary(): Boolean = js.native
  /** The name of the DataSource as seen in the UI. */
  /* CompleteClass */
  override def getName(): String = js.native
}

