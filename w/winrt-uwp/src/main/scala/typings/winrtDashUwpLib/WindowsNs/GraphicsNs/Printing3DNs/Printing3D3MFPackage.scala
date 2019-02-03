package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) package. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
@js.native
/** Creates a Printing3D3MFPackage object. */
class Printing3D3MFPackage () extends js.Object {
  /** Gets or sets an XML stream to the 3D model in the 3D Manufacturing Format (3MF) package. */
  var modelPart: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Gets or sets a stream to the print ticket in the 3D Manufacturing Format (3MF) package. */
  var printTicket: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Gets or sets the textures in the 3D Manufacturing Format (3MF) package. */
  var textures: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Printing3DTextureResource] = js.native
  /** Gets or sets a thumbnail image that represents the contents of the 3D Manufacturing Format (3MF) package. */
  var thumbnail: Printing3DTextureResource = js.native
  /**
    * Creates a Printing3DModel object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3DModel object created from the specified 3MF object stream.
    */
  def loadModelFromPackageAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Printing3DModel] = js.native
  /**
    * Saves the Printing3D3MFPackage object to a 3D Manufacturing Format (3MF) file stream.
    * @return A stream to the 3MF file where the package is to be saved.
    */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
    * Saves the specified 3D model to the 3D Manufacturing Format (3MF) package.
    * @param value The 3D model to be saved to the 3MF package.
    * @return The results of the operation.
    */
  def saveModelToPackageAsync(value: Printing3DModel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
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
  def loadAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3D3MFPackage] = js.native
}

