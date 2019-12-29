package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointOptions with Double] = js.native
  /* 4 */ @js.native
  object allowOffClient extends TopLevel[allowOffClient with Double]
  
  /* 3 */ @js.native
  object clientCoordinates extends TopLevel[clientCoordinates with Double]
  
  /* 1 */ @js.native
  object includeInset extends TopLevel[includeInset with Double]
  
  /* 6 */ @js.native
  object noHorizontalScroll extends TopLevel[noHorizontalScroll with Double]
  
  /* 7 */ @js.native
  object noVerticalScroll extends TopLevel[noVerticalScroll with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 5 */ @js.native
  object transform extends TopLevel[transform with Double]
  
}

