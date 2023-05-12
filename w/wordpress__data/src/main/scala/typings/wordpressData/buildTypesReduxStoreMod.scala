package typings.wordpressData

import typings.std.Record
import typings.wordpressData.buildTypesTypesMod.AnyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReduxStoreMod {
  
  @JSImport("@wordpress/data/build-types/redux-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Actions /* <: Record[String, Any] */, Selectors](
    key: String,
    options: typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig[State, Actions, Selectors]
  ): typings.wordpressData.buildTypesTypesMod.StoreDescriptor[
    typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig[State, Actions, Selectors]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressData.buildTypesTypesMod.StoreDescriptor[
    typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig[State, Actions, Selectors]
  ]]
  
  type DataRegistry = typings.wordpressData.buildTypesTypesMod.DataRegistry
  
  type ReduxStoreConfig[State, Actions /* <: Record[String, Any] */, Selectors] = typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig[State, Actions, Selectors]
  
  type StoreDescriptor[C /* <: AnyConfig */] = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[C]
}
