package typings
package universalDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Compile extends js.Object {
  def apply(path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path): stdLib.RegExp = js.native
  def apply(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key]
  ): stdLib.RegExp = js.native
  def apply(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.RegExpOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.ParseOptions
  ): stdLib.RegExp = js.native
  def compile[P /* <: js.Object */](path: java.lang.String): pathDashToDashRegexpLib.pathDashToDashRegexpMod.PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: java.lang.String, options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.ParseOptions): pathDashToDashRegexpLib.pathDashToDashRegexpMod.PathFunction[P] = js.native
  def parse(path: java.lang.String): js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token] = js.native
  def parse(path: java.lang.String, options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.ParseOptions): js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token]): pathDashToDashRegexpLib.pathDashToDashRegexpMod.PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token]): stdLib.RegExp = js.native
  def tokensToRegExp(
    tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token],
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key]
  ): stdLib.RegExp = js.native
  def tokensToRegExp(
    tokens: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Token],
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.RegExpOptions
  ): stdLib.RegExp = js.native
}

