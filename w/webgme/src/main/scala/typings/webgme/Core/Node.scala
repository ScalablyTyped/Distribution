package typings.webgme.Core

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
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
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSetAsMixin(value: Path => Boolean): Self = this.set("canSetAsMixin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAspectMeta(value: () => Metadata): Self = this.set("getAspectMeta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttribute(value: Name => OutAttr): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeMeta(value: Name => AttrMeta): Self = this.set("getAttributeMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[Name]): Self = this.set("getAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBaseId(value: () => NodeId): Self = this.set("getBaseId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBaseTypeId(value: () => Node | Null): Self = this.set("getBaseTypeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChildrenIds(value: () => js.Array[NodeId]): Self = this.set("getChildrenIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCollectionPaths(value: Name => js.Array[Path]): Self = this.set("getCollectionPaths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConstraint(value: Name => Constraint): Self = this.set("getConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConstraintNames(value: () => js.Array[Name]): Self = this.set("getConstraintNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCrosscutsInfo(value: () => CrosscutsInfo): Self = this.set("getCrosscutsInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEditableAttribute(value: Name => OutAttr): Self = this.set("getEditableAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEditableMemberAttribute(value: (SetId, MemberId, Name) => OutAttr): Self = this.set("getEditableMemberAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetEditableMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = this.set("getEditableMemberRegistry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetEditableRegistry(value: Name => Registry): Self = this.set("getEditableRegistry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFullyQualifiedName(value: () => Name): Self = this.set("getFullyQualifiedName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGuid(value: () => GUID): Self = this.set("getGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => NodeId): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInheritorIds(value: () => js.Array[NodeId]): Self = this.set("getInheritorIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstancePaths(value: () => js.Array[Path]): Self = this.set("getInstancePaths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJsonMeta(value: () => js.Array[Metadata]): Self = this.set("getJsonMeta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLibraryGuid(value: () => GUID): Self = this.set("getLibraryGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemberAttribute(value: (SetId, MemberId) => OutAttr): Self = this.set("getMemberAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMemberAttributeNames(value: (SetId, MemberId) => js.Array[Name]): Self = this.set("getMemberAttributeNames", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMemberIds(value: SetId => js.Array[Path]): Self = this.set("getMemberIds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMemberRegistry(value: (SetId, MemberId, Name) => Registry): Self = this.set("getMemberRegistry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetMemberRegistryNames(value: (SetId, MemberId) => js.Array[Name]): Self = this.set("getMemberRegistryNames", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMetaTypeId(value: () => Node | Null): Self = this.set("getMetaTypeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMixinPaths(value: () => js.Array[Path]): Self = this.set("getMixinPaths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNamespace(value: () => Name): Self = this.set("getNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNode(value: (NodeId, GmeLogger, js.Any, ResultCallback[Storage]) => Node): Self = this.set("getNode", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetOwnAttribute(value: Name => OutAttr): Self = this.set("getOwnAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnAttributeNames(value: () => js.Array[Name]): Self = this.set("getOwnAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnConstraintNames(value: () => js.Array[Name]): Self = this.set("getOwnConstraintNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnEditableAttribute(value: Name => OutAttr): Self = this.set("getOwnEditableAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnEditableRegistry(value: Name => Registry): Self = this.set("getOwnEditableRegistry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnPointer(value: Name => Pointer): Self = this.set("getOwnPointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnPointerId(value: Name => SetId): Self = this.set("getOwnPointerId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnPointerNames(value: () => js.Array[Name]): Self = this.set("getOwnPointerNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnRegistry(value: Name => Registry): Self = this.set("getOwnRegistry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOwnRegistryNames(value: () => js.Array[Name]): Self = this.set("getOwnRegistryNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnValidAspectNames(value: () => js.Array[Name]): Self = this.set("getOwnValidAspectNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnValidAttributeNames(value: () => js.Array[Name]): Self = this.set("getOwnValidAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentId(value: () => NodeId): Self = this.set("getParentId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointer(value: Name => Pointer): Self = this.set("getPointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPointerId(value: Name => SetId): Self = this.set("getPointerId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPointerNames(value: () => js.Array[Name]): Self = this.set("getPointerNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRegistry(value: Name => Registry): Self = this.set("getRegistry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRegistryNames(value: () => js.Array[Name]): Self = this.set("getRegistryNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRelid(value: () => RelId): Self = this.set("getRelid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSetNames(value: () => js.Array[Name]): Self = this.set("getSetNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidAspectNames(value: () => js.Array[Name]): Self = this.set("getValidAspectNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidAttributeNames(value: () => js.Array[Name]): Self = this.set("getValidAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidChildrenIds(value: () => js.Array[NodeId]): Self = this.set("getValidChildrenIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidChildrenTypes(value: () => js.Array[NodeId]): Self = this.set("getValidChildrenTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidChildrenTypesDetailed(value: (Aspect, Boolean) => Dictionary[_]): Self = this.set("getValidChildrenTypesDetailed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValidPointerNames(value: () => js.Array[Name]): Self = this.set("getValidPointerNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValidSetMemberTypesDetailed(value: Name => StringDictionary[js.Any]): Self = this.set("getValidSetMemberTypesDetailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValidSetNames(value: () => js.Array[Name]): Self = this.set("getValidSetNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValildAttributeNames(value: () => js.Array[Name]): Self = this.set("getValildAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAbstract(value: () => Boolean): Self = this.set("isAbstract", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnection(value: () => Boolean): Self = this.set("isConnection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLibraryElement(value: () => Boolean): Self = this.set("isLibraryElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLibraryRoot(value: () => Boolean): Self = this.set("isLibraryRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMetaNode(value: () => Boolean): Self = this.set("isMetaNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTypeOf(value: Path => Boolean): Self = this.set("isTypeOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidAttributeValueOf(value: (Name, js.Any) => Boolean): Self = this.set("isValidAttributeValueOf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsValidChildOf(value: Path => Boolean): Self = this.set("isValidChildOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidNewBase(value: Path => Boolean): Self = this.set("isValidNewBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidNewParent(value: Path => Boolean): Self = this.set("isValidNewParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidTargetOf(value: (Path, Name) => Boolean): Self = this.set("isValidTargetOf", js.Any.fromFunction2(value))
  }
}
