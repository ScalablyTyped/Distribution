package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeAliasSymbol
  extends StObject
     with PullTypeSymbol {
  
  /* private */ var _assignedContainer: Any = js.native
  
  /* private */ var _assignedType: Any = js.native
  
  /* private */ var _assignedValue: Any = js.native
  
  /* private */ var _isUsedAsValue: Any = js.native
  
  /* private */ var _isUsedInExportAlias: Any = js.native
  
  /* private */ var _typeUsedExternally: Any = js.native
  
  def addLinkedAliasSymbol(contingentValueSymbol: PullTypeAliasSymbol): Unit = js.native
  
  def assignedContainer(): PullContainerSymbol = js.native
  
  def assignedType(): PullTypeSymbol = js.native
  
  def assignedValue(): PullSymbol = js.native
  
  def findMember(name: String): PullSymbol = js.native
  
  def getExportAssignedContainerSymbol(): PullContainerSymbol = js.native
  
  def getExportAssignedTypeSymbol(): PullTypeSymbol = js.native
  
  def getExportAssignedValueSymbol(): PullSymbol = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  def isUsedAsValue(): Boolean = js.native
  
  def isUsedInExportedAlias(): Boolean = js.native
  
  /* private */ var linkedAliasSymbols: Any = js.native
  
  /* private */ var retrievingExportAssignment: Any = js.native
  
  def setAssignedContainerSymbol(container: PullContainerSymbol): Unit = js.native
  
  def setAssignedTypeSymbol(`type`: PullTypeSymbol): Unit = js.native
  
  def setAssignedValueSymbol(symbol: PullSymbol): Unit = js.native
  
  def setIsUsedAsValue(): Unit = js.native
  
  def setIsUsedInExportedAlias(): Unit = js.native
  
  def setTypeUsedExternally(): Unit = js.native
  
  def typeUsedExternally(): Boolean = js.native
}
