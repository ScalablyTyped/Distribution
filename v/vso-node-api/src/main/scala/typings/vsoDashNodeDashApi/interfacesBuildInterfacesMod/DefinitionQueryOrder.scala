package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameAscending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameDescending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedAscending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedDescending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueryOrder")
@js.native
object DefinitionQueryOrder extends js.Object {
  /**
    * Order by definition name ascending.
    */
  @js.native
  sealed trait DefinitionNameAscending extends DefinitionQueryOrder
  
  /**
    * Order by definition name descending.
    */
  @js.native
  sealed trait DefinitionNameDescending extends DefinitionQueryOrder
  
  /**
    * Order by created on/last modified time ascending.
    */
  @js.native
  sealed trait LastModifiedAscending extends DefinitionQueryOrder
  
  /**
    * Order by created on/last modified time descending.
    */
  @js.native
  sealed trait LastModifiedDescending extends DefinitionQueryOrder
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends DefinitionQueryOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueryOrder with Double] = js.native
  /* 3 */ @js.native
  object DefinitionNameAscending extends TopLevel[DefinitionNameAscending with Double]
  
  /* 4 */ @js.native
  object DefinitionNameDescending extends TopLevel[DefinitionNameDescending with Double]
  
  /* 1 */ @js.native
  object LastModifiedAscending extends TopLevel[LastModifiedAscending with Double]
  
  /* 2 */ @js.native
  object LastModifiedDescending extends TopLevel[LastModifiedDescending with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

