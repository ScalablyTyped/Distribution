package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends js.Object
@JSGlobal("Viewer.Visibility")
@js.native
object Visibility extends js.Object {
  
  @js.native
  sealed trait Hidden extends Visibility
  
  @js.native
  sealed trait Visible extends Visibility
  
  @js.native
  sealed trait VisibleOnExtraLargeOrWiderScreen extends Visibility
  
  @js.native
  sealed trait VisibleOnLargeOrWiderScreen extends Visibility
  
  @js.native
  sealed trait VisibleOnMediumOrWiderScreen extends Visibility
}
