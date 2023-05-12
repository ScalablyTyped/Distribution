package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable0
import typings.three.mod.Triangle
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcMathVector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTriangle
  extends StObject
     with Instantiable0[Triangle] {
  
  def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = js.native
  
  def getBarycoord(point: Vector3, a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = js.native
  
  def getInterpolation(
    point: Vector3,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    v1: Vector2,
    v2: Vector2,
    v3: Vector2,
    target: Vector2
  ): Vector2 = js.native
  def getInterpolation(
    point: Vector3,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    v1: Vector3,
    v2: Vector3,
    v3: Vector3,
    target: Vector3
  ): Vector3 = js.native
  def getInterpolation(
    point: Vector3,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    v1: Vector4,
    v2: Vector4,
    v3: Vector4,
    target: Vector4
  ): Vector4 = js.native
  
  def getNormal(a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = js.native
  
  /**
    * @deprecated THREE.Triangle.getUV() has been renamed to THREE.Triangle.getInterpolation().
    */
  def getUV(
    point: Vector3,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    uv1: Vector2,
    uv2: Vector2,
    uv3: Vector2,
    target: Vector2
  ): Vector2 = js.native
  
  def isFrontFacing(a: Vector3, b: Vector3, c: Vector3, direction: Vector3): Boolean = js.native
}
