package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionUpdateType extends StObject
@JSImport("tableau-js-api/enums", "SelectionUpdateType")
@js.native
object SelectionUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionUpdateType & String] = js.native
  
  @js.native
  sealed trait ADD
    extends StObject
       with SelectionUpdateType
  /* "add" */ val ADD: typings.tableauJsApi.enumsMod.SelectionUpdateType.ADD & String = js.native
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with SelectionUpdateType
  /* "remove" */ val REMOVE: typings.tableauJsApi.enumsMod.SelectionUpdateType.REMOVE & String = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with SelectionUpdateType
  /* "replace" */ val REPLACE: typings.tableauJsApi.enumsMod.SelectionUpdateType.REPLACE & String = js.native
}
