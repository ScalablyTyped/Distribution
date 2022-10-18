package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathMatrix3Mod.Matrix
import typings.three.srcThreeMod.AnimationClip
import typings.three.srcThreeMod.Bone
import typings.three.srcThreeMod.Box3
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.EventDispatcher
import typings.three.srcThreeMod.Matrix4
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Sphere
import typings.three.srcThreeMod.Vector2
import typings.three.srcThreeMod.Vector3
import typings.three.srcThreeMod.Vector4
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmDeprecatedGeometryMod {
  
  @JSImport("three/examples/jsm/deprecated/Geometry", "Face3")
  @js.native
  open class Face3 protected () extends StObject {
    /**
      * @param a Vertex A index.
      * @param b Vertex B index.
      * @param c Vertex C index.
      * @param normal Face normal or array of vertex normals.
      * @param color Face color or array of vertex colors.
      * @param materialIndex Material index.
      */
    def this(a: Double, b: Double, c: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: js.Array[Vector3]) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3) = this()
    def this(a: Double, b: Double, c: Double, normal: js.Array[Vector3], color: js.Array[Color]) = this()
    def this(a: Double, b: Double, c: Double, normal: js.Array[Vector3], color: Color) = this()
    def this(a: Double, b: Double, c: Double, normal: Unit, color: js.Array[Color]) = this()
    def this(a: Double, b: Double, c: Double, normal: Unit, color: Color) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: js.Array[Color]) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color) = this()
    def this(
      a: Double,
      b: Double,
      c: Double,
      normal: js.Array[Vector3],
      color: js.Array[Color],
      materialIndex: Double
    ) = this()
    def this(a: Double, b: Double, c: Double, normal: js.Array[Vector3], color: Unit, materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: js.Array[Vector3], color: Color, materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Unit, color: js.Array[Color], materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Unit, color: Unit, materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Unit, color: Color, materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: js.Array[Color], materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: Unit, materialIndex: Double) = this()
    def this(a: Double, b: Double, c: Double, normal: Vector3, color: Color, materialIndex: Double) = this()
    
    /**
      * Vertex A index.
      */
    var a: Double = js.native
    
    /**
      * Vertex B index.
      */
    var b: Double = js.native
    
    /**
      * Vertex C index.
      */
    var c: Double = js.native
    
    /**
      * Face color.
      * @default new THREE.Color()
      */
    var color: Color = js.native
    
    def copy(source: Face3): this.type = js.native
    
    /**
      * Material index (points to {@link Mesh.material}).
      * @default 0
      */
    var materialIndex: Double = js.native
    
    /**
      * Face normal.
      * @default new THREE.Vector3()
      */
    var normal: Vector3 = js.native
    
    /**
      * Array of 3 vertex colors.
      * @default []
      */
    var vertexColors: js.Array[Color] = js.native
    
    /**
      * Array of 3 vertex normals.
      * @default []
      */
    var vertexNormals: js.Array[Vector3] = js.native
  }
  
  @JSImport("three/examples/jsm/deprecated/Geometry", "Geometry")
  @js.native
  open class Geometry () extends EventDispatcher[Event] {
    
    var animation: AnimationClip = js.native
    
    var animations: js.Array[AnimationClip] = js.native
    
    /**
      * Bakes matrix transform directly into vertex coordinates.
      */
    def applyMatrix4(matrix: Matrix4): Geometry = js.native
    
    // These properties do not exist in a normal Geometry class, but if you use the instance that was passed by JSONLoader, it will be added.
    var bones: js.Array[Bone] = js.native
    
    /**
      * Bounding box.
      * @default null
      */
    var boundingBox: Box3 | Null = js.native
    
    /**
      * Bounding sphere.
      * @default null
      */
    var boundingSphere: Sphere | Null = js.native
    
    def center(): Geometry = js.native
    
    /**
      * Array of vertex colors, matching number and order of vertices.
      * Used in ParticleSystem, Line and Ribbon.
      * Meshes use per-face-use-of-vertex colors embedded directly in faces.
      * To signal an update in this array, Geometry.colorsNeedUpdate needs to be set to true.
      * @default []
      */
    var colors: js.Array[Color] = js.native
    
    /**
      * Set to true if the colors array has been updated.
      * @default false
      */
    var colorsNeedUpdate: Boolean = js.native
    
    /**
      * Computes bounding box of the geometry, updating {@link Geometry.boundingBox} attribute.
      */
    def computeBoundingBox(): Unit = js.native
    
    /**
      * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
      * Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are null.
      */
    def computeBoundingSphere(): Unit = js.native
    
    /**
      * Computes face normals.
      */
    def computeFaceNormals(): Unit = js.native
    
    /**
      * Compute vertex normals, but duplicating face normals.
      */
    def computeFlatVertexNormals(): Unit = js.native
    
    /**
      * Computes morph normals.
      */
    def computeMorphNormals(): Unit = js.native
    
    /**
      * Computes vertex normals by averaging face normals.
      * Face normals must be existing / computed beforehand.
      */
    def computeVertexNormals(): Unit = js.native
    def computeVertexNormals(areaWeighted: Boolean): Unit = js.native
    
    def copy(source: Geometry): this.type = js.native
    
    /**
      * Removes The object from memory.
      * Don't forget to call this method when you remove an geometry because it can cuase meomory leaks.
      */
    def dispose(): Unit = js.native
    
    /**
      * Set to true if the faces array has been updated.
      * @default false
      */
    var elementsNeedUpdate: Boolean = js.native
    
    /**
      * Array of face UV layers.
      * Each UV layer is an array of UV matching order and number of vertices in faces.
      * To signal an update in this array, Geometry.uvsNeedUpdate needs to be set to true.
      * @default [[]]
      */
    var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
    
    /**
      * Array of triangles or/and quads.
      * The array of faces describe how each vertex in the model is connected with each other.
      * To signal an update in this array, Geometry.elementsNeedUpdate needs to be set to true.
      * @default []
      */
    var faces: js.Array[Face3] = js.native
    
    def fromBufferGeometry(geometry: BufferGeometry): Geometry = js.native
    
    /**
      *
      * @default false
      */
    var groupsNeedUpdate: Boolean = js.native
    
    /**
      * Unique number of this geometry instance
      */
    var id: Double = js.native
    
    val isGeometry: `true` = js.native
    
    /**
      * @default []
      */
    var lineDistances: js.Array[Double] = js.native
    
    /**
      * Set to true if the linedistances array has been updated.
      * @default false
      */
    var lineDistancesNeedUpdate: Boolean = js.native
    
    def lookAt(vector: Vector3): Unit = js.native
    
    def merge(geometry: Geometry): Unit = js.native
    def merge(geometry: Geometry, matrix: Unit, materialIndexOffset: Double): Unit = js.native
    def merge(geometry: Geometry, matrix: Matrix): Unit = js.native
    def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = js.native
    
    def mergeMesh(
      mesh: Mesh[
          typings.three.srcCoreBufferGeometryMod.BufferGeometry, 
          Material | js.Array[Material]
        ]
    ): Unit = js.native
    
    /**
      * Checks for duplicate vertices using hashmap for specified number of decimal points, e.g. 4 for epsilon of 0.0001
      * Duplicated vertices are removed and faces' vertices are updated.
      */
    def mergeVertices(): Double = js.native
    def mergeVertices(precisionPoints: Double): Double = js.native
    
    /**
      * Array of morph normals. Morph normals have similar structure as morph targets, each normal set is a Javascript object:
      *
      * morphNormal = { name: "NormalName", normals: [ new THREE.Vector3(), ... ] }
      * @default []
      */
    var morphNormals: js.Array[MorphNormals] = js.native
    
    /**
      * Array of morph targets. Each morph target is a Javascript object:
      *
      * { name: "targetName", vertices: [ new THREE.Vector3(), ... ] }
      *
      * Morph vertices match number and order of primary vertices.
      * @default []
      */
    var morphTargets: js.Array[MorphTarget] = js.native
    
    /**
      * Name for this geometry. Default is an empty string.
      * @default ''
      */
    var name: String = js.native
    
    def normalize(): Geometry = js.native
    
    /**
      * Set to true if the normals array has been updated.
      * @default false
      */
    var normalsNeedUpdate: Boolean = js.native
    
    def rotateX(angle: Double): Geometry = js.native
    
    def rotateY(angle: Double): Geometry = js.native
    
    def rotateZ(angle: Double): Geometry = js.native
    
    def scale(x: Double, y: Double, z: Double): Geometry = js.native
    
    def setFromPoints(points: js.Array[Vector2 | Vector3]): this.type = js.native
    
    /**
      * Array of skinning indices, matching number and order of vertices.
      * @default []
      */
    var skinIndices: js.Array[Vector4] = js.native
    
    /**
      * Array of skinning weights, matching number and order of vertices.
      * @default []
      */
    var skinWeights: js.Array[Vector4] = js.native
    
    def sortFacesByMaterialIndex(): Unit = js.native
    
    def toBufferGeometry(): BufferGeometry = js.native
    
    def toJSON(): Any = js.native
    
    def translate(x: Double, y: Double, z: Double): Geometry = js.native
    
    /**
      * @default 'Geometry'
      */
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    /**
      * Set to true if the uvs array has been updated.
      * @default false
      */
    var uvsNeedUpdate: Boolean = js.native
    
    /**
      * The array of vertices hold every position of points of the model.
      * To signal an update in this array, Geometry.verticesNeedUpdate needs to be set to true.
      * @default []
      */
    var vertices: js.Array[Vector3] = js.native
    
    /**
      * Set to true if the vertices array has been updated.
      * @default false
      */
    var verticesNeedUpdate: Boolean = js.native
  }
  /* static members */
  object Geometry {
    
    @JSImport("three/examples/jsm/deprecated/Geometry", "Geometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBufferGeometryFromObject(`object`: Object3D[Event]): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createBufferGeometryFromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  }
  
  trait MorphColor extends StObject {
    
    var colors: js.Array[Color]
    
    var name: String
  }
  object MorphColor {
    
    inline def apply(colors: js.Array[Color], name: String): MorphColor = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphColor]
    }
    
    extension [Self <: MorphColor](x: Self) {
      
      inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MorphNormals extends StObject {
    
    var name: String
    
    var normals: js.Array[Vector3]
  }
  object MorphNormals {
    
    inline def apply(name: String, normals: js.Array[Vector3]): MorphNormals = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphNormals]
    }
    
    extension [Self <: MorphNormals](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNormals(value: js.Array[Vector3]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
      
      inline def setNormalsVarargs(value: Vector3*): Self = StObject.set(x, "normals", js.Array(value*))
    }
  }
  
  trait MorphTarget extends StObject {
    
    var name: String
    
    var vertices: js.Array[Vector3]
  }
  object MorphTarget {
    
    inline def apply(name: String, vertices: js.Array[Vector3]): MorphTarget = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphTarget]
    }
    
    extension [Self <: MorphTarget](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVertices(value: js.Array[Vector3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Vector3*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
}
