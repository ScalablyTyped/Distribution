package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NullOption extends StObject
@JSImport("tableau-js-api/enums", "NullOption")
@js.native
object NullOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NullOption & String] = js.native
  
  @js.native
  sealed trait ALL_VALUES
    extends StObject
       with NullOption
  /* "allValues" */ val ALL_VALUES: typings.tableauJsApi.enumsMod.NullOption.ALL_VALUES & String = js.native
  
  @js.native
  sealed trait NON_NULL_VALUES
    extends StObject
       with NullOption
  /* "nonNullValues" */ val NON_NULL_VALUES: typings.tableauJsApi.enumsMod.NullOption.NON_NULL_VALUES & String = js.native
  
  @js.native
  sealed trait NULL_VALUES
    extends StObject
       with NullOption
  /* "nullValues" */ val NULL_VALUES: typings.tableauJsApi.enumsMod.NullOption.NULL_VALUES & String = js.native
}
