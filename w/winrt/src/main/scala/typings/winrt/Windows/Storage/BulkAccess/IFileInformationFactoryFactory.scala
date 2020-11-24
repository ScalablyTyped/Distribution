package typings.winrt.Windows.Storage.BulkAccess

import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrt.Windows.Storage.Search.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileInformationFactoryFactory extends js.Object {
  
  def createWithMode(queryResult: IStorageQueryResultBase, mode: ThumbnailMode): FileInformationFactory = js.native
  
  def createWithModeAndSize(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double): FileInformationFactory = js.native
  
  def createWithModeAndSizeAndOptions(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions
  ): FileInformationFactory = js.native
  
  def createWithModeAndSizeAndOptionsAndFlags(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ): FileInformationFactory = js.native
}
object IFileInformationFactoryFactory {
  
  @scala.inline
  def apply(
    createWithMode: (IStorageQueryResultBase, ThumbnailMode) => FileInformationFactory,
    createWithModeAndSize: (IStorageQueryResultBase, ThumbnailMode, Double) => FileInformationFactory,
    createWithModeAndSizeAndOptions: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => FileInformationFactory,
    createWithModeAndSizeAndOptionsAndFlags: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => FileInformationFactory
  ): IFileInformationFactoryFactory = {
    val __obj = js.Dynamic.literal(createWithMode = js.Any.fromFunction2(createWithMode), createWithModeAndSize = js.Any.fromFunction3(createWithModeAndSize), createWithModeAndSizeAndOptions = js.Any.fromFunction4(createWithModeAndSizeAndOptions), createWithModeAndSizeAndOptionsAndFlags = js.Any.fromFunction5(createWithModeAndSizeAndOptionsAndFlags))
    __obj.asInstanceOf[IFileInformationFactoryFactory]
  }
  
  @scala.inline
  implicit class IFileInformationFactoryFactoryOps[Self <: IFileInformationFactoryFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateWithMode(value: (IStorageQueryResultBase, ThumbnailMode) => FileInformationFactory): Self = this.set("createWithMode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateWithModeAndSize(value: (IStorageQueryResultBase, ThumbnailMode, Double) => FileInformationFactory): Self = this.set("createWithModeAndSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateWithModeAndSizeAndOptions(
      value: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => FileInformationFactory
    ): Self = this.set("createWithModeAndSizeAndOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateWithModeAndSizeAndOptionsAndFlags(
      value: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => FileInformationFactory
    ): Self = this.set("createWithModeAndSizeAndOptionsAndFlags", js.Any.fromFunction5(value))
  }
}
