package typings.wordpressEditor.mod

import typings.wordpressEditor.anon.TypeofimportedActions
import typings.wordpressEditor.anon.TypeofimportedSelectors
import typings.wordpressEditor.wordpressEditorStrings.coreSlasheditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object wordpressDataAugmentingMod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dispatch_coreeditor(key: coreSlasheditor): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
  
  @scala.inline
  def select_coreeditor(key: coreSlasheditor): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
}
