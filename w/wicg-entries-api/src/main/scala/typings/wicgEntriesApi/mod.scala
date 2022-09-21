package typings.wicgEntriesApi

import typings.std.DOMException
import typings.wicgEntriesApi.mod.global.File
import typings.wicgEntriesApi.mod.global.FileSystemEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ErrorCallback = js.Function1[/* err */ DOMException, Unit]
  
  type FileCallback = js.Function1[/* file */ File, Unit]
  
  type FileSystemEntriesCallback = js.Function1[/* entries */ js.Array[FileSystemEntry], Unit]
  
  type FileSystemEntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]
  
  trait FileSystemFlags extends StObject {
    
    var create: js.UndefOr[Boolean] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
  }
  object FileSystemFlags {
    
    inline def apply(): FileSystemFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemFlags]
    }
    
    extension [Self <: FileSystemFlags](x: Self) {
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  object global {
    
    trait DataTransferItem extends StObject {
      
      def webkitGetAsEntry(): FileSystemEntry | Null
    }
    object DataTransferItem {
      
      inline def apply(webkitGetAsEntry: () => FileSystemEntry | Null): DataTransferItem = {
        val __obj = js.Dynamic.literal(webkitGetAsEntry = js.Any.fromFunction0(webkitGetAsEntry))
        __obj.asInstanceOf[DataTransferItem]
      }
      
      extension [Self <: DataTransferItem](x: Self) {
        
        inline def setWebkitGetAsEntry(value: () => FileSystemEntry | Null): Self = StObject.set(x, "webkitGetAsEntry", js.Any.fromFunction0(value))
      }
    }
    
    trait File extends StObject {
      
      val webkitRelativePath: String
    }
    object File {
      
      inline def apply(webkitRelativePath: String): File = {
        val __obj = js.Dynamic.literal(webkitRelativePath = webkitRelativePath.asInstanceOf[js.Any])
        __obj.asInstanceOf[File]
      }
      
      extension [Self <: File](x: Self) {
        
        inline def setWebkitRelativePath(value: String): Self = StObject.set(x, "webkitRelativePath", value.asInstanceOf[js.Any])
      }
    }
    
    trait FileSystem extends StObject {
      
      val name: String
      
      val root: FileSystemDirectoryEntry
    }
    object FileSystem {
      
      inline def apply(name: String, root: FileSystemDirectoryEntry): FileSystem = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
        __obj.asInstanceOf[FileSystem]
      }
      
      extension [Self <: FileSystem](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRoot(value: FileSystemDirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FileSystemDirectoryEntry
      extends StObject
         with FileSystemEntry {
      
      def createReader(): FileSystemDirectoryReader = js.native
      
      def getDirectory(): Unit = js.native
      def getDirectory(path: String): Unit = js.native
      def getDirectory(path: String, options: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getDirectory(path: String, options: Unit, successCallback: FileSystemEntryCallback): Unit = js.native
      def getDirectory(
        path: String,
        options: Unit,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
      def getDirectory(path: String, options: FileSystemFlags): Unit = js.native
      def getDirectory(path: String, options: FileSystemFlags, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getDirectory(path: String, options: FileSystemFlags, successCallback: FileSystemEntryCallback): Unit = js.native
      def getDirectory(
        path: String,
        options: FileSystemFlags,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
      def getDirectory(path: Unit, options: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getDirectory(path: Unit, options: Unit, successCallback: FileSystemEntryCallback): Unit = js.native
      def getDirectory(path: Unit, options: Unit, successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
      def getDirectory(path: Unit, options: FileSystemFlags): Unit = js.native
      def getDirectory(path: Unit, options: FileSystemFlags, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getDirectory(path: Unit, options: FileSystemFlags, successCallback: FileSystemEntryCallback): Unit = js.native
      def getDirectory(
        path: Unit,
        options: FileSystemFlags,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
      
      def getFile(): Unit = js.native
      def getFile(path: String): Unit = js.native
      def getFile(path: String, options: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getFile(path: String, options: Unit, successCallback: FileSystemEntryCallback): Unit = js.native
      def getFile(
        path: String,
        options: Unit,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
      def getFile(path: String, options: FileSystemFlags): Unit = js.native
      def getFile(path: String, options: FileSystemFlags, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getFile(path: String, options: FileSystemFlags, successCallback: FileSystemEntryCallback): Unit = js.native
      def getFile(
        path: String,
        options: FileSystemFlags,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
      def getFile(path: Unit, options: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getFile(path: Unit, options: Unit, successCallback: FileSystemEntryCallback): Unit = js.native
      def getFile(path: Unit, options: Unit, successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
      def getFile(path: Unit, options: FileSystemFlags): Unit = js.native
      def getFile(path: Unit, options: FileSystemFlags, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getFile(path: Unit, options: FileSystemFlags, successCallback: FileSystemEntryCallback): Unit = js.native
      def getFile(
        path: Unit,
        options: FileSystemFlags,
        successCallback: FileSystemEntryCallback,
        errorCallback: ErrorCallback
      ): Unit = js.native
    }
    
    @js.native
    trait FileSystemDirectoryReader extends StObject {
      
      def readEntries(successCallback: FileSystemEntriesCallback): Unit = js.native
      def readEntries(successCallback: FileSystemEntriesCallback, errorCallback: ErrorCallback): Unit = js.native
    }
    
    @js.native
    trait FileSystemEntry extends StObject {
      
      val filesystem: FileSystem = js.native
      
      val fullPath: String = js.native
      
      def getParent(): Unit = js.native
      def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
      def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
      def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
      
      val isDirectory: Boolean = js.native
      
      val isFile: Boolean = js.native
      
      val name: String = js.native
    }
    
    @js.native
    trait FileSystemFileEntry
      extends StObject
         with FileSystemEntry {
      
      def file(successCallback: FileCallback): Unit = js.native
      def file(successCallback: FileCallback, errorCallback: ErrorCallback): Unit = js.native
    }
    
    trait HTMLInputElement extends StObject {
      
      val webkitEntries: js.Array[FileSystemEntry]
      
      var webkitdirectory: Boolean
    }
    object HTMLInputElement {
      
      inline def apply(webkitEntries: js.Array[FileSystemEntry], webkitdirectory: Boolean): HTMLInputElement = {
        val __obj = js.Dynamic.literal(webkitEntries = webkitEntries.asInstanceOf[js.Any], webkitdirectory = webkitdirectory.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLInputElement]
      }
      
      extension [Self <: HTMLInputElement](x: Self) {
        
        inline def setWebkitEntries(value: js.Array[FileSystemEntry]): Self = StObject.set(x, "webkitEntries", value.asInstanceOf[js.Any])
        
        inline def setWebkitEntriesVarargs(value: FileSystemEntry*): Self = StObject.set(x, "webkitEntries", js.Array(value*))
        
        inline def setWebkitdirectory(value: Boolean): Self = StObject.set(x, "webkitdirectory", value.asInstanceOf[js.Any])
      }
    }
  }
}
