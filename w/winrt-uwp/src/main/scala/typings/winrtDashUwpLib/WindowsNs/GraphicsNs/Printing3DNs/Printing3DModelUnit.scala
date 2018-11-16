package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Printing3DModelUnit extends js.Object

/** Specifies the units of measure used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DModelUnit")
@js.native
object Printing3DModelUnit extends js.Object {
  /** The units of the 3D model are specified in centimeters. */
  @js.native
  sealed trait centimeter
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  /** The units of the 3D model are specified in feet. */
  @js.native
  sealed trait foot
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  /** The units of the 3D model are specified in inches. */
  @js.native
  sealed trait inch
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  /** The units of the 3D model are specified in meters. */
  @js.native
  sealed trait meter
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  /** The units of the 3D model are specified in microns. */
  @js.native
  sealed trait micron
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  /** The units of the 3D model are specified in millimeters. */
  @js.native
  sealed trait millimeter
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit
  
  val centimeter: centimeter with java.lang.String = js.native
  val foot: foot with java.lang.String = js.native
  val inch: inch with java.lang.String = js.native
  val meter: meter with java.lang.String = js.native
  val micron: micron with java.lang.String = js.native
  val millimeter: millimeter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit with java.lang.String
  ] = js.native
}

