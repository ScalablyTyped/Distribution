package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullDecl")
@js.native
class PullDecl protected () extends js.Object {
  def this(
    declName: String,
    displayName: String,
    kind: PullElementKind,
    declFlags: PullElementFlags,
    semanticInfoChain: SemanticInfoChain
  ) = this()
  var childDeclNamespaceCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclTypeCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDeclValueCache: IIndexable[js.Array[PullDecl]] = js.native
  var childDecls: js.Any = js.native
  var containerDecl: js.Any = js.native
  var declDisplayName: js.Any = js.native
  var declGroups: js.Any = js.native
  var declID: Double = js.native
  var flags: PullElementFlags = js.native
  var kind: PullElementKind = js.native
  var name: String = js.native
  var semanticInfoChain: SemanticInfoChain = js.native
  var synthesizedValDecl: js.Any = js.native
  var typeParameters: js.Any = js.native
  def _getEnclosingDeclFromParentDecl(): PullDecl = js.native
  def addChildDecl(childDecl: PullDecl): Unit = js.native
  def addVariableDeclToGroup(decl: PullDecl): Unit = js.native
  def ast(): AST = js.native
  def ensureSymbolIsBound(): Unit = js.native
  def fileName(): String = js.native
  /* private */ def getChildDeclCache(declKind: js.Any): js.Any = js.native
  def getChildDecls(): js.Array[PullDecl] = js.native
  def getContainerDecl(): PullDecl = js.native
  def getDisplayName(): String = js.native
  def getEnclosingDecl(): PullDecl = js.native
  def getParentDecl(): PullDecl = js.native
  def getParentPath(): js.Array[PullDecl] = js.native
  def getSignatureSymbol(): PullSignatureSymbol = js.native
  def getSymbol(): PullSymbol = js.native
  def getTypeParameters(): js.Array[PullDecl] = js.native
  def getValueDecl(): PullDecl = js.native
  def getVariableDeclGroups(): js.Array[js.Array[PullDecl]] = js.native
  def hasBeenBound(): Boolean = js.native
  def hasSignatureSymbol(): Boolean = js.native
  def hasSymbol(): Boolean = js.native
  def isExternalModule(): Boolean = js.native
  def isRootDecl(): Unit = js.native
  def isSynthesized(): Boolean = js.native
  def searchChildDecls(declName: String, searchKind: PullElementKind): js.Array[PullDecl] = js.native
  def setFlag(flags: PullElementFlags): Unit = js.native
  def setFlags(flags: PullElementFlags): Unit = js.native
  def setSignatureSymbol(signatureSymbol: PullSignatureSymbol): Unit = js.native
  def setSymbol(symbol: PullSymbol): Unit = js.native
  def setValueDecl(valDecl: PullDecl): Unit = js.native
}

