package typings.tokenizr.tokenizrMod

import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizr extends js.Object {
  /**
    * Configure a tokenization after-rule callback
    */
  def after(action: Action): this.type = js.native
  /**
    * Execute multiple alternative callbacks
    */
  def alternatives[X /* <: js.Array[js.ThisFunction0[/* this */ this.type, _]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param alternatives because its type X is not an array type */ alternatives: X
  ): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: X[number] */ js.Any
  ] = js.native
  /**
    * Configure a tokenization before-rule callback
    */
  def before(action: Action): this.type = js.native
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
  def consume(`type`: String): Token[_] = js.native
  def consume(`type`: String, value: js.Any): Token[_] = js.native
  /**
    * Configure debug operation
    */
  def debug(enableDebug: Boolean): this.type = js.native
  /**
    * Determine depth of still open tokenization transaction
    */
  def depth(): Double = js.native
  /**
    * Create an error message for the current position
    */
  def error(): ParsingError = js.native
  def error(message: String): ParsingError = js.native
  /**
    * Configure a tokenization finish callback
    */
  def finish(action: js.ThisFunction1[/* this */ ActionContext, /* ctx */ ActionContext, Unit]): this.type = js.native
  /**
    * Provide (new) input string to tokenize
    */
  def input(input: String): this.type = js.native
  /**
    * Peek at the next token or token at particular offset
    */
  def peek(): Token[_] = js.native
  def peek(offset: Double): Token[_] = js.native
  /**
    * Pop state
    */
  def pop(): String = js.native
  /**
    * Push state
    */
  def push(state: String): this.type = js.native
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
  def rule(pattern: RegExp, action: RuleAction): this.type = js.native
  def rule(pattern: RegExp, action: RuleAction, name: String): this.type = js.native
  def rule(state: String, pattern: RegExp, action: RuleAction, name: String): this.type = js.native
  /**
    * Skip one or more tokens
    */
  def skip(): this.type = js.native
  def skip(len: Double): this.type = js.native
  /**
    * Get/set state
    */
  def state(): String = js.native
  /**
    * Replaces the current state
    */
  def state(state: String): this.type = js.native
  /**
    * Set a tag
    */
  def tag(tag: String): this.type = js.native
  /**
    * Check whether tag is set
    */
  def tagged(tag: String): Boolean = js.native
  /**
    * Determine and return next token
    */
  def token(): Token[_] | Null = js.native
  /**
    * Determine and return all tokens
    */
  def tokens(): js.Array[Token[_]] = js.native
  /**
    * Unset a tag
    */
  def untag(tag: String): this.type = js.native
}

