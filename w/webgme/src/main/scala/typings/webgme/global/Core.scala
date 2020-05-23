package typings.webgme.global

import org.scalablytyped.runtime.StringDictionary
import typings.std.Storage
import typings.webgme.Core.Constraint
import typings.webgme.Core.GUID
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

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
@JSGlobal("Core")
@js.native
object Core extends js.Object {
  @js.native
  class Node ()
    extends typings.webgme.Core.Node {
    def this(id: String, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]) = this()
    /* CompleteClass */
    override var _id: String = js.native
    /* CompleteClass */
    override def canSetAsMixin(mixinPath: Path): Boolean = js.native
    /* CompleteClass */
    override def getAspectMeta(): Metadata = js.native
    /* CompleteClass */
    override def getAttribute(name: Name): OutAttr = js.native
    /* CompleteClass */
    override def getAttributeMeta(name: Name): AttrMeta = js.native
    /* CompleteClass */
    override def getAttributeNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getBaseId(): NodeId = js.native
    /* CompleteClass */
    override def getBaseTypeId(): typings.webgme.Core.Node | Null = js.native
    /* CompleteClass */
    override def getChildrenIds(): js.Array[NodeId] = js.native
    /* CompleteClass */
    override def getCollectionPaths(name: Name): js.Array[Path] = js.native
    /* CompleteClass */
    override def getConstraint(name: Name): Constraint = js.native
    /* CompleteClass */
    override def getConstraintNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getCrosscutsInfo(): CrosscutsInfo = js.native
    /* CompleteClass */
    override def getEditableAttribute(name: Name): OutAttr = js.native
    /* CompleteClass */
    override def getEditableMemberAttribute(setId: SetId, memberId: MemberId, name: Name): OutAttr = js.native
    /* CompleteClass */
    override def getEditableMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
    /* CompleteClass */
    override def getEditableRegistry(name: Name): Registry = js.native
    /* CompleteClass */
    override def getFullyQualifiedName(): Name = js.native
    /* CompleteClass */
    override def getGuid(): GUID = js.native
    /* CompleteClass */
    override def getId(): NodeId = js.native
    /* CompleteClass */
    override def getInheritorIds(): js.Array[NodeId] = js.native
    /* CompleteClass */
    override def getInstancePaths(): js.Array[Path] = js.native
    /* CompleteClass */
    override def getJsonMeta(): js.Array[Metadata] = js.native
    /* CompleteClass */
    override def getLibraryGuid(): GUID = js.native
    /* CompleteClass */
    override def getMemberAttribute(setId: SetId, memberId: MemberId): OutAttr = js.native
    /* CompleteClass */
    override def getMemberAttributeNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
    /** Set */
    /* CompleteClass */
    override def getMemberIds(setId: SetId): js.Array[Path] = js.native
    /* CompleteClass */
    override def getMemberRegistry(setId: SetId, memberId: MemberId, name: Name): Registry = js.native
    /* CompleteClass */
    override def getMemberRegistryNames(setId: SetId, memberId: MemberId): js.Array[Name] = js.native
    /* CompleteClass */
    override def getMetaTypeId(): typings.webgme.Core.Node | Null = js.native
    /** MixIns */
    /* CompleteClass */
    override def getMixinPaths(): js.Array[Path] = js.native
    /* CompleteClass */
    override def getNamespace(): Name = js.native
    /* CompleteClass */
    override def getNode(id: NodeId, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]): typings.webgme.Core.Node = js.native
    /* CompleteClass */
    override def getOwnAttribute(name: Name): OutAttr = js.native
    /* CompleteClass */
    override def getOwnAttributeNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getOwnConstraintNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getOwnEditableAttribute(name: Name): OutAttr = js.native
    /* CompleteClass */
    override def getOwnEditableRegistry(name: Name): Registry = js.native
    /* CompleteClass */
    override def getOwnPointer(name: Name): Pointer = js.native
    /* CompleteClass */
    override def getOwnPointerId(name: Name): SetId = js.native
    /* CompleteClass */
    override def getOwnPointerNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getOwnRegistry(name: Name): Registry = js.native
    /* CompleteClass */
    override def getOwnRegistryNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getOwnValidAspectNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getOwnValidAttributeNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getParentId(): NodeId = js.native
    /* CompleteClass */
    override def getPointer(name: Name): Pointer = js.native
    /* CompleteClass */
    override def getPointerId(name: Name): SetId = js.native
    /* CompleteClass */
    override def getPointerNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getRegistry(name: Name): Registry = js.native
    /* CompleteClass */
    override def getRegistryNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getRelid(): RelId = js.native
    /* CompleteClass */
    override def getSetNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getValidAspectNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getValidAttributeNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getValidChildrenIds(): js.Array[NodeId] = js.native
    /** META */
    /* CompleteClass */
    override def getValidChildrenTypes(): js.Array[NodeId] = js.native
    /* CompleteClass */
    override def getValidChildrenTypesDetailed(aspect: Aspect, noFilter: Boolean): Dictionary[_] = js.native
    /* CompleteClass */
    override def getValidPointerNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getValidSetMemberTypesDetailed(setName: Name): StringDictionary[js.Any] = js.native
    /* CompleteClass */
    override def getValidSetNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def getValildAttributeNames(): js.Array[Name] = js.native
    /* CompleteClass */
    override def isAbstract(): Boolean = js.native
    /* CompleteClass */
    override def isConnection(): Boolean = js.native
    /* CompleteClass */
    override def isLibraryElement(): Boolean = js.native
    /* CompleteClass */
    override def isLibraryRoot(): Boolean = js.native
    /* CompleteClass */
    override def isMetaNode(): Boolean = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def isTypeOf(typePath: Path): Boolean = js.native
    /* CompleteClass */
    override def isValidAttributeValueOf(name: Name, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def isValidChildOf(parentPath: Path): Boolean = js.native
    /* CompleteClass */
    override def isValidNewBase(basePath: Path): Boolean = js.native
    /* CompleteClass */
    override def isValidNewParent(parentPath: Path): Boolean = js.native
    /* CompleteClass */
    override def isValidTargetOf(sourcePath: Path, name: Name): Boolean = js.native
  }
  
}

