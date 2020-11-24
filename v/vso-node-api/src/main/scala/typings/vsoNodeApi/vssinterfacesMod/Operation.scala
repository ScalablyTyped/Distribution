package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Operation extends js.Object
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Operation with Double] = js.native
  
  @js.native
  sealed trait Add extends Operation
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait Copy extends Operation
  /* 4 */ @js.native
  object Copy extends TopLevel[Copy with Double]
  
  @js.native
  sealed trait Move extends Operation
  /* 3 */ @js.native
  object Move extends TopLevel[Move with Double]
  
  @js.native
  sealed trait Remove extends Operation
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
  @js.native
  sealed trait Replace extends Operation
  /* 2 */ @js.native
  object Replace extends TopLevel[Replace with Double]
  
  @js.native
  sealed trait Test extends Operation
  /* 5 */ @js.native
  object Test extends TopLevel[Test with Double]
}
