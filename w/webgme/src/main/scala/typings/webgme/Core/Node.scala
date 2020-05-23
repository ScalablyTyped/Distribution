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
import scala.scalajs.js.annotation._

trait Node extends js.Object {
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
  def getNode(id: NodeId, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]): Node
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
  def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[_]
  def getValidPointerNames(): js.Array[Name]
  def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[js.Any]
  def getValidSetNames(): js.Array[Name]
  def getValildAttributeNames(): js.Array[Name]
  def isAbstract(): Boolean
  def isConnection(): Boolean
  def isLibraryElement(): Boolean
  def isLibraryRoot(): Boolean
  def isMetaNode(): Boolean
  def isReadOnly(): Boolean
  def isTypeOf(typePath: Path): Boolean
  def isValidAttributeValueOf(name: Name, value: js.Any): Boolean
  def isValidChildOf(parentPath: Path): Boolean
  def isValidNewBase(basePath: Path): Boolean
  def isValidNewParent(parentPath: Path): Boolean
  def isValidTargetOf(sourcePath: Path, name: Name): Boolean
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
}

