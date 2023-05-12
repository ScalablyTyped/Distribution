package typings.three

import typings.three.srcConstantsMod.TrianglesDrawModes
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.BufferAttribute
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.InterleavedBufferAttribute
import typings.three.srcThreeMod.Line
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsBufferGeometryUtilsMod {
  
  @JSImport("three/examples/jsm/utils/BufferGeometryUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeMikkTSpaceTangents(geometry: BufferGeometry[NormalBufferAttributes], MikkTSpace: Any): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMikkTSpaceTangents")(geometry.asInstanceOf[js.Any], MikkTSpace.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  inline def computeMikkTSpaceTangents(geometry: BufferGeometry[NormalBufferAttributes], MikkTSpace: Any, negateSign: Boolean): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMikkTSpaceTangents")(geometry.asInstanceOf[js.Any], MikkTSpace.asInstanceOf[js.Any], negateSign.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def computeMorphedAttributes(
    `object`: Line[
      typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def computeMorphedAttributes(
    `object`: Mesh[
      typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def computeMorphedAttributes(
    `object`: Points[
      typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
      Material | js.Array[Material]
    ]
  ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMorphedAttributes")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def deepCloneAttribute(attribute: BufferAttribute): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCloneAttribute")(attribute.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
  
  inline def deinterleaveAttribute(geometry: BufferGeometry[NormalBufferAttributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deinterleaveAttribute")(geometry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deinterleaveGeometry(geometry: BufferGeometry[NormalBufferAttributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deinterleaveGeometry")(geometry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def estimateBytesUsed(geometry: BufferGeometry[NormalBufferAttributes]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("estimateBytesUsed")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def interleaveAttributes(attributes: js.Array[BufferAttribute]): InterleavedBufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("interleaveAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[InterleavedBufferAttribute]
  
  inline def mergeAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
  
  inline def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
  
  inline def mergeBufferGeometries(geometries: js.Array[BufferGeometry[NormalBufferAttributes]]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  inline def mergeBufferGeometries(geometries: js.Array[BufferGeometry[NormalBufferAttributes]], useGroups: Boolean): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any], useGroups.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def mergeGeometries(geometries: js.Array[BufferGeometry[NormalBufferAttributes]]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  inline def mergeGeometries(geometries: js.Array[BufferGeometry[NormalBufferAttributes]], useGroups: Boolean): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeGeometries")(geometries.asInstanceOf[js.Any], useGroups.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def mergeGroups(geometry: BufferGeometry[NormalBufferAttributes]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGroups")(geometry.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def mergeVertices(geometry: BufferGeometry[NormalBufferAttributes]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  inline def mergeVertices(geometry: BufferGeometry[NormalBufferAttributes], tolerance: Double): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeVertices")(geometry.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def toCreasedNormals(geometry: BufferGeometry[NormalBufferAttributes]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCreasedNormals")(geometry.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  inline def toCreasedNormals(geometry: BufferGeometry[NormalBufferAttributes], creaseAngle: Double): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCreasedNormals")(geometry.asInstanceOf[js.Any], creaseAngle.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
  
  inline def toTrianglesDrawMode(geometry: BufferGeometry[NormalBufferAttributes], drawMode: TrianglesDrawModes): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTrianglesDrawMode")(geometry.asInstanceOf[js.Any], drawMode.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
}
