package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamType extends js.Object
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends js.Object {
  
  @js.native
  sealed trait audio extends MediaStreamType
  
  @js.native
  sealed trait photo extends MediaStreamType
  
  @js.native
  sealed trait videoPreview extends MediaStreamType
  
  @js.native
  sealed trait videoRecord extends MediaStreamType
}
