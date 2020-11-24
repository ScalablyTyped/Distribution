package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentsQueryType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentsQueryType")
@js.native
object DeploymentsQueryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentsQueryType with Double] = js.native
  
  @js.native
  sealed trait FailingSince extends DeploymentsQueryType
  /* 2 */ @js.native
  object FailingSince extends TopLevel[FailingSince with Double]
  
  @js.native
  sealed trait Regular extends DeploymentsQueryType
  /* 1 */ @js.native
  object Regular extends TopLevel[Regular with Double]
}
