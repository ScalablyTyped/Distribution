package typings
package webgmeLib.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Core.Node")
@js.native
class Node () extends js.Object {
  def this(id: java.lang.String, logger: webgmeLib.GlobalNs.GmeLogger, state: js.Any, storeNode: webgmeLib.GmeCommonNs.ResultCallback[stdLib.Storage]) = this()
  var _id: java.lang.String = js.native
  def canSetAsMixin(mixinPath: webgmeLib.GmeCommonNs.Path): scala.Boolean = js.native
  def getAspectMeta(): webgmeLib.GmeCommonNs.Metadata = js.native
  def getAttribute(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getAttributeMeta(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.AttrMeta = js.native
  def getAttributeNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getBaseId(): webgmeLib.GmeCommonNs.NodeId = js.native
  def getBaseTypeId(): Node | scala.Null = js.native
  def getChildrenIds(): js.Array[webgmeLib.GmeCommonNs.NodeId] = js.native
  def getCollectionPaths(name: webgmeLib.GmeCommonNs.Name): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  def getConstraint(name: webgmeLib.GmeCommonNs.Name): Constraint = js.native
  def getConstraintNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getCrosscutsInfo(): webgmeLib.GmeCommonNs.CrosscutsInfo = js.native
  def getEditableAttribute(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getEditableMemberAttribute(
    setId: webgmeLib.GmeCommonNs.SetId,
    memberId: webgmeLib.GmeCommonNs.MemberId,
    name: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getEditableMemberRegistry(
    setId: webgmeLib.GmeCommonNs.SetId,
    memberId: webgmeLib.GmeCommonNs.MemberId,
    name: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.Registry = js.native
  def getEditableRegistry(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Registry = js.native
  def getFullyQualifiedName(): webgmeLib.GmeCommonNs.Name = js.native
  def getGuid(): GUID = js.native
  def getId(): webgmeLib.GmeCommonNs.NodeId = js.native
  def getInheritorIds(): js.Array[webgmeLib.GmeCommonNs.NodeId] = js.native
  def getInstancePaths(): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  def getJsonMeta(): js.Array[webgmeLib.GmeCommonNs.Metadata] = js.native
  def getLibraryGuid(): GUID = js.native
  def getMemberAttribute(setId: webgmeLib.GmeCommonNs.SetId, memberId: webgmeLib.GmeCommonNs.MemberId): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getMemberAttributeNames(setId: webgmeLib.GmeCommonNs.SetId, memberId: webgmeLib.GmeCommonNs.MemberId): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  /** Set */
  def getMemberIds(setId: webgmeLib.GmeCommonNs.SetId): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  def getMemberRegistry(
    setId: webgmeLib.GmeCommonNs.SetId,
    memberId: webgmeLib.GmeCommonNs.MemberId,
    name: webgmeLib.GmeCommonNs.Name
  ): webgmeLib.GmeCommonNs.Registry = js.native
  def getMemberRegistryNames(setId: webgmeLib.GmeCommonNs.SetId, memberId: webgmeLib.GmeCommonNs.MemberId): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getMetaTypeId(): Node | scala.Null = js.native
  /** MixIns */
  def getMixinPaths(): js.Array[webgmeLib.GmeCommonNs.Path] = js.native
  def getNamespace(): webgmeLib.GmeCommonNs.Name = js.native
  def getNode(
    id: webgmeLib.GmeCommonNs.NodeId,
    logger: webgmeLib.GlobalNs.GmeLogger,
    state: js.Any,
    storeNode: webgmeLib.GmeCommonNs.ResultCallback[stdLib.Storage]
  ): Node = js.native
  def getOwnAttribute(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getOwnAttributeNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getOwnConstraintNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getOwnEditableAttribute(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.OutAttr = js.native
  def getOwnEditableRegistry(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Registry = js.native
  def getOwnPointer(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Pointer = js.native
  def getOwnPointerId(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.SetId = js.native
  def getOwnPointerNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getOwnRegistry(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Registry = js.native
  def getOwnRegistryNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getOwnValidAspectNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getOwnValidAttributeNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getParentId(): webgmeLib.GmeCommonNs.NodeId = js.native
  def getPointer(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Pointer = js.native
  def getPointerId(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.SetId = js.native
  def getPointerNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getRegistry(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeCommonNs.Registry = js.native
  def getRegistryNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getRelid(): webgmeLib.GmeCommonNs.RelId = js.native
  def getSetNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getValidAspectNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getValidAttributeNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getValidChildrenIds(): js.Array[webgmeLib.GmeCommonNs.NodeId] = js.native
  /** META */
  def getValidChildrenTypes(): js.Array[webgmeLib.GmeCommonNs.NodeId] = js.native
  def getValidChildrenTypesDetailed(aspect: webgmeLib.GmeCommonNs.Aspect, noFilter: scala.Boolean): webgmeLib.GmeCommonNs.Dictionary[_] = js.native
  def getValidPointerNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getValidSetMemberTypesDetailed(setName: webgmeLib.GmeCommonNs.Name): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getValidSetNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def getValildAttributeNames(): js.Array[webgmeLib.GmeCommonNs.Name] = js.native
  def isAbstract(): scala.Boolean = js.native
  def isConnection(): scala.Boolean = js.native
  def isLibraryElement(): scala.Boolean = js.native
  def isLibraryRoot(): scala.Boolean = js.native
  def isMetaNode(): scala.Boolean = js.native
  def isReadOnly(): scala.Boolean = js.native
  def isTypeOf(typePath: webgmeLib.GmeCommonNs.Path): scala.Boolean = js.native
  def isValidAttributeValueOf(name: webgmeLib.GmeCommonNs.Name, value: js.Any): scala.Boolean = js.native
  def isValidChildOf(parentPath: webgmeLib.GmeCommonNs.Path): scala.Boolean = js.native
  def isValidNewBase(basePath: webgmeLib.GmeCommonNs.Path): scala.Boolean = js.native
  def isValidNewParent(parentPath: webgmeLib.GmeCommonNs.Path): scala.Boolean = js.native
  def isValidTargetOf(sourcePath: webgmeLib.GmeCommonNs.Path, name: webgmeLib.GmeCommonNs.Name): scala.Boolean = js.native
}

