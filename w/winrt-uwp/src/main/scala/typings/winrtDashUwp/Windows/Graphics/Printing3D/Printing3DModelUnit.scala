package typings.winrtDashUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.centimeter
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.foot
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.inch
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.meter
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.micron
import typings.winrtDashUwp.Windows.Graphics.Printing3D.Printing3DModelUnit.millimeter
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Printing3DModelUnit with Double] = js.native
  /* 3 */ @js.native
  object centimeter extends TopLevel[centimeter with Double]
  
  /* 5 */ @js.native
  object foot extends TopLevel[foot with Double]
  
  /* 4 */ @js.native
  object inch extends TopLevel[inch with Double]
  
  /* 0 */ @js.native
  object meter extends TopLevel[meter with Double]
  
  /* 1 */ @js.native
  object micron extends TopLevel[micron with Double]
  
  /* 2 */ @js.native
  object millimeter extends TopLevel[millimeter with Double]
  
}

