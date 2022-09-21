package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarPosition extends StObject
@JSImport("tableau-js-api/enums", "ToolbarPosition")
@js.native
object ToolbarPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarPosition & String] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with ToolbarPosition
  /* "bottom" */ val BOTTOM: typings.tableauJsApi.enumsMod.ToolbarPosition.BOTTOM & String = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with ToolbarPosition
  /* "top" */ val TOP: typings.tableauJsApi.enumsMod.ToolbarPosition.TOP & String = js.native
}
