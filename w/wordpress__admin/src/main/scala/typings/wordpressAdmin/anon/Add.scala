package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  /**
    * If the workflow does not support multi-select, clear out the selection
    * before adding a new attachment to it.
    */
  def add(models: js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment], options: Any): js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment] = js.native
  
  /**
    * Refresh the `single` model whenever the selection changes.
    * Binds `single` instead of using the context argument to ensure
    * it receives no parameters.
    */
  def initialize(models: js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment], options: Any): Unit = js.native
  
  /**
    * Fired when toggling (clicking on) an attachment in the modal.
    */
  def single(): js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment] = js.native
  def single(model: Boolean): js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment] = js.native
  def single(model: typings.wordpressAdmin.mediaModelsMod.Attachment): js.Array[typings.wordpressAdmin.mediaModelsMod.Attachment] = js.native
}
