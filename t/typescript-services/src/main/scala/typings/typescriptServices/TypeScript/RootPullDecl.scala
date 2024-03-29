package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootPullDecl
  extends StObject
     with PullDecl {
  
  /* private */ var _fileName: Any
  
  /* private */ var _isExternalModule: Any
}
object RootPullDecl {
  
  inline def apply(
    _fileName: Any,
    _getEnclosingDeclFromParentDecl: () => PullDecl,
    _isExternalModule: Any,
    addChildDecl: PullDecl => Unit,
    addVariableDeclToGroup: PullDecl => Unit,
    ast: () => AST,
    childDeclNamespaceCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]],
    childDeclValueCache: IIndexable[js.Array[PullDecl]],
    childDecls: Any,
    containerDecl: Any,
    declDisplayName: Any,
    declGroups: Any,
    declID: Double,
    ensureSymbolIsBound: () => Unit,
    fileName: () => String,
    flags: PullElementFlags,
    getChildDeclCache: Any => Any,
    getChildDecls: () => js.Array[PullDecl],
    getContainerDecl: () => PullDecl,
    getDisplayName: () => String,
    getEnclosingDecl: () => PullDecl,
    getParentDecl: () => PullDecl,
    getParentPath: () => js.Array[PullDecl],
    getSignatureSymbol: () => PullSignatureSymbol,
    getSymbol: () => PullSymbol,
    getTypeParameters: () => js.Array[PullDecl],
    getValueDecl: () => PullDecl,
    getVariableDeclGroups: () => js.Array[js.Array[PullDecl]],
    hasBeenBound: () => Boolean,
    hasSignatureSymbol: () => Boolean,
    hasSymbol: () => Boolean,
    isExternalModule: () => Boolean,
    isRootDecl: () => Unit,
    isSynthesized: () => Boolean,
    kind: PullElementKind,
    name: String,
    searchChildDecls: (String, PullElementKind) => js.Array[PullDecl],
    semanticInfoChain: SemanticInfoChain,
    setFlag: PullElementFlags => Unit,
    setFlags: PullElementFlags => Unit,
    setSignatureSymbol: PullSignatureSymbol => Unit,
    setSymbol: PullSymbol => Unit,
    setValueDecl: PullDecl => Unit,
    synthesizedValDecl: Any,
    typeParameters: Any
  ): RootPullDecl = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _getEnclosingDeclFromParentDecl = js.Any.fromFunction0(_getEnclosingDeclFromParentDecl), _isExternalModule = _isExternalModule.asInstanceOf[js.Any], addChildDecl = js.Any.fromFunction1(addChildDecl), addVariableDeclToGroup = js.Any.fromFunction1(addVariableDeclToGroup), ast = js.Any.fromFunction0(ast), childDeclNamespaceCache = childDeclNamespaceCache.asInstanceOf[js.Any], childDeclTypeCache = childDeclTypeCache.asInstanceOf[js.Any], childDeclTypeParameterCache = childDeclTypeParameterCache.asInstanceOf[js.Any], childDeclValueCache = childDeclValueCache.asInstanceOf[js.Any], childDecls = childDecls.asInstanceOf[js.Any], containerDecl = containerDecl.asInstanceOf[js.Any], declDisplayName = declDisplayName.asInstanceOf[js.Any], declGroups = declGroups.asInstanceOf[js.Any], declID = declID.asInstanceOf[js.Any], ensureSymbolIsBound = js.Any.fromFunction0(ensureSymbolIsBound), fileName = js.Any.fromFunction0(fileName), flags = flags.asInstanceOf[js.Any], getChildDeclCache = js.Any.fromFunction1(getChildDeclCache), getChildDecls = js.Any.fromFunction0(getChildDecls), getContainerDecl = js.Any.fromFunction0(getContainerDecl), getDisplayName = js.Any.fromFunction0(getDisplayName), getEnclosingDecl = js.Any.fromFunction0(getEnclosingDecl), getParentDecl = js.Any.fromFunction0(getParentDecl), getParentPath = js.Any.fromFunction0(getParentPath), getSignatureSymbol = js.Any.fromFunction0(getSignatureSymbol), getSymbol = js.Any.fromFunction0(getSymbol), getTypeParameters = js.Any.fromFunction0(getTypeParameters), getValueDecl = js.Any.fromFunction0(getValueDecl), getVariableDeclGroups = js.Any.fromFunction0(getVariableDeclGroups), hasBeenBound = js.Any.fromFunction0(hasBeenBound), hasSignatureSymbol = js.Any.fromFunction0(hasSignatureSymbol), hasSymbol = js.Any.fromFunction0(hasSymbol), isExternalModule = js.Any.fromFunction0(isExternalModule), isRootDecl = js.Any.fromFunction0(isRootDecl), isSynthesized = js.Any.fromFunction0(isSynthesized), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchChildDecls = js.Any.fromFunction2(searchChildDecls), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], setFlag = js.Any.fromFunction1(setFlag), setFlags = js.Any.fromFunction1(setFlags), setSignatureSymbol = js.Any.fromFunction1(setSignatureSymbol), setSymbol = js.Any.fromFunction1(setSymbol), setValueDecl = js.Any.fromFunction1(setValueDecl), synthesizedValDecl = synthesizedValDecl.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootPullDecl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootPullDecl] (val x: Self) extends AnyVal {
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_isExternalModule(value: Any): Self = StObject.set(x, "_isExternalModule", value.asInstanceOf[js.Any])
  }
}
