package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "Polygon")
@js.native
class Polygon protected () extends js.Object {
  /**
    * Constructor function.
    */
  def this(points: js.Array[js.Array[scala.Double] | Vector], plane: Plane) = this()
  /**
    * The vertices of the polygon.
    */
  var vertices: CircularLinkedList = js.native
  /**
    * Retursn the area of the polygon.
    */
  def area(): scala.Double = js.native
  /**
    * Returns the centroid of the polygon.
    */
  def centroid(): Vector = js.native
  /**
    * Clears the vertices caches.
    */
  def clearCache(): scala.Unit = js.native
  def contains(point: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Whether the polygon contains a point.
    */
  def contains(point: Vector): scala.Boolean = js.native
  def containsByWindingNumber(point: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Whether the polygon contains a point.
    */
  def containsByWindingNumber(point: Vector): scala.Boolean = js.native
  /**
    * Copies the vertices into the cache.
    */
  def copyVertices(): scala.Unit = js.native
  /**
    * Returns a duplicate of this polygon.
    */
  def dup(): Polygon = js.native
  def hasEdgeContaining(point: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Whether the point is an edge in the polygon.
    */
  def hasEdgeContaining(point: Vector): scala.Boolean = js.native
  /**
    * Inspect the points on all vertices in the polygon.
    */
  def inspect(): java.lang.String = js.native
  /**
    * Whether this polygon is a triangle or not.
    */
  def isTriangle(): scala.Boolean = js.native
  /**
    * Gets the node given the vertex.
    */
  def nodeFor(vertex: js.Any): LinkedListNode = js.native
  /**
    * Populates the vertex type lists.
    */
  def populateVertexTypeLists(): scala.Unit = js.native
  /**
    * Returns a projection of the polygon given the plane.
    */
  def projectionOn(plane: Plane): Polygon = js.native
  /**
    * Removes a vertex from the polygon.
    */
  def removeVertex(vertex: js.Any): Polygon | scala.Null = js.native
  /**
    * Rotates the polygon.
    */
  def rotate(t: scala.Double, line: Line): Polygon = js.native
  /**
    * Scale the polygon.
    */
  def scale(k: scala.Double, point: js.Array[scala.Double]): Polygon = js.native
  /**
    * Sets the cache of this polygon.
    */
  def setCache(key: java.lang.String, value: js.Any): js.Any = js.native
  /**
    * Set the vertices of the polygon.
    */
  def setVertices(points: js.Array[js.Array[scala.Double] | Vector], plane: Plane): Polygon = js.native
  /**
    * Converts the polygon into triangles.
    */
  def toTriangles(): js.Array[Polygon] = js.native
  def translate(vector: js.Array[scala.Double]): Polygon = js.native
  /**
    * Translate the polygon given a vector.
    */
  def translate(vector: Vector): Polygon = js.native
  /**
    * Returns a collection of triangles used for calculating area and center of mass.
    */
  def trianglesForSurfaceIntegral(): js.Array[Polygon] = js.native
  /**
    * Implementation of ear clipping algorithm
    * Found in 'Triangulation by ear clipping', by David Eberly.
    * at http://www.geometrictools.com
    *
    * This will not deal with overlapping sections - contruct your polygons sensibly
    */
  def triangulateByEarClipping(): js.Array[Polygon] = js.native
  /**
    * Updates the plane properties of all the cached triangles belonging to the
    * polygon according to the given function.
    */
  def updateTrianglePlanes(fn: js.Function1[/* plane */ Plane, _]): scala.Unit = js.native
  /**
    * Gets the data of the vertex given the index.
    */
  def v(i: scala.Double): LinkedListNode = js.native
}

