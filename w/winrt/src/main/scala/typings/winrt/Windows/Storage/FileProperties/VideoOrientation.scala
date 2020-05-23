package typings.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  @js.native
  sealed trait normal extends VideoOrientation
  
  @js.native
  sealed trait rotate180 extends VideoOrientation
  
  @js.native
  sealed trait rotate270 extends VideoOrientation
  
  @js.native
  sealed trait rotate90 extends VideoOrientation
  
}

