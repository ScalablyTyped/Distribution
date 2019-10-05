package typings.webgme.Core

import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.webgme.Global.GmeLogger
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

@JSGlobal("Core.Node")
@js.native
class Node () extends js.Object {
  def this(id: String, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]) = this()
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

