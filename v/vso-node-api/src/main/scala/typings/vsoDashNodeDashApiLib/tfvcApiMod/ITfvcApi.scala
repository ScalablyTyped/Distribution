package typings
package vsoDashNodeDashApiLib.tfvcApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITfvcApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def createChangeset(changeset: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef] = js.native
  def createChangeset(
    changeset: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef] = js.native
  def getBatchedChangesets(changesetsRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetsRequestData): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef]] = js.native
  def getBranch(path: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(path: java.lang.String, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(path: java.lang.String, project: java.lang.String, includeParent: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(
    path: java.lang.String,
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranchRefs(scopePath: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(scopePath: java.lang.String, project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(scopePath: java.lang.String, project: java.lang.String, includeDeleted: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(
    scopePath: java.lang.String,
    project: java.lang.String,
    includeDeleted: scala.Boolean,
    includeLinks: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranches(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String, includeParent: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String, includeParent: scala.Boolean, includeChildren: scala.Boolean): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean,
    includeDeleted: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean,
    includeDeleted: scala.Boolean,
    includeLinks: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getChangeset(
    id: scala.Double,
    project: js.UndefOr[java.lang.String],
    maxChangeCount: js.UndefOr[scala.Double],
    includeDetails: js.UndefOr[scala.Boolean],
    includeWorkItems: js.UndefOr[scala.Boolean],
    maxCommentLength: js.UndefOr[scala.Double],
    includeSourceRename: js.UndefOr[scala.Boolean],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    orderby: js.UndefOr[java.lang.String],
    searchCriteria: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetSearchCriteria]
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset] = js.native
  def getChangesetChanges(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double, skip: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double, skip: scala.Double, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetWorkItems(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getChangesetWorkItems(id: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getChangesets(
    project: js.UndefOr[java.lang.String],
    maxCommentLength: js.UndefOr[scala.Double],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    orderby: js.UndefOr[java.lang.String],
    searchCriteria: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetSearchCriteria]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef]] = js.native
  def getItem(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem] = js.native
  def getItemContent(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemText(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemZip(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItems(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(project: java.lang.String, scopePath: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType,
    includeLinks: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType,
    includeLinks: scala.Boolean,
    versionDescriptor: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItemsBatch(itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData): js.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]]] = js.native
  def getItemsBatch(
    itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData,
    project: java.lang.String
  ): js.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]]] = js.native
  def getItemsBatchZip(itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemsBatchZip(
    itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData,
    project: java.lang.String
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getLabel(
    labelId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabel] = js.native
  def getLabel(
    labelId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabel] = js.native
  def getLabelItems(labelId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabelItems(labelId: java.lang.String, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabelItems(labelId: java.lang.String, top: scala.Double, skip: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabels(requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String,
    top: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getShelveset(shelvesetId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelveset] = js.native
  def getShelveset(
    shelvesetId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData
  ): js.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelveset] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String, top: scala.Double, skip: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetWorkItems(shelvesetId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getShelvesets(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData,
    top: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData,
    top: scala.Double,
    skip: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
}

