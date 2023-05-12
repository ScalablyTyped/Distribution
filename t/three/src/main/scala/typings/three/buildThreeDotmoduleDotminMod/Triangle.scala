package typings.three.buildThreeDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "Triangle")
@js.native
open class Triangle ()
  extends typings.three.srcThreeMod.Triangle {
  def this(a: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: Unit, b: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: typings.three.srcMathVector3Mod.Vector3, b: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: Unit, b: Unit, c: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: Unit, b: typings.three.srcMathVector3Mod.Vector3, c: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(a: typings.three.srcMathVector3Mod.Vector3, b: Unit, c: typings.three.srcMathVector3Mod.Vector3) = this()
  def this(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3
  ) = this()
}
/* static members */
object Triangle {
  
  @JSImport("three/build/three.module.min", "Triangle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsPoint(
    point: typings.three.srcMathVector3Mod.Vector3,
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPoint")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getBarycoord(
    point: typings.three.srcMathVector3Mod.Vector3,
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    target: typings.three.srcMathVector3Mod.Vector3
  ): typings.three.srcMathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getBarycoord")(point.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector3Mod.Vector3]
  
  inline def getInterpolation(
    point: typings.three.srcMathVector3Mod.Vector3,
    p1: typings.three.srcMathVector3Mod.Vector3,
    p2: typings.three.srcMathVector3Mod.Vector3,
    p3: typings.three.srcMathVector3Mod.Vector3,
    v1: typings.three.srcMathVector2Mod.Vector2,
    v2: typings.three.srcMathVector2Mod.Vector2,
    v3: typings.three.srcMathVector2Mod.Vector2,
    target: typings.three.srcMathVector2Mod.Vector2
  ): typings.three.srcMathVector2Mod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector2Mod.Vector2]
  inline def getInterpolation(
    point: typings.three.srcMathVector3Mod.Vector3,
    p1: typings.three.srcMathVector3Mod.Vector3,
    p2: typings.three.srcMathVector3Mod.Vector3,
    p3: typings.three.srcMathVector3Mod.Vector3,
    v1: typings.three.srcMathVector3Mod.Vector3,
    v2: typings.three.srcMathVector3Mod.Vector3,
    v3: typings.three.srcMathVector3Mod.Vector3,
    target: typings.three.srcMathVector3Mod.Vector3
  ): typings.three.srcMathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector3Mod.Vector3]
  inline def getInterpolation(
    point: typings.three.srcMathVector3Mod.Vector3,
    p1: typings.three.srcMathVector3Mod.Vector3,
    p2: typings.three.srcMathVector3Mod.Vector3,
    p3: typings.three.srcMathVector3Mod.Vector3,
    v1: typings.three.srcMathVector4Mod.Vector4,
    v2: typings.three.srcMathVector4Mod.Vector4,
    v3: typings.three.srcMathVector4Mod.Vector4,
    target: typings.three.srcMathVector4Mod.Vector4
  ): typings.three.srcMathVector4Mod.Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolation")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector4Mod.Vector4]
  
  inline def getNormal(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    target: typings.three.srcMathVector3Mod.Vector3
  ): typings.three.srcMathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector3Mod.Vector3]
  
  /**
    * @deprecated THREE.Triangle.getUV() has been renamed to THREE.Triangle.getInterpolation().
    */
  inline def getUV(
    point: typings.three.srcMathVector3Mod.Vector3,
    p1: typings.three.srcMathVector3Mod.Vector3,
    p2: typings.three.srcMathVector3Mod.Vector3,
    p3: typings.three.srcMathVector3Mod.Vector3,
    uv1: typings.three.srcMathVector2Mod.Vector2,
    uv2: typings.three.srcMathVector2Mod.Vector2,
    uv3: typings.three.srcMathVector2Mod.Vector2,
    target: typings.three.srcMathVector2Mod.Vector2
  ): typings.three.srcMathVector2Mod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getUV")(point.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], uv1.asInstanceOf[js.Any], uv2.asInstanceOf[js.Any], uv3.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathVector2Mod.Vector2]
  
  inline def isFrontFacing(
    a: typings.three.srcMathVector3Mod.Vector3,
    b: typings.three.srcMathVector3Mod.Vector3,
    c: typings.three.srcMathVector3Mod.Vector3,
    direction: typings.three.srcMathVector3Mod.Vector3
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFrontFacing")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
