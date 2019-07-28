package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  
  /* 3 */ val DefinitionNameAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameAscending with Double = js.native
  /* 4 */ val DefinitionNameDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameDescending with Double = js.native
  /* 1 */ val LastModifiedAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedAscending with Double = js.native
  /* 2 */ val LastModifiedDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedDescending with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueryOrder with Double] = js.native
}

