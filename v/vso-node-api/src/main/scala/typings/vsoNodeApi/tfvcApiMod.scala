package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.tfvcInterfacesMod.AssociatedWorkItem
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcBranch
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcBranchRef
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcChange
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcChangeset
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetRef
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetSearchCriteria
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcChangesetsRequestData
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcItem
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcItemRequestData
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcLabel
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcLabelRef
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcLabelRequestData
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcShelveset
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcShelvesetRef
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcShelvesetRequestData
import typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionDescriptor
import typings.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfvcApiMod {
  
  @JSImport("vso-node-api/TfvcApi", "TfvcApi")
  @js.native
  class TfvcApi protected () extends ITfvcApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ITfvcApi extends ClientApiBase {
    
    def createChangeset(changeset: TfvcChangeset): js.Promise[TfvcChangesetRef] = js.native
    def createChangeset(changeset: TfvcChangeset, project: String): js.Promise[TfvcChangesetRef] = js.native
    
    def getBatchedChangesets(changesetsRequestData: TfvcChangesetsRequestData): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    
    def getBranch(path: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: String, includeParent: Unit, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Boolean, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    def getBranch(path: String, project: Unit, includeParent: Unit, includeChildren: Boolean): js.Promise[TfvcBranch] = js.native
    
    def getBranchRefs(scopePath: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Boolean, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: String, includeDeleted: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Boolean, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    def getBranchRefs(scopePath: String, project: Unit, includeDeleted: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcBranchRef]] = js.native
    
    def getBranches(): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Boolean, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: String, includeParent: Unit, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: String,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Boolean, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Boolean,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Boolean, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Boolean,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(project: Unit, includeParent: Unit, includeChildren: Unit, includeDeleted: Boolean): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Boolean,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    def getBranches(
      project: Unit,
      includeParent: Unit,
      includeChildren: Unit,
      includeDeleted: Unit,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcBranch]] = js.native
    
    def getChangeset(
      id: Double,
      project: js.UndefOr[String],
      maxChangeCount: js.UndefOr[Double],
      includeDetails: js.UndefOr[Boolean],
      includeWorkItems: js.UndefOr[Boolean],
      maxCommentLength: js.UndefOr[Double],
      includeSourceRename: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[TfvcChangeset] = js.native
    
    def getChangesetChanges(): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Double, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Double, skip: Unit, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Double, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getChangesetChanges(id: Unit, skip: Unit, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    
    def getChangesetWorkItems(): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getChangesetWorkItems(id: Double): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    
    def getChangesets(
      project: js.UndefOr[String],
      maxCommentLength: js.UndefOr[Double],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      orderby: js.UndefOr[String],
      searchCriteria: js.UndefOr[TfvcChangesetSearchCriteria]
    ): js.Promise[js.Array[TfvcChangesetRef]] = js.native
    
    def getItem(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[TfvcItem] = js.native
    
    def getItemContent(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemText(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItemZip(
      path: String,
      project: js.UndefOr[String],
      fileName: js.UndefOr[String],
      download: js.UndefOr[Boolean],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      versionDescriptor: js.UndefOr[TfvcVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    
    def getItems(): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: String, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: Unit, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: String, scopePath: Unit, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: String,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: String, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: String,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: Unit, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: Unit,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: VersionControlRecursionType): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(project: Unit, scopePath: Unit, recursionLevel: VersionControlRecursionType, includeLinks: Boolean): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Boolean,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    def getItems(
      project: Unit,
      scopePath: Unit,
      recursionLevel: VersionControlRecursionType,
      includeLinks: Unit,
      versionDescriptor: TfvcVersionDescriptor
    ): js.Promise[js.Array[TfvcItem]] = js.native
    
    def getItemsBatch(itemRequestData: TfvcItemRequestData): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    def getItemsBatch(itemRequestData: TfvcItemRequestData, project: String): js.Promise[js.Array[js.Array[TfvcItem]]] = js.native
    
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData): js.Promise[ReadableStream] = js.native
    def getItemsBatchZip(itemRequestData: TfvcItemRequestData, project: String): js.Promise[ReadableStream] = js.native
    
    def getLabel(labelId: String, requestData: TfvcLabelRequestData): js.Promise[TfvcLabel] = js.native
    def getLabel(labelId: String, requestData: TfvcLabelRequestData, project: String): js.Promise[TfvcLabel] = js.native
    
    def getLabelItems(labelId: String): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcItem]] = js.native
    def getLabelItems(labelId: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcItem]] = js.native
    
    def getLabels(requestData: TfvcLabelRequestData): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Double, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Double, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    def getLabels(requestData: TfvcLabelRequestData, project: Unit, top: Unit, skip: Double): js.Promise[js.Array[TfvcLabelRef]] = js.native
    
    def getShelveset(shelvesetId: String): js.Promise[TfvcShelveset] = js.native
    def getShelveset(shelvesetId: String, requestData: TfvcShelvesetRequestData): js.Promise[TfvcShelveset] = js.native
    
    def getShelvesetChanges(shelvesetId: String): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Double, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    def getShelvesetChanges(shelvesetId: String, top: Unit, skip: Double): js.Promise[js.Array[TfvcChange]] = js.native
    
    def getShelvesetWorkItems(shelvesetId: String): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    
    def getShelvesets(): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Double, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: Unit, top: Unit, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Double, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
    def getShelvesets(requestData: TfvcShelvesetRequestData, top: Unit, skip: Double): js.Promise[js.Array[TfvcShelvesetRef]] = js.native
  }
}
