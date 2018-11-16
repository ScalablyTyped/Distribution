package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", "CodeLens")
@js.native
object CodeLensNs extends js.Object {
  /**
       * Creates a new CodeLens literal.
       */
  def create(range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
  /**
       * Creates a new CodeLens literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    data: js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
  /**
       * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
       */
  def is(value: js.Any): /* is CodeLens */scala.Boolean = js.native
}

