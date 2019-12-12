package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.AfnStrip
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.BugFilingData
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.CodeCoverage
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.ConsoleLog
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.GeneralAttachment
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.IntermediateCollectorData
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.RunConfig
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.TestImpactDetails
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.TmiTestResultDetail
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunDeploymentFiles
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunReverseDeploymentFiles
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait AfnStrip extends AttachmentType
  
  @js.native
  sealed trait BugFilingData extends AttachmentType
  
  @js.native
  sealed trait CodeCoverage extends AttachmentType
  
  @js.native
  sealed trait ConsoleLog extends AttachmentType
  
  @js.native
  sealed trait GeneralAttachment extends AttachmentType
  
  @js.native
  sealed trait IntermediateCollectorData extends AttachmentType
  
  @js.native
  sealed trait RunConfig extends AttachmentType
  
  @js.native
  sealed trait TestImpactDetails extends AttachmentType
  
  @js.native
  sealed trait TmiTestResultDetail extends AttachmentType
  
  @js.native
  sealed trait TmiTestRunDeploymentFiles extends AttachmentType
  
  @js.native
  sealed trait TmiTestRunReverseDeploymentFiles extends AttachmentType
  
  @js.native
  sealed trait TmiTestRunSummary extends AttachmentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  /* 1 */ @js.native
  object AfnStrip extends TopLevel[AfnStrip with Double]
  
  /* 2 */ @js.native
  object BugFilingData extends TopLevel[BugFilingData with Double]
  
  /* 3 */ @js.native
  object CodeCoverage extends TopLevel[CodeCoverage with Double]
  
  /* 11 */ @js.native
  object ConsoleLog extends TopLevel[ConsoleLog with Double]
  
  /* 0 */ @js.native
  object GeneralAttachment extends TopLevel[GeneralAttachment with Double]
  
  /* 4 */ @js.native
  object IntermediateCollectorData extends TopLevel[IntermediateCollectorData with Double]
  
  /* 5 */ @js.native
  object RunConfig extends TopLevel[RunConfig with Double]
  
  /* 6 */ @js.native
  object TestImpactDetails extends TopLevel[TestImpactDetails with Double]
  
  /* 9 */ @js.native
  object TmiTestResultDetail extends TopLevel[TmiTestResultDetail with Double]
  
  /* 7 */ @js.native
  object TmiTestRunDeploymentFiles extends TopLevel[TmiTestRunDeploymentFiles with Double]
  
  /* 8 */ @js.native
  object TmiTestRunReverseDeploymentFiles extends TopLevel[TmiTestRunReverseDeploymentFiles with Double]
  
  /* 10 */ @js.native
  object TmiTestRunSummary extends TopLevel[TmiTestRunSummary with Double]
  
}

