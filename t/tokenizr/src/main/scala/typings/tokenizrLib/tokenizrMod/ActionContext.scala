package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContext extends js.Object {
  /**
    * Accept current matching as a new token
    */
  def accept(`type`: java.lang.String): this.type = js.native
  def accept(`type`: java.lang.String, value: js.Any): this.type = js.native
  /**
    * Store and retrieve user data attached to context
    */
  def data(key: java.lang.String): js.Any = js.native
  def data(key: java.lang.String, value: js.Any): js.Any = js.native
  /**
    * Mark current matching to be ignored
    */
  def ignore(): this.type = js.native
  /**
    * Retrieve information of current matching
    */
  def info(): tokenizrLib.Anon_Column = js.native
  /**
    * Pop state
    */
  def pop(): java.lang.String = js.native
  /**
    * Push state
    */
  def push(state: java.lang.String): this.type = js.native
  /**
    * Rark current matching to be rejected
    */
  def reject(): this.type = js.native
  /**
    * Mark current matching to be repeated from scratch
    */
  def repeat(): this.type = js.native
  /**
    * Get/set state
    */
  def state(): java.lang.String = js.native
  /**
    * Replaces the current state
    */
  def state(state: java.lang.String): this.type = js.native
  /**
    * Immediately stop tokenization
    */
  def stop(): this.type = js.native
  /**
    * Set a tag
    */
  def tag(tag: java.lang.String): this.type = js.native
  /**
    * Check whether tag is set
    */
  def tagged(tag: java.lang.String): scala.Boolean = js.native
  /**
    * Unset a tag
    */
  def untag(tag: java.lang.String): this.type = js.native
}

