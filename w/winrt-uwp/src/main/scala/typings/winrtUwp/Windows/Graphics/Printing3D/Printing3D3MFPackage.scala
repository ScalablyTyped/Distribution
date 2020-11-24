package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) package. */
@js.native
trait Printing3D3MFPackage extends js.Object {
  
  /**
    * Creates a Printing3DModel object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3DModel object created from the specified 3MF object stream.
    */
  def loadModelFromPackageAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[Printing3DModel] = js.native
  
  /** Gets or sets an XML stream to the 3D model in the 3D Manufacturing Format (3MF) package. */
  var modelPart: IRandomAccessStream = js.native
  
  /** Gets or sets a stream to the print ticket in the 3D Manufacturing Format (3MF) package. */
  var printTicket: IRandomAccessStream = js.native
  
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
  
  /** Gets or sets the textures in the 3D Manufacturing Format (3MF) package. */
  var textures: IVector[Printing3DTextureResource] = js.native
  
  /** Gets or sets a thumbnail image that represents the contents of the 3D Manufacturing Format (3MF) package. */
  var thumbnail: Printing3DTextureResource = js.native
}
object Printing3D3MFPackage {
  
  @scala.inline
  def apply(
    loadModelFromPackageAsync: IRandomAccessStream => IPromiseWithIAsyncOperation[Printing3DModel],
    modelPart: IRandomAccessStream,
    printTicket: IRandomAccessStream,
    saveAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStream],
    saveModelToPackageAsync: Printing3DModel => IPromiseWithIAsyncAction,
    textures: IVector[Printing3DTextureResource],
    thumbnail: Printing3DTextureResource
  ): Printing3D3MFPackage = {
    val __obj = js.Dynamic.literal(loadModelFromPackageAsync = js.Any.fromFunction1(loadModelFromPackageAsync), modelPart = modelPart.asInstanceOf[js.Any], printTicket = printTicket.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), saveModelToPackageAsync = js.Any.fromFunction1(saveModelToPackageAsync), textures = textures.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3D3MFPackage]
  }
  
  @scala.inline
  implicit class Printing3D3MFPackageOps[Self <: Printing3D3MFPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadModelFromPackageAsync(value: IRandomAccessStream => IPromiseWithIAsyncOperation[Printing3DModel]): Self = this.set("loadModelFromPackageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModelPart(value: IRandomAccessStream): Self = this.set("modelPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTicket(value: IRandomAccessStream): Self = this.set("printTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStream]): Self = this.set("saveAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveModelToPackageAsync(value: Printing3DModel => IPromiseWithIAsyncAction): Self = this.set("saveModelToPackageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextures(value: IVector[Printing3DTextureResource]): Self = this.set("textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Printing3DTextureResource): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
