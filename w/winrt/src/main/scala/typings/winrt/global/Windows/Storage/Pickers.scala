package typings.winrt.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pickers {
  
  @JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
  @js.native
  class FileExtensionVector ()
    extends typings.winrt.Windows.Storage.Pickers.FileExtensionVector
  
  @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
  @js.native
  class FileOpenPicker ()
    extends typings.winrt.Windows.Storage.Pickers.FileOpenPicker
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
  @js.native
  class FilePickerFileTypesOrderedMap ()
    extends typings.winrt.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
  @js.native
  class FilePickerSelectedFilesArray ()
    extends typings.winrt.Windows.Storage.Pickers.FilePickerSelectedFilesArray
  
  @JSGlobal("Windows.Storage.Pickers.FileSavePicker")
  @js.native
  class FileSavePicker ()
    extends typings.winrt.Windows.Storage.Pickers.FileSavePicker
  
  @JSGlobal("Windows.Storage.Pickers.FolderPicker")
  @js.native
  class FolderPicker ()
    extends typings.winrt.Windows.Storage.Pickers.FolderPicker
  
  @JSGlobal("Windows.Storage.Pickers.PickerLocationId")
  @js.native
  object PickerLocationId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.PickerLocationId with Double] = js.native
    
    /* 1 */ val computerFolder: typings.winrt.Windows.Storage.Pickers.PickerLocationId.computerFolder with Double = js.native
    
    /* 2 */ val desktop: typings.winrt.Windows.Storage.Pickers.PickerLocationId.desktop with Double = js.native
    
    /* 0 */ val documentsLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.documentsLibrary with Double = js.native
    
    /* 3 */ val downloads: typings.winrt.Windows.Storage.Pickers.PickerLocationId.downloads with Double = js.native
    
    /* 4 */ val homeGroup: typings.winrt.Windows.Storage.Pickers.PickerLocationId.homeGroup with Double = js.native
    
    /* 5 */ val musicLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.musicLibrary with Double = js.native
    
    /* 6 */ val picturesLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.picturesLibrary with Double = js.native
    
    /* 7 */ val videosLibrary: typings.winrt.Windows.Storage.Pickers.PickerLocationId.videosLibrary with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.PickerViewMode")
  @js.native
  object PickerViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.PickerViewMode with Double] = js.native
    
    /* 0 */ val list: typings.winrt.Windows.Storage.Pickers.PickerViewMode.list with Double = js.native
    
    /* 1 */ val thumbnail: typings.winrt.Windows.Storage.Pickers.PickerViewMode.thumbnail with Double = js.native
  }
  
  object Provider {
    
    @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
    @js.native
    object AddFileResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult with Double] = js.native
      
      /* 0 */ val added: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
      
      /* 2 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
      
      /* 3 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
    @js.native
    class FileOpenPickerUI ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
    @js.native
    class FileRemovedEventArgs ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.FileRemovedEventArgs
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
    @js.native
    class FileSavePickerUI ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
    @js.native
    object FileSelectionMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode with Double] = js.native
      
      /* 1 */ val multiple: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
      
      /* 0 */ val single: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
    @js.native
    class PickerClosingDeferral ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
    @js.native
    class PickerClosingEventArgs ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingEventArgs
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
    @js.native
    class PickerClosingOperation ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation
    
    @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
    @js.native
    object SetFileNameResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult with Double] = js.native
      
      /* 1 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed with Double = js.native
      
      /* 0 */ val succeeded: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded with Double = js.native
      
      /* 2 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable with Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
    @js.native
    class TargetFileRequest ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
    @js.native
    class TargetFileRequestDeferral ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs")
    @js.native
    class TargetFileRequestedEventArgs ()
      extends typings.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs
  }
}
