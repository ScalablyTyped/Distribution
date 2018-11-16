package typings
package vsoDashNodeDashApiLib.tfvcapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITfvcApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createChangeset(changeset: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef] = js.native
  def createChangeset(
    changeset: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef] = js.native
  def getBatchedChangesets(changesetsRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetsRequestData): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef]] = js.native
  def getBranch(path: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(path: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(path: java.lang.String, project: java.lang.String, includeParent: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranch(
    path: java.lang.String,
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch] = js.native
  def getBranchRefs(scopePath: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(scopePath: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(scopePath: java.lang.String, project: java.lang.String, includeDeleted: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranchRefs(
    scopePath: java.lang.String,
    project: java.lang.String,
    includeDeleted: scala.Boolean,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranchRef]] = js.native
  def getBranches(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String, includeParent: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(project: java.lang.String, includeParent: scala.Boolean, includeChildren: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean,
    includeDeleted: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
  def getBranches(
    project: java.lang.String,
    includeParent: scala.Boolean,
    includeChildren: scala.Boolean,
    includeDeleted: scala.Boolean,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcBranch]] = js.native
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
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangeset] = js.native
  def getChangesetChanges(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetChanges(id: scala.Double, skip: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getChangesetWorkItems(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getChangesetWorkItems(id: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getChangesets(
    project: js.UndefOr[java.lang.String],
    maxCommentLength: js.UndefOr[scala.Double],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    orderby: js.UndefOr[java.lang.String],
    searchCriteria: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetSearchCriteria]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChangesetRef]] = js.native
  def getItem(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem] = js.native
  def getItemContent(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemText(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemZip(
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    fileName: js.UndefOr[java.lang.String],
    download: js.UndefOr[scala.Boolean],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItems(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(project: java.lang.String, scopePath: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItems(
    project: java.lang.String,
    scopePath: java.lang.String,
    recursionLevel: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.VersionControlRecursionType,
    includeLinks: scala.Boolean,
    versionDescriptor: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcVersionDescriptor
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getItemsBatch(itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData): stdLib.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]]] = js.native
  def getItemsBatch(
    itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData,
    project: java.lang.String
  ): stdLib.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]]] = js.native
  def getItemsBatchZip(itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemsBatchZip(
    itemRequestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItemRequestData,
    project: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getLabel(
    labelId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabel] = js.native
  def getLabel(
    labelId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabel] = js.native
  def getLabelItems(labelId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabelItems(labelId: java.lang.String, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabelItems(labelId: java.lang.String, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcItem]] = js.native
  def getLabels(requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getLabels(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRequestData,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcLabelRef]] = js.native
  def getShelveset(shelvesetId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelveset] = js.native
  def getShelveset(
    shelvesetId: java.lang.String,
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelveset] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetChanges(shelvesetId: java.lang.String, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcChange]] = js.native
  def getShelvesetWorkItems(shelvesetId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.AssociatedWorkItem]] = js.native
  def getShelvesets(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
  def getShelvesets(
    requestData: vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRequestData,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod.TfvcShelvesetRef]] = js.native
}

