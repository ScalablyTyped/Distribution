package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DBufferDescription
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mesh in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMesh")
@js.native
/** Creates an instance of the Printing3DMesh class. */
class Printing3DMesh ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMesh {
  /** Gets a set of mesh buffer descriptions. */
  /* CompleteClass */
  override var bufferDescriptionSet: IPropertySet = js.native
  /** Gets a set of mesh buffers. */
  /* CompleteClass */
  override var bufferSet: IPropertySet = js.native
  /** Gets or sets the number of triangle indices. */
  /* CompleteClass */
  override var indexCount: Double = js.native
  /** Gets or sets the buffer description for triangle indices. */
  /* CompleteClass */
  override var triangleIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for triangle material indices. */
  /* CompleteClass */
  override var triangleMaterialIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the number of triangle vertices. */
  /* CompleteClass */
  override var vertexCount: Double = js.native
  /** Gets or sets the buffer description for vertex normals. */
  /* CompleteClass */
  override var vertexNormalsDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for vertex positions. */
  /* CompleteClass */
  override var vertexPositionsDescription: Printing3DBufferDescription = js.native
  /**
    * Creates the buffer for triangle indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  /* CompleteClass */
  override def createTriangleIndices(value: Double): Unit = js.native
  /**
    * Creates the buffer for triangle material indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  /* CompleteClass */
  override def createTriangleMaterialIndices(value: Double): Unit = js.native
  /**
    * Creates the buffer for vertex normals.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  /* CompleteClass */
  override def createVertexNormals(value: Double): Unit = js.native
  /**
    * Creates the buffer for vertex positions.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  /* CompleteClass */
  override def createVertexPositions(value: Double): Unit = js.native
  /**
    * Gets the buffer for triangle indices.
    * @return The buffer for triangle indices.
    */
  /* CompleteClass */
  override def getTriangleIndices(): IBuffer = js.native
  /**
    * Gets the buffer for triangle material indices.
    * @return The buffer for triangle material indices.
    */
  /* CompleteClass */
  override def getTriangleMaterialIndices(): IBuffer = js.native
  /**
    * Gets the buffer for vertex normals.
    * @return The buffer for vertex normals.
    */
  /* CompleteClass */
  override def getVertexNormals(): IBuffer = js.native
  /**
    * Gets the buffer for vertex positions.
    * @return The buffer for vertex positions.
    */
  /* CompleteClass */
  override def getVertexPositions(): IBuffer = js.native
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  /* CompleteClass */
  override def verifyAsync(value: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DMeshVerificationResult] = js.native
}

