package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  def getAggregation(): FieldAggregationType
  
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource
  
  /** Gets the field name (i.e. caption). */
  def getName(): String
  
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType
}
object Field {
  
  inline def apply(
    getAggregation: () => FieldAggregationType,
    getDataSource: () => DataSource,
    getName: () => String,
    getRole: () => FieldRoleType
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = js.Any.fromFunction0(getAggregation), getDataSource = js.Any.fromFunction0(getDataSource), getName = js.Any.fromFunction0(getName), getRole = js.Any.fromFunction0(getRole))
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setGetAggregation(value: () => FieldAggregationType): Self = StObject.set(x, "getAggregation", js.Any.fromFunction0(value))
    
    inline def setGetDataSource(value: () => DataSource): Self = StObject.set(x, "getDataSource", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetRole(value: () => FieldRoleType): Self = StObject.set(x, "getRole", js.Any.fromFunction0(value))
  }
}
