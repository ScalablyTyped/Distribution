package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldRoleType extends StObject
@JSImport("tableau-js-api/enums", "FieldRoleType")
@js.native
object FieldRoleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FieldRoleType & String] = js.native
  
  @js.native
  sealed trait DIMENSION
    extends StObject
       with FieldRoleType
  /* "dimension" */ val DIMENSION: typings.tableauJsApi.enumsMod.FieldRoleType.DIMENSION & String = js.native
  
  @js.native
  sealed trait MEASURE
    extends StObject
       with FieldRoleType
  /* "measure" */ val MEASURE: typings.tableauJsApi.enumsMod.FieldRoleType.MEASURE & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with FieldRoleType
  /* "unknown" */ val UNKNOWN: typings.tableauJsApi.enumsMod.FieldRoleType.UNKNOWN & String = js.native
}
