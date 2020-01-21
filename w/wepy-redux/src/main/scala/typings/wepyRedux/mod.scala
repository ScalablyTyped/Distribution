package typings.wepyRedux

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.wepy.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy-redux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def connect(mapStateToProps: MapStateToProps, mapDispatchToProps: MapDispatchToProps): js.Function1[/* original */ Component, Component] = js.native
  def getStore(): Store[_, AnyAction] = js.native
  def setStore(store: Store[_, _]): Unit = js.native
  type MapDispatchToProps = StringDictionary[(js.Function2[/* store */ js.Any, /* repeated */ js.Any, Unit]) | String]
  type MapStateToProps = StringDictionary[(js.Function1[/* state */ js.Any, js.Any]) | String]
}

