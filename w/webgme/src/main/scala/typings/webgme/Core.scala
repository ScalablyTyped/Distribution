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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
object Core {
  
  @js.native
  trait Constraint extends StObject {
    
    /** Short description of the constraint. */
    var info: String = js.native
    
    /** Gives instructions on how to deal with violations of the constraint. */
    var priority: Double = js.native
    
    /** The script which checks if the constraint is met. */
    var script: String = js.native
  }
  object Constraint {
    
    @scala.inline
    def apply(info: String, priority: Double, script: String): Constraint = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constraint]
    }
    
    @scala.inline
    implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  type DataObject = js.Any
  
  type GUID = String
  
  @js.native
  trait GmePersisted extends StObject {
    
    var objects: StringDictionary[DataObject] = js.native
    
    var rootHash: ObjectHash = js.native
  }
  object GmePersisted {
    
    @scala.inline
    def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
      __obj.asInstanceOf[GmePersisted]
    }
    
    @scala.inline
    implicit class GmePersistedMutableBuilder[Self <: GmePersisted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: StringDictionary[DataObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootHash(value: ObjectHash): Self = StObject.set(x, "rootHash", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MixinViolation extends StObject {
    
    /** The colliding mixin nodes (if any). */
    var collisionNodes: js.UndefOr[js.Array[Node]] = js.native
    
    /** The list of paths of colliding nodes (if any). */
    var collisionPaths: js.UndefOr[js.Array[String]] = js.native
    
    /** Hint on how to resolve the issue. */
    var hint: js.UndefOr[String] = js.native
    
    /** The description of the violation. */
    var message: js.UndefOr[String] = js.native
    
    /** The name of the affected rule definition (if available). */
    var ruleName: js.UndefOr[String] = js.native
    
    /** The severity of the given error. */
    var severity: js.UndefOr[error | warning] = js.native
    
    /** The name of the affected rule definition (if available). */
    var targetInfo: js.UndefOr[String] = js.native
    
    /** The target node of the violation (if available). */
    var targetNode: js.UndefOr[Node] = js.native
    
    /** What kind of violation */
    var `type`: js.UndefOr[
        missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ] = js.native
  }
  object MixinViolation {
    
    @scala.inline
    def apply(): MixinViolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinViolation]
    }
    
    @scala.inline
    implicit class MixinViolationMutableBuilder[Self <: MixinViolation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollisionNodes(value: js.Array[Node]): Self = StObject.set(x, "collisionNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionNodesUndefined: Self = StObject.set(x, "collisionNodes", js.undefined)
      
      @scala.inline
      def setCollisionNodesVarargs(value: Node*): Self = StObject.set(x, "collisionNodes", js.Array(value :_*))
      
      @scala.inline
      def setCollisionPaths(value: js.Array[String]): Self = StObject.set(x, "collisionPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionPathsUndefined: Self = StObject.set(x, "collisionPaths", js.undefined)
      
      @scala.inline
      def setCollisionPathsVarargs(value: String*): Self = StObject.set(x, "collisionPaths", js.Array(value :_*))
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
      
      @scala.inline
      def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setTargetInfo(value: String): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetInfoUndefined: Self = StObject.set(x, "targetInfo", js.undefined)
      
      @scala.inline
      def setTargetNode(value: Node): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
      
      @scala.inline
      def setType(
        value: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    var _id: String = js.native
    
    def canSetAsMixin(mixinPath: Path): Boolean = js.native
    
    def getAspectMeta(): Metadata = js.native
    
    def getAttribute(name: Name): OutAttr = js.native
    
    def getAttributeMeta(name: Name): AttrMeta = js.native
    
    def getAttributeNames(): js.Array[Name] = js.native
    
    def getBaseId(): NodeId = js.native
    
    def getBaseTypeId(): Node | Null = js.native
    
    def getChildrenIds(): js.Array[NodeId] = js.native
    
    def getCollectionPaths(name: Name): js.Array[Path] = js.native
    
    def getConstraint(name: Name): Constraint = js.native
    
    def getConstraintNames(): js.Array[Name] = js.native
    
    def getCrosscutsInfo(): CrosscutsInfo = js.native
    
    def getEditableAttribute(name: Name): OutAttr = js.native
    
    def getEditableMemberAttribute(setId: SetId, memberId: MemberId, name: Name): OutAttr = js.native
    
    def getEditableMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
    
    def getEditableRegistry(name: Name): Registry = js.native
    
    def getFullyQualifiedName(): Name = js.native
    
    def getGuid(): GUID = js.native
    
    def getId(): NodeId = js.native
    
    def getInheritorIds(): js.Array[NodeId] = js.native
    
    def getInstancePaths(): js.Array[Path] = js.native
    
    def getJsonMeta(): js.Array[Metadata] = js.native
    
    def getLibraryGuid(): GUID = js.native
    
    def getMemberAttribute(setId: SetId, memberId: MemberId): OutAttr = js.native
    
    def getMemberAttributeNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
    
    /** Set */
    def getMemberIds(setId: SetId): js.Array[Path] = js.native
    
    def getMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
    
    def getMemberRegistryNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
    
    def getMetaTypeId(): Node | Null = js.native
    
    /** MixIns */
    def getMixinPaths(): js.Array[Path] = js.native
    
    def getNamespace(): Name = js.native
    
    def getNode(id: NodeId, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]): Node = js.native
    
    def getOwnAttribute(name: Name): OutAttr = js.native
    
    def getOwnAttributeNames(): js.Array[Name] = js.native
    
    def getOwnConstraintNames(): js.Array[Name] = js.native
    
    def getOwnEditableAttribute(name: Name): OutAttr = js.native
    
    def getOwnEditableRegistry(name: Name): Registry = js.native
    
    def getOwnPointer(name: Name): Pointer = js.native
    
    def getOwnPointerId(name: Name): SetId = js.native
    
    def getOwnPointerNames(): js.Array[Name] = js.native
    
    def getOwnRegistry(name: Name): Registry = js.native
    
    def getOwnRegistryNames(): js.Array[Name] = js.native
    
    def getOwnValidAspectNames(): js.Array[Name] = js.native
    
    def getOwnValidAttributeNames(): js.Array[Name] = js.native
    
    def getParentId(): NodeId = js.native
    
    def getPointer(name: Name): Pointer = js.native
    
    def getPointerId(name: Name): SetId = js.native
    
    def getPointerNames(): js.Array[Name] = js.native
    
    def getRegistry(name: Name): Registry = js.native
    
    def getRegistryNames(): js.Array[Name] = js.native
    
    def getRelid(): RelId = js.native
    
    def getSetNames(): js.Array[Name] = js.native
    
    def getValidAspectNames(): js.Array[Name] = js.native
    
    def getValidAttributeNames(): js.Array[Name] = js.native
    
    def getValidChildrenIds(): js.Array[NodeId] = js.native
    
    /** META */
    def getValidChildrenTypes(): js.Array[NodeId] = js.native
    
    def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[_] = js.native
    
    def getValidPointerNames(): js.Array[Name] = js.native
    
    def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[js.Any] = js.native
    
    def getValidSetNames(): js.Array[Name] = js.native
    
    def getValildAttributeNames(): js.Array[Name] = js.native
    
    def isAbstract(): Boolean = js.native
    
    def isConnection(): Boolean = js.native
    
    def isLibraryElement(): Boolean = js.native
    
    def isLibraryRoot(): Boolean = js.native
    
    def isMetaNode(): Boolean = js.native
    
    def isReadOnly(): Boolean = js.native
    
    def isTypeOf(typePath: Path): Boolean = js.native
    
    def isValidAttributeValueOf(name: Name, value: js.Any): Boolean = js.native
    
    def isValidChildOf(parentPath: Path): Boolean = js.native
    
    def isValidNewBase(basePath: Path): Boolean = js.native
    
    def isValidNewParent(parentPath: Path): Boolean = js.native
    
    def isValidTargetOf(sourcePath: Path, name: Name): Boolean = js.native
  }
  object Node {
    
    @scala.inline
    def apply(
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
      getNode: (NodeId, GmeLogger, js.Any, ResultCallback[Storage]) => Node,
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
      getValidChildrenTypesDetailed: (Aspect, Boolean) => Dictionary[_],
      getValidPointerNames: () => js.Array[Name],
      getValidSetMemberTypesDetailed: Name => StringDictionary[js.Any],
      getValidSetNames: () => js.Array[Name],
      getValildAttributeNames: () => js.Array[Name],
      isAbstract: () => Boolean,
      isConnection: () => Boolean,
      isLibraryElement: () => Boolean,
      isLibraryRoot: () => Boolean,
      isMetaNode: () => Boolean,
      isReadOnly: () => Boolean,
      isTypeOf: Path => Boolean,
      isValidAttributeValueOf: (Name, js.Any) => Boolean,
      isValidChildOf: Path => Boolean,
      isValidNewBase: Path => Boolean,
      isValidNewParent: Path => Boolean,
      isValidTargetOf: (Path, Name) => Boolean
    ): Node = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], canSetAsMixin = js.Any.fromFunction1(canSetAsMixin), getAspectMeta = js.Any.fromFunction0(getAspectMeta), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeMeta = js.Any.fromFunction1(getAttributeMeta), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getBaseId = js.Any.fromFunction0(getBaseId), getBaseTypeId = js.Any.fromFunction0(getBaseTypeId), getChildrenIds = js.Any.fromFunction0(getChildrenIds), getCollectionPaths = js.Any.fromFunction1(getCollectionPaths), getConstraint = js.Any.fromFunction1(getConstraint), getConstraintNames = js.Any.fromFunction0(getConstraintNames), getCrosscutsInfo = js.Any.fromFunction0(getCrosscutsInfo), getEditableAttribute = js.Any.fromFunction1(getEditableAttribute), getEditableMemberAttribute = js.Any.fromFunction3(getEditableMemberAttribute), getEditableMemberRegistry = js.Any.fromFunction3(getEditableMemberRegistry), getEditableRegistry = js.Any.fromFunction1(getEditableRegistry), getFullyQualifiedName = js.Any.fromFunction0(getFullyQualifiedName), getGuid = js.Any.fromFunction0(getGuid), getId = js.Any.fromFunction0(getId), getInheritorIds = js.Any.fromFunction0(getInheritorIds), getInstancePaths = js.Any.fromFunction0(getInstancePaths), getJsonMeta = js.Any.fromFunction0(getJsonMeta), getLibraryGuid = js.Any.fromFunction0(getLibraryGuid), getMemberAttribute = js.Any.fromFunction2(getMemberAttribute), getMemberAttributeNames = js.Any.fromFunction2(getMemberAttributeNames), getMemberIds = js.Any.fromFunction1(getMemberIds), getMemberRegistry = js.Any.fromFunction3(getMemberRegistry), getMemberRegistryNames = js.Any.fromFunction2(getMemberRegistryNames), getMetaTypeId = js.Any.fromFunction0(getMetaTypeId), getMixinPaths = js.Any.fromFunction0(getMixinPaths), getNamespace = js.Any.fromFunction0(getNamespace), getNode = js.Any.fromFunction4(getNode), getOwnAttribute = js.Any.fromFunction1(getOwnAttribute), getOwnAttributeNames = js.Any.fromFunction0(getOwnAttributeNames), getOwnConstraintNames = js.Any.fromFunction0(getOwnConstraintNames), getOwnEditableAttribute = js.Any.fromFunction1(getOwnEditableAttribute), getOwnEditableRegistry = js.Any.fromFunction1(getOwnEditableRegistry), getOwnPointer = js.Any.fromFunction1(getOwnPointer), getOwnPointerId = js.Any.fromFunction1(getOwnPointerId), getOwnPointerNames = js.Any.fromFunction0(getOwnPointerNames), getOwnRegistry = js.Any.fromFunction1(getOwnRegistry), getOwnRegistryNames = js.Any.fromFunction0(getOwnRegistryNames), getOwnValidAspectNames = js.Any.fromFunction0(getOwnValidAspectNames), getOwnValidAttributeNames = js.Any.fromFunction0(getOwnValidAttributeNames), getParentId = js.Any.fromFunction0(getParentId), getPointer = js.Any.fromFunction1(getPointer), getPointerId = js.Any.fromFunction1(getPointerId), getPointerNames = js.Any.fromFunction0(getPointerNames), getRegistry = js.Any.fromFunction1(getRegistry), getRegistryNames = js.Any.fromFunction0(getRegistryNames), getRelid = js.Any.fromFunction0(getRelid), getSetNames = js.Any.fromFunction0(getSetNames), getValidAspectNames = js.Any.fromFunction0(getValidAspectNames), getValidAttributeNames = js.Any.fromFunction0(getValidAttributeNames), getValidChildrenIds = js.Any.fromFunction0(getValidChildrenIds), getValidChildrenTypes = js.Any.fromFunction0(getValidChildrenTypes), getValidChildrenTypesDetailed = js.Any.fromFunction2(getValidChildrenTypesDetailed), getValidPointerNames = js.Any.fromFunction0(getValidPointerNames), getValidSetMemberTypesDetailed = js.Any.fromFunction1(getValidSetMemberTypesDetailed), getValidSetNames = js.Any.fromFunction0(getValidSetNames), getValildAttributeNames = js.Any.fromFunction0(getValildAttributeNames), isAbstract = js.Any.fromFunction0(isAbstract), isConnection = js.Any.fromFunction0(isConnection), isLibraryElement = js.Any.fromFunction0(isLibraryElement), isLibraryRoot = js.Any.fromFunction0(isLibraryRoot), isMetaNode = js.Any.fromFunction0(isMetaNode), isReadOnly = js.Any.fromFunction0(isReadOnly), isTypeOf = js.Any.fromFunction1(isTypeOf), isValidAttributeValueOf = js.Any.fromFunction2(isValidAttributeValueOf), isValidChildOf = js.Any.fromFunction1(isValidChildOf), isValidNewBase = js.Any.fromFunction1(isValidNewBase), isValidNewParent = js.Any.fromFunction1(isValidNewParent), isValidTargetOf = js.Any.fromFunction2(isValidTargetOf))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanSetAsMixin(value: Path => Boolean): Self = StObject.set(x, "canSetAsMixin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAspectMeta(value: () => Metadata): Self = StObject.set(x, "getAspectMeta", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttribute(value: Name => OutAttr): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttributeMeta(value: Name => AttrMeta): Self = StObject.set(x, "getAttributeMeta", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBaseId(value: () => NodeId): Self = StObject.set(x, "getBaseId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBaseTypeId(value: () => Node | Null): Self = StObject.set(x, "getBaseTypeId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChildrenIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getChildrenIds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCollectionPaths(value: Name => js.Array[Path]): Self = StObject.set(x, "getCollectionPaths", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetConstraint(value: Name => Constraint): Self = StObject.set(x, "getConstraint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetConstraintNames(value: () => js.Array[Name]): Self = StObject.set(x, "getConstraintNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCrosscutsInfo(value: () => CrosscutsInfo): Self = StObject.set(x, "getCrosscutsInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getEditableAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEditableMemberAttribute(value: (SetId, MemberId, Name) => OutAttr): Self = StObject.set(x, "getEditableMemberAttribute", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetEditableMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getEditableMemberRegistry", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getEditableRegistry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFullyQualifiedName(value: () => Name): Self = StObject.set(x, "getFullyQualifiedName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGuid(value: () => GUID): Self = StObject.set(x, "getGuid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => NodeId): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInheritorIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getInheritorIds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInstancePaths(value: () => js.Array[Path]): Self = StObject.set(x, "getInstancePaths", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetJsonMeta(value: () => js.Array[Metadata]): Self = StObject.set(x, "getJsonMeta", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLibraryGuid(value: () => GUID): Self = StObject.set(x, "getLibraryGuid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMemberAttribute(value: (SetId, MemberId) => OutAttr): Self = StObject.set(x, "getMemberAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetMemberAttributeNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberAttributeNames", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetMemberIds(value: SetId => js.Array[Path]): Self = StObject.set(x, "getMemberIds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = StObject.set(x, "getMemberRegistry", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetMemberRegistryNames(value: (SetId, MemberId) => js.Array[Name]): Self = StObject.set(x, "getMemberRegistryNames", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetMetaTypeId(value: () => Node | Null): Self = StObject.set(x, "getMetaTypeId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMixinPaths(value: () => js.Array[Path]): Self = StObject.set(x, "getMixinPaths", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNamespace(value: () => Name): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNode(value: (NodeId, GmeLogger, js.Any, ResultCallback[Storage]) => Node): Self = StObject.set(x, "getNode", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetOwnAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnAttributeNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOwnConstraintNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnConstraintNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOwnEditableAttribute(value: Name => OutAttr): Self = StObject.set(x, "getOwnEditableAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnEditableRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnEditableRegistry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnPointer(value: Name => Pointer): Self = StObject.set(x, "getOwnPointer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnPointerId(value: Name => SetId): Self = StObject.set(x, "getOwnPointerId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnPointerNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOwnRegistry(value: Name => Registry): Self = StObject.set(x, "getOwnRegistry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOwnRegistryNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnRegistryNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOwnValidAspectNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnValidAspectNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOwnValidAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getOwnValidAttributeNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentId(value: () => NodeId): Self = StObject.set(x, "getParentId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPointer(value: Name => Pointer): Self = StObject.set(x, "getPointer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPointerId(value: Name => SetId): Self = StObject.set(x, "getPointerId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getPointerNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRegistry(value: Name => Registry): Self = StObject.set(x, "getRegistry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRegistryNames(value: () => js.Array[Name]): Self = StObject.set(x, "getRegistryNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRelid(value: () => RelId): Self = StObject.set(x, "getRelid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSetNames(value: () => js.Array[Name]): Self = StObject.set(x, "getSetNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidAspectNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidAspectNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidAttributeNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidChildrenIds(value: () => js.Array[NodeId]): Self = StObject.set(x, "getValidChildrenIds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidChildrenTypes(value: () => js.Array[NodeId]): Self = StObject.set(x, "getValidChildrenTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidChildrenTypesDetailed(value: (Aspect, Boolean) => Dictionary[_]): Self = StObject.set(x, "getValidChildrenTypesDetailed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetValidPointerNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidPointerNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValidSetMemberTypesDetailed(value: Name => StringDictionary[js.Any]): Self = StObject.set(x, "getValidSetMemberTypesDetailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValidSetNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValidSetNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValildAttributeNames(value: () => js.Array[Name]): Self = StObject.set(x, "getValildAttributeNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAbstract(value: () => Boolean): Self = StObject.set(x, "isAbstract", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnection(value: () => Boolean): Self = StObject.set(x, "isConnection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLibraryElement(value: () => Boolean): Self = StObject.set(x, "isLibraryElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLibraryRoot(value: () => Boolean): Self = StObject.set(x, "isLibraryRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMetaNode(value: () => Boolean): Self = StObject.set(x, "isMetaNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTypeOf(value: Path => Boolean): Self = StObject.set(x, "isTypeOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidAttributeValueOf(value: (Name, js.Any) => Boolean): Self = StObject.set(x, "isValidAttributeValueOf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValidChildOf(value: Path => Boolean): Self = StObject.set(x, "isValidChildOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidNewBase(value: Path => Boolean): Self = StObject.set(x, "isValidNewBase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidNewParent(value: Path => Boolean): Self = StObject.set(x, "isValidNewParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidTargetOf(value: (Path, Name) => Boolean): Self = StObject.set(x, "isValidTargetOf", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectHash = String
  
  type RelationRule = RelationRuleDetail with RelationRuleDictionary
  
  @js.native
  trait RelationRuleDetail extends StObject {
    
    /** 
      * The maximum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no maximum rule that applies) 
      */
    var max: js.UndefOr[Double] = js.native
    
    /** 
      * The minimum amount of target necessary for the relationship 
      * (if not present or '-1' then there is no minimum rule that applies) 
      */
    var min: js.UndefOr[Double] = js.native
  }
  object RelationRuleDetail {
    
    @scala.inline
    def apply(): RelationRuleDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationRuleDetail]
    }
    
    @scala.inline
    implicit class RelationRuleDetailMutableBuilder[Self <: RelationRuleDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  type RelationRuleDictionary = StringDictionary[RelationRuleDetail]
}
