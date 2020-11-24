package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueryOrder")
@js.native
object DefinitionQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueryOrder with Double] = js.native
  
  /**
    * Order by definition name ascending.
    */
  @js.native
  sealed trait DefinitionNameAscending extends DefinitionQueryOrder
  /* 3 */ @js.native
  object DefinitionNameAscending extends TopLevel[DefinitionNameAscending with Double]
  
  /**
    * Order by definition name descending.
    */
  @js.native
  sealed trait DefinitionNameDescending extends DefinitionQueryOrder
  /* 4 */ @js.native
  object DefinitionNameDescending extends TopLevel[DefinitionNameDescending with Double]
  
  /**
    * Order by created on/last modified time ascending.
    */
  @js.native
  sealed trait LastModifiedAscending extends DefinitionQueryOrder
  /* 1 */ @js.native
  object LastModifiedAscending extends TopLevel[LastModifiedAscending with Double]
  
  /**
    * Order by created on/last modified time descending.
    */
  @js.native
  sealed trait LastModifiedDescending extends DefinitionQueryOrder
  /* 2 */ @js.native
  object LastModifiedDescending extends TopLevel[LastModifiedDescending with Double]
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends DefinitionQueryOrder
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
