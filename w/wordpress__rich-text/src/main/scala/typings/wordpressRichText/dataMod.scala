package typings.wordpressRichText

import typings.wordpressRichText.anon.TypeofimportedActions
import typings.wordpressRichText.anon.TypeofimportedSelectors
import typings.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object dataMod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch_corerichtext(key: `coreSlashrich-text`): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
  
  inline def select_corerichtext(key: `coreSlashrich-text`): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
}
