package typings.atUirouterCore.libParamsStateParamsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libCommonCommonMod.Obj
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/params/stateParams", "StateParams")
@js.native
class StateParams ()
  extends /* key */ StringDictionary[js.Any] {
  def this(params: Obj) = this()
  /**
    * Merges a set of parameters with all parameters inherited between the common parents of the
    * current state and a given destination state.
    *
    * @param {Object} newParams The set of parameters which will be composited with inherited params.
    * @param {Object} $current Internal definition of object representing the current state.
    * @param {Object} $to Internal definition of object representing state to transition to.
    */
  @JSName("$inherit")
  def $inherit(newParams: Obj, $current: StateObject, $to: StateObject): Obj = js.native
}

