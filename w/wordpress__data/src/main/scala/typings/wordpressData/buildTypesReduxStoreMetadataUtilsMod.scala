package typings.wordpressData

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReduxStoreMetadataUtilsMod {
  
  @JSImport("@wordpress/data/build-types/redux-store/metadata/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onSubKey[TState /* <: Any */, TAction /* <: AnyAction */](actionProperty: String): js.Function1[/* reducer */ Reducer[TState, TAction], Reducer[Record[String, TState], TAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("onSubKey")(actionProperty.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* reducer */ Reducer[TState, TAction], Reducer[Record[String, TState], TAction]]]
  
  inline def selectorArgsToStateKey(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorArgsToStateKey")().asInstanceOf[js.Array[Any]]
  inline def selectorArgsToStateKey(args: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorArgsToStateKey")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
