package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.tsconfigPaths.filesystemMod.FileExistsAsync_
import typings.tsconfigPaths.filesystemMod.ReadJsonAsync
import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsconfig-paths/lib/match-path-async", JSImport.Namespace)
@js.native
object matchPathAsyncMod extends js.Object {
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPathAsync = js.native
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPathAsync = js.native
  def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPathAsync = js.native
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
  type MatchPathAsync = js.Function5[
    /* requestedModule */ String, 
    /* readJson */ js.UndefOr[ReadJsonAsync], 
    /* fileExists */ js.UndefOr[FileExistsAsync_], 
    /* extensions */ js.UndefOr[js.Array[String]], 
    /* callback */ MatchPathAsyncCallback, 
    Unit
  ]
  type MatchPathAsyncCallback = js.Function2[/* err */ js.UndefOr[Error], /* path */ js.UndefOr[String], Unit]
}

