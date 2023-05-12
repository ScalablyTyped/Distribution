package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
  def addChild(): Unit = js.native
  def addChild(child: Any): Unit = js.native
  
  var children: js.UndefOr[Set[Snapshot]] = js.native
  
  var contextHashes: js.UndefOr[Map[String, Null | String]] = js.native
  
  var contextTimestamps: js.UndefOr[Map[String, Null | ResolvedContextFileSystemInfoEntry]] = js.native
  
  var contextTshs: js.UndefOr[Map[String, Null | ResolvedContextTimestampAndHash]] = js.native
  
  def deserialize(__0: ObjectDeserializerContext): Unit = js.native
  
  var fileHashes: js.UndefOr[Map[String, Null | String]] = js.native
  
  var fileTimestamps: js.UndefOr[Map[String, Null | FileSystemInfoEntry]] = js.native
  
  var fileTshs: js.UndefOr[Map[String, Null | String | TimestampAndHash]] = js.native
  
  def getContextIterable(): js.Iterable[String] = js.native
  
  def getFileIterable(): js.Iterable[String] = js.native
  
  def getMissingIterable(): js.Iterable[String] = js.native
  
  def hasChildren(): Boolean = js.native
  
  def hasContextHashes(): Boolean = js.native
  
  def hasContextTimestamps(): Boolean = js.native
  
  def hasContextTshs(): Boolean = js.native
  
  def hasFileHashes(): Boolean = js.native
  
  def hasFileTimestamps(): Boolean = js.native
  
  def hasFileTshs(): Boolean = js.native
  
  def hasManagedContexts(): Boolean = js.native
  
  def hasManagedFiles(): Boolean = js.native
  
  def hasManagedItemInfo(): Boolean = js.native
  
  def hasManagedMissing(): Boolean = js.native
  
  def hasMissingExistence(): Boolean = js.native
  
  def hasStartTime(): Boolean = js.native
  
  var managedContexts: js.UndefOr[Set[String]] = js.native
  
  var managedFiles: js.UndefOr[Set[String]] = js.native
  
  var managedItemInfo: js.UndefOr[Map[String, String]] = js.native
  
  var managedMissing: js.UndefOr[Set[String]] = js.native
  
  var missingExistence: js.UndefOr[Map[String, Boolean]] = js.native
  
  def serialize(__0: ObjectSerializerContext): Unit = js.native
  
  def setChildren(): Unit = js.native
  def setChildren(value: Any): Unit = js.native
  
  def setContextHashes(): Unit = js.native
  def setContextHashes(value: Any): Unit = js.native
  
  def setContextTimestamps(): Unit = js.native
  def setContextTimestamps(value: Any): Unit = js.native
  
  def setContextTshs(): Unit = js.native
  def setContextTshs(value: Any): Unit = js.native
  
  def setFileHashes(): Unit = js.native
  def setFileHashes(value: Any): Unit = js.native
  
  def setFileTimestamps(): Unit = js.native
  def setFileTimestamps(value: Any): Unit = js.native
  
  def setFileTshs(): Unit = js.native
  def setFileTshs(value: Any): Unit = js.native
  
  def setManagedContexts(): Unit = js.native
  def setManagedContexts(value: Any): Unit = js.native
  
  def setManagedFiles(): Unit = js.native
  def setManagedFiles(value: Any): Unit = js.native
  
  def setManagedItemInfo(): Unit = js.native
  def setManagedItemInfo(value: Any): Unit = js.native
  
  def setManagedMissing(): Unit = js.native
  def setManagedMissing(value: Any): Unit = js.native
  
  def setMergedStartTime(): Unit = js.native
  def setMergedStartTime(value: Any): Unit = js.native
  def setMergedStartTime(value: Any, snapshot: Any): Unit = js.native
  def setMergedStartTime(value: Unit, snapshot: Any): Unit = js.native
  
  def setMissingExistence(): Unit = js.native
  def setMissingExistence(value: Any): Unit = js.native
  
  def setStartTime(): Unit = js.native
  def setStartTime(value: Any): Unit = js.native
  
  var startTime: js.UndefOr[Double] = js.native
}
