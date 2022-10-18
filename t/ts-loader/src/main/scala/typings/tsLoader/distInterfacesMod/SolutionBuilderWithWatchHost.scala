package typings.tsLoader.distInterfacesMod

import typings.std.Map
import typings.tsLoader.anon.Key
import typings.tsLoader.anon.Text
import typings.tsLoader.tsLoaderBooleans.`true`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.OutputFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilderWithWatchHost
  extends StObject
     with typings.typescript.mod.SolutionBuilderWithWatchHost[EmitAndSemanticDiagnosticsBuilderProgram]
     with WatchFactory {
  
  def buildReferences(): Unit = js.native
  
  def clearCache(): Unit = js.native
  
  def close(): Unit = js.native
  
  var configFileInfo: Map[FilePathKey, ConfigFileInfo] = js.native
  
  var diagnostics: SolutionDiagnostics = js.native
  
  def ensureAllReferenceTimestamps(): Unit = js.native
  
  def getInputFileNameFromOutput(outputFileName: String): js.UndefOr[String] = js.native
  
  def getInputFileStamp(fileName: String): js.Date = js.native
  
  def getOutputFileAndKeyFromReferencedProject(oututFileName: String): js.UndefOr[Key] = js.native
  
  def getOutputFileKeyFromReferencedProject(outputFileName: String): js.UndefOr[FilePathKey] = js.native
  
  def getOutputFileTextAndKeyFromReferencedProject(oututFileName: String): js.UndefOr[Text] = js.native
  
  def getOutputFilesFromReferencedProjectInput(inputFileName: String): js.Array[OutputFile] = js.native
  
  var outputAffectingInstanceVersion: Map[FilePathKey, `true`] = js.native
  
  def updateSolutionBuilderInputFile(fileName: String): Unit = js.native
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: CompilerOptions): FileWatcher = js.native
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: CompilerOptions): FileWatcher = js.native
  
  var writtenFiles: js.Array[OutputFile] = js.native
}
