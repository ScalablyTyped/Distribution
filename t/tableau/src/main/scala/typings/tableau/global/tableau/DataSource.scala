package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.DataSource")
@js.native
open class DataSource ()
  extends StObject
     with typings.tableau.tableau.DataSource {
  
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
