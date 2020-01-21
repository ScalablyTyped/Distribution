package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AltitudeReferenceSystem extends js.Object

/** Indicates the altitude reference system to be used in defining a geographic shape. */
@JSGlobal("Windows.Devices.Geolocation.AltitudeReferenceSystem")
@js.native
object AltitudeReferenceSystem extends js.Object {
  /** The altitude reference system is based on an ellipsoid which is a mathematical approximation of the shape of the Earth. */
  @js.native
  sealed trait ellipsoid extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above sea level. */
  @js.native
  sealed trait geoid extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above the tallest surface structures, such as buildings, trees, roads, etc., above terrain or ground level. */
  @js.native
  sealed trait surface extends AltitudeReferenceSystem
  
  /** The altitude reference system is based on distance above terrain or ground level. */
  @js.native
  sealed trait terrain extends AltitudeReferenceSystem
  
  /** The altitude reference system was not specified. */
  @js.native
  sealed trait unspecified extends AltitudeReferenceSystem
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AltitudeReferenceSystem with Double] = js.native
  /* 2 */ @js.native
  object ellipsoid extends TopLevel[ellipsoid with Double]
  
  /* 3 */ @js.native
  object geoid extends TopLevel[geoid with Double]
  
  /* 4 */ @js.native
  object surface extends TopLevel[surface with Double]
  
  /* 1 */ @js.native
  object terrain extends TopLevel[terrain with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

