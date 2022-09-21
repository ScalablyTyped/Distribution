package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterAllowableValuesType extends StObject
@JSImport("tableau-js-api/enums", "ParameterAllowableValuesType")
@js.native
object ParameterAllowableValuesType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParameterAllowableValuesType & String] = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with ParameterAllowableValuesType
  /* "all" */ val ALL: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.ALL & String = js.native
  
  @js.native
  sealed trait LIST
    extends StObject
       with ParameterAllowableValuesType
  /* "list" */ val LIST: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.LIST & String = js.native
  
  @js.native
  sealed trait RANGE
    extends StObject
       with ParameterAllowableValuesType
  /* "range" */ val RANGE: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.RANGE & String = js.native
}
