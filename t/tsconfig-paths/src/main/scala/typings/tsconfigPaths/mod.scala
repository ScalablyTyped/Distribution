package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderResult
import typings.tsconfigPaths.libFilesystemMod.FileExistsAsync_
import typings.tsconfigPaths.libFilesystemMod.FileExistsSync_
import typings.tsconfigPaths.libFilesystemMod.ReadJsonAsync
import typings.tsconfigPaths.libFilesystemMod.ReadJsonSync
import typings.tsconfigPaths.libMappingEntryMod.MappingEntry
import typings.tsconfigPaths.libMatchPathAsyncMod.MatchPathAsync
import typings.tsconfigPaths.libMatchPathAsyncMod.MatchPathAsyncCallback
import typings.tsconfigPaths.libMatchPathSyncMod.MatchPath
import typings.tsconfigPaths.libRegisterMod.RegisterParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsconfig-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  inline def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String | js.Array[String]]
  ): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  inline def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String | js.Array[String]],
    addMatchAll: Boolean
  ): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  inline def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: Unit,
    addMatchAll: Boolean
  ): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  
  inline def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPathAsync = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPathAsync")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[MatchPathAsync]
  inline def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String | js.Array[String]]
  ): MatchPathAsync = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPathAsync")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[MatchPathAsync]
  inline def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String | js.Array[String]],
    addMatchAll: Boolean
  ): MatchPathAsync = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPathAsync")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPathAsync]
  inline def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: Unit,
    addMatchAll: Boolean
  ): MatchPathAsync = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPathAsync")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPathAsync]
  
  inline def loadConfig(): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[ConfigLoaderResult]
  inline def loadConfig(cwd: String): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(cwd.asInstanceOf[js.Any]).asInstanceOf[ConfigLoaderResult]
  
  inline def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String],
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: Unit,
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: Unit,
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String, readJson: ReadJsonSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: js.Array[String],
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: Unit,
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: Unit,
    mainFields: js.Array[String | js.Array[String]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: Unit,
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: Unit,
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsAsync_,
    extensions: Unit,
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsAsync_,
    extensions: Unit,
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: Unit,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: Unit,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: Unit,
    extensions: Unit,
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: Unit,
    extensions: Unit,
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: Unit,
    callback: MatchPathAsyncCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: Unit,
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String | js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePathsAsync")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def register(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Function0[Unit]]
  inline def register(params: RegisterParams): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
