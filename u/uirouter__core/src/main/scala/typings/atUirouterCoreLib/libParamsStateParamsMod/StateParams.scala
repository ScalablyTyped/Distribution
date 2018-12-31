package typings
package atUirouterCoreLib.libParamsStateParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/params/stateParams", "StateParams")
@js.native
class StateParams ()
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(params: atUirouterCoreLib.libCommonCommonMod.Obj) = this()
  /**
    * Merges a set of parameters with all parameters inherited between the common parents of the
    * current state and a given destination state.
    *
    * @param {Object} newParams The set of parameters which will be composited with inherited params.
    * @param {Object} $current Internal definition of object representing the current state.
    * @param {Object} $to Internal definition of object representing state to transition to.
    */
  @JSName("$inherit")
  def $inherit(
    newParams: atUirouterCoreLib.libCommonCommonMod.Obj,
    $current: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    $to: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): atUirouterCoreLib.libCommonCommonMod.Obj = js.native
}

