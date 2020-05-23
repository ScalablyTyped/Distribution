package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mesh in the 3D model. */
trait Printing3DMesh extends js.Object {
  /** Gets a set of mesh buffer descriptions. */
  var bufferDescriptionSet: IPropertySet
  /** Gets a set of mesh buffers. */
  var bufferSet: IPropertySet
  /** Gets or sets the number of triangle indices. */
  var indexCount: Double
  /** Gets or sets the buffer description for triangle indices. */
  var triangleIndicesDescription: Printing3DBufferDescription
  /** Gets or sets the buffer description for triangle material indices. */
  var triangleMaterialIndicesDescription: Printing3DBufferDescription
  /** Gets or sets the number of triangle vertices. */
  var vertexCount: Double
  /** Gets or sets the buffer description for vertex normals. */
  var vertexNormalsDescription: Printing3DBufferDescription
  /** Gets or sets the buffer description for vertex positions. */
  var vertexPositionsDescription: Printing3DBufferDescription
  /**
    * Creates the buffer for triangle indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleIndices(value: Double): Unit
  /**
    * Creates the buffer for triangle material indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleMaterialIndices(value: Double): Unit
  /**
    * Creates the buffer for vertex normals.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexNormals(value: Double): Unit
  /**
    * Creates the buffer for vertex positions.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexPositions(value: Double): Unit
  /**
    * Gets the buffer for triangle indices.
    * @return The buffer for triangle indices.
    */
  def getTriangleIndices(): IBuffer
  /**
    * Gets the buffer for triangle material indices.
    * @return The buffer for triangle material indices.
    */
  def getTriangleMaterialIndices(): IBuffer
  /**
    * Gets the buffer for vertex normals.
    * @return The buffer for vertex normals.
    */
  def getVertexNormals(): IBuffer
  /**
    * Gets the buffer for vertex positions.
    * @return The buffer for vertex positions.
    */
  def getVertexPositions(): IBuffer
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult]
}

object Printing3DMesh {
  @scala.inline
  def apply(
    bufferDescriptionSet: IPropertySet,
    bufferSet: IPropertySet,
    createTriangleIndices: Double => Unit,
    createTriangleMaterialIndices: Double => Unit,
    createVertexNormals: Double => Unit,
    createVertexPositions: Double => Unit,
    getTriangleIndices: () => IBuffer,
    getTriangleMaterialIndices: () => IBuffer,
    getVertexNormals: () => IBuffer,
    getVertexPositions: () => IBuffer,
    indexCount: Double,
    triangleIndicesDescription: Printing3DBufferDescription,
    triangleMaterialIndicesDescription: Printing3DBufferDescription,
    verifyAsync: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult],
    vertexCount: Double,
    vertexNormalsDescription: Printing3DBufferDescription,
    vertexPositionsDescription: Printing3DBufferDescription
  ): Printing3DMesh = {
    val __obj = js.Dynamic.literal(bufferDescriptionSet = bufferDescriptionSet.asInstanceOf[js.Any], bufferSet = bufferSet.asInstanceOf[js.Any], createTriangleIndices = js.Any.fromFunction1(createTriangleIndices), createTriangleMaterialIndices = js.Any.fromFunction1(createTriangleMaterialIndices), createVertexNormals = js.Any.fromFunction1(createVertexNormals), createVertexPositions = js.Any.fromFunction1(createVertexPositions), getTriangleIndices = js.Any.fromFunction0(getTriangleIndices), getTriangleMaterialIndices = js.Any.fromFunction0(getTriangleMaterialIndices), getVertexNormals = js.Any.fromFunction0(getVertexNormals), getVertexPositions = js.Any.fromFunction0(getVertexPositions), indexCount = indexCount.asInstanceOf[js.Any], triangleIndicesDescription = triangleIndicesDescription.asInstanceOf[js.Any], triangleMaterialIndicesDescription = triangleMaterialIndicesDescription.asInstanceOf[js.Any], verifyAsync = js.Any.fromFunction1(verifyAsync), vertexCount = vertexCount.asInstanceOf[js.Any], vertexNormalsDescription = vertexNormalsDescription.asInstanceOf[js.Any], vertexPositionsDescription = vertexPositionsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMesh]
  }
}

