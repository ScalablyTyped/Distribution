package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IIndexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "RootPullDecl")
@js.native
class RootPullDecl protected ()
  extends typings.typescriptServices.TypeScript.RootPullDecl {
  def this(
    name: String,
    fileName: String,
    kind: typings.typescriptServices.TypeScript.PullElementKind,
    declFlags: typings.typescriptServices.TypeScript.PullElementFlags,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    isExternalModule: Boolean
  ) = this()
  /* CompleteClass */
  override var _fileName: js.Any = js.native
  /* CompleteClass */
  override var _isExternalModule: js.Any = js.native
  /* CompleteClass */
  override var childDeclNamespaceCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclTypeCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclTypeParameterCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDeclValueCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override var childDecls: js.Any = js.native
  /* CompleteClass */
  override var containerDecl: js.Any = js.native
  /* CompleteClass */
  override var declDisplayName: js.Any = js.native
  /* CompleteClass */
  override var declGroups: js.Any = js.native
  /* CompleteClass */
  override var declID: Double = js.native
  /* CompleteClass */
  override var flags: typings.typescriptServices.TypeScript.PullElementFlags = js.native
  /* CompleteClass */
  override var kind: typings.typescriptServices.TypeScript.PullElementKind = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain = js.native
  /* CompleteClass */
  override var synthesizedValDecl: js.Any = js.native
  /* CompleteClass */
  override var typeParameters: js.Any = js.native
  /* CompleteClass */
  override def _getEnclosingDeclFromParentDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def addChildDecl(childDecl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  /* CompleteClass */
  override def addVariableDeclToGroup(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  /* CompleteClass */
  override def ast(): typings.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def ensureSymbolIsBound(): Unit = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  /* private */ override def getChildDeclCache(declKind: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getChildDecls(): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getContainerDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getDisplayName(): String = js.native
  /* CompleteClass */
  override def getEnclosingDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getParentDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getParentPath(): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getSignatureSymbol(): typings.typescriptServices.TypeScript.PullSignatureSymbol = js.native
  /* CompleteClass */
  override def getSymbol(): typings.typescriptServices.TypeScript.PullSymbol = js.native
  /* CompleteClass */
  override def getTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def getValueDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  /* CompleteClass */
  override def getVariableDeclGroups(): js.Array[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  /* CompleteClass */
  override def hasBeenBound(): Boolean = js.native
  /* CompleteClass */
  override def hasSignatureSymbol(): Boolean = js.native
  /* CompleteClass */
  override def hasSymbol(): Boolean = js.native
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  /* CompleteClass */
  override def isRootDecl(): Unit = js.native
  /* CompleteClass */
  override def isSynthesized(): Boolean = js.native
  /* CompleteClass */
  override def searchChildDecls(declName: String, searchKind: typings.typescriptServices.TypeScript.PullElementKind): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  /* CompleteClass */
  override def setFlag(flags: typings.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  /* CompleteClass */
  override def setFlags(flags: typings.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  /* CompleteClass */
  override def setSignatureSymbol(signatureSymbol: typings.typescriptServices.TypeScript.PullSignatureSymbol): Unit = js.native
  /* CompleteClass */
  override def setSymbol(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  /* CompleteClass */
  override def setValueDecl(valDecl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
}

