package typings.tsLoader.interfacesMod

import typings.std.Map
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.FileWatcherEventKind
import typings.typescript.mod.OutputFile
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchHost extends WatchCompilerHostOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram] {
  
  def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
  
  def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
  
  var outputFiles: Map[String, js.Array[OutputFile]] = js.native
  
  var tsbuildinfo: js.UndefOr[OutputFile] = js.native
  
  def updateRootFileNames(): Unit = js.native
}
