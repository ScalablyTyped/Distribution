package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizr extends js.Object {
  /**
    * Configure a tokenization after-rule callback
    */
  def after(action: tokenizrLib.Action): this.type = js.native
  /**
    * Execute multiple alternative callbacks
    */
  def alternatives(alternatives: (js.ThisFunction0[/* this */ this.type, _])*): js.Any = js.native
  /**
    * Configure a tokenization before-rule callback
    */
  def before(action: tokenizrLib.Action): this.type = js.native
  /**
    * Open tokenization transaction
    */
  def begin(): this.type = js.native
  /**
    * Close (successfully) tokenization transaction
    */
  def commit(): this.type = js.native
  /**
    * Consume the current token (by expecting it to be a particular symbol)
    */
  def consume(`type`: java.lang.String, value: js.Any): Token = js.native
  /**
    * Configure debug operation
    */
  def debug(enableDebug: scala.Boolean): this.type = js.native
  /**
    * Determine depth of still open tokenization transaction
    */
  def depth(): scala.Double = js.native
  /**
    * Create an error message for the current position
    */
  def error(): ParsingError = js.native
  def error(message: java.lang.String): ParsingError = js.native
  /**
    * Configure a tokenization finish callback
    */
  def finish(action: js.ThisFunction1[/* this */ ActionContext, /* ctx */ ActionContext, scala.Unit]): this.type = js.native
  /**
    * Provide (new) input string to tokenize
    */
  def input(input: java.lang.String): this.type = js.native
  /**
    * Peek at the next token or token at particular offset
    */
  def peek(): Token = js.native
  def peek(offset: scala.Double): Token = js.native
  /**
    * Pop state
    */
  def pop(): java.lang.String = js.native
  /**
    * Push state
    */
  def push(state: java.lang.String): this.type = js.native
  /**
    * Reset the internal state
    */
  def reset(): this.type = js.native
  /**
    * Close (unsuccessfully) tokenization transaction
    */
  def rollback(): this.type = js.native
  /**
    * Configure a tokenization rule
    */
  def rule(pattern: stdLib.RegExp, action: tokenizrLib.RuleAction): this.type = js.native
  def rule(pattern: stdLib.RegExp, action: tokenizrLib.RuleAction, name: java.lang.String): this.type = js.native
  def rule(
    state: java.lang.String,
    pattern: stdLib.RegExp,
    action: tokenizrLib.RuleAction,
    name: java.lang.String
  ): this.type = js.native
  /**
    * Skip one or more tokens
    */
  def skip(): this.type = js.native
  def skip(len: scala.Double): this.type = js.native
  /**
    * Get/set state
    */
  def state(): java.lang.String = js.native
  /**
    * Replaces the current state
    */
  def state(state: java.lang.String): this.type = js.native
  /**
    * Set a tag
    */
  def tag(tag: java.lang.String): this.type = js.native
  /**
    * Check whether tag is set
    */
  def tagged(tag: java.lang.String): scala.Boolean = js.native
  /**
    * Determine and return next token
    */
  def token(): Token | scala.Null = js.native
  /**
    * Determine and return all tokens
    */
  def tokens(): js.Array[Token] = js.native
  /**
    * Unset a tag
    */
  def untag(tag: java.lang.String): this.type = js.native
}

