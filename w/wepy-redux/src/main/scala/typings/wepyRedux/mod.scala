package typings.wepyRedux

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.wepy.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wepy-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(mapStateToProps: MapStateToProps, mapDispatchToProps: MapDispatchToProps): js.Function1[/* original */ Component, Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* original */ Component, Component]]
  
  @scala.inline
  def getStore(): Store[js.Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStore")().asInstanceOf[Store[js.Any, AnyAction]]
  
  @scala.inline
  def setStore(store: Store[js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStore")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type MapDispatchToProps = StringDictionary[(js.Function2[/* store */ js.Any, /* repeated */ js.Any, Unit]) | String]
  
  type MapStateToProps = StringDictionary[(js.Function1[/* state */ js.Any, js.Any]) | String]
}
