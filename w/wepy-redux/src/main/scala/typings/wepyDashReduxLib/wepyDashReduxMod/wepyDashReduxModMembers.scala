package typings
package wepyDashReduxLib.wepyDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy-redux", JSImport.Namespace)
@js.native
object wepyDashReduxModMembers extends js.Object {
  def connect(mapStateToProps: MapStateToProps, mapDispatchToProps: MapDispatchToProps): js.Function1[/* original */ wepyLib.wepyMod.Component, wepyLib.wepyMod.Component] = js.native
  def getStore(): reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction] = js.native
  def setStore(store: reduxLib.reduxMod.Store[_, _]): scala.Unit = js.native
}

