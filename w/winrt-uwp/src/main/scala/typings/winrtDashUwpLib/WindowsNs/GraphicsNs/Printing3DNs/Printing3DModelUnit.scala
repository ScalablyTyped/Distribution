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
  
  /* 3 */ val centimeter: centimeter with scala.Double = js.native
  /* 5 */ val foot: foot with scala.Double = js.native
  /* 4 */ val inch: inch with scala.Double = js.native
  /* 0 */ val meter: meter with scala.Double = js.native
  /* 1 */ val micron: micron with scala.Double = js.native
  /* 2 */ val millimeter: millimeter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DModelUnit with scala.Double
  ] = js.native
}

