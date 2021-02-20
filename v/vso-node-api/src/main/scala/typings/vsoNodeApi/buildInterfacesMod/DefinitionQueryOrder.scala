package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueryOrder")
@js.native
object DefinitionQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueryOrder with Double] = js.native
  
  /**
    * Order by definition name ascending.
    */
  @js.native
  sealed trait DefinitionNameAscending extends DefinitionQueryOrder
  /* 3 */ val DefinitionNameAscending: typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder.DefinitionNameAscending with Double = js.native
  
  /**
    * Order by definition name descending.
    */
  @js.native
  sealed trait DefinitionNameDescending extends DefinitionQueryOrder
  /* 4 */ val DefinitionNameDescending: typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder.DefinitionNameDescending with Double = js.native
  
  /**
    * Order by created on/last modified time ascending.
    */
  @js.native
  sealed trait LastModifiedAscending extends DefinitionQueryOrder
  /* 1 */ val LastModifiedAscending: typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder.LastModifiedAscending with Double = js.native
  
  /**
    * Order by created on/last modified time descending.
    */
  @js.native
  sealed trait LastModifiedDescending extends DefinitionQueryOrder
  /* 2 */ val LastModifiedDescending: typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder.LastModifiedDescending with Double = js.native
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends DefinitionQueryOrder
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder.None with Double = js.native
}
