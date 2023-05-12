package typings.wordpressData

import typings.wordpressData.buildTypesTypesMod.ActionCreatorsOf
import typings.wordpressData.buildTypesTypesMod.AnyConfig
import typings.wordpressData.buildTypesTypesMod.ConfigOf
import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDispatchMod {
  
  @JSImport("@wordpress/data/build-types/dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch[T /* <: StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: T): ActionCreatorsOf[ConfigOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ActionCreatorsOf[ConfigOf[T]]]
  inline def dispatch[T /* <: StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: String): ActionCreatorsOf[ConfigOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ActionCreatorsOf[ConfigOf[T]]]
}
