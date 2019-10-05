package typings.winrtDashUwp.Windows.Graphics.Printing3D

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
  sealed trait centimeter extends Printing3DModelUnit
  
  /** The units of the 3D model are specified in feet. */
  @js.native
  sealed trait foot extends Printing3DModelUnit
  
  /** The units of the 3D model are specified in inches. */
  @js.native
  sealed trait inch extends Printing3DModelUnit
  
  /** The units of the 3D model are specified in meters. */
  @js.native
  sealed trait meter extends Printing3DModelUnit
  
  /** The units of the 3D model are specified in microns. */
  @js.native
  sealed trait micron extends Printing3DModelUnit
  
  /** The units of the 3D model are specified in millimeters. */
  @js.native
  sealed trait millimeter extends Printing3DModelUnit
  
  /* 3 */ val centimeter: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.centimeter with Double = js.native
  /* 5 */ val foot: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.foot with Double = js.native
  /* 4 */ val inch: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.inch with Double = js.native
  /* 0 */ val meter: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.meter with Double = js.native
  /* 1 */ val micron: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.micron with Double = js.native
  /* 2 */ val millimeter: typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.millimeter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DModelUnit with Double] = js.native
}

