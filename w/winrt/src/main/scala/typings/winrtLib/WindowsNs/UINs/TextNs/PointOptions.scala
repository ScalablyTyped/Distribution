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
  
  val allowOffClient: allowOffClient with java.lang.String = js.native
  val clientCoordinates: clientCoordinates with java.lang.String = js.native
  val includeInset: includeInset with java.lang.String = js.native
  val noHorizontalScroll: noHorizontalScroll with java.lang.String = js.native
  val noVerticalScroll: noVerticalScroll with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val start: start with java.lang.String = js.native
  val transform: transform with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.PointOptions with java.lang.String] = js.native
}

