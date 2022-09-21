package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterDataType extends StObject
@JSImport("tableau-js-api/enums", "ParameterDataType")
@js.native
object ParameterDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterDataType & String] = js.native
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with ParameterDataType
  /* "boolean" */ val BOOLEAN: typings.tableauJsApi.enumsMod.ParameterDataType.BOOLEAN & String = js.native
  
  @js.native
  sealed trait DATE
    extends StObject
       with ParameterDataType
  /* "date" */ val DATE: typings.tableauJsApi.enumsMod.ParameterDataType.DATE & String = js.native
  
  @js.native
  sealed trait DATETIME
    extends StObject
       with ParameterDataType
  /* "datetime" */ val DATETIME: typings.tableauJsApi.enumsMod.ParameterDataType.DATETIME & String = js.native
  
  @js.native
  sealed trait FLOAT
    extends StObject
       with ParameterDataType
  /* "float" */ val FLOAT: typings.tableauJsApi.enumsMod.ParameterDataType.FLOAT & String = js.native
  
  @js.native
  sealed trait INTEGER
    extends StObject
       with ParameterDataType
  /* "integer" */ val INTEGER: typings.tableauJsApi.enumsMod.ParameterDataType.INTEGER & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with ParameterDataType
  /* "string" */ val STRING: typings.tableauJsApi.enumsMod.ParameterDataType.STRING & String = js.native
}
