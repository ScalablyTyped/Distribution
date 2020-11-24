package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeReferenceSymbol extends PullTypeSymbol {
  
  def addConstructorTypeParameter(typeParameter: PullTypeParameterSymbol): Unit = js.native
  
  def addContainedNonMember(nonMember: PullSymbol): Unit = js.native
  
  def addSpecialization(specializedVersionOfThisType: PullTypeSymbol, substitutingTypes: js.Array[PullTypeSymbol]): Unit = js.native
  
  def ensureReferencedTypeIsResolved(): Unit = js.native
  
  def findMember(name: String): PullSymbol = js.native
  
  def getReferencedTypeSymbol(): PullTypeSymbol = js.native
  
  def getSpecialization(substitutingTypes: js.Array[PullTypeSymbol]): PullTypeSymbol = js.native
  
  def invalidate(): Unit = js.native
  
  var referencedTypeSymbol: PullTypeSymbol = js.native
}
