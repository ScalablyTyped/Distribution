package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "AttachmentType")
@js.native
object AttachmentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  
  @js.native
  sealed trait AfnStrip extends AttachmentType
  /* 1 */ @js.native
  object AfnStrip extends TopLevel[AfnStrip with Double]
  
  @js.native
  sealed trait BugFilingData extends AttachmentType
  /* 2 */ @js.native
  object BugFilingData extends TopLevel[BugFilingData with Double]
  
  @js.native
  sealed trait CodeCoverage extends AttachmentType
  /* 3 */ @js.native
  object CodeCoverage extends TopLevel[CodeCoverage with Double]
  
  @js.native
  sealed trait ConsoleLog extends AttachmentType
  /* 11 */ @js.native
  object ConsoleLog extends TopLevel[ConsoleLog with Double]
  
  @js.native
  sealed trait GeneralAttachment extends AttachmentType
  /* 0 */ @js.native
  object GeneralAttachment extends TopLevel[GeneralAttachment with Double]
  
  @js.native
  sealed trait IntermediateCollectorData extends AttachmentType
  /* 4 */ @js.native
  object IntermediateCollectorData extends TopLevel[IntermediateCollectorData with Double]
  
  @js.native
  sealed trait RunConfig extends AttachmentType
  /* 5 */ @js.native
  object RunConfig extends TopLevel[RunConfig with Double]
  
  @js.native
  sealed trait TestImpactDetails extends AttachmentType
  /* 6 */ @js.native
  object TestImpactDetails extends TopLevel[TestImpactDetails with Double]
  
  @js.native
  sealed trait TmiTestResultDetail extends AttachmentType
  /* 9 */ @js.native
  object TmiTestResultDetail extends TopLevel[TmiTestResultDetail with Double]
  
  @js.native
  sealed trait TmiTestRunDeploymentFiles extends AttachmentType
  /* 7 */ @js.native
  object TmiTestRunDeploymentFiles extends TopLevel[TmiTestRunDeploymentFiles with Double]
  
  @js.native
  sealed trait TmiTestRunReverseDeploymentFiles extends AttachmentType
  /* 8 */ @js.native
  object TmiTestRunReverseDeploymentFiles extends TopLevel[TmiTestRunReverseDeploymentFiles with Double]
  
  @js.native
  sealed trait TmiTestRunSummary extends AttachmentType
  /* 10 */ @js.native
  object TmiTestRunSummary extends TopLevel[TmiTestRunSummary with Double]
}
