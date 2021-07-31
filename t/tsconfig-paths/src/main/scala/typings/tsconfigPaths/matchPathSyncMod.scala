package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.filesystemMod.FileExistsSync_
import typings.tsconfigPaths.filesystemMod.ReadJsonSync
import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchPathSyncMod {
  
  @JSImport("tsconfig-paths/lib/match-path-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  @scala.inline
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  @scala.inline
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  @scala.inline
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: Unit,
    addMatchAll: Boolean
  ): MatchPath = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatchPath")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[MatchPath]
  
  @scala.inline
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: Unit,
    extensions: Unit,
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: Unit,
    fileExists: FileExistsSync_,
    extensions: Unit,
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String, readJson: ReadJsonSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: Unit,
    extensions: Unit,
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: Unit,
    mainFields: js.Array[String]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFromAbsolutePaths")(absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any], readJson.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], mainFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  type MatchPath = js.Function4[
    /* requestedModule */ String, 
    /* readJson */ js.UndefOr[ReadJsonSync], 
    /* fileExists */ js.UndefOr[js.Function1[/* name */ String, Boolean]], 
    /* extensions */ js.UndefOr[js.Array[String]], 
    js.UndefOr[String]
  ]
}
