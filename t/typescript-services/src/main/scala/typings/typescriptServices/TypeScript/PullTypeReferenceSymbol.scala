package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
class PullTypeReferenceSymbol protected () extends PullTypeSymbol {
  def this(referencedTypeSymbol: PullTypeSymbol) = this()
  var referencedTypeSymbol: PullTypeSymbol = js.native
  def addConstructorTypeParameter(typeParameter: PullTypeParameterSymbol): Unit = js.native
  def addContainedNonMember(nonMember: PullSymbol): Unit = js.native
  def addSpecialization(specializedVersionOfThisType: PullTypeSymbol, substitutingTypes: js.Array[PullTypeSymbol]): Unit = js.native
  def ensureReferencedTypeIsResolved(): Unit = js.native
  def findMember(name: String): PullSymbol = js.native
  def getReferencedTypeSymbol(): PullTypeSymbol = js.native
  def getSpecialization(substitutingTypes: js.Array[PullTypeSymbol]): PullTypeSymbol = js.native
  def invalidate(): Unit = js.native
}

/* static members */
@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
object PullTypeReferenceSymbol extends js.Object {
  def createTypeReference(`type`: PullTypeSymbol): PullTypeReferenceSymbol = js.native
}

