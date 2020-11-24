package typings.tokenizr.mod

import typings.tokenizr.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionContext extends js.Object {
  
  /**
    * Accept current matching as a new token
    */
  def accept(`type`: String): this.type = js.native
  def accept(`type`: String, value: js.Any): this.type = js.native
  
  /**
    * Store and retrieve user data attached to context
    */
  def data(key: String): js.Any = js.native
  def data(key: String, value: js.Any): js.Any = js.native
  
  /**
    * Mark current matching to be ignored
    */
  def ignore(): this.type = js.native
  
  /**
    * Retrieve information of current matching
    */
  def info(): Column = js.native
  
  /**
    * Pop state
    */
  def pop(): String = js.native
  
  /**
    * Push state
    */
  def push(state: String): this.type = js.native
  
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
  def state(): String = js.native
  /**
    * Replaces the current state
    */
  def state(state: String): this.type = js.native
  
  /**
    * Immediately stop tokenization
    */
  def stop(): this.type = js.native
  
  /**
    * Set a tag
    */
  def tag(tag: String): this.type = js.native
  
  /**
    * Check whether tag is set
    */
  def tagged(tag: String): Boolean = js.native
  
  /**
    * Unset a tag
    */
  def untag(tag: String): this.type = js.native
}
