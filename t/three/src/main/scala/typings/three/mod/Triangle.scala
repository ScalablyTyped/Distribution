package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Triangle")
@js.native
class Triangle ()
  extends typings.three.triangleMod.Triangle {
  def this(a: typings.three.vector3Mod.Vector3) = this()
  def this(a: js.UndefOr[scala.Nothing], b: typings.three.vector3Mod.Vector3) = this()
  def this(a: typings.three.vector3Mod.Vector3, b: typings.three.vector3Mod.Vector3) = this()
  def this(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: typings.three.vector3Mod.Vector3) = this()
  def this(
    a: js.UndefOr[scala.Nothing],
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3
  ) = this()
  def this(
    a: typings.three.vector3Mod.Vector3,
    b: js.UndefOr[scala.Nothing],
    c: typings.three.vector3Mod.Vector3
  ) = this()
  def this(
    a: typings.three.vector3Mod.Vector3,
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3
  ) = this()
}
/* static members */
object Triangle {
  
  @JSImport("three", "Triangle.containsPoint")
  @js.native
  def containsPoint(
    point: typings.three.vector3Mod.Vector3,
    a: typings.three.vector3Mod.Vector3,
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3
  ): Boolean = js.native
  
  @JSImport("three", "Triangle.getBarycoord")
  @js.native
  def getBarycoord(
    point: typings.three.vector3Mod.Vector3,
    a: typings.three.vector3Mod.Vector3,
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3,
    target: typings.three.vector3Mod.Vector3
  ): typings.three.vector3Mod.Vector3 = js.native
  
  @JSImport("three", "Triangle.getNormal")
  @js.native
  def getNormal(
    a: typings.three.vector3Mod.Vector3,
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3,
    target: typings.three.vector3Mod.Vector3
  ): typings.three.vector3Mod.Vector3 = js.native
  
  @JSImport("three", "Triangle.getUV")
  @js.native
  def getUV(
    point: typings.three.vector3Mod.Vector3,
    p1: typings.three.vector3Mod.Vector3,
    p2: typings.three.vector3Mod.Vector3,
    p3: typings.three.vector3Mod.Vector3,
    uv1: typings.three.vector2Mod.Vector2,
    uv2: typings.three.vector2Mod.Vector2,
    uv3: typings.three.vector2Mod.Vector2,
    target: typings.three.vector2Mod.Vector2
  ): typings.three.vector2Mod.Vector2 = js.native
  
  @JSImport("three", "Triangle.isFrontFacing")
  @js.native
  def isFrontFacing(
    a: typings.three.vector3Mod.Vector3,
    b: typings.three.vector3Mod.Vector3,
    c: typings.three.vector3Mod.Vector3,
    direction: typings.three.vector3Mod.Vector3
  ): Boolean = js.native
}
