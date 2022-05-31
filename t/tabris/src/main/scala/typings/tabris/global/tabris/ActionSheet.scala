package typings.tabris.global.tabris

import typings.tabris.anon.OmitActionSheetsetActions
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ActionSheet")
@js.native
class ActionSheet ()
  extends typings.tabris.mod.ActionSheet {
  def this(properties: Properties[typings.tabris.mod.ActionSheet, OmitActionSheetsetActions]) = this()
}
/* static members */
object ActionSheet {
  
  @JSGlobal("tabris.ActionSheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given action sheet visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual ActionSheet.
    * @param actionSheet The action sheet to open
    */
  inline def open(actionSheet: typings.tabris.mod.ActionSheet): typings.tabris.mod.ActionSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(actionSheet.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.ActionSheet]
}
