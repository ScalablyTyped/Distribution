package typings.winrtDashUwp.Windows.Graphics.Printing3D

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) package. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
@js.native
/** Creates a Printing3D3MFPackage object. */
class Printing3D3MFPackage () extends js.Object {
  /** Gets or sets an XML stream to the 3D model in the 3D Manufacturing Format (3MF) package. */
  var modelPart: IRandomAccessStream = js.native
  /** Gets or sets a stream to the print ticket in the 3D Manufacturing Format (3MF) package. */
  var printTicket: IRandomAccessStream = js.native
  /** Gets or sets the textures in the 3D Manufacturing Format (3MF) package. */
  var textures: IVector[Printing3DTextureResource] = js.native
  /** Gets or sets a thumbnail image that represents the contents of the 3D Manufacturing Format (3MF) package. */
  var thumbnail: Printing3DTextureResource = js.native
  /**
    * Creates a Printing3DModel object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3DModel object created from the specified 3MF object stream.
    */
  def loadModelFromPackageAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[Printing3DModel] = js.native
  /**
    * Saves the Printing3D3MFPackage object to a 3D Manufacturing Format (3MF) file stream.
    * @return A stream to the 3MF file where the package is to be saved.
    */
  def saveAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  /**
    * Saves the specified 3D model to the 3D Manufacturing Format (3MF) package.
    * @param value The 3D model to be saved to the 3MF package.
    * @return The results of the operation.
    */
  def saveModelToPackageAsync(value: Printing3DModel): IPromiseWithIAsyncAction = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
@js.native
object Printing3D3MFPackage extends js.Object {
  /**
    * Creates a Printing3D3MFPackage object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3D3MFPackage created from the specified 3MF package stream.
    */
  def loadAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[Printing3D3MFPackage] = js.native
}

