package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Operation extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends js.Object {
  @js.native
  sealed trait Add extends Operation
  
  @js.native
  sealed trait Copy extends Operation
  
  @js.native
  sealed trait Move extends Operation
  
  @js.native
  sealed trait Remove extends Operation
  
  @js.native
  sealed trait Replace extends Operation
  
  @js.native
  sealed trait Test extends Operation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Operation with Double] = js.native
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 4 */ @js.native
  object Copy extends TopLevel[Copy with Double]
  
  /* 3 */ @js.native
  object Move extends TopLevel[Move with Double]
  
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
  /* 2 */ @js.native
  object Replace extends TopLevel[Replace with Double]
  
  /* 5 */ @js.native
  object Test extends TopLevel[Test with Double]
  
}

