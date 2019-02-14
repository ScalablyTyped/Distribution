package typings
package useDashPersistedDashStateLib.useDashPersistedDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-persisted-state", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(key: java.lang.String): useDashPersistedDashStateLib.Anon_InitialState = js.native
  def default(
    key: java.lang.String,
    provider: stdLib.Pick[
      stdLib.Storage, 
      useDashPersistedDashStateLib.useDashPersistedDashStateLibStrings.getItem | useDashPersistedDashStateLib.useDashPersistedDashStateLibStrings.setItem
    ]
  ): useDashPersistedDashStateLib.Anon_InitialState = js.native
}

