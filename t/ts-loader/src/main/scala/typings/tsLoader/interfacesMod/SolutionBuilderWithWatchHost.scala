package typings.tsLoader.interfacesMod

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.SolutionBuilderHostBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilderWithWatchHost
  extends SolutionBuilderHostBase[EmitAndSemanticDiagnosticsBuilderProgram]
     with typings.typescript.mod.WatchHost
     with WatchFactory {
  
  var diagnostics: SolutionDiagnostics = js.native
  
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(
    path: String,
    callback: DirectoryWatcherCallback,
    recursive: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
  
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(
    path: String,
    callback: FileWatcherCallback,
    pollingInterval: js.UndefOr[scala.Nothing],
    options: CompilerOptions
  ): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  /* InferMemberOverrides */
  override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
}
