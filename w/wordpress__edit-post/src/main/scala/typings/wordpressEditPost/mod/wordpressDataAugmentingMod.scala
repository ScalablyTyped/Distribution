package typings.wordpressEditPost.mod

import typings.wordpressEditPost.anon.TypeofimportedActions
import typings.wordpressEditPost.anon.TypeofimportedSelectors
import typings.wordpressEditPost.wordpressEditPostStrings.`coreSlashedit-post`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  
  @JSName("dispatch")
  def dispatch_coreeditpost(key: `coreSlashedit-post`): TypeofimportedActions = js.native
  
  @JSName("select")
  def select_coreeditpost(key: `coreSlashedit-post`): TypeofimportedSelectors = js.native
}
