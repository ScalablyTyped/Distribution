package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ValueSetArray extends js.Object {
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

