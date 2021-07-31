package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static methods for retrieving intrinsic properties of a camera. */
@JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
@js.native
abstract class KnownCameraIntrinsicsProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.KnownCameraIntrinsicsProperties
object KnownCameraIntrinsicsProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the focal length of the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties.focalLength")
  @js.native
  def focalLength: String = js.native
  @scala.inline
  def focalLength_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focalLength")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the principal point, relative to the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties.principalPoint")
  @js.native
  def principalPoint: String = js.native
  @scala.inline
  def principalPoint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("principalPoint")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the radial distortion of the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties.radialDistortion")
  @js.native
  def radialDistortion: String = js.native
  @scala.inline
  def radialDistortion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radialDistortion")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve an array of single-precision, floating-point property values indicating the tangential distortion of the camera. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownCameraIntrinsicsProperties.tangentialDistortion")
  @js.native
  def tangentialDistortion: String = js.native
  @scala.inline
  def tangentialDistortion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tangentialDistortion")(x.asInstanceOf[js.Any])
}
