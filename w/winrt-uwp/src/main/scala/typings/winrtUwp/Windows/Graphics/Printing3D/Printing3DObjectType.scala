package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Printing3DObjectType extends js.Object
/** Specifies the function of the object in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DObjectType")
@js.native
object Printing3DObjectType extends js.Object {
  
  /** Functions as a core component of the 3D model. */
  @js.native
  sealed trait model extends Printing3DObjectType
  
  /** Functions in some other capacity. */
  @js.native
  sealed trait others extends Printing3DObjectType
  
  /** Functions as a support object. */
  @js.native
  sealed trait support extends Printing3DObjectType
}
