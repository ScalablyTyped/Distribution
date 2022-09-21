package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterUpdateType extends StObject
@JSImport("tableau-js-api/enums", "FilterUpdateType")
@js.native
object FilterUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterUpdateType & String] = js.native
  
  @js.native
  sealed trait ADD
    extends StObject
       with FilterUpdateType
  /* "add" */ val ADD: typings.tableauJsApi.enumsMod.FilterUpdateType.ADD & String = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with FilterUpdateType
  /* "all" */ val ALL: typings.tableauJsApi.enumsMod.FilterUpdateType.ALL & String = js.native
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with FilterUpdateType
  /* "remove" */ val REMOVE: typings.tableauJsApi.enumsMod.FilterUpdateType.REMOVE & String = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with FilterUpdateType
  /* "replace" */ val REPLACE: typings.tableauJsApi.enumsMod.FilterUpdateType.REPLACE & String = js.native
}
