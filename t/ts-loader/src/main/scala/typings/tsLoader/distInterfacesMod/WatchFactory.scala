package typings.tsLoader.distInterfacesMod

import typings.tsLoader.anon.FnCallPathCallbackPollingIntervalOptions
import typings.tsLoader.anon.FnCallPathCallbackRecursiveOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.FileWatcherEventKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchFactory extends StObject {
  
  def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Boolean
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: CompilerOptions): FileWatcher
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  @JSName("watchDirectory")
  var watchDirectory_Original: FnCallPathCallbackRecursiveOptions
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback): FileWatcher
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: CompilerOptions): FileWatcher
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  @JSName("watchFile")
  var watchFile_Original: FnCallPathCallbackPollingIntervalOptions
  
  var watchedDirectories: WatchCallbacks[DirectoryWatcherCallback]
  
  var watchedDirectoriesRecursive: WatchCallbacks[DirectoryWatcherCallback]
  
  var watchedFiles: WatchCallbacks[FileWatcherCallback]
}
object WatchFactory {
  
  inline def apply(
    invokeFileWatcher: (String, FileWatcherEventKind) => Boolean,
    watchDirectory: FnCallPathCallbackRecursiveOptions,
    watchFile: FnCallPathCallbackPollingIntervalOptions,
    watchedDirectories: WatchCallbacks[DirectoryWatcherCallback],
    watchedDirectoriesRecursive: WatchCallbacks[DirectoryWatcherCallback],
    watchedFiles: WatchCallbacks[FileWatcherCallback]
  ): WatchFactory = {
    val __obj = js.Dynamic.literal(invokeFileWatcher = js.Any.fromFunction2(invokeFileWatcher), watchDirectory = watchDirectory.asInstanceOf[js.Any], watchFile = watchFile.asInstanceOf[js.Any], watchedDirectories = watchedDirectories.asInstanceOf[js.Any], watchedDirectoriesRecursive = watchedDirectoriesRecursive.asInstanceOf[js.Any], watchedFiles = watchedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchFactory]
  }
  
  extension [Self <: WatchFactory](x: Self) {
    
    inline def setInvokeFileWatcher(value: (String, FileWatcherEventKind) => Boolean): Self = StObject.set(x, "invokeFileWatcher", js.Any.fromFunction2(value))
    
    inline def setWatchDirectory(value: FnCallPathCallbackRecursiveOptions): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
    
    inline def setWatchFile(value: FnCallPathCallbackPollingIntervalOptions): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
    
    inline def setWatchedDirectories(value: WatchCallbacks[DirectoryWatcherCallback]): Self = StObject.set(x, "watchedDirectories", value.asInstanceOf[js.Any])
    
    inline def setWatchedDirectoriesRecursive(value: WatchCallbacks[DirectoryWatcherCallback]): Self = StObject.set(x, "watchedDirectoriesRecursive", value.asInstanceOf[js.Any])
    
    inline def setWatchedFiles(value: WatchCallbacks[FileWatcherCallback]): Self = StObject.set(x, "watchedFiles", value.asInstanceOf[js.Any])
  }
}
