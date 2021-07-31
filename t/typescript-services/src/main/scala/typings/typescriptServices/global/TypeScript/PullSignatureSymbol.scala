package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullSignatureSymbol {
  def this(kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
  def this(kind: typings.typescriptServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullSignatureSymbol {
  
  @JSGlobal("TypeScript.PullSignatureSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getSignatureTypeMemberName(
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureTypeMemberName")(candidateSignature.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  
  /* static member */
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Boolean
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Boolean,
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: Unit,
    getPrettyTypeName: Unit,
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
  @scala.inline
  def getSignaturesTypeNameEx(
    signatures: js.Array[typings.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Unit,
    candidateSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typings.typescriptServices.TypeScript.MemberName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignaturesTypeNameEx")(signatures.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], shortform.asInstanceOf[js.Any], brackets.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getPrettyTypeName.asInstanceOf[js.Any], candidateSignature.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.MemberName]]
}
