package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeCommon.Aspect
import typings.webgme.GmeCommon.AttrMeta
import typings.webgme.GmeCommon.CrosscutsInfo
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.MemberId
import typings.webgme.GmeCommon.Metadata
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.NodeId
import typings.webgme.GmeCommon.OutAttr
import typings.webgme.GmeCommon.Path
import typings.webgme.GmeCommon.Pointer
import typings.webgme.GmeCommon.Registry
import typings.webgme.GmeCommon.RelId
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeCommon.SetId
import typings.webgme.webgmeStrings.`aspect collision`
import typings.webgme.webgmeStrings.`attribute collision`
import typings.webgme.webgmeStrings.`constraint collision`
import typings.webgme.webgmeStrings.`containment collision`
import typings.webgme.webgmeStrings.`pointer collision`
import typings.webgme.webgmeStrings.`set collision`
import typings.webgme.webgmeStrings.error
import typings.webgme.webgmeStrings.missing
import typings.webgme.webgmeStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
object Core {
  
  trait Constraint extends StObject {
    
    /** Short description of the constraint. */
    var info: String
    
    /** Gives instructions on how to deal with violations of the constraint. */
    var priority: Double
    
    /** The script which checks if the constraint is met. */
    var script: String
  }
  object Constraint {
    
    inline def apply(info: String, priority: Double, script: String): Constraint = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constraint]
    }
    
    extension [Self <: Constraint](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  type DataObject = Any
  
  type GUID = String
  
  trait GmePersisted extends StObject {
    
    var objects: StringDictionary[DataObject]
    
    var rootHash: ObjectHash
  }
  object GmePersisted {
    
    inline def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GmePersisted]
    }
    
    extension [Self <: GmePersisted](x: Self) {
      
      inline def setObjects(value: StringDictionary[DataObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setRootHash(value: ObjectHash): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
    }
  }
  
  trait MixinViolation extends StObject {
    
    /** The colliding mixin nodes (if any). */
    var collisionNodes: js.UndefOr[js.Array[Node]] = js.undefined
    
    /** The list of paths of colliding nodes (if any). */
    var collisionPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Hint on how to resolve the issue. */
    var hint: js.UndefOr[String] = js.undefined
    
    /** The description of the violation. */
    var message: js.UndefOr[String] = js.undefined
    
    /** The name of the affected rule definition (if available). */
    var ruleName: js.UndefOr[String] = js.undefined
    
    /** The severity of the given error. */
    var severity: js.UndefOr[error | warning] = js.undefined
    
    /** The name of the affected rule definition (if available). */
    var targetInfo: js.UndefOr[String] = js.undefined
    
    /** The target node of the violation (if available). */
    var targetNode: js.UndefOr[Node] = js.undefined
    
    /** What kind of violation */
    var `type`: js.UndefOr[
        missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ] = js.undefined
  }
  object MixinViolation {
    
    inline def apply(): MixinViolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinViolation]
    }
    
    extension [Self <: MixinViolation](x: Self) {
      
      inline def setCollisionNodes(value: js.Array[Node]): Self = StObject.set(x, "collisionNodes", value.asInstanceOf[js.Any])
      
      inline def setCollisionNodesUndefined: Self = StObject.set(x, "collisionNodes", js.undefined)
      
      inline def setCollisionNodesVarargs(value: Node*): Self = StObject.set(x, "collisionNodes", js.Array(value*))
      
      inline def setCollisionPaths(value: js.Array[String]): Self = StObject.set(x, "collisionPaths", value.asInstanceOf[js.Any])
      
      inline def setCollisionPathsUndefined: Self = StObject.set(x, "collisionPaths", js.undefined)
      
      inline def setCollisionPathsVarargs(value: String*): Self = StObject.set(x, "collisionPaths", js.Array(value*))
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
      
      inline def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setTargetInfo(value: String): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      inline def setTargetInfoUndefined: Self = StObject.set(x, "targetInfo", js.undefined)
      
      inline def setTargetNode(value: Node): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
      
      inline def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
      
      inline def setType(
        value: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var _id: String
    
    def canSetAsMixin(mixinPath: Path): Boolean
    
    def getAspectMeta(): Metadata
    
    def getAttribute(name: Name): OutAttr
    
    def getAttributeMeta(name: Name): AttrMeta
    
    def getAttributeNames(): js.Array[Name]
    
    def getBaseId(): NodeId
    
    def getBaseTypeId(): Node | Null
    
    def getChildrenIds(): js.Array[NodeId]
    
    def getCollectionPaths(name: Name): js.Array[Path]
    
    def getConstraint(name: Name): Constraint
    
    def getConstraintNames(): js.Array[Name]
    
    def getCrosscutsInfo(): CrosscutsInfo
    
    def getEditableAttribute(name: Name): OutAttr
    
    def getEditableMemberAttribute(setId: SetId, memberId: MemberId, name: Name): OutAttr
    
    def getEditableMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry
    
    def getEditableRegistry(name: Name): Registry
    
    def getFullyQualifiedName(): Name
    
    def getGuid(): GUID
    
    def getId(): NodeId
    
    def getInheritorIds(): js.Array[NodeId]
    
    def getInstancePaths(): js.Array[Path]
    
    def getJsonMeta(): js.Array[Metadata]
    
    def getLibraryGuid(): GUID
    
    def getMemberAttribute(setId: SetId, memberId: MemberId): OutAttr
    
    def getMemberAttributeNames(setId: SetId, memberId: MemberId): js.Array[Name]
    
    /** Set */
    def getMemberIds(setId: SetId): js.Array[Path]
    
    def getMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry
    
    def getMemberRegistryNames(setId: SetId, memberId: MemberId): js.Array[Name]
    
    def getMetaTypeId(): Node | Null
    
    /** MixIns */
    def getMixinPaths(): js.Array[Path]
    
    def getNamespace(): Name
    
    def getNode(id: NodeId, logger: GmeLogger, state: Any, storeNode: ResultCallback[Storage]): Node
    
    def getOwnAttribute(name: Name): OutAttr
    
    def getOwnAttributeNames(): js.Array[Name]
    
    def getOwnConstraintNames(): js.Array[Name]
    
    def getOwnEditableAttribute(name: Name): OutAttr
    
    def getOwnEditableRegistry(name: Name): Registry
    
    def getOwnPointer(name: Name): Pointer
    
    def getOwnPointerId(name: Name): SetId
    
    def getOwnPointerNames(): js.Array[Name]
    
    def getOwnRegistry(name: Name): Registry
    
    def getOwnRegistryNames(): js.Array[Name]
    
    def getOwnValidAspectNames(): js.Array[Name]
    
    def getOwnValidAttributeNames(): js.Array[Name]
    
    def getParentId(): NodeId
    
    def getPointer(name: Name): Pointer
    
    def getPointerId(name: Name): SetId
    
    def getPointerNames(): js.Array[Name]
    
    def getRegistry(name: Name): Registry
    
    def getRegistryNames(): js.Array[Name]
    
    def getRelid(): RelId
    
    def getSetNames(): js.Array[Name]
    
    def getValidAspectNames(): js.Array[Name]
    
    def getValidAttributeNames(): js.Array[Name]
    
    def getValidChildrenIds(): js.Array[NodeId]
    
    /** META */
    def getValidChildrenTypes(): js.Array[NodeId]
    
    def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[Any]
    
    def getValidPointerNames(): js.Array[Name]
    
    def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[Any]
    
    def getValidSetNames(): js.Array[Name]
    
    def getValildAttributeNames(): js.Array[Name]
    
    def isAbstract(): Boolean
    
    def isConnection(): Boolean
    
    def isLibraryElement(): Boolean
    
    def isLibraryRoot(): Boolean
    
    def isMetaNode(): Boolean
    
    def isReadOnly(): Boolean
    
    def isTypeOf(typePath: Path): Boolean
    
    def isValidAttributeValueOf(name: Name, value: Any): Boolean
    
    def isValidChildOf(parentPath: Path): Boolean
    
    def isValidNewBase(basePath: Path): Boolean
    
    def isValidNewParent(parentPath: Path): Boolean
    
    def isValidTargetOf(sourcePath: Path, name: Name): Boolean
  }
  object Node {
    
    inline def apply(
      _id: String,
      canSetAsMixin: Path => Boolean,
      getAspectMeta: () => Metadata,
      getAttribute: Name => OutAttr,
      getAttributeMeta: Name => AttrMeta,
      getAttributeNames: () => js.Array[Name],
      getBaseId: () => NodeId,
      getBaseTypeId: () => Node | Null,
      getChildrenIds: () => js.Array[NodeId],
      getCollectionPaths: Name => js.Array[Path],
      getConstraint: Name => Constraint,
      getConstraintNames: () => js.Array[Name],
      getCrosscutsInfo: () => CrosscutsInfo,
      getEditableAttribute: Name => OutAttr,
      getEditableMemberAttribute: (SetId, MemberId, Name) => OutAttr,
      getEditableMemberRegistry: (SetId, MemberId, Name) => Registry,
      getEditableRegistry: Name => Registry,
      getFullyQualifiedName: () => Name,
      getGuid: () => GUID,
      getId: () => NodeId,
      getInheritorIds: () => js.Array[NodeId],
      getInstancePaths: () => js.Array[Path],
      getJsonMeta: () => js.Array[Metadata],
      getLibraryGuid: () => GUID,
      getMemberAttribute: (SetId, MemberId) => OutAttr,
      getMemberAttributeNames: (SetId, MemberId) => js.Array[Name],
      getMemberIds: SetId => js.Array[Path],
      getMemberRegistry: (SetId, MemberId, Name) => Registry,
      getMemberRegistryNames: (SetId, MemberId) => js.Array[Name],
      getMetaTypeId: () => Node | Null,
      getMixinPaths: () => js.Array[Path],
      getNamespace: () => Name,
      getNode: (NodeId, GmeLogger, Any, ResultCallback[Storage]) => Node,
      getOwnAttribute: Name => OutAttr,
      getOwnAttributeNames: () => js.Array[Name],
      getOwnConstraintNames: () => js.Array[Name],
      getOwnEditableAttribute: Name => OutAttr,
      getOwnEditableRegistry: Name => Registry,
      getOwnPointer: Name => Pointer,
      getOwnPointerId: Name => SetId,
      getOwnPointerNames: () => js.Array[Name],
      getOwnRegistry: Name => Registry,
      getOwnRegistryNames: () => js.Array[Name],
      getOwnValidAspectNames: () => js.Array[Name],
      getOwnValidAttributeNames: () => js.Array[Name],
      getParentId: () => NodeId,
      getPointer: Name => Pointer,
      getPointerId: Name => SetId,
      getPointerNames: () => js.Array[Name],
      getRegistry: Name => Registry,
      getRegistryNames: () => js.Array[Name],
      getRelid: () => RelId,
      getSetNames: () => js.Array[Name],
      getValidAspectNames: () => js.Array[Name],
      getValidAttributeNames: () => js.Array[Name],
      getValidChildrenIds: () => js.Array[NodeId],
      getValidChildrenTypes: () => js.Array[NodeId],
      getValidChildrenTypesDetailed: (Aspect, Boolean) => Dictionary[Any],
      getValidPointerNames: () => js.Array[Name],
      getValidSetMemberTypesDetailed: Name => StringDictionary[Any],
      getValidSetNames: () => js.Array[Name],
      getValildAttributeNames: () => js.Array[Name],
      isAbstract: () => Boolean,
      isConnection: () => Boolean,
      isLibraryElement: () => Boolean,
      isLibraryRoot: () => Boolean,
      isMetaNode: () => Boolean,
      isReadOnly: () => Boolean,
      isTypeOf: Path => Boolean,
      isValidAttributeValueOf: (Name, Any) => Boolean,
      isValidChildOf: Path => Boolean,
      isValidNewBase: Path => Boolean,
      isValidNewParent: Path => Boolean,
      isValidTargetOf: (Path, Name) => Boolean
    ): Node = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], canSetAsMixin = js.Any.fromFunction1(canSetAsMixin), getAspectMeta = js.Any.fromFunction0(getAspectMeta), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeMeta = js.Any.fromFunction1(getAttributeMeta), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getBaseId = js.Any.fromFunction0(getBaseId), getBaseTypeId = js.Any.fromFunction0(getBaseTypeId), getChildrenIds = js.Any.fromFunction0(getChildrenIds), getCollectionPaths = js.Any.fromFunction1(getCollectionPaths), getConstraint = js.Any.fromFunction1(getConstraint), getConstraintNames = js.Any.fromFunction0(getConstraintNames), getCrosscutsInfo = js.Any.fromFunction0(getCrosscutsInfo), getEditableAttribute = js.Any.fromFunction1(getEditableAttribute), getEditableMemberAttribute = js.Any.fromFunction3(getEditableMemberAttribute), getEditableMemberRegistry = js.Any.fromFunction3(getEditableMemberRegistry), getEditableRegistry = js.Any.fromFunction1(getEditableRegistry), getFullyQualifiedName = js.Any.fromFunction0(getFullyQualifiedName), getGuid = js.Any.fromFunction0(getGuid), getId = js.Any.fromFunction0(getId), getInheritorIds = js.Any.fromFunction0(getInheritorIds), getInstancePaths = js.Any.fromFunction0(getInstancePaths), getJsonMeta = js.Any.fromFunction0(getJsonMeta), getLibraryGuid = js.Any.fromFunction0(getLibraryGuid), getMemberAttribute = js.Any.fromFunction2(getMemberAttribute), getMemberAttributeNames = js.Any.fromFunction2(getMemberAttributeNames), getMemberIds = js.Any.fromFunction1(getMemberIds), getMemberRegistry = js.Any.fromFunction3(getMemberRegistry), getMemberRegistryNames = js.Any.fromFunction2(getMemberRegistryNames), getMetaTypeId = js.Any.fromFunction0(getMetaTypeId), getMixinPaths = js.Any.fromFunction0(getMixinPaths), getNamespace = js.Any.fromFunction0(getNamespace), getNode = js.Any.fromFunction4(getNode), getOwnAttribute = js.Any.fromFunction1(getOwnAttribute), getOwnAttributeNames = js.Any.fromFunction0(getOwnAttributeNames), getOwnConstraintNames = js.Any.fromFunction0(getOwnConstraintNames), getOwnEditableAttribute = js.Any.fromFunction1(getOwnEditableAttribute), getOwnEditableRegistry = js.Any.fromFunction1(getOwnEditableRegistry), getOwnPointer = js.Any.fromFunction1(getOwnPointer), getOwnPointerId = js.Any.fromFunction1(getOwnPointerId), getOwnPointerNames = js.Any.fromFunction0(getOwnPointerNames), getOwnRegistry = js.Any.fromFunction1(getOwnRegistry), getOwnRegistryNames = js.Any.fromFunction0(getOwnRegistryNames), getOwnValidAspectNames = js.Any.fromFunction0(getOwnValidAspectNames), getOwnValidAttributeNames = js.Any.fromFunction0(getOwnValidAttributeNames), getParentId = js.Any.fromFunction0(getParentId), getPointer = js.Any.fromFunction1(getPointer), getPointerId = js.Any.fromFunction1(getPointerId), getPointerNames = js.Any.fromFunction0(getPointerNames), getRegistry = js.Any.fromFunction1(getRegistry), getRegistryNames = js.Any.fromFunction0(getRegistryNames), getRelid = js.Any.fromFunction0(getRelid), getSetNames = js.Any.fromFunction0(getSetNames), getValidAspectNames = js.Any.fromFunction0(getValidAspectNames), getValidAttributeNames = js.Any.fromFunction0(getValidAttributeNames), getValidChildrenIds = js.Any.fromFunction0(getValidChildrenIds), getValidChildrenTypes = js.Any.fromFunction0(getValidChildrenTypes), getValidChildrenTypesDetailed = js.Any.fromFunction2(getValidChildrenTypesDetailed), getValidPointerNames = js.Any.fromFunction0(getValidPointerNames), getValidSetMemberTypesDetailed = js.Any.fromFunction1(getValidSetMemberTypesDetailed), getValidSetNames = js.Any.fromFunction0(getValidSetNames), getValildAttributeNames = js.Any.fromFunction0(getValildAttributeNames), isAbstract = js.Any.fromFunction0(isAbstract), isConnection = js.Any.fromFunction0(isConnection), isLibraryElement = js.Any.fromFunction0(isLibraryElement), isLibraryRoot = js.Any.fromFunction0(isLibraryRoot), isMetaNode = js.Any.fromFunction0(isMetaNode), isReadOnly = js.Any.fromFunction0(isReadOnly), isTypeOf = js.Any.fromFunction1(isTypeOf), isValidAttributeValueOf = js.Any.fromFunction2(isValidAttributeValueOf), isValidChildOf = js.Any.fromFunction1(isValidChildOf), isValidNewBase = js.Any.fromFunction1(isValidNewBase), isValidNewParent = js.Any.fromFunction1(isValidNewParent), isValidTargetOf = js.Any.fromFunction2(isValidTargetOf))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setCanSetAsMixin(value: Path => Boolean): Self = StObject.set(x, "canSetAsMixin", js.Any.fromFunction1(value))
      
      inline def setGetAspectMeta(value: () => Metadata): Self = StObject.set(x, "getAspectMeta", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: Name => OutAttr): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeMeta(value: Name => AttrMeta): Self = StObject.set(x, "getAttributeMeta", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
      
      inline def setGetBaseId(value: () => NodeId): Self = StObject.set(x, "getBaseId", js.Any.fromFunction0(value))
      
      inline def setGetBaseTypeId(value: () => Node | Null): Self = StObject.set(x, "getBaseTypeId", js.Any.fromFunction0(value))
      
      inline def setGetChildrenIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getChildrenIds", js.Any.fromFunction0(value))
      
      inline def setGetCollectionPaths(value: Name => js.Array[Path]): Self = StObject.set(x, "getCollectionPaths", js.Any.fromFunction1(value))
      
      inline def setGetConstraint(value: Name => Constraint): Self = StObject.set(x, "getConstraint", js.Any.fromFunction1(value))
      
      inline def setGetConstraintNames(value: () => js.Array[Name]): Self = StObject.set(x, "getConstraintNames", js.Any.fromFunction0(value))
      
      inline def setGetCrosscutsInfo(value: () => CrosscutsInfo): Self = StObject.set(x, "getCrosscutsInfo", js.Any.fromFunction0(value))
      
      inline def setGetEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getEditableAttribute", js.Any.fromFunction1(value))
      
      inline def setGetEditableMemberAttribute(value: (SetId, MemberId, Name) => OutAttr): Self = StObject.set(x, "getEditableMemberAttribute", js.Any.fromFunction3(value))
      
      inline def setGetEditableMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getEditableMemberRegistry", js.Any.fromFunction3(value))
      
      inline def setGetEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getEditableRegistry", js.Any.fromFunction1(value))
      
      inline def setGetFullyQualifiedName(value: () => Name): Self = StObject.set(x, "getFullyQualifiedName", js.Any.fromFunction0(value))
      
      inline def setGetGuid(value: () => GUID): Self = StObject.set(x, "getGuid", js.Any.fromFunction0(value))
      
      inline def setGetId(value: () => NodeId): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetInheritorIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getInheritorIds", js.Any.fromFunction0(value))
      
      inline def setGetInstancePaths(value: () => js.Array[Path]): Self = StObject.set(x, "getInstancePaths", js.Any.fromFunction0(value))
      
      inline def setGetJsonMeta(value: () => js.Array[Metadata]): Self = StObject.set(x, "getJsonMeta", js.Any.fromFunction0(value))
      
      inline def setGetLibraryGuid(value: () => GUID): Self = StObject.set(x, "getLibraryGuid", js.Any.fromFunction0(value))
      
      inline def setGetMemberAttribute(value: (SetId, MemberId) => OutAttr): Self = StObject.set(x, "getMemberAttribute", js.Any.fromFunction2(value))
      
      inline def setGetMemberAttributeNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberAttributeNames", js.Any.fromFunction2(value))
      
      inline def setGetMemberIds(value: SetId => js.Array[Path]): Self = StObject.set(x, "getMemberIds", js.Any.fromFunction1(value))
      
      inline def setGetMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getMemberRegistry", js.Any.fromFunction3(value))
      
      inline def setGetMemberRegistryNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberRegistryNames", js.Any.fromFunction2(value))
      
      inline def setGetMetaTypeId(value: () => Node | Null): Self = StObject.set(x, "getMetaTypeId", js.Any.fromFunction0(value))
      
      inline def setGetMixinPaths(value: () => js.Array[Path]): Self = StObject.set(x, "getMixinPaths", js.Any.fromFunction0(value))
      
      inline def setGetNamespace(value: () => Name): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      inline def setGetNode(value: (NodeId, GmeLogger, Any, ResultCallback[Storage]) => Node): Self = StObject.set(x, "getNode", js.Any.fromFunction4(value))
      
      inline def setGetOwnAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnAttribute", js.Any.fromFunction1(value))
      
      inline def setGetOwnAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnAttributeNames", js.Any.fromFunction0(value))
      
      inline def setGetOwnConstraintNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnConstraintNames", js.Any.fromFunction0(value))
      
      inline def setGetOwnEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnEditableAttribute", js.Any.fromFunction1(value))
      
      inline def setGetOwnEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnEditableRegistry", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointer(value: Name => Pointer): Self = StObject.set(x, "getOwnPointer", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointerId(value: Name => SetId): Self = StObject.set(x, "getOwnPointerId", js.Any.fromFunction1(value))
      
      inline def setGetOwnPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnPointerNames", js.Any.fromFunction0(value))
      
      inline def setGetOwnRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnRegistry", js.Any.fromFunction1(value))
      
      inline def setGetOwnRegistryNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnRegistryNames", js.Any.fromFunction0(value))
      
      inline def setGetOwnValidAspectNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnValidAspectNames", js.Any.fromFunction0(value))
      
      inline def setGetOwnValidAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnValidAttributeNames", js.Any.fromFunction0(value))
      
      inline def setGetParentId(value: () => NodeId): Self = StObject.set(x, "getParentId", js.Any.fromFunction0(value))
      
      inline def setGetPointer(value: Name => Pointer): Self = StObject.set(x, "getPointer", js.Any.fromFunction1(value))
      
      inline def setGetPointerId(value: Name => SetId): Self = StObject.set(x, "getPointerId", js.Any.fromFunction1(value))
      
      inline def setGetPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getPointerNames", js.Any.fromFunction0(value))
      
      inline def setGetRegistry(value: Name => Registry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction1(value))
      
      inline def setGetRegistryNames(value: () => js.Array[Name]): Self = StObject.set(x, "getRegistryNames", js.Any.fromFunction0(value))
      
      inline def setGetRelid(value: () => RelId): Self = StObject.set(x, "getRelid", js.Any.fromFunction0(value))
      
      inline def setGetSetNames(value: () => js.Array[Name]): Self = StObject.set(x, "getSetNames", js.Any.fromFunction0(value))
      
      inline def setGetValidAspectNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidAspectNames", js.Any.fromFunction0(value))
      
      inline def setGetValidAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidAttributeNames", js.Any.fromFunction0(value))
      
      inline def setGetValidChildrenIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getValidChildrenIds", js.Any.fromFunction0(value))
      
      inline def setGetValidChildrenTypes(value: () => js.Array[NodeId]): Self = StObject.set(x, "getValidChildrenTypes", js.Any.fromFunction0(value))
      
      inline def setGetValidChildrenTypesDetailed(value: (Aspect, Boolean) => Dictionary[Any]): Self = StObject.set(x, "getValidChildrenTypesDetailed", js.Any.fromFunction2(value))
      
      inline def setGetValidPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidPointerNames", js.Any.fromFunction0(value))
      
      inline def setGetValidSetMemberTypesDetailed(value: Name => StringDictionary[Any]): Self = StObject.set(x, "getValidSetMemberTypesDetailed", js.Any.fromFunction1(value))
      
      inline def setGetValidSetNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidSetNames", js.Any.fromFunction0(value))
      
      inline def setGetValildAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValildAttributeNames", js.Any.fromFunction0(value))
      
      inline def setIsAbstract(value: () => Boolean): Self = StObject.set(x, "isAbstract", js.Any.fromFunction0(value))
      
      inline def setIsConnection(value: () => Boolean): Self = StObject.set(x, "isConnection", js.Any.fromFunction0(value))
      
      inline def setIsLibraryElement(value: () => Boolean): Self = StObject.set(x, "isLibraryElement", js.Any.fromFunction0(value))
      
      inline def setIsLibraryRoot(value: () => Boolean): Self = StObject.set(x, "isLibraryRoot", js.Any.fromFunction0(value))
      
      inline def setIsMetaNode(value: () => Boolean): Self = StObject.set(x, "isMetaNode", js.Any.fromFunction0(value))
      
      inline def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
      
      inline def setIsTypeOf(value: Path => Boolean): Self = StObject.set(x, "isTypeOf", js.Any.fromFunction1(value))
      
      inline def setIsValidAttributeValueOf(value: (Name, Any) => Boolean): Self = StObject.set(x, "isValidAttributeValueOf", js.Any.fromFunction2(value))
      
      inline def setIsValidChildOf(value: Path => Boolean): Self = StObject.set(x, "isValidChildOf", js.Any.fromFunction1(value))
      
      inline def setIsValidNewBase(value: Path => Boolean): Self = StObject.set(x, "isValidNewBase", js.Any.fromFunction1(value))
      
      inline def setIsValidNewParent(value: Path => Boolean): Self = StObject.set(x, "isValidNewParent", js.Any.fromFunction1(value))
      
      inline def setIsValidTargetOf(value: (Path, Name) => Boolean): Self = StObject.set(x, "isValidTargetOf", js.Any.fromFunction2(value))
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectHash = String
  
  trait RelationRule
    extends StObject
       with RelationRuleDetail
       with RelationRuleDictionary
  object RelationRule {
    
    inline def apply(): RelationRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationRule]
    }
  }
  
  trait RelationRuleDetail extends StObject {
    
    /** 
      * The maximum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no maximum rule that applies) 
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** 
      * The minimum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no minimum rule that applies) 
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object RelationRuleDetail {
    
    inline def apply(): RelationRuleDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationRuleDetail]
    }
    
    extension [Self <: RelationRuleDetail](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  type RelationRuleDictionary = StringDictionary[RelationRuleDetail]
}
