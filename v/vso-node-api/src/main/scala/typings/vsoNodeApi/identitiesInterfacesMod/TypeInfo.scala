package typings.vsoNodeApi.identitiesInterfacesMod

import typings.vsoNodeApi.anon.EnumValuesAggregateIdentity
import typings.vsoNodeApi.anon.EnumValuesDirect
import typings.vsoNodeApi.anon.EnumValuesFilterIllegalMemberships
import typings.vsoNodeApi.anon.EnumValuesGeneric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeInfo {
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.CreateScopeInfo")
  @js.native
  def CreateScopeInfo: js.Any = js.native
  inline def CreateScopeInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScopeInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.FrameworkIdentityInfo")
  @js.native
  def FrameworkIdentityInfo: js.Any = js.native
  inline def FrameworkIdentityInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameworkIdentityInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.FrameworkIdentityType")
  @js.native
  def FrameworkIdentityType: EnumValuesAggregateIdentity = js.native
  inline def FrameworkIdentityType_=(x: EnumValuesAggregateIdentity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameworkIdentityType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.GroupScopeType")
  @js.native
  def GroupScopeType: EnumValuesGeneric = js.native
  inline def GroupScopeType_=(x: EnumValuesGeneric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupScopeType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.IdentityBatchInfo")
  @js.native
  def IdentityBatchInfo: js.Any = js.native
  inline def IdentityBatchInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IdentityBatchInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.IdentityScope")
  @js.native
  def IdentityScope: js.Any = js.native
  inline def IdentityScope_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IdentityScope")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.IdentitySnapshot")
  @js.native
  def IdentitySnapshot: js.Any = js.native
  inline def IdentitySnapshot_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IdentitySnapshot")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.QueryMembership")
  @js.native
  def QueryMembership: EnumValuesDirect = js.native
  inline def QueryMembership_=(x: EnumValuesDirect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QueryMembership")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "TypeInfo.ReadIdentitiesOptions")
  @js.native
  def ReadIdentitiesOptions: EnumValuesFilterIllegalMemberships = js.native
  inline def ReadIdentitiesOptions_=(x: EnumValuesFilterIllegalMemberships): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadIdentitiesOptions")(x.asInstanceOf[js.Any])
}
