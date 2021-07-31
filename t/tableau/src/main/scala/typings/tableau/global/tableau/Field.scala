package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Field")
@js.native
class Field ()
  extends StObject
     with typings.tableau.tableau.Field {
  
  /* CompleteClass */
  override def getAggregation(): typings.tableau.tableau.FieldAggregationType = js.native
  
  /** Gets the data source to which this field belongs. */
  /* CompleteClass */
  override def getDataSource(): typings.tableau.tableau.DataSource = js.native
  
  /** Gets the field name (i.e. caption). */
  /* CompleteClass */
  override def getName(): String = js.native
  
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  /* CompleteClass */
  override def getRole(): typings.tableau.tableau.FieldRoleType = js.native
}
