package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JumpListItemKind extends StObject
/** Specifies the kind of jump list item. */
@JSGlobal("Windows.UI.StartScreen.JumpListItemKind")
@js.native
object JumpListItemKind extends StObject {
  
  /** Indicates a jump list item that includes arguments. */
  @js.native
  sealed trait arguments
    extends StObject
       with JumpListItemKind
  
  /** Indicates a jump list item that is an inert separator within a custom jump list item group. */
  @js.native
  sealed trait separator
    extends StObject
       with JumpListItemKind
}
