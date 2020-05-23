package typings.wordpressRichText.mod

import typings.wordpressRichText.anon.TypeofimportedActions
import typings.wordpressRichText.anon.TypeofimportedSelectors
import typings.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corerichtext(key: `coreSlashrich-text`): TypeofimportedActions = js.native
  @JSName("select")
  def select_corerichtext(key: `coreSlashrich-text`): TypeofimportedSelectors = js.native
}

