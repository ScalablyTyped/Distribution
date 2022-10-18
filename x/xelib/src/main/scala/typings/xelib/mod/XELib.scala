package typings.xelib.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import typings.xelib.anon.Data
import typings.xelib.xelibBooleans.`false`
import typings.xelib.xelibBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoaderState * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GameMode * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArchiveType * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DefType * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SmashType * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueType * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictThis * / any
- Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictAll * / any */ @js.native
trait XELib extends StObject {
  
  /**
    * Adds an value the `Additional Races` array on `record`.
    * @returns Handle to the added Additional Race element.
    */
  def AddAdditionalRace(record: RecordHandle, value: String): ElementHandle = js.native
  
  /**
    * Adds all files loaded before file `id` as masters to it.
    */
  def AddAllMasters(id: FileHandle): Unit = js.native
  
  /**
    * Adds an item to the array at path and sets value at subpath.
    * @returns Handle to the added array item.
    */
  def AddArrayItem(id: Zeroable[Handle], path: String, subpath: String, value: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `Conditions` array on `record`,
    * setting `CTDA\Function` to `value`,
    * `CTDA\Type` to `value2`,
    * `CTDA\Comparison Value` to `value3`,
    * and `CTDA\Parameter #1` to `value4`.
    * @returns Handle to the added Condition element.
    */
  def AddCondition(record: RecordHandle, value: String, value2: String, value3: String, value4: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `Effects` array on `record`,
    * setting `EFID - Base Effect` to `value`,
    * `EFIT\Magnitude` to `value2`,
    * `EFIT\Area` to `value3`,
    * and `EFIT\Duration` to `value4`.
    * @returns Handle to the added Effect element.
    */
  def AddEffect(record: RecordHandle, value: String, value2: String, value3: String, value4: String): ElementHandle = js.native
  
  /**
    * Traverses path, creating any elements that are not found.
    * Returns a handle to the element at the end of the path.
    */
  def AddElement(id: Zeroable[Handle], path: String): ElementHandle = js.native
  
  /**
    * Traverses path, creating any elements that are not found.
    * Sets the value of the element at the end of the path to value, and returns a handle to it.
    */
  def AddElementValue(id: Zeroable[Handle], path: String, value: String): ElementHandle = js.native
  
  /**
    * File functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FFiles}
    */
  /**
    * Creates a new file filename.
    * @returns Handle to the file
    */
  def AddFile(filename: String): FileHandle = js.native
  
  /**
    * Adds an item to the `Footstep Sets` array on `record`.
    * @returns Handle to the added Footstep element.
    */
  def AddFootstep(record: Handle, value: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `FormIDs` array on `record`.
    * @returns Handle to the added Form ID element.
    */
  def AddFormID(record: RecordHandle, value: String): ElementHandle = js.native
  
  /**
    * Adds the group `signature` to file `id` if missing and returns a handle to it.
    */
  def AddGroup(id: FileHandle, signature: String): Handle = js.native
  
  /**
    * Adds an item to the `Items` array on `record`,
    * setting `CNTO\Item` to `value`, and `CNTO\Count` to `value2`.
    * @returns Handle to the added Item element.
    */
  def AddItem(record: RecordHandle, value: String, value2: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `Keywords` array on `record`.
    * @returns Handle to the added Keyword element.
    */
  def AddKeyword(record: RecordHandle, value: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `Leveled List Entries` array on `record`,
    * setting `LVLO\Reference` to `value`, `LVLO\Level` to `value2`, and `LVLO\Count` to `value3`.
    * @returns Handle to the added LeveledEntry element.
    */
  def AddLeveledEntry(record: RecordHandle, value: String, value2: String, value3: String): ElementHandle = js.native
  
  /**
    * Adds master `filename` to file `id` if missing.
    */
  def AddMaster(id: FileHandle, filename: String): Unit = js.native
  
  /**
    * Adds an item to the `Music Tracks` array on `record`.
    * @returns Handle to the added Music Track element.
    */
  def AddMusicTrack(record: RecordHandle, value: String): ElementHandle = js.native
  
  /**
    * Adds an value the `Perks` array on `record`,
    * setting `Perk` to `value` and `rank` if provided.
    * @returns Handle to the added Perk element.
    */
  def AddPerk(record: RecordHandle, value: String): ElementHandle = js.native
  def AddPerk(record: RecordHandle, value: String, rank: String): ElementHandle = js.native
  
  /**
    * Adds masters to file `id2` which are required when copying element `id` to it.
    * Set `asNew` to true when copying `id` as a new record.
    */
  def AddRequiredMasters(id: ElementHandle, id2: FileHandle): Unit = js.native
  def AddRequiredMasters(id: ElementHandle, id2: FileHandle, /**
    * @default false
    */
  asNew: Boolean): Unit = js.native
  
  /**
    * Adds an item to the `VMAD\Scripts` array on `record`,
    * setting `scriptName` to `value`, and `Flags` to `value2`.
    * @returns Handle to the added Script element.
    */
  def AddScript(record: RecordHandle, value: String, value2: String): ElementHandle = js.native
  
  /**
    * Adds an item to the `Properties` array on `scriptElement`,
    * setting `propertyName` to `value`, and `CNTO\Count` to `value2`.
    * @returns Handle to the added ScriptProperty element.
    */
  def AddScriptProperty(scriptElement: ElementHandle, value: String, value2: String): ElementHandle = js.native
  
  /**
    * Creates a new archive name in folder containing files at the filePaths relative to folder.
    * Uses archive type archiveType.
    * Compresses the archive if compress is true and packs data if share is true.
    * Pass a hexadecimal integer as a string to af or ff to set custom archive flags or file flags, respectively.
    * @see ArchiveType
    */
  def BuildArchive(
    name: String,
    folder: String,
    filePaths: String,
    archiveType: ArchiveType,
    compress: Boolean,
    share: Boolean,
    af: String,
    ff: String
  ): Unit = js.native
  
  /**
    * Gets all records matching `search` found in `id`
    * and returns an object with properties corresponding to each record found.
    * The object's properties have keys produced by calling `keyFn` on the record
    * and values produced by calling `valueFn` on the record.
    * If `valueFn` is falsy, the record's handle is used as the value.
    */
  def BuildReferenceMap[V](id: Handle): StringDictionary[V] = js.native
  def BuildReferenceMap[V](id: Handle, /**
    * @default ''
    */
  search: String): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: String,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: js.Function1[/* rec */ RecordHandle, String]
  ): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: String,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: js.Function1[/* rec */ RecordHandle, String],
    /**
    * @default null
    */
  valueFn: js.Function1[/* rec */ RecordHandle, V]
  ): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: String,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: Unit,
    /**
    * @default null
    */
  valueFn: js.Function1[/* rec */ RecordHandle, V]
  ): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: Unit,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: js.Function1[/* rec */ RecordHandle, String]
  ): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: Unit,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: js.Function1[/* rec */ RecordHandle, String],
    /**
    * @default null
    */
  valueFn: js.Function1[/* rec */ RecordHandle, V]
  ): StringDictionary[V] = js.native
  def BuildReferenceMap[V](
    id: Handle,
    /**
    * @default ''
    */
  search: Unit,
    /**
    * @default xelib.EditorID
    * @see EditorID
    */
  keyFn: Unit,
    /**
    * @default null
    */
  valueFn: js.Function1[/* rec */ RecordHandle, V]
  ): StringDictionary[V] = js.native
  
  /**
    * Builds referenced by information for the plugin file id.
    * If id is 0 reference information will be built for all loaded plugins.
    */
  def BuildReferences(id: Zeroable[FileHandle], sync: Boolean): Unit = js.native
  
  /**
    * @returns CRC Hash of file id.
    */
  def CRCHash(id: FileHandle): String = js.native
  
  /**
    * Plugin Error functions
    */
  /**
    * Starts a background thread which checks for errors in `id`.
    */
  def CheckForErrors(id: FileHandle): Unit = js.native
  
  /**
    * Masters functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FMasters}
    */
  /**
    * Removes unnecessary masters from file `id`.
    */
  def CleanMasters(id: FileHandle): Unit = js.native
  
  /**
    * Clears all messages from the XEditLib's internal log.
    */
  def ClearMessages(): Unit = js.native
  
  /**
    * Copies element id into id2.
    * Records are copied as overrides if asNew is false.
    * @returns Handle to the copied element.
    */
  def CopyElement(id: ElementHandle, id2: ContainerHandle, asNew: Boolean): ElementHandle = js.native
  
  /**
    * Creates an array in xelib at `xelib.HandleGroup`.
    * All handles retrieved from `xelib` functions will be appended to this array.
    * @see HandleGroup
    */
  def CreateHandleGroup(): Unit = js.native
  
  /**
    * @returns id's element type.
    */
  def DefType(id: ElementHandle): typings.xelib.mod.DefType = js.native
  
  /**
    * @returns the name of id used for display purposes in ZEdit's user interface.
    */
  def DisplayName(id: Handle): String = js.native
  
  /**
    * Record value functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FRecord_Values}
    */
  /**
    * @returns Editor ID of record id.
    * @returns Empty string if the record does not have an editor ID.
    */
  def EditorID(id: RecordHandle): String = js.native
  
  /**
    * Returns the number of element children id has.
    */
  def ElementCount(id: Handle): Double = js.native
  
  /**
    * Returns true if id and id2 refer to the same element.
    */
  def ElementEquals(id: ElementHandle, id2: ElementHandle): Boolean = js.native
  
  /**
    * Creates elements by deserializing `json` in the context of `id` at `path`.
    */
  def ElementFromJSON(id: Zeroable[Handle], path: String, json: String): Unit = js.native
  
  /**
    * Creates elements from `obj` in the context of `id` at `path`.
    */
  def ElementFromObject(id: Zeroable[Handle], path: String, obj: js.Object): Unit = js.native
  
  /**
    * Returns true if the value at path matches value.
    * When the element at path contains a reference, value can be a Form ID, Editor ID, or FULL Name.
    * FULL Names passed to this function must be surrounded by double quotes.
    */
  def ElementMatches(id: Zeroable[Handle], path: String, value: String): Boolean = js.native
  
  /**
    * Serialization functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FSerialization}
    */
  /**
    * @returns Element `id` as a JSON string.
    */
  def ElementToJSON(id: ElementHandle): String = js.native
  
  /**
    * @returns Element `id` as a JavaScript object.
    */
  def ElementToObject(id: ElementHandle): js.Object = js.native
  
  /**
    * @returns the elementType of id.
    */
  def ElementType(id: ElementHandle): typings.xelib.mod.ElementType = js.native
  
  /**
    * Exchanges all references to oldFormID with references to newFormID on record id.
    */
  def ExchangeReferences(id: RecordHandle, oldFormID: Double, newFormID: Double): Unit = js.native
  
  /**
    * Extracts container name to destination, replacing existing files if replace is true.
    * Returns true if the container is extracted successfully.
    */
  def ExtractContainer(name: String, destination: String, replace: Boolean): Boolean = js.native
  
  /**
    * Extracts file source from container name to destination.
    * Returns true if the file is extracted successfully.
    */
  def ExtractFile(name: String, source: String, destination: String): Boolean = js.native
  
  /**
    * Extracts a signature from a string.
    * E.g. extracts `ARMO`, from `ArmorIronCuirass "Iron Armor" [ARMO:00012E49]`.
    */
  def ExtractSignature(str: String): String = js.native
  
  /**
    * Resolves the file with author equal to author and returns a handle to it.
    * Returns 0 if a matching file is not found.
    */
  def FileByAuthor(author: String): Zeroable[FileHandle] = js.native
  
  /**
    * Resolves the file with load order loadOrder and returns a handle to it.
    * Returns 0 if a matching file is not found.
    */
  def FileByLoadOrder(loadOrder: Double): Zeroable[FileHandle] = js.native
  
  /**
    * Resolves the file with name equal to filename and returns a handle to it.
    * Returns 0 if a matching file is not found.
    */
  def FileByName(filename: String): Zeroable[FileHandle] = js.native
  
  /**
    * Finalizes XEditLib.
    * This should be called just before the DLL is unloaded to rename saved files, save logs, and free all memory used by the library.
    */
  def Finalize(): Unit = js.native
  
  /**
    * @returns Next record after id which matches search.
    * @returns 0 if no match is found.
    */
  def FindNextRecord(id: Handle, search: String, byEdid: Boolean, byName: Boolean): Zeroable[RecordHandle] = js.native
  
  /**
    * @returns Previous record after id which matches search.
    * @returns 0 if no match is found.
    */
  def FindPreviousRecord(id: Handle, search: String, byEdid: Boolean, byName: Boolean): Zeroable[RecordHandle] = js.native
  
  /**
    * Excludes results which do not contain search in their LongName.
    * @returns Up to limitTo records matching signature which can be referenced by the file containing id.
    */
  def FindValidReferences(id: FileHandle, signature: String, search: String, limitTo: Double): js.Array[String] = js.native
  
  /**
    * Releases all handles in `xelib.HandleGroup`.
    * After calling this, handles retrieved from xelib
    * will no longer be appended to the `xelib.HandleGroup` array.
    * @see HandleGroup
    */
  def FreeHandleGroup(): Unit = js.native
  
  /**
    * @returns FULL name of record id.
    * @returns Empty string if the record does not have an FULL name.
    */
  def FullName(id: RecordHandle): String = js.native
  
  /**
    * Returns the user's active plugins determined from plugins.txt.
    * Active plugins are returned as a list of filenames separated by \r\n.
    */
  def GetActivePlugins(): String = js.native
  
  /**
    * Returns an array of the signatures that can be added to id.
    */
  def GetAddList(id: Handle): js.Array[String] = js.native
  
  /**
    * Finds the first item in the `Additional Races` array on `record` matching `value`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetAdditionalRace(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Resolves the flags element at path and returns an array of the names of all of the flags it supports.
    * Flag positions in the array indicate the binary bits they corresponds to.
    */
  def GetAllFlags(id: Zeroable[Handle], path: String): js.Array[String] = js.native
  
  /**
    * @returns Array of all signatures id is allowed to reference.
    */
  def GetAllowedSignatures(id: Handle): js.Array[String] = js.native
  
  /**
    * @returns Value at `DNAM` on `record`.
    */
  def GetArmorRating(record: RecordHandle): Double = js.native
  
  /**
    * @returns Value at `[BODT|BOD2]\Armor Type` on `record`.
    */
  def GetArmorType(record: RecordHandle): String = js.native
  
  /**
    * Returns the first item in the array at path which matches value at subpath.
    * Returns 0 if no matching element is found.
    */
  def GetArrayItem(id: Zeroable[Handle], path: String, subpath: String, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * @returns Array of the filenames of files loaded before file `id` that aren't already masters for it.
    */
  def GetAvailableMasters(id: FileHandle): js.Array[String] = js.native
  
  /**
    * @returns true if elements can be added to id.
    */
  def GetCanAdd(id: Handle): Boolean = js.native
  
  /**
    * @returns Handle to the child group of id.
    * @returns 0 if id does not have a child group.
    */
  def GetChildGroup(id: Handle): Zeroable[Handle] = js.native
  
  /**
    * Finds the first item in the `Conditions` array on `record` matching `value` at `CTDA\Function`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetCondition(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  def GetConflictData(nodes: Zeroable[NodeTreeHandle], element: ElementHandle): js.Tuple2[ConflictAll, ConflictThis] = js.native
  @JSName("GetConflictData")
  def GetConflictData_false(nodes: Zeroable[NodeTreeHandle], element: ElementHandle, asString: `false`): js.Tuple2[ConflictAll, ConflictThis] = js.native
  /**
    * Pass a handle for a node tree retrieved using GetNodes for nodes if you plan on calling this function for more than one element from the same record.
    * NOTE: Can be slow for very large records like NAVI.
    * @returns ConflictAll and ConflictThis values for element.
    */
  @JSName("GetConflictData")
  def GetConflictData_true(nodes: Zeroable[NodeTreeHandle], element: ElementHandle, asString: `true`): js.Tuple2[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictAll * / any */ String, 
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictThis * / any */ String
  ] = js.native
  
  /**
    * Returns a handle to the container of id.
    * Returns 0 on failure.
    */
  def GetContainer(id: Handle): Zeroable[ContainerHandle] = js.native
  
  /**
    * Returns an array of the file paths in container name in folder.
    */
  def GetContainerFiles(name: String, folder: String): js.Array[String] = js.native
  
  /**
    * @returns Value at `DATA\Damage` on `record`.
    */
  def GetDamage(record: RecordHandle): Double = js.native
  
  /**
    * Returns an array of the names of all elements that can exist at path.
    */
  def GetDefNames(id: Zeroable[Handle], path: String): js.Array[String] = js.native
  
  /**
    * Finds other handles to a particular interface.
    */
  def GetDuplicateHandles(id: Handle): js.Array[Handle] = js.native
  
  /**
    * Finds the first item in the `Effects` array on `record` matching `value` at `EFID - Base Effect`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetEffect(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Resolves the element at path and returns a handle to it.
    * Returns 0 if the element is not found.
    */
  def GetElement(id: Zeroable[Handle], path: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Returns a handle to the file id belongs to.
    */
  def GetElementFile(id: ElementHandle): FileHandle = js.native
  
  /**
    * Returns an array of handles for all of the elements found in the container at path.
    */
  def GetElements(id: Zeroable[ContainerHandle], path: String): js.Array[ElementHandle] = js.native
  
  /**
    * Resolves the flags element at path and returns an array of the names of the enabled flags on it.
    */
  def GetEnabledFlags(id: Zeroable[Handle], path: String): js.Array[String] = js.native
  
  /**
    * Resolves the enumeration element at path and returns an array of the options it supports.
    * Enumeration positions in the array indicate the binary bits they corresponds to.
    */
  def GetEnumOptions(id: Zeroable[Handle], path: String): js.Array[String] = js.native
  
  /**
    * @returns true if the error thread started by `CheckForErrors` is done.
    * @see CheckForErrors
    */
  def GetErrorThreadDone(): Boolean = js.native
  
  /**
    * @returns Errors found by `CheckForErrors` as an array of error objects.
    * @see CheckForErrors
    */
  def GetErrors(): js.Array[Data] = js.native
  
  /**
    * Returns a message corresponding to the last exception that occurred.
    * Returns an empty string if no exception has occurred since the last time this function was called.
    */
  def GetExceptionMessage(): String = js.native
  
  /**
    * @returns Author of file id.
    */
  def GetFileAuthor(id: FileHandle): String = js.native
  
  /**
    * Returns the name of the container where the winning version of the file path is stored.
    */
  def GetFileContainer(path: String): String = js.native
  
  /**
    * @returns Description of file id.
    */
  def GetFileDescription(id: FileHandle): String = js.native
  
  /**
    * @returns Handle to the file header of file id.
    */
  def GetFileHeader(id: FileHandle): Handle = js.native
  
  /**
    * @returns Load order of file id.
    */
  def GetFileLoadOrder(id: FileHandle): Double = js.native
  
  /**
    * This is equivalent to calling Name(id).
    * @returns File name of file id.
    */
  def GetFileName(id: FileHandle): String = js.native
  
  /**
    * Resolves the flags element at path, and gets the state of flag name.
    */
  def GetFlag(id: Zeroable[Handle], path: String, name: String): Boolean = js.native
  
  /**
    * @returns The native float value at path.
    * @returns 0.0 if path does not exist.
    */
  def GetFloatValue(id: Zeroable[Handle], path: String): Double = js.native
  
  /**
    * Finds the first item in the `Footstep Sets` array on `record` matching `value`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetFootstep(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * @returns Form ID of the record id.
    */
  def GetFormID(id: RecordHandle): Double = js.native
  def GetFormID(id: RecordHandle, native: Boolean): Double = js.native
  def GetFormID(id: RecordHandle, native: Boolean, local: Boolean): Double = js.native
  def GetFormID(id: RecordHandle, native: Unit, local: Boolean): Double = js.native
  /**
    * Finds the first item in the `FormIDs` array on `record` matching `value`.
    * @returns Handle to the element if found, else returns 0.
    */
  // tslint:disable-next-line adjacent-overload-signatures
  def GetFormID(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Retrieves the the language used for gameMode from the game INI file.
    * Returns an empty string if the game INI file cannot be found.
    * @see GameMode
    */
  def GetGameLanguage(gameMode: GameMode): String = js.native
  
  /**
    * Retrieves the path to the game corresponding to gameMode from the registry.
    * Returns an empty string if the game path cannot be found.
    * @see GameMode
    */
  def GetGamePath(gameMode: GameMode): String = js.native
  
  /**
    * Gets the value of a global from the library. Supported globals include:
    *
    * - ProgramPath: The path to the folder containing XEditLib.dll.
    * - Version: The version of XEditLib.dll.
    * - GameName: The short game name associated with the current game mode.
    * - AppName: The abbreviated game name associated with the current game mode.
    * - LongGameName: The full game name associated with the current game mode.
    * - DataPath: The game data path associated with the current game mode.
    * - AppDataPath: The game application data path associated with the current game mode.
    * - MyGamesPath: The my games folder path associated with the current game mode.
    * - GameIniPath: The path to the INI file associated with the current game mode.
    */
  def GetGlobal(key: String): String = js.native
  
  /**
    * Returns a list of name value pairs for all globals.
    * Entries are separated by \r\n, and name value pairs are separated by =.
    */
  def GetGlobals(): String = js.native
  
  /**
    * @returns Value at `DATA\Value` on `record`.
    */
  def GetGoldValue(record: RecordHandle): Double = js.native
  
  /**
    * @returns Form ID of the record id as a hexadecimal string.
    */
  def GetHexFormID(id: RecordHandle): String = js.native
  def GetHexFormID(id: RecordHandle, native: Boolean): String = js.native
  def GetHexFormID(id: RecordHandle, native: Boolean, local: Boolean): String = js.native
  def GetHexFormID(id: RecordHandle, native: Unit, local: Boolean): String = js.native
  
  /**
    * @returns Handle for the file that record id is injected into.
    */
  def GetInjectionTarget(id: RecordHandle): FileHandle = js.native
  
  /**
    * @returns The native integer value at path.
    * @returns 0 if path does not exist.
    */
  def GetIntValye(id: Zeroable[Handle], path: String): Double = js.native
  
  /**
    * @returns State of the ESM flag on file id.
    */
  def GetIsESM(id: FileHandle): Boolean = js.native
  
  /**
    * @returns true if id has can be edited.
    */
  def GetIsEditable(id: Handle): Boolean = js.native
  
  /**
    * @returns State of flag Essential at `ACBS\Flags` on `record`.
    */
  def GetIsEssential(record: RecordHandle): Boolean = js.native
  
  /**
    * @returns State of flag Female at `ACBS\Flags` on `record`.
    */
  def GetIsFemale(record: RecordHandle): Boolean = js.native
  
  /**
    * @returns true if id has been modified during the current session.
    */
  def GetIsModified(id: Handle): Boolean = js.native
  
  /**
    * @returns true if id can be removed.
    */
  def GetIsRemoveable(id: Handle): Boolean = js.native
  
  /**
    * @returns State of flag Unique at `ACBS\Flags` on `record`.
    */
  def GetIsUnique(record: RecordHandle): Boolean = js.native
  
  /**
    * Finds the first item in the `Items` array on `record` matching `value` at `CNTO\Item`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetItem(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Finds the first item in the `Keywords` array on `record` matching `value`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetKeyword(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Finds the first item in the `Leveled List Entries` array on `record` matching `value` at `LVLO\Reference`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetLeveledEntry(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Returns the record referenced by the element at path.
    * Note: this returns the master of the record, not the winning override.
    */
  def GetLinksTo(id: Zeroable[Handle], path: String): RecordHandle = js.native
  
  /**
    * Returns the user's load order determined from loadorder.txt, plugins.txt, or plugin dates depending on the game and available files.
    * The load order is returned as a list of filenames separated by \r\n.
    */
  def GetLoadOrder(): String = js.native
  
  /**
    * Returns an array of the names of the currently loaded containers.
    */
  def GetLoadedContainers(): js.Array[String] = js.native
  
  /**
    * Returns an array of all loaded filenames.
    * Excludes hardcoded files if excludeHardcoded is true.
    */
  def GetLoadedFileNames(excludeHardcoded: Boolean): js.Array[String] = js.native
  
  /**
    * Returns the status of the loader.
    * @see LoaderState
    */
  def GetLoaderStatus(): LoaderState = js.native
  
  /**
    * @returns Array of the master filenames of the file `id`.
    */
  def GetMasterNames(id: FileHandle): js.Array[String] = js.native
  
  /**
    * @returns Handle for the master record of id.
    * @returns New handle to record id if it is a master record.
    */
  def GetMasterRecord(id: RecordHandle): RecordHandle = js.native
  
  /**
    * @returns Array of handles for the master files of file `id`.
    */
  def GetMasters(id: FileHandle): js.Array[FileHandle] = js.native
  
  /**
    * Message functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FMessages}
    */
  /**
    * Gets any messages that have been added to XEditLib's internal log
    * since the last time this function was called.
    */
  def GetMessages(): String = js.native
  
  /**
    * Finds the first item in the `Music Tracks` array on `record` matching `value`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetMusicTrack(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * File value functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FFile_Values}
    */
  /**
    * @returns Next Object ID of file id.
    */
  def GetNextObjecID(id: FileHandle): Double = js.native
  
  /**
    * You must pass a handle for a node tree retrieved using GetNodes to nodes.
    * Note that this is different from xelib.GetElements in that it returns an array with null handles in it as placeholders for unassigned elements.
    * @returns Handles for the element children of element.
    * @see GetNodes
    * @see GetElements
    */
  def GetNodeElements(nodes: NodeTreeHandle, element: ElementHandle): js.Array[Zeroable[ElementHandle]] = js.native
  
  /**
    * The handle returned by this function must be freed with xelib.ReleaseNodes.
    * NOTE: Can be slow for very large records like NAVI.
    * @returns Handle pointing to a node tree for rec.
    * @see ReleaseNodes
    */
  def GetNodes(rec: RecordHandle): NodeTreeHandle = js.native
  
  /**
    * @returns Number of override records in file id.
    */
  def GetOverrideRecordCount(id: FileHandle): Double = js.native
  
  /**
    * @returns Array of handles corresponding to the overrides of record id.
    */
  def GetOverrides(id: RecordHandle): js.Array[RecordHandle] = js.native
  
  /**
    * Finds the first item in the `Perks` array on `record` matching `value` at path `Perk`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetPerk(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * @returns Handle for the winning override of record id in the masters of file id2.
    */
  def GetPreviousOverride(id: RecordHandle, id2: FileHandle): RecordHandle = js.native
  
  /**
    * @returns Array of all REFR records referencing base records with signatures in search found within id.
    * @see GetREFRsOptions
    */
  def GetREFRs(id: Handle, search: String): js.Array[RecordHandle] = js.native
  def GetREFRs(id: Handle, search: String, opts: GetREFRsOptions): js.Array[RecordHandle] = js.native
  
  /**
    * Pass 0 as id and a load order formID to perform a lookup by load order form ID.
    * Pass a file handle as id and a file formID to perform a lookup by native (file) form ID.
    * @returns Handle to the record matching formID in id.
    */
  def GetRecord(id: Zeroable[FileHandle], formID: Double): RecordHandle = js.native
  
  /**
    * @returns Number of records in file id.
    */
  def GetRecordCount(id: FileHandle): Double = js.native
  
  /**
    * Gets the state of record flag name on record id.
    */
  def GetRecordFlag(id: RecordHandle, name: String): Boolean = js.native
  
  /**
    * Pass 0 for id to search all loaded files.
    * @returns Array of all records matching search found in id.
    */
  def GetRecords(id: Zeroable[FileHandle], search: String): js.Array[RecordHandle] = js.native
  def GetRecords(id: Zeroable[FileHandle], search: String, /**
    * @default false
    */
  includeOverrides: Boolean): js.Array[RecordHandle] = js.native
  
  /**
    * References must be built with xelib.BuildReferences to be returned.
    * @returns Array of the records that reference record id.
    */
  def GetReferencedBy(id: RecordHandle): js.Array[RecordHandle] = js.native
  
  /**
    * Finds the first item in the `VMAD\Scripts` array on `record` matching `value` at `scriptName`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetScript(record: RecordHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * Finds the first item in the `Properties` array on `scriptElement` matching `value` at `propertyName`.
    * @returns Handle to the element if found, else returns 0.
    */
  def GetScriptProperty(scriptElement: ElementHandle, value: String): Zeroable[ElementHandle] = js.native
  
  /**
    * @returns true if id is allowed to reference signature.
    */
  def GetSignatureAllowed(id: Handle, signature: String): Boolean = js.native
  
  /**
    * Return the pixel image data for the texture resource resourceName.
    */
  def GetTextureData(resourceName: String): ImageData = js.native
  
  /**
    * @returns The native unsigned integer value at path.
    * @returns 0 if path does not exist.
    */
  def GetUIntValue(id: Zeroable[Handle], path: String): Double = js.native
  
  /**
    * This is the same value displayed in the record view.
    * @returns the editor value at path.
    * @returns an empty string if path does not exist.
    */
  def GetValue(id: Zeroable[Handle], path: String): String = js.native
  
  /**
    * @returns Value at `DATA\Weight` on `record`.
    */
  def GetWeight(record: RecordHandle): Double = js.native
  
  /**
    * @returns Handle for the winning override of record id.
    */
  def GetWinningOverride(id: RecordHandle): RecordHandle = js.native
  
  /**
    * @see CreateHandleGroup
    */
  var HandleGroup: js.UndefOr[js.Array[Handle]] = js.native
  
  /**
    * @returns true if the `Additional Races` array on `record` has an element matching `value`.
    */
  def HasAdditionalRace(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * Returns true if the array at path contains an item which matches value at subpath.
    */
  def HasArrayItem(id: Zeroable[Handle], path: String, subpath: String, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Conditions` array on `record` has an element matching `value` at `CTDA\Function`.
    */
  def HasCondition(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Effects` array on `record` has an element matching `value` at `EFID - Base Effect`.
    */
  def HasEffect(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * Returns true if an element exists at the given path.
    */
  def HasElement(id: Zeroable[Handle], path: String): Boolean = js.native
  
  /**
    * @returns true if the `Footstep Sets` array on `record` has an element matching `value`.
    */
  def HasFootstep(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `FormIDs` array on `record` has an element matching `value`.
    */
  def HasFormID(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * Group functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FGroups}
    */
  /**
    * @returns true if group `signature` is present in file `id`.
    */
  def HasGroup(id: FileHandle, signature: String): Boolean = js.native
  
  /**
    * @returns true if the `Items` array on `record` has an element matching `value` at `CNTO\Item`.
    */
  def HasItem(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Keywords` array on `record` has an element matching `value`.
    */
  def HasKeyword(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Leveled List Entries` array on `record` has an element matching `value` at `LVLO\Reference`.
    */
  def HasLeveledEntry(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Music Tracks` array on `record` has an element matching `value`.
    */
  def HasMusicTrack(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Perks` array on `record` has an element matching `value` at path `Perk`.
    */
  def HasPerk(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `VMAD\Scripts` array on `record` has an element matching `value` at `scriptName`.
    */
  def HasScript(record: RecordHandle, value: String): Boolean = js.native
  
  /**
    * @returns true if the `Properties` array on `scriptElement` has an element matching `value` at `propertyName`.
    */
  def HasScriptProperty(scriptElement: ElementHandle, value: String): Boolean = js.native
  
  /**
    * Utils functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FUtils}
    */
  /**
    * Converts `n` to a hexadecimal string and pads it with zeros until it has a length equal to `padding`.
    * @param n unsigned integer
    * @param padding integer
    */
  def Hex(n: Double, padding: Double): String = js.native
  
  /**
    * Initializes XEditLib.
    * This should be called after the DLL loaded to prepare the library for future function calls.
    *
    * @param dllPath Path to XEditLib.dll
    */
  def Initialize(dllPath: String): Unit = js.native
  
  /**
    * @returns true if id contains flags.
    */
  def IsFlags(id: ElementHandle): Boolean = js.native
  
  /**
    * @returns true if record id is an injected record.
    */
  def IsInjected(id: RecordHandle): Boolean = js.native
  
  /**
    * @returns true if record id is a master record.
    */
  def IsMaster(id: RecordHandle): Boolean = js.native
  
  /**
    * @returns true if record id is an override record.
    */
  def IsOverride(id: RecordHandle): Boolean = js.native
  
  /**
    * @returns true if id is a sorted array.
    */
  def IsSorted(id: ElementHandle): Boolean = js.native
  
  /**
    * @returns true if record id is a winning override record.
    */
  def IsWinningOverride(id: RecordHandle): Boolean = js.native
  
  /**
    * Loads the container at filePath.
    * Returns true if the container is loaded succesfully.
    */
  def LoadContainer(filePath: String): Boolean = js.native
  
  /**
    * Loads the plugin file filename at the next available load order position after currently loaded plugins files.
    * Plugin loading is performed in a background thread, use GetLoaderStatus to track the loader and determine when it is done.
    * @see GetLoaderStatus
    */
  def LoadPlugin(filename: String): Unit = js.native
  
  /**
    * Loads the header of plugin file filename and returns a handle to it.
    * This plugin should be unloaded with UnloadPlugin once you're done with it.
    * Note: Unlike LoadPlugin, this function does not use a background thread.
    * @see UnloadPlugin
    */
  def LoadPluginHeader(filename: String): FileHandle = js.native
  
  /**
    * Loads plugin files in loadOrder.
    * If smartLoad is set to true, master files required by files in loadOrder will be automatically loaded as necessary.
    * Plugin loading is performed in a background thread, use GetLoaderStatus to track the loader and determine when it is done.
    * @see GetLoaderStatus
    */
  def LoadPlugins(loadOrder: String): Unit = js.native
  def LoadPlugins(loadOrder: String, /**
    * @default true
    */
  smartLoad: Boolean): Unit = js.native
  
  /**
    * All paths returned from this function can be used with GetElement.
    * @returns Path of id within its parent record.
    * @see GetElement
    */
  def LocalPath(id: Handle): String = js.native
  
  /**
    * Identical to the Name function from XEdit scripting.
    */
  def LongName(id: Handle): String = js.native
  
  /**
    * All paths returned from this function can be used with GetElement.
    * @returns Fully qualified path to id.
    * @see GetElement
    */
  def LongPath(id: Handle): String = js.native
  
  /**
    * @returns MD5 Hash of file id.
    */
  def MD5Hash(id: FileHandle): String = js.native
  
  /**
    * Moves the array item id to position index.
    */
  def MoveArrayItem(id: ElementHandle, index: Double): Unit = js.native
  
  /**
    * Element value functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FElement_Values}
    */
  /**
    * Note: This is not the same as XEdit's Name function - LongName is.
    * @returns The name of id.
    */
  def Name(id: Handle): String = js.native
  
  /**
    * Removes all records and groups in file id.
    */
  def NukeFile(id: FileHandle): Unit = js.native
  
  /**
    * Executes `callback`.
    * Any handles retrieved from `xelib` in `callback` will not be added to the active handle group.
    */
  def OutsideHandleGroup(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * All paths returned from this function can be used with GetElement.
    * @returns The path to id.
    * @see GetElement
    */
  def Path(id: Handle): String = js.native
  
  /**
    * Releases the input handle if it is allocated.
    */
  def Release(id: Handle): Unit = js.native
  
  /**
    * Releases the input handle if it is allocated.
    * For use with handles returned by GetNodes.
    * @see GetNodes
    */
  def ReleaseNodes(id: Handle): Unit = js.native
  
  /**
    * Removes the first item in the `Additional Races` array on `record` matching `value`.
    */
  def RemoveAdditionalRace(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the array at path which matches value at subpath.
    */
  def RemoveArrayItem(id: Zeroable[Handle], path: String, subpath: String, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Conditions` array on `record` matching `value` at `CTDA\Function`.
    */
  def RemoveCondition(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Effects` array on `record` matching `value` at `EFID - Base Effect`.
    */
  def RemoveEffect(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the element at path if it exists.
    */
  def RemoveElement(id: Zeroable[Handle], path: String): Unit = js.native
  
  /**
    * Removes the element id.
    * If the element cannot be removed it gets its parent container and attempts to remove it.
    * This repeats until the container can be removed or the code reaches a main record.
    */
  def RemoveElementOrParent(id: ElementHandle): Unit = js.native
  
  /**
    * Removes the first item in the `Footstep Sets` array on `record` matching `value`.
    */
  def RemoveFootstep(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `FormIDs` array on `record` matching `value`.
    */
  def RemoveFormID(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Items` array on `record` matching `value` at `CNTO\Item`.
    */
  def RemoveItem(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Keywords` array on `record` matching `value`.
    */
  def RemoveKeyword(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Leveled List Entries` array on `record`
    * matching `value` at `LVLO\Reference`.
    */
  def RemoveLeveledEntry(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Music Tracks` array on `record` matching `value`.
    */
  def RemoveMusicTrack(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Perks` array on `record` matching `value` at `Perk`.
    */
  def RemovePerk(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `VMAD\Scripts` array on `record` matching `value` at `scriptName`.
    */
  def RemoveScript(record: RecordHandle, value: String): Unit = js.native
  
  /**
    * Removes the first item in the `Properties` array on `scriptElement` matching `value` at `propertyName`.
    */
  def RemoveScriptProperty(scriptElement: ElementHandle, value: String): Unit = js.native
  
  /**
    * Renames file id to newFileName.
    */
  def RenameFile(id: FileHandle): Unit = js.native
  
  /**
    * @returns object constructed by mapping each value in the `paths` object
    * to an element resolved relative to `id`.
    */
  def ResolveElements[P /* <: StringDictionary[String] */](id: Handle, paths: P): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: xelib.xelib.Zeroable<xelib.xelib.ElementHandle>} */ js.Any = js.native
  
  /**
    * Raises an exception if any element fails to resolve.
    * @returns object constructed by mapping each value in the `paths` object
    * to an element resolved relative to `id`.
    */
  def ResolveElementsEx[P /* <: StringDictionary[String] */](id: Handle, paths: P): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: xelib.xelib.ElementHandle} */ js.Any = js.native
  
  /**
    * Rotates record id by vector degrees.
    */
  def Rotate(id: RecordHandle, vector: Vector): Unit = js.native
  
  /**
    * Saves file to filePath.
    * Passing an empty string for filePath indicates the file should be saved in the game data folder to {filename}.esp.
    */
  def SaveFile(id: FileHandle, filePath: String): Unit = js.native
  
  /**
    * Sets the value at `DNAM` on `record` to `value`.
    */
  def SetArmorRating(record: RecordHandle, value: Double): Unit = js.native
  
  /**
    * Sets the value at `[BODT|BOD2]\Armor Type` on `record` to `armorType`.
    */
  def SetArmorType(record: RecordHandle, armorType: String): Unit = js.native
  
  /**
    * Sets the value at `DATA\Damage` on `record` to `value`.
    */
  def SetDamage(record: RecordHandle, value: Double): Unit = js.native
  
  /**
    * Assigns id2 to id.
    * This is equivalent to drag and drop.
    */
  def SetElement(id: ElementHandle, id2: ElementHandle): Unit = js.native
  
  /**
    * Resolves the flags element at path and sets the enabled flags to flags.
    * Note: This disables any active flags that are not in flags.
    */
  def SetEnabledFlags(id: Zeroable[Handle], path: String, flags: js.Array[String]): Unit = js.native
  
  /**
    * Sets the author of file id to author.
    */
  def SetFileAuthor(id: FileHandle, author: String): Unit = js.native
  
  /**
    * Sets the description of file id to description.
    */
  def SetFileDescription(id: FileHandle, description: String): Unit = js.native
  
  /**
    * Resolves the flags element at path, and sets flag name to state.
    */
  def SetFlag(id: Zeroable[Handle], path: String, name: String, state: Boolean): Unit = js.native
  
  /**
    * Sets the native float value at path to value.
    */
  def SetFloatValue(id: Zeroable[Handle], path: String, value: Double): Unit = js.native
  
  /**
    * Set the form ID of the record id.
    * @returns Form ID of the record id as a hexadecimal string.
    */
  def SetFormID(id: RecordHandle, newFormID: Double): String = js.native
  def SetFormID(id: RecordHandle, newFormID: Double, native: Boolean): String = js.native
  def SetFormID(id: RecordHandle, newFormID: Double, native: Boolean, fixReferences: Boolean): String = js.native
  def SetFormID(id: RecordHandle, newFormID: Double, native: Unit, fixReferences: Boolean): String = js.native
  
  /**
    * Sets the game mode to gameMode.
    * @see GameMode
    */
  def SetGameMode(gameMode: GameMode): Unit = js.native
  
  /**
    * Sets the game path to be used when loading plugin and resource files to gamePath.
    */
  def SetGamePath(gamePath: String): Unit = js.native
  
  /**
    * Sets the value at `DATA\Value` on `record` to `value`.
    */
  def SetGoldValue(record: RecordHandle, value: Double): Unit = js.native
  
  /**
    * Sets the native integer value at path to value.
    */
  def SetIntValue(id: Zeroable[Handle], path: String, value: Double): Unit = js.native
  
  /**
    * Sets the the state of the ESM flag on file id to state.
    */
  def SetIsESM(id: FileHandle, state: Boolean): Unit = js.native
  
  /**
    * Sets flag Essential at `ACBS\Flags` on `record` to `state`.
    */
  def SetIsEssential(record: RecordHandle, state: Boolean): Unit = js.native
  
  /**
    * Sets flag Female at `ACBS\Flags` on `record` to `state`.
    */
  def SetIsFemale(record: RecordHandle, state: Boolean): Unit = js.native
  
  /**
    * Sets flag Unique at `ACBS\Flags` on `record` to `state`.
    */
  def SetIsUnique(record: RecordHandle, state: Boolean): Unit = js.native
  
  /**
    * Sets the language to be used when loading string files to language.
    */
  def SetLanguage(language: String): Unit = js.native
  
  /**
    * Sets the record referenced by the element at path to id2.
    */
  def SetLinksTo(id: Handle, id2: Zeroable[RecordHandle], path: String): Unit = js.native
  
  /**
    * Sets the Next Object ID of file id to nextObjectID.
    */
  def SetNextObjectID(id: FileHandle, nextObjectID: Double): Unit = js.native
  
  /**
    * Sets record flag name on record id to state.
    */
  def SetRecordFlag(id: RecordHandle, name: String, state: Boolean): Unit = js.native
  
  /**
    * Sets the sort mode to be used by GetElements when the sort argument is set to true.
    * @see GetElements
    * @see SortMode
    */
  def SetSortMode(
    mode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortMode * / any */ String,
    reverse: Boolean
  ): Unit = js.native
  
  /**
    * Sets the native unsigned integer value at path to value.
    */
  def SetUIntValue(id: Zeroable[Handle], path: String, value: Double): Unit = js.native
  
  /**
    * Sets the editor value at path to value.
    * This is the same value displayed in the record view.
    */
  def SetValue(id: Zeroable[Handle], path: String, value: String): Unit = js.native
  
  /**
    * Sets the value at `DATA\Weight` on `record` to `value`.
    */
  def SetWeight(record: RecordHandle, value: Double): Unit = js.native
  
  /**
    * @returns The signature of id.
    */
  def Signature(id: Handle): String = js.native
  
  /**
    * @returns id's definition type.
    */
  def SmashType(id: ElementHandle): typings.xelib.mod.SmashType = js.native
  
  /**
    * @returns The sort key of id.
    */
  def SortKey(id: Handle): String = js.native
  
  /**
    * Orders the masters in file `id` based on the order in which they are loaded.
    */
  def SortMasters(id: FileHandle): Unit = js.native
  
  /**
    * Translates record id by vector.
    */
  def Translate(id: RecordHandle, vector: Vector): Unit = js.native
  
  /**
    * Unloads the plugin file id.
    * Only plugins at the end of the active load order which have not have references built can be unloaded.
    * Plugin headers loaded with LoadPluginHeader can also be unloaded.
    */
  def UnloadPlugin(id: FileHandle): Unit = js.native
  
  /**
    * @returns id's value type.
    */
  def ValueType(id: ElementHandle): typings.xelib.mod.ValueType = js.native
  
  /**
    * Passes `handle` to `callback`, executes it, and then releases `handle`.
    * Uses a try-finally to ensure the handle gets released
    * regardless of any exceptions that occur in `callback`.
    */
  def WithHandle(handle: Handle, callback: js.Function1[/* handle */ Handle, Unit]): Unit = js.native
  
  /**
    * Executes `callback` in a handle group.
    * Any handles retrieved from `xelib` in `callback` will be automatically released
    * once it finishes executing.
    */
  def WithHandleGroup(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Passes `handles` to `callback`, executes it, and then releases `handles`.
    * Uses a try-finally to ensure the handles get released
    * regardless of any exceptions that occur in `callback`.
    */
  def WithHandles(handles: js.Array[Handle], callback: js.Function1[/* handle */ js.Array[Handle], Unit]): Unit = js.native
  
  /**
    * Resource functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FResources}
    */
  /**
    * @see ArchiveType
    */
  var archiveTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArchiveType */ Any = js.native
  
  /**
    * @see ConflictAll
    */
  var conflictAll: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictAll */ Any = js.native
  
  /**
    * Record functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FRecords}
    */
  /**
    * @see ConflictThis
    */
  var conflictThis: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConflictThis */ Any = js.native
  
  /**
    * @see DefType
    */
  var defTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DefType */ Any = js.native
  
  /**
    * Element functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FElements}
    */
  /**
    * @see ElementType
    */
  var elementTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ Any = js.native
  
  /**
    * @see GameMode
    */
  var gameModes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GameMode */ Any = js.native
  
  /**
    * Array of game objects corresponding to each supported game mode.
    */
  var games: js.Array[Game] = js.native
  
  /**
    * Setup functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FSetup}
    */
  /**
    * @see LoaderState
    */
  var loaderStates: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoaderState */ Any = js.native
  
  /**
    * @see SmashType
    */
  var smashTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SmashType */ Any = js.native
  
  /**
    * Meta functions
    * @see {@link https://z-edit.github.io#/docs?t=Development%2FAPIs%2Fxelib%2FMeta}
    */
  /**
    * @see SortMode
    */
  var sortBy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortMode */ Any = js.native
  
  /**
    * @see ValueType
    */
  var valueTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueType */ Any = js.native
}
