package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Raycaster")
@js.native
/**
  * This creates a new {@link Raycaster} object.
  * @param origin The origin vector where the ray casts from. Default `new Vector3()`
  * @param direction The direction vector that gives direction to the ray. Should be normalized. Default `new Vector3(0, 0, -1)`
  * @param near All results returned are further away than near. Near can't be negative. Expects a `Float`. Default `0`
  * @param far All results returned are closer than far. Far can't be lower than near. Expects a `Float`. Default `Infinity`
  */
open class Raycaster ()
  extends typings.three.srcCoreRaycasterMod.Raycaster {
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
