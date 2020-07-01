package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.configLoaderMod.ConfigLoaderResult
import typings.tsconfigPaths.configLoaderMod.ExplicitParams
import typings.tsconfigPaths.filesystemMod.FileExistsAsync_
import typings.tsconfigPaths.filesystemMod.FileExistsSync_
import typings.tsconfigPaths.filesystemMod.ReadJsonAsync
import typings.tsconfigPaths.filesystemMod.ReadJsonSync
import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import typings.tsconfigPaths.matchPathAsyncMod.MatchPathAsync
import typings.tsconfigPaths.matchPathAsyncMod.MatchPathAsyncCallback
import typings.tsconfigPaths.matchPathSyncMod.MatchPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsconfig-paths", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPath = js.native
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPath = js.native
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPath = js.native
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPathAsync = js.native
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPathAsync = js.native
  def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPathAsync = js.native
  def loadConfig(): ConfigLoaderResult = js.native
  def loadConfig(cwd: String): ConfigLoaderResult = js.native
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String, readJson: ReadJsonSync): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[ReadJsonAsync],
    fileExists: js.UndefOr[FileExistsAsync_],
    extensions: js.UndefOr[js.Array[String]],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[ReadJsonAsync],
    fileExists: js.UndefOr[FileExistsAsync_],
    extensions: js.UndefOr[js.Array[String]],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def register(explicitParams: ExplicitParams): js.Function0[Unit] = js.native
}

