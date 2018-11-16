package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
class PullTypeReferenceSymbol protected () extends PullTypeSymbol {
  def this(referencedTypeSymbol: PullTypeSymbol) = this()
  var referencedTypeSymbol: PullTypeSymbol = js.native
  def addConstructorTypeParameter(typeParameter: PullTypeParameterSymbol): scala.Unit = js.native
  def addContainedNonMember(nonMember: PullSymbol): scala.Unit = js.native
  def addSpecialization(specializedVersionOfThisType: PullTypeSymbol, substitutingTypes: js.Array[PullTypeSymbol]): scala.Unit = js.native
  def ensureReferencedTypeIsResolved(): scala.Unit = js.native
  def findMember(name: java.lang.String): PullSymbol = js.native
  def getReferencedTypeSymbol(): PullTypeSymbol = js.native
  def getSpecialization(substitutingTypes: js.Array[PullTypeSymbol]): PullTypeSymbol = js.native
  def invalidate(): scala.Unit = js.native
}

@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
object PullTypeReferenceSymbol extends js.Object {
  def createTypeReference(`type`: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol): typescriptDashServicesLib.TypeScriptNs.PullTypeReferenceSymbol = js.native
}

