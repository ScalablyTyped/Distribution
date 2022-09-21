package typings.three

import typings.three.capsuleMod.Capsule
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Box3
import typings.three.threeMod.Object3D
import typings.three.threeMod.Ray
import typings.three.threeMod.Sphere
import typings.three.threeMod.Triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octreeMod {
  
  @JSImport("three/examples/jsm/math/Octree", "Octree")
  @js.native
  open class Octree () extends StObject {
    def this(box: Box3) = this()
    
    def addTriangle(triangle: Triangle): this.type = js.native
    
    var box: Box3 = js.native
    
    def build(): this.type = js.native
    
    def calcBox(): this.type = js.native
    
    def capsuleIntersect(capsule: Capsule): Any = js.native
    
    def fromGraphNode(group: Object3D[Event]): this.type = js.native
    
    def getCapsuleTriangles(capsule: Capsule, triangles: js.Array[Triangle]): js.Array[Triangle] = js.native
    
    def getRayTriangles(ray: Ray, triangles: js.Array[Triangle]): js.Array[Triangle] = js.native
    
    def getSphereTriangles(sphere: Sphere, triangles: js.Array[Triangle]): js.Array[Triangle] = js.native
    
    def rayIntersect(ray: Ray): Any = js.native
    
    def sphereIntersect(sphere: Sphere): Any = js.native
    
    def split(level: Double): this.type = js.native
    
    var subTrees: js.Array[Octree] = js.native
    
    def triangleCapsuleIntersect(capsule: Capsule, triangle: Triangle): Any = js.native
    
    def triangleSphereIntersect(sphere: Sphere, triangle: Triangle): Any = js.native
    
    var triangles: js.Array[Triangle] = js.native
  }
}
