package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeAliasSymbol")
@js.native
class PullTypeAliasSymbol protected () extends PullTypeSymbol {
  def this(name: java.lang.String) = this()
  var _assignedContainer: js.Any = js.native
  var _assignedType: js.Any = js.native
  var _assignedValue: js.Any = js.native
  var _isUsedAsValue: js.Any = js.native
  var _isUsedInExportAlias: js.Any = js.native
  var _typeUsedExternally: js.Any = js.native
  var linkedAliasSymbols: js.Any = js.native
  var retrievingExportAssignment: js.Any = js.native
  def addLinkedAliasSymbol(contingentValueSymbol: PullTypeAliasSymbol): scala.Unit = js.native
  def assignedContainer(): PullContainerSymbol = js.native
  def assignedType(): PullTypeSymbol = js.native
  def assignedValue(): PullSymbol = js.native
  def findMember(name: java.lang.String): PullSymbol = js.native
  def getExportAssignedContainerSymbol(): PullContainerSymbol = js.native
  def getExportAssignedTypeSymbol(): PullTypeSymbol = js.native
  def getExportAssignedValueSymbol(): PullSymbol = js.native
  def isUsedAsValue(): scala.Boolean = js.native
  def isUsedInExportedAlias(): scala.Boolean = js.native
  def setAssignedContainerSymbol(container: PullContainerSymbol): scala.Unit = js.native
  def setAssignedTypeSymbol(`type`: PullTypeSymbol): scala.Unit = js.native
  def setAssignedValueSymbol(symbol: PullSymbol): scala.Unit = js.native
  def setIsUsedAsValue(): scala.Unit = js.native
  def setIsUsedInExportedAlias(): scala.Unit = js.native
  def setTypeUsedExternally(): scala.Unit = js.native
  def typeUsedExternally(): scala.Boolean = js.native
}

