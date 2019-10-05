package typings.winrtDashUwp.Windows.Graphics.Printing3D

import typings.winrtDashUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mesh in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMesh")
@js.native
/** Creates an instance of the Printing3DMesh class. */
class Printing3DMesh () extends js.Object {
  /** Gets a set of mesh buffer descriptions. */
  var bufferDescriptionSet: IPropertySet = js.native
  /** Gets a set of mesh buffers. */
  var bufferSet: IPropertySet = js.native
  /** Gets or sets the number of triangle indices. */
  var indexCount: Double = js.native
  /** Gets or sets the buffer description for triangle indices. */
  var triangleIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for triangle material indices. */
  var triangleMaterialIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the number of triangle vertices. */
  var vertexCount: Double = js.native
  /** Gets or sets the buffer description for vertex normals. */
  var vertexNormalsDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for vertex positions. */
  var vertexPositionsDescription: Printing3DBufferDescription = js.native
  /**
    * Creates the buffer for triangle indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleIndices(value: Double): Unit = js.native
  /**
    * Creates the buffer for triangle material indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleMaterialIndices(value: Double): Unit = js.native
  /**
    * Creates the buffer for vertex normals.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexNormals(value: Double): Unit = js.native
  /**
    * Creates the buffer for vertex positions.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexPositions(value: Double): Unit = js.native
  /**
    * Gets the buffer for triangle indices.
    * @return The buffer for triangle indices.
    */
  def getTriangleIndices(): IBuffer = js.native
  /**
    * Gets the buffer for triangle material indices.
    * @return The buffer for triangle material indices.
    */
  def getTriangleMaterialIndices(): IBuffer = js.native
  /**
    * Gets the buffer for vertex normals.
    * @return The buffer for vertex normals.
    */
  def getVertexNormals(): IBuffer = js.native
  /**
    * Gets the buffer for vertex positions.
    * @return The buffer for vertex positions.
    */
  def getVertexPositions(): IBuffer = js.native
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult] = js.native
}

