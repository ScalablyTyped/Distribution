package typings.webpack.mod

import typings.std.Set
import typings.webpack.anon.OtherCanMangleProvide
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportsInfo extends StObject {
  
  val exports: js.Iterable[ExportInfo] = js.native
  
  def getExportInfo(name: String): ExportInfo = js.native
  
  def getNestedExportsInfo(): js.UndefOr[ExportsInfo] = js.native
  def getNestedExportsInfo(name: js.Array[String]): js.UndefOr[ExportsInfo] = js.native
  
  def getOwnExportInfo(name: String): ExportInfo = js.native
  
  def getProvidedExports(): Null | `true` | js.Array[String] = js.native
  
  def getReadOnlyExportInfo(name: String): ExportInfo = js.native
  
  def getReadOnlyExportInfoRecursive(name: js.Array[String]): js.UndefOr[ExportInfo] = js.native
  
  def getRelevantExports(runtime: RuntimeSpec): js.Array[ExportInfo] = js.native
  
  def getRestoreProvidedData(): Any = js.native
  
  def getUsageKey(runtime: RuntimeSpec): String = js.native
  
  def getUsed(name: String, runtime: RuntimeSpec): UsageStateType = js.native
  def getUsed(name: js.Array[String], runtime: RuntimeSpec): UsageStateType = js.native
  
  def getUsedExports(runtime: RuntimeSpec): Null | Boolean | SortableSet[String] = js.native
  
  def getUsedName(name: String, runtime: RuntimeSpec): String | `false` | js.Array[String] = js.native
  def getUsedName(name: js.Array[String], runtime: RuntimeSpec): String | `false` | js.Array[String] = js.native
  
  def isEquallyUsed(runtimeA: RuntimeSpec, runtimeB: RuntimeSpec): Boolean = js.native
  
  def isExportProvided(name: String): js.UndefOr[Null | Boolean] = js.native
  def isExportProvided(name: js.Array[String]): js.UndefOr[Null | Boolean] = js.native
  
  def isModuleUsed(runtime: RuntimeSpec): Boolean = js.native
  
  def isUsed(runtime: RuntimeSpec): Boolean = js.native
  
  val orderedExports: js.Iterable[ExportInfo] = js.native
  
  val orderedOwnedExports: js.Iterable[ExportInfo] = js.native
  
  val otherExportsInfo: ExportInfo = js.native
  
  val ownedExports: js.Iterable[ExportInfo] = js.native
  
  def restoreProvided(__0: OtherCanMangleProvide): Unit = js.native
  
  def setAllKnownExportsUsed(runtime: RuntimeSpec): Boolean = js.native
  
  def setHasProvideInfo(): Unit = js.native
  
  def setHasUseInfo(): Unit = js.native
  
  def setRedirectNamedTo(): Boolean = js.native
  def setRedirectNamedTo(exportsInfo: Any): Boolean = js.native
  
  def setUnknownExportsProvided(): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Unit, targetKey: Any): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Unit, targetKey: Any, targetModule: Unit, priority: Double): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Unit, targetKey: Any, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Unit,
    targetKey: Any,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Unit, targetKey: Unit, targetModule: Unit, priority: Double): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Unit, targetKey: Unit, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Unit,
    targetKey: Unit,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Set[String]): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Boolean, excludeExports: Set[String], targetKey: Any): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Any,
    targetModule: Unit,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Any,
    targetModule: ModuleGraphConnection
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Any,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Unit,
    targetModule: Unit,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Unit,
    targetModule: ModuleGraphConnection
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Boolean,
    excludeExports: Set[String],
    targetKey: Unit,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Unit, targetKey: Any): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Unit, targetKey: Any, targetModule: Unit, priority: Double): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Unit, targetKey: Any, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Unit,
    excludeExports: Unit,
    targetKey: Any,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Unit, targetKey: Unit, targetModule: Unit, priority: Double): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Unit, targetKey: Unit, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Unit,
    excludeExports: Unit,
    targetKey: Unit,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Set[String]): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Set[String], targetKey: Any): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Set[String], targetKey: Any, targetModule: Unit, priority: Double): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Set[String], targetKey: Any, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Unit,
    excludeExports: Set[String],
    targetKey: Any,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Unit,
    excludeExports: Set[String],
    targetKey: Unit,
    targetModule: Unit,
    priority: Double
  ): Boolean = js.native
  def setUnknownExportsProvided(canMangle: Unit, excludeExports: Set[String], targetKey: Unit, targetModule: ModuleGraphConnection): Boolean = js.native
  def setUnknownExportsProvided(
    canMangle: Unit,
    excludeExports: Set[String],
    targetKey: Unit,
    targetModule: ModuleGraphConnection,
    priority: Double
  ): Boolean = js.native
  
  def setUsedForSideEffectsOnly(runtime: RuntimeSpec): Boolean = js.native
  
  def setUsedInUnknownWay(runtime: RuntimeSpec): Boolean = js.native
  
  def setUsedWithoutInfo(runtime: RuntimeSpec): Boolean = js.native
  
  def updateHash(hash: Hash, runtime: RuntimeSpec): Unit = js.native
}
