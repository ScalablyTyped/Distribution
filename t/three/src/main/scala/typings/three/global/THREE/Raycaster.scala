package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Raycaster")
@js.native
/**
  * This creates a new raycaster object.
  * @param origin The origin vector where the ray casts from.
  * @param direction The direction vector that gives direction to the ray. Should be normalized.
  * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
  * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
  */
open class Raycaster ()
  extends typings.three.mod.Raycaster {
  def this(origin: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(origin: Unit, direction: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(
    origin: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3
  ) = this()
  def this(origin: Unit, direction: Unit, near: Double) = this()
  def this(origin: Unit, direction: typings.three.srcMathVector3Mod.Vector3, near: Double) = this()
  def this(origin: typings.three.srcMathVector3Mod.Vector3, direction: Unit, near: Double) = this()
  def this(
    origin: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3,
    near: Double
  ) = this()
  def this(origin: Unit, direction: Unit, near: Double, far: Double) = this()
  def this(origin: Unit, direction: Unit, near: Unit, far: Double) = this()
  def this(origin: Unit, direction: typings.three.srcMathVector3Mod.Vector3, near: Double, far: Double) = this()
  def this(origin: Unit, direction: typings.three.srcMathVector3Mod.Vector3, near: Unit, far: Double) = this()
  def this(origin: typings.three.srcMathVector3Mod.Vector3, direction: Unit, near: Double, far: Double) = this()
  def this(origin: typings.three.srcMathVector3Mod.Vector3, direction: Unit, near: Unit, far: Double) = this()
  def this(
    origin: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3,
    near: Double,
    far: Double
  ) = this()
  def this(
    origin: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3,
    near: Unit,
    far: Double
  ) = this()
}
