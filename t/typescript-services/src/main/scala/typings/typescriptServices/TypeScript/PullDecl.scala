package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullDecl extends StObject {
  
  def _getEnclosingDeclFromParentDecl(): PullDecl
  
  def addChildDecl(childDecl: PullDecl): Unit
  
  def addVariableDeclToGroup(decl: PullDecl): Unit
  
  def ast(): AST
  
  var childDeclNamespaceCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclTypeCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclValueCache: IIndexable[js.Array[PullDecl]]
  
  /* private */ var childDecls: js.Any
  
  /* private */ var containerDecl: js.Any
  
  /* private */ var declDisplayName: js.Any
  
  /* private */ var declGroups: js.Any
  
  var declID: Double
  
  def ensureSymbolIsBound(): Unit
  
  def fileName(): String
  
  var flags: PullElementFlags
  
  /* private */ def getChildDeclCache(declKind: js.Any): js.Any
  
  def getChildDecls(): js.Array[PullDecl]
  
  def getContainerDecl(): PullDecl
  
  def getDisplayName(): String
  
  def getEnclosingDecl(): PullDecl
  
  def getParentDecl(): PullDecl
  
  def getParentPath(): js.Array[PullDecl]
  
  def getSignatureSymbol(): PullSignatureSymbol
  
  def getSymbol(): PullSymbol
  
  def getTypeParameters(): js.Array[PullDecl]
  
  def getValueDecl(): PullDecl
  
  def getVariableDeclGroups(): js.Array[js.Array[PullDecl]]
  
  def hasBeenBound(): Boolean
  
  def hasSignatureSymbol(): Boolean
  
  def hasSymbol(): Boolean
  
  def isExternalModule(): Boolean
  
  def isRootDecl(): Unit
  
  def isSynthesized(): Boolean
  
  var kind: PullElementKind
  
  var name: String
  
  def searchChildDecls(declName: String, searchKind: PullElementKind): js.Array[PullDecl]
  
  var semanticInfoChain: SemanticInfoChain
  
  def setFlag(flags: PullElementFlags): Unit
  
  def setFlags(flags: PullElementFlags): Unit
  
  def setSignatureSymbol(signatureSymbol: PullSignatureSymbol): Unit
  
  def setSymbol(symbol: PullSymbol): Unit
  
  def setValueDecl(valDecl: PullDecl): Unit
  
  /* private */ var synthesizedValDecl: js.Any
  
  /* private */ var typeParameters: js.Any
}
object PullDecl {
  
  inline def apply(
    _getEnclosingDeclFromParentDecl: () => PullDecl,
    addChildDecl: PullDecl => Unit,
    addVariableDeclToGroup: PullDecl => Unit,
    ast: () => AST,
    childDeclNamespaceCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]],
    childDeclValueCache: IIndexable[js.Array[PullDecl]],
    childDecls: js.Any,
    containerDecl: js.Any,
    declDisplayName: js.Any,
    declGroups: js.Any,
    declID: Double,
    ensureSymbolIsBound: () => Unit,
    fileName: () => String,
    flags: PullElementFlags,
    getChildDeclCache: js.Any => js.Any,
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
    synthesizedValDecl: js.Any,
    typeParameters: js.Any
  ): PullDecl = {
    val __obj = js.Dynamic.literal(_getEnclosingDeclFromParentDecl = js.Any.fromFunction0(_getEnclosingDeclFromParentDecl), addChildDecl = js.Any.fromFunction1(addChildDecl), addVariableDeclToGroup = js.Any.fromFunction1(addVariableDeclToGroup), ast = js.Any.fromFunction0(ast), childDeclNamespaceCache = childDeclNamespaceCache.asInstanceOf[js.Any], childDeclTypeCache = childDeclTypeCache.asInstanceOf[js.Any], childDeclTypeParameterCache = childDeclTypeParameterCache.asInstanceOf[js.Any], childDeclValueCache = childDeclValueCache.asInstanceOf[js.Any], childDecls = childDecls.asInstanceOf[js.Any], containerDecl = containerDecl.asInstanceOf[js.Any], declDisplayName = declDisplayName.asInstanceOf[js.Any], declGroups = declGroups.asInstanceOf[js.Any], declID = declID.asInstanceOf[js.Any], ensureSymbolIsBound = js.Any.fromFunction0(ensureSymbolIsBound), fileName = js.Any.fromFunction0(fileName), flags = flags.asInstanceOf[js.Any], getChildDeclCache = js.Any.fromFunction1(getChildDeclCache), getChildDecls = js.Any.fromFunction0(getChildDecls), getContainerDecl = js.Any.fromFunction0(getContainerDecl), getDisplayName = js.Any.fromFunction0(getDisplayName), getEnclosingDecl = js.Any.fromFunction0(getEnclosingDecl), getParentDecl = js.Any.fromFunction0(getParentDecl), getParentPath = js.Any.fromFunction0(getParentPath), getSignatureSymbol = js.Any.fromFunction0(getSignatureSymbol), getSymbol = js.Any.fromFunction0(getSymbol), getTypeParameters = js.Any.fromFunction0(getTypeParameters), getValueDecl = js.Any.fromFunction0(getValueDecl), getVariableDeclGroups = js.Any.fromFunction0(getVariableDeclGroups), hasBeenBound = js.Any.fromFunction0(hasBeenBound), hasSignatureSymbol = js.Any.fromFunction0(hasSignatureSymbol), hasSymbol = js.Any.fromFunction0(hasSymbol), isExternalModule = js.Any.fromFunction0(isExternalModule), isRootDecl = js.Any.fromFunction0(isRootDecl), isSynthesized = js.Any.fromFunction0(isSynthesized), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchChildDecls = js.Any.fromFunction2(searchChildDecls), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], setFlag = js.Any.fromFunction1(setFlag), setFlags = js.Any.fromFunction1(setFlags), setSignatureSymbol = js.Any.fromFunction1(setSignatureSymbol), setSymbol = js.Any.fromFunction1(setSymbol), setValueDecl = js.Any.fromFunction1(setValueDecl), synthesizedValDecl = synthesizedValDecl.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDecl]
  }
  
  extension [Self <: PullDecl](x: Self) {
    
    inline def setAddChildDecl(value: PullDecl => Unit): Self = StObject.set(x, "addChildDecl", js.Any.fromFunction1(value))
    
    inline def setAddVariableDeclToGroup(value: PullDecl => Unit): Self = StObject.set(x, "addVariableDeclToGroup", js.Any.fromFunction1(value))
    
    inline def setAst(value: () => AST): Self = StObject.set(x, "ast", js.Any.fromFunction0(value))
    
    inline def setChildDeclNamespaceCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclNamespaceCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclTypeCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclTypeCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclTypeParameterCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclTypeParameterCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclValueCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclValueCache", value.asInstanceOf[js.Any])
    
    inline def setChildDecls(value: js.Any): Self = StObject.set(x, "childDecls", value.asInstanceOf[js.Any])
    
    inline def setContainerDecl(value: js.Any): Self = StObject.set(x, "containerDecl", value.asInstanceOf[js.Any])
    
    inline def setDeclDisplayName(value: js.Any): Self = StObject.set(x, "declDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeclGroups(value: js.Any): Self = StObject.set(x, "declGroups", value.asInstanceOf[js.Any])
    
    inline def setDeclID(value: Double): Self = StObject.set(x, "declID", value.asInstanceOf[js.Any])
    
    inline def setEnsureSymbolIsBound(value: () => Unit): Self = StObject.set(x, "ensureSymbolIsBound", js.Any.fromFunction0(value))
    
    inline def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    inline def setFlags(value: PullElementFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetChildDeclCache(value: js.Any => js.Any): Self = StObject.set(x, "getChildDeclCache", js.Any.fromFunction1(value))
    
    inline def setGetChildDecls(value: () => js.Array[PullDecl]): Self = StObject.set(x, "getChildDecls", js.Any.fromFunction0(value))
    
    inline def setGetContainerDecl(value: () => PullDecl): Self = StObject.set(x, "getContainerDecl", js.Any.fromFunction0(value))
    
    inline def setGetDisplayName(value: () => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction0(value))
    
    inline def setGetEnclosingDecl(value: () => PullDecl): Self = StObject.set(x, "getEnclosingDecl", js.Any.fromFunction0(value))
    
    inline def setGetParentDecl(value: () => PullDecl): Self = StObject.set(x, "getParentDecl", js.Any.fromFunction0(value))
    
    inline def setGetParentPath(value: () => js.Array[PullDecl]): Self = StObject.set(x, "getParentPath", js.Any.fromFunction0(value))
    
    inline def setGetSignatureSymbol(value: () => PullSignatureSymbol): Self = StObject.set(x, "getSignatureSymbol", js.Any.fromFunction0(value))
    
    inline def setGetSymbol(value: () => PullSymbol): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
    
    inline def setGetTypeParameters(value: () => js.Array[PullDecl]): Self = StObject.set(x, "getTypeParameters", js.Any.fromFunction0(value))
    
    inline def setGetValueDecl(value: () => PullDecl): Self = StObject.set(x, "getValueDecl", js.Any.fromFunction0(value))
    
    inline def setGetVariableDeclGroups(value: () => js.Array[js.Array[PullDecl]]): Self = StObject.set(x, "getVariableDeclGroups", js.Any.fromFunction0(value))
    
    inline def setHasBeenBound(value: () => Boolean): Self = StObject.set(x, "hasBeenBound", js.Any.fromFunction0(value))
    
    inline def setHasSignatureSymbol(value: () => Boolean): Self = StObject.set(x, "hasSignatureSymbol", js.Any.fromFunction0(value))
    
    inline def setHasSymbol(value: () => Boolean): Self = StObject.set(x, "hasSymbol", js.Any.fromFunction0(value))
    
    inline def setIsExternalModule(value: () => Boolean): Self = StObject.set(x, "isExternalModule", js.Any.fromFunction0(value))
    
    inline def setIsRootDecl(value: () => Unit): Self = StObject.set(x, "isRootDecl", js.Any.fromFunction0(value))
    
    inline def setIsSynthesized(value: () => Boolean): Self = StObject.set(x, "isSynthesized", js.Any.fromFunction0(value))
    
    inline def setKind(value: PullElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSearchChildDecls(value: (String, PullElementKind) => js.Array[PullDecl]): Self = StObject.set(x, "searchChildDecls", js.Any.fromFunction2(value))
    
    inline def setSemanticInfoChain(value: SemanticInfoChain): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def setSetFlag(value: PullElementFlags => Unit): Self = StObject.set(x, "setFlag", js.Any.fromFunction1(value))
    
    inline def setSetFlags(value: PullElementFlags => Unit): Self = StObject.set(x, "setFlags", js.Any.fromFunction1(value))
    
    inline def setSetSignatureSymbol(value: PullSignatureSymbol => Unit): Self = StObject.set(x, "setSignatureSymbol", js.Any.fromFunction1(value))
    
    inline def setSetSymbol(value: PullSymbol => Unit): Self = StObject.set(x, "setSymbol", js.Any.fromFunction1(value))
    
    inline def setSetValueDecl(value: PullDecl => Unit): Self = StObject.set(x, "setValueDecl", js.Any.fromFunction1(value))
    
    inline def setSynthesizedValDecl(value: js.Any): Self = StObject.set(x, "synthesizedValDecl", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: js.Any): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def set_getEnclosingDeclFromParentDecl(value: () => PullDecl): Self = StObject.set(x, "_getEnclosingDeclFromParentDecl", js.Any.fromFunction0(value))
  }
}
