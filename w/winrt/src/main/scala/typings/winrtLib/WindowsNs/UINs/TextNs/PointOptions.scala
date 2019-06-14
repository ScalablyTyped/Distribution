package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointOptions extends js.Object

@JSGlobal("Windows.UI.Text.PointOptions")
@js.native
object PointOptions extends js.Object {
  @js.native
  sealed trait allowOffClient
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait clientCoordinates
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait includeInset
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait noHorizontalScroll
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait noVerticalScroll
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait start
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  @js.native
  sealed trait transform
    extends winrtLib.WindowsNs.UINs.TextNs.PointOptions
  
  /* 4 */ val allowOffClient: allowOffClient with scala.Double = js.native
  /* 3 */ val clientCoordinates: clientCoordinates with scala.Double = js.native
  /* 1 */ val includeInset: includeInset with scala.Double = js.native
  /* 6 */ val noHorizontalScroll: noHorizontalScroll with scala.Double = js.native
  /* 7 */ val noVerticalScroll: noVerticalScroll with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val start: start with scala.Double = js.native
  /* 5 */ val transform: transform with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.PointOptions with scala.Double] = js.native
}

