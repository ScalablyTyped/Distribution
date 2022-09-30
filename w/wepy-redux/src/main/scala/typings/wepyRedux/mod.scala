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
  
  inline def connect(mapStateToProps: MapStateToProps, mapDispatchToProps: MapDispatchToProps): js.Function1[/* original */ Component, Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* original */ Component, Component]]
  
  inline def getStore(): Store[Any, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStore")().asInstanceOf[Store[Any, AnyAction]]
  
  inline def setStore(store: Store[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStore")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type MapDispatchToProps = StringDictionary[(js.Function2[/* store */ Any, /* repeated */ Any, Unit]) | String]
  
  type MapStateToProps = StringDictionary[(js.Function1[/* state */ Any, Any]) | String]
}
