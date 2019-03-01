package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueSetArrayCodeActionKind extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
  ]
}

object Anon_ValueSetArrayCodeActionKind {
  @scala.inline
  def apply(
    valueSet: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): Anon_ValueSetArrayCodeActionKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("valueSet")(valueSet)
    __obj.asInstanceOf[Anon_ValueSetArrayCodeActionKind]
  }
}

