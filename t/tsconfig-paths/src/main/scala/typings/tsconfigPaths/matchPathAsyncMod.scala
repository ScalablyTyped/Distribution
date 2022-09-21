package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.filesystemMod.FileExistsAsync_
import typings.tsconfigPaths.filesystemMod.ReadJsonAsync
import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchPathAsyncMod {
  
  @JSImport("tsconfig-paths/lib/match-path-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  type MatchPathAsync = js.Function5[
    /* requestedModule */ String, 
    /* readJson */ js.UndefOr[ReadJsonAsync], 
    /* fileExists */ js.UndefOr[FileExistsAsync_], 
    /* extensions */ js.UndefOr[js.Array[String]], 
    /* callback */ MatchPathAsyncCallback, 
    Unit
  ]
  
  type MatchPathAsyncCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* path */ js.UndefOr[String], Unit]
}
