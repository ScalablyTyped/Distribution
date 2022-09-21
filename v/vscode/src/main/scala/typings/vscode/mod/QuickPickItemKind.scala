package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuickPickItemKind extends StObject
@JSImport("vscode", "QuickPickItemKind")
@js.native
object QuickPickItemKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickPickItemKind & Double] = js.native
  
  /**
    * The default {@link QuickPickItem.kind} is an item that can be selected in the quick pick.
    */
  @js.native
  sealed trait Default
    extends StObject
       with QuickPickItemKind
  /* 0 */ val Default: typings.vscode.mod.QuickPickItemKind.Default & Double = js.native
  
  /**
    * When a {@link QuickPickItem} has a kind of {@link Separator}, the item is just a visual separator and does not represent a real item.
    * The only property that applies is {@link QuickPickItem.label label }. All other properties on {@link QuickPickItem} will be ignored and have no effect.
    */
  @js.native
  sealed trait Separator
    extends StObject
       with QuickPickItemKind
  /* -1 */ val Separator: typings.vscode.mod.QuickPickItemKind.Separator & Double = js.native
}
