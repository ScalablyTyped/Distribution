package typings.wordpressNotices.mod

import typings.wordpressNotices.anon.TypeofimportedActions
import typings.wordpressNotices.anon.TypeofimportedSelectors
import typings.wordpressNotices.wordpressNoticesStrings.coreSlashnotices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corenotices(key: coreSlashnotices): TypeofimportedActions = js.native
  @JSName("select")
  def select_corenotices(key: coreSlashnotices): TypeofimportedSelectors = js.native
}

