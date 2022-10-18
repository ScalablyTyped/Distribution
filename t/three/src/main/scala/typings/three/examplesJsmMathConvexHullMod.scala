package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Ray
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMathConvexHullMod {
  
  @JSImport("three/examples/jsm/math/ConvexHull", "ConvexHull")
  @js.native
  open class ConvexHull () extends StObject {
    
    def addAdjoiningFace(eyeVertex: VertexNode, horizonEdge: HalfEdge): HalfEdge = js.native
    
    def addNewFaces(eyeVertex: VertexNode, horizon: js.Array[HalfEdge]): this.type = js.native
    
    def addVertexToFace(vertex: VertexNode, face: Face): this.type = js.native
    
    def addVertexToHull(eyeVertex: VertexNode): this.type = js.native
    
    var assigned: VertexList = js.native
    
    def cleanup(): this.type = js.native
    
    def compute(): this.type = js.native
    
    def computeExtremes(): js.Object = js.native
    
    def computeHorizon(eyePoint: Vector3, crossEdge: HalfEdge, face: Face, horizon: js.Array[HalfEdge]): this.type = js.native
    
    def computeInitialHull(): this.type = js.native
    
    def containsPoint(point: Vector3): Boolean = js.native
    
    def deleteFaceVertices(face: Face, absorbingFace: Face): this.type = js.native
    
    var faces: js.Array[Face] = js.native
    
    def intersectRay(ray: Ray, target: Vector3): Vector3 | Null = js.native
    
    def intersectsRay(ray: Ray): Boolean = js.native
    
    def makeEmpty(): this.type = js.native
    
    var newFaces: js.Array[Face] = js.native
    
    def nextVertexToAdd(): js.UndefOr[VertexNode] = js.native
    
    def reindexFaces(): this.type = js.native
    
    def removeAllVerticesFromFace(face: Face): js.UndefOr[VertexNode] = js.native
    
    def removeVertexFromFace(vertex: VertexNode, face: Face): this.type = js.native
    
    def resolveUnassignedPoints(newFaces: js.Array[Face]): this.type = js.native
    
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    
    def setFromPoints(points: js.Array[Vector3]): this.type = js.native
    
    var tolerance: Double = js.native
    
    var unassigned: VertexList = js.native
    
    var vertices: js.Array[VertexNode] = js.native
  }
  
  @JSImport("three/examples/jsm/math/ConvexHull", "Face")
  @js.native
  open class Face () extends StObject {
    
    var area: Double = js.native
    
    def compute(): this.type = js.native
    
    var constant: Double = js.native
    
    var edge: HalfEdge = js.native
    
    def getEdge(i: Double): HalfEdge = js.native
    
    var mark: Double = js.native
    
    var midpoint: Vector3 = js.native
    
    var normal: Vector3 = js.native
    
    var outside: VertexNode = js.native
  }
  /* static members */
  object Face {
    
    @JSImport("three/examples/jsm/math/ConvexHull", "Face")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(a: VertexNode, b: VertexNode, c: VertexNode): Face = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Face]
  }
  
  @JSImport("three/examples/jsm/math/ConvexHull", "HalfEdge")
  @js.native
  open class HalfEdge protected () extends StObject {
    def this(vertex: VertexNode, face: Face) = this()
    
    var face: Face = js.native
    
    def head(): VertexNode = js.native
    
    def length(): Double = js.native
    
    def lengthSquared(): Double = js.native
    
    var next: HalfEdge = js.native
    
    var prev: HalfEdge = js.native
    
    def setTwin(edge: HalfEdge): this.type = js.native
    
    def tail(): VertexNode = js.native
    
    var twin: HalfEdge = js.native
    
    var vertex: VertexNode = js.native
  }
  
  @JSImport("three/examples/jsm/math/ConvexHull", "VertexList")
  @js.native
  open class VertexList () extends StObject {
    
    def append(vertex: VertexNode): this.type = js.native
    
    def appendChain(vertex: VertexNode): this.type = js.native
    
    def clear(): this.type = js.native
    
    def first(): VertexNode = js.native
    
    var head: VertexNode = js.native
    
    def insertAfter(target: VertexNode, vertex: VertexNode): this.type = js.native
    
    def insertBefore(target: VertexNode, vertex: VertexNode): this.type = js.native
    
    def isEmpty(): Boolean = js.native
    
    def last(): VertexNode = js.native
    
    def remove(vertex: VertexNode): this.type = js.native
    
    def removeSubList(a: VertexNode, b: VertexNode): this.type = js.native
    
    var tail: VertexNode = js.native
  }
  
  @JSImport("three/examples/jsm/math/ConvexHull", "VertexNode")
  @js.native
  open class VertexNode protected () extends StObject {
    def this(point: Vector3) = this()
    
    var face: Face = js.native
    
    var next: VertexNode = js.native
    
    var point: Vector3 = js.native
    
    var prev: VertexNode = js.native
  }
}
