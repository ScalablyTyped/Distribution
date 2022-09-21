package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarButtonName extends StObject
@JSImport("tableau-js-api/enums", "ToolbarButtonName")
@js.native
object ToolbarButtonName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonName & String] = js.native
  
  @js.native
  sealed trait REDO
    extends StObject
       with ToolbarButtonName
  /* "redo" */ val REDO: typings.tableauJsApi.enumsMod.ToolbarButtonName.REDO & String = js.native
  
  @js.native
  sealed trait UNDO
    extends StObject
       with ToolbarButtonName
  /* "undo" */ val UNDO: typings.tableauJsApi.enumsMod.ToolbarButtonName.UNDO & String = js.native
}
