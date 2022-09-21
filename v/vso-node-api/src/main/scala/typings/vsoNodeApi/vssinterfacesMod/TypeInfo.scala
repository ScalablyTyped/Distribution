package typings.vsoNodeApi.vssinterfacesMod

import typings.vsoNodeApi.anon.EnumValuesCopy
import typings.vsoNodeApi.anon.EnumValuesHS256
import typings.vsoNodeApi.anon.EnumValuesIncludeInheritedDefinitionsOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeInfo {
  
  @JSImport("vso-node-api/interfaces/common/VSSInterfaces", "TypeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/common/VSSInterfaces", "TypeInfo.ConnectOptions")
  @js.native
  def ConnectOptions: EnumValuesIncludeInheritedDefinitionsOnly = js.native
  inline def ConnectOptions_=(x: EnumValuesIncludeInheritedDefinitionsOnly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/common/VSSInterfaces", "TypeInfo.JWTAlgorithm")
  @js.native
  def JWTAlgorithm: EnumValuesHS256 = js.native
  inline def JWTAlgorithm_=(x: EnumValuesHS256): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JWTAlgorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/common/VSSInterfaces", "TypeInfo.JsonPatchOperation")
  @js.native
  def JsonPatchOperation: Any = js.native
  inline def JsonPatchOperation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonPatchOperation")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/common/VSSInterfaces", "TypeInfo.Operation")
  @js.native
  def Operation: EnumValuesCopy = js.native
  inline def Operation_=(x: EnumValuesCopy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
}
