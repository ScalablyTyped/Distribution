package typings.universalRouter

import typings.pathToRegexp.mod.Key
import typings.pathToRegexp.mod.MatchFunction
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.Path
import typings.pathToRegexp.mod.PathFunction
import typings.pathToRegexp.mod.RegExpOptions
import typings.pathToRegexp.mod.Token
import typings.pathToRegexp.mod.TokensToFunctionOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompile extends js.Object {
  def apply(path: Path): RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): RegExp = js.native
  def compile[P /* <: js.Object */](path: String): PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String): MatchFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String, options: ParseOptions): MatchFunction[P] = js.native
  def parse(path: String): js.Array[Token] = js.native
  def parse(path: String, options: ParseOptions): js.Array[Token] = js.native
  def regexpToFunction[P /* <: js.Object */](re: RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[Token]): RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): RegExp = js.native
}

