package typings.twineSugarcube.uiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIBarAPI extends js.Object {
  
  /**
    * Completely removes the UI bar and all of its associated styles and event handlers.
    * @since 2.17.0
    */
  def destroy(): Unit = js.native
  
  /**
    * Hides the UI bar. Returns a reference to the UIBar object for chaining.
    *
    * NOTE: This does not reclaim the space reserved for the UI bar. Thus, a call to UIBar.stow() may also be necessary.
    * Alternatively, if you simply want the UI bar gone completely and permanently, either using UIBar.destroy() or the
    * StoryInterface special passage may be a better choice.
    * @since 2.29.0
    */
  def hide(): this.type = js.native
  
  /**
    * Returns whether the UI bar is currently hidden.
    * @since 2.29.0
    */
  def isHidden(): Boolean = js.native
  
  /**
    * Returns whether the UI bar is currently stowed.
    * @since 2.29.0
    */
  def isStowed(): Boolean = js.native
  
  /**
    * Shows the UI bar. Returns a reference to the UIBar object for chaining.
    * @since 2.29.0
    */
  def show(): this.type = js.native
  
  /**
    * Stows the UI bar, so that it takes up less space.
    * @param noAnimation Whether to skip the default animation.
    * @since 2.17.0
    * @since 2.29.0: Added returned UIBar chaining reference.
    */
  def stow(): this.type = js.native
  def stow(noAnimation: Boolean): this.type = js.native
  
  /**
    * Unstows UI bar, so that it is fully accessible again.
    * @param noAnimation Whether to skip the default animation.
    * @since 2.17.0
    * @since 2.29.0: Added returned UIBar chaining reference.
    */
  def unstow(): this.type = js.native
  def unstow(noAnimation: Boolean): this.type = js.native
  
  /**
    * Updates all sections of the UI bar that are populated by special passages — e.g., StoryBanner,
    * StoryCaption, StoryMenu, etc.
    * WARNING: As all special passage populated sections are updated it is recommended that
    * UIBar.update() be used sparingly. Ideally, if you need to update UI bar content outside of
    * the normal passage navigation update, then you should update only the specific areas you
    * need to rather than the entire UI bar.
    *
    * @since 2.29.0 Introduced
    */
  def update(): Unit = js.native
}
