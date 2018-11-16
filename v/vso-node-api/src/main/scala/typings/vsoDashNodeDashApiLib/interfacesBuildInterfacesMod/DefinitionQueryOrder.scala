package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait DefinitionNameAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder
  
  /**
       * Order by definition name descending.
       */
  @js.native
  sealed trait DefinitionNameDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder
  
  /**
       * Order by created on/last modified time ascending.
       */
  @js.native
  sealed trait LastModifiedAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder
  
  /**
       * Order by created on/last modified time descending.
       */
  @js.native
  sealed trait LastModifiedDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder
  
  /**
       * No order
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder
  
  /* 3 */ val DefinitionNameAscending: DefinitionNameAscending with scala.Double = js.native
  /* 4 */ val DefinitionNameDescending: DefinitionNameDescending with scala.Double = js.native
  /* 1 */ val LastModifiedAscending: LastModifiedAscending with scala.Double = js.native
  /* 2 */ val LastModifiedDescending: LastModifiedDescending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder with scala.Double
  ] = js.native
}

