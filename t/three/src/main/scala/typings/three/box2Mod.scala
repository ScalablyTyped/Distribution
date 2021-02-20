package typings.three

import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object box2Mod {
  
  @JSImport("three/src/math/Box2", "Box2")
  @js.native
  class Box2 () extends StObject {
    def this(min: Vector2) = this()
    def this(min: js.UndefOr[scala.Nothing], max: Vector2) = this()
    def this(min: Vector2, max: Vector2) = this()
    
    def clampPoint(point: Vector2, target: Vector2): Vector2 = js.native
    
    def containsBox(box: Box2): Boolean = js.native
    
    def containsPoint(point: Vector2): Boolean = js.native
    
    def copy(box: Box2): this.type = js.native
    
    def distanceToPoint(point: Vector2): Double = js.native
    
    /**
    	 * @deprecated Use {@link Box2#isEmpty .isEmpty()} instead.
    	 */
    def empty(): js.Any = js.native
    
    def equals(box: Box2): Boolean = js.native
    
    def expandByPoint(point: Vector2): Box2 = js.native
    
    def expandByScalar(scalar: Double): Box2 = js.native
    
    def expandByVector(vector: Vector2): Box2 = js.native
    
    def getCenter(target: Vector2): Vector2 = js.native
    
    def getParameter(point: Vector2, target: Vector2): Vector2 = js.native
    
    def getSize(target: Vector2): Vector2 = js.native
    
    def intersect(box: Box2): Box2 = js.native
    
    def intersectsBox(box: Box2): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    /**
    	 * @deprecated Use {@link Box2#intersectsBox .intersectsBox()} instead.
    	 */
    def isIntersectionBox(b: js.Any): js.Any = js.native
    
    def makeEmpty(): Box2 = js.native
    
    /**
    	 * @default new THREE.Vector2( - Infinity, - Infinity )
    	 */
    var max: Vector2 = js.native
    
    /**
    	 * @default new THREE.Vector2( + Infinity, + Infinity )
    	 */
    var min: Vector2 = js.native
    
    def set(min: Vector2, max: Vector2): Box2 = js.native
    
    def setFromCenterAndSize(center: Vector2, size: Vector2): Box2 = js.native
    
    def setFromPoints(points: js.Array[Vector2]): Box2 = js.native
    
    def translate(offset: Vector2): Box2 = js.native
    
    def union(box: Box2): Box2 = js.native
  }
}
