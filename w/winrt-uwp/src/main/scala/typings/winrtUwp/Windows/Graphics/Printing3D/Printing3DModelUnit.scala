package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Printing3DModelUnit extends StObject
/** Specifies the units of measure used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DModelUnit")
@js.native
object Printing3DModelUnit extends StObject {
  
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
}
