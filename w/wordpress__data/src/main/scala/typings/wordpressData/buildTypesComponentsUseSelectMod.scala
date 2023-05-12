package typings.wordpressData

import typings.std.Record
import typings.wordpressData.buildTypesTypesMod.ActionCreator
import typings.wordpressData.buildTypesTypesMod.AnyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsUseSelectMod {
  
  @JSImport("@wordpress/data/build-types/components/use-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: typings.wordpressData.buildTypesTypesMod.MapSelect | typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any] */](mapSelect: T, deps: js.Array[Any]): typings.wordpressData.buildTypesTypesMod.UseSelectReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressData.buildTypesTypesMod.UseSelectReturn[T]]
  
  inline def useSuspenseSelect(mapSelect: js.Function, deps: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useSuspenseSelect")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  type MapSelect = typings.wordpressData.buildTypesTypesMod.MapSelect
  
  type ReduxStoreConfig[State, Actions /* <: Record[String, ActionCreator] */, Selectors] = typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig[State, Actions, Selectors]
  
  type StoreDescriptor[C /* <: AnyConfig */] = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[C]
  
  type UseSelectReturn[T /* <: typings.wordpressData.buildTypesTypesMod.MapSelect | typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any] */] = typings.wordpressData.buildTypesTypesMod.UseSelectReturn[T]
}
