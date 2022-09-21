package typings.tableauJsApi

import typings.tableauJsApi.enumsMod.ParameterAllowableValuesType
import typings.tableauJsApi.enumsMod.ParameterDataType
import typings.tableauJsApi.enumsMod.PeriodType
import typings.tableauJsApi.filteringMod.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("tableau-js-api/parameter", "Parameter")
  @js.native
  open class Parameter () extends StObject {
    
    def getAllowableValues(): js.Array[DataValue] = js.native
    
    def getAllowableValuesType(): ParameterAllowableValuesType = js.native
    
    def getCurrentValue(): DataValue = js.native
    
    def getDataType(): ParameterDataType = js.native
    
    def getDateStepPeriod(): PeriodType = js.native
    
    def getMaxValue(): js.UndefOr[DataValue | Null] = js.native
    
    def getMinValue(): js.UndefOr[DataValue | Null] = js.native
    
    def getName(): String = js.native
    
    def getStepSize(): js.UndefOr[Double | Null] = js.native
  }
}
