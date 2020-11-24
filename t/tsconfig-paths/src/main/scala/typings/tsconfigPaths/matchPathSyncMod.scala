package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.filesystemMod.FileExistsSync_
import typings.tsconfigPaths.filesystemMod.ReadJsonSync
import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsconfig-paths/lib/match-path-sync", JSImport.Namespace)
@js.native
object matchPathSyncMod extends js.Object {
  
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPath = js.native
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.UndefOr[scala.Nothing],
    addMatchAll: Boolean
  ): MatchPath = js.native
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPath = js.native
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPath = js.native
  
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String, readJson: ReadJsonSync): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
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
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
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
  
  type MatchPath = js.Function4[
    /* requestedModule */ String, 
    /* readJson */ js.UndefOr[ReadJsonSync], 
    /* fileExists */ js.UndefOr[js.Function1[/* name */ String, Boolean]], 
    /* extensions */ js.UndefOr[js.Array[String]], 
    js.UndefOr[String]
  ]
}
