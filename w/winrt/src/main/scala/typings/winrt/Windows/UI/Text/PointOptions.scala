package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointOptions extends js.Object

@JSGlobal("Windows.UI.Text.PointOptions")
@js.native
object PointOptions extends js.Object {
  @js.native
  sealed trait allowOffClient extends PointOptions
  
  @js.native
  sealed trait clientCoordinates extends PointOptions
  
  @js.native
  sealed trait includeInset extends PointOptions
  
  @js.native
  sealed trait noHorizontalScroll extends PointOptions
  
  @js.native
  sealed trait noVerticalScroll extends PointOptions
  
  @js.native
  sealed trait none extends PointOptions
  
  @js.native
  sealed trait start extends PointOptions
  
  @js.native
  sealed trait transform extends PointOptions
  
}

