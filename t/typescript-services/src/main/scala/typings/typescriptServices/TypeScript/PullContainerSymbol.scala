package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
class PullContainerSymbol protected () extends PullTypeSymbol {
  def this(name: String, kind: PullElementKind) = this()
  var assignedContainer: js.Any = js.native
  var assignedType: js.Any = js.native
  var assignedValue: js.Any = js.native
  var instanceSymbol: PullSymbol = js.native
  def getExportAssignedContainerSymbol(): PullContainerSymbol = js.native
  def getExportAssignedTypeSymbol(): PullTypeSymbol = js.native
  def getExportAssignedValueSymbol(): PullSymbol = js.native
  def getInstanceSymbol(): PullSymbol = js.native
  def getInstanceType(): PullTypeSymbol = js.native
  def hasExportAssignment(): Boolean = js.native
  def setExportAssignedContainerSymbol(container: PullContainerSymbol): Unit = js.native
  def setExportAssignedTypeSymbol(`type`: PullTypeSymbol): Unit = js.native
  def setExportAssignedValueSymbol(symbol: PullSymbol): Unit = js.native
  def setInstanceSymbol(symbol: PullSymbol): Unit = js.native
}

/* static members */
@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
object PullContainerSymbol extends js.Object {
  def usedAsSymbol(containerSymbol: PullSymbol, symbol: PullSymbol): Boolean = js.native
}

