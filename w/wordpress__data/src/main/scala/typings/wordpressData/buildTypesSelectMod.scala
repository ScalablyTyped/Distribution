package typings.wordpressData

import typings.wordpressData.buildTypesTypesMod.AnyConfig
import typings.wordpressData.buildTypesTypesMod.CurriedSelectorsOf
import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSelectMod {
  
  @JSImport("@wordpress/data/build-types/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def select[T /* <: StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: T): CurriedSelectorsOf[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[CurriedSelectorsOf[T]]
  inline def select[T /* <: StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: String): CurriedSelectorsOf[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[CurriedSelectorsOf[T]]
}
