package typings.winrt.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileProperties {
  
  @JSGlobal("Windows.Storage.FileProperties.BasicProperties")
  @js.native
  class BasicProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.BasicProperties
  
  @JSGlobal("Windows.Storage.FileProperties.DocumentProperties")
  @js.native
  class DocumentProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.DocumentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.ImageProperties")
  @js.native
  class ImageProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.ImageProperties
  
  @JSGlobal("Windows.Storage.FileProperties.MusicProperties")
  @js.native
  class MusicProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.MusicProperties
  
  @JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
  @js.native
  object PhotoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.PhotoOrientation with Double] = js.native
    
    /* 2 */ val flipHorizontal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
    
    /* 4 */ val flipVertical: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
    
    /* 1 */ val normal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
    
    /* 3 */ val rotate180: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
    
    /* 6 */ val rotate270: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
    
    /* 8 */ val rotate90: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
    
    /* 5 */ val transpose: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
    
    /* 7 */ val transverse: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
    
    /* 0 */ val unspecified: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
  @js.native
  object PropertyPrefetchOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions with Double] = js.native
    
    /* 5 */ val basicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties with Double = js.native
    
    /* 4 */ val documentProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties with Double = js.native
    
    /* 3 */ val imageProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties with Double = js.native
    
    /* 1 */ val musicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.none with Double = js.native
    
    /* 2 */ val videoProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemContentProperties")
  @js.native
  class StorageItemContentProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
  @js.native
  class StorageItemThumbnail ()
    extends typings.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
  @js.native
  object ThumbnailMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailMode with Double] = js.native
    
    /* 3 */ val documentsView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
    
    /* 4 */ val listView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
    
    /* 2 */ val musicView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
    
    /* 0 */ val picturesView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
    
    /* 5 */ val singleItem: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
    
    /* 1 */ val videosView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
  @js.native
  object ThumbnailOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions with Double] = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.none with Double = js.native
    
    /* 2 */ val resizeThumbnail: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail with Double = js.native
    
    /* 1 */ val returnOnlyIfCached: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached with Double = js.native
    
    /* 3 */ val useCurrentScale: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
  @js.native
  object ThumbnailType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailType with Double] = js.native
    
    /* 1 */ val icon: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
    
    /* 0 */ val image: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
  @js.native
  object VideoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.VideoOrientation with Double] = js.native
    
    /* 0 */ val normal: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.normal with Double = js.native
    
    /* 2 */ val rotate180: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate180 with Double = js.native
    
    /* 3 */ val rotate270: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate270 with Double = js.native
    
    /* 1 */ val rotate90: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate90 with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoProperties")
  @js.native
  class VideoProperties ()
    extends typings.winrt.Windows.Storage.FileProperties.VideoProperties
}
