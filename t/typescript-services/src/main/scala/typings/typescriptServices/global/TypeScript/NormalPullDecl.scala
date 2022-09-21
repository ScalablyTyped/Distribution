package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IIndexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.NormalPullDecl")
@js.native
open class NormalPullDecl protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.NormalPullDecl {
  def this(
    declName: String,
    displayName: String,
    kind: typings.typescriptServices.TypeScript.PullElementKind,
    declFlags: typings.typescriptServices.TypeScript.PullElementFlags,
    parentDecl: typings.typescriptServices.TypeScript.PullDecl
  ) = this()
  def this(
    declName: String,
    displayName: String,
    kind: typings.typescriptServices.TypeScript.PullElementKind,
    declFlags: typings.typescriptServices.TypeScript.PullElementFlags,
    parentDecl: typings.typescriptServices.TypeScript.PullDecl,
    addToParent: Boolean
  ) = this()
  
  /* CompleteClass */
  override def _getEnclosingDeclFromParentDecl(): typings.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  var _rootDecl: typings.typescriptServices.TypeScript.RootPullDecl = js.native
  
  /* CompleteClass */
  override def addChildDecl(childDecl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def addVariableDeclToGroup(decl: typings.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def ast(): typings.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  var childDeclNamespaceCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclTypeCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclTypeParameterCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclValueCache: IIndexable[js.Array[typings.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* private */ /* CompleteClass */
  var childDecls: Any = js.native
  
  /* private */ /* CompleteClass */
  var containerDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var declDisplayName: Any = js.native
  
  /* private */ /* CompleteClass */
  var declGroups: Any = js.native
  
  /* CompleteClass */
  var declID: Double = js.native
  
  /* CompleteClass */
  override def ensureSymbolIsBound(): Unit = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  var flags: typings.typescriptServices.TypeScript.PullElementFlags = js.native
  
  /* private */ /* CompleteClass */
  override def getChildDeclCache(declKind: Any): Any = js.native
  
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
  var kind: typings.typescriptServices.TypeScript.PullElementKind = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* private */ /* CompleteClass */
  var parentDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var parentPath: Any = js.native
  
  /* CompleteClass */
  override def searchChildDecls(declName: String, searchKind: typings.typescriptServices.TypeScript.PullElementKind): js.Array[typings.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  var semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain = js.native
  
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
  
  /* private */ /* CompleteClass */
  var synthesizedValDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var typeParameters: Any = js.native
}
