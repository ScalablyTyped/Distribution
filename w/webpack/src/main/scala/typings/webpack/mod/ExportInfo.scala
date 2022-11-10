package typings.webpack.mod

import typings.webpack.anon.Export
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`no provided info`
import typings.webpack.webpackStrings.`not provided`
import typings.webpack.webpackStrings.provided
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportInfo extends StObject {
  
  def canMangle: Boolean = js.native
  
  /**
  	 * true: it can be mangled
  	 * false: is can not be mangled
  	 * undefined: it was not determined if it can be mangled
  	 */
  var canMangleProvide: js.UndefOr[Boolean] = js.native
  
  /**
  	 * true: it can be mangled
  	 * false: is can not be mangled
  	 * undefined: it was not determined if it can be mangled
  	 */
  var canMangleUse: js.UndefOr[Boolean] = js.native
  
  def createNestedExportsInfo(): js.UndefOr[ExportsInfo] = js.native
  
  var exportsInfo: js.UndefOr[ExportsInfo] = js.native
  
  var exportsInfoOwned: Boolean = js.native
  
  def findTarget(moduleGraph: ModuleGraph, validTargetModuleFilter: js.Function1[/* arg0 */ Module, Boolean]): js.UndefOr[`false` | Export] = js.native
  
  def getNestedExportsInfo(): js.UndefOr[ExportsInfo] = js.native
  
  def getProvidedInfo(): (`no provided info`) | (/* maybe provided (runtime-defined) */ String) | provided | (`not provided`) = js.native
  
  def getRenameInfo(): String = js.native
  
  def getTarget(moduleGraph: ModuleGraph): js.UndefOr[Export] = js.native
  def getTarget(moduleGraph: ModuleGraph, resolveTargetFilter: js.Function1[/* arg0 */ Export, Boolean]): js.UndefOr[Export] = js.native
  
  def getTerminalBinding(moduleGraph: ModuleGraph): js.UndefOr[ExportsInfo | ExportInfo] = js.native
  def getTerminalBinding(moduleGraph: ModuleGraph, resolveTargetFilter: js.Function1[/* arg0 */ Export, Boolean]): js.UndefOr[ExportsInfo | ExportInfo] = js.native
  
  def getUsed(runtime: RuntimeSpec): UsageStateType = js.native
  
  def getUsedInfo(): String = js.native
  
  def getUsedName(fallbackName: String, runtime: RuntimeSpec): String | `false` = js.native
  /**
  	 * get used name
  	 */
  def getUsedName(fallbackName: Unit, runtime: RuntimeSpec): String | `false` = js.native
  
  def hasInfo(): Boolean = js.native
  def hasInfo(baseInfo: Any): Boolean = js.native
  def hasInfo(baseInfo: Any, runtime: Any): Boolean = js.native
  def hasInfo(baseInfo: Unit, runtime: Any): Boolean = js.native
  
  def hasUsedName(): Boolean = js.native
  
  def isReexport(): js.UndefOr[Boolean] = js.native
  
  /**
  	 * Move the target forward as long resolveTargetFilter is fulfilled
  	 */
  def moveTarget(moduleGraph: ModuleGraph, resolveTargetFilter: js.Function1[/* arg0 */ Export, Boolean]): js.UndefOr[Export] = js.native
  def moveTarget(
    moduleGraph: ModuleGraph,
    resolveTargetFilter: js.Function1[/* arg0 */ Export, Boolean],
    updateOriginalConnection: js.Function1[/* arg0 */ Export, ModuleGraphConnection]
  ): js.UndefOr[Export] = js.native
  
  var name: String = js.native
  
  /**
  	 * true: it is provided
  	 * false: it is not provided
  	 * null: only the runtime knows if it is provided
  	 * undefined: it was not determined if it is provided
  	 */
  var provided: js.UndefOr[Null | Boolean] = js.native
  
  def setHasUseInfo(): Unit = js.native
  
  def setTarget(key: Any, connection: ModuleGraphConnection): Boolean = js.native
  def setTarget(key: Any, connection: ModuleGraphConnection, exportName: js.Array[String]): Boolean = js.native
  def setTarget(key: Any, connection: ModuleGraphConnection, exportName: js.Array[String], priority: Double): Boolean = js.native
  def setTarget(key: Any, connection: ModuleGraphConnection, exportName: Unit, priority: Double): Boolean = js.native
  
  def setUsed(newValue: UsageStateType, runtime: RuntimeSpec): Boolean = js.native
  
  def setUsedConditionally(
    condition: js.Function1[/* arg0 */ UsageStateType, Boolean],
    newValue: UsageStateType,
    runtime: RuntimeSpec
  ): Boolean = js.native
  
  def setUsedInUnknownWay(runtime: RuntimeSpec): Boolean = js.native
  
  /**
  	 * Sets the mangled name of this export
  	 */
  def setUsedName(name: String): Unit = js.native
  
  def setUsedWithoutInfo(runtime: RuntimeSpec): Boolean = js.native
  
  /**
  	 * is the export a terminal binding that should be checked for export star conflicts
  	 */
  var terminalBinding: Boolean = js.native
  
  def unsetTarget(): Boolean = js.native
  def unsetTarget(key: Any): Boolean = js.native
  
  def updateHash(): Unit = js.native
  def updateHash(hash: Any): Unit = js.native
  def updateHash(hash: Any, runtime: Any): Unit = js.native
  def updateHash(hash: Unit, runtime: Any): Unit = js.native
}
