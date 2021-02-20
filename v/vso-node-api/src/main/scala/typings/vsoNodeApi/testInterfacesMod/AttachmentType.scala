package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  
  @js.native
  sealed trait AfnStrip extends AttachmentType
  /* 1 */ val AfnStrip: typings.vsoNodeApi.testInterfacesMod.AttachmentType.AfnStrip with Double = js.native
  
  @js.native
  sealed trait BugFilingData extends AttachmentType
  /* 2 */ val BugFilingData: typings.vsoNodeApi.testInterfacesMod.AttachmentType.BugFilingData with Double = js.native
  
  @js.native
  sealed trait CodeCoverage extends AttachmentType
  /* 3 */ val CodeCoverage: typings.vsoNodeApi.testInterfacesMod.AttachmentType.CodeCoverage with Double = js.native
  
  @js.native
  sealed trait ConsoleLog extends AttachmentType
  /* 11 */ val ConsoleLog: typings.vsoNodeApi.testInterfacesMod.AttachmentType.ConsoleLog with Double = js.native
  
  @js.native
  sealed trait GeneralAttachment extends AttachmentType
  /* 0 */ val GeneralAttachment: typings.vsoNodeApi.testInterfacesMod.AttachmentType.GeneralAttachment with Double = js.native
  
  @js.native
  sealed trait IntermediateCollectorData extends AttachmentType
  /* 4 */ val IntermediateCollectorData: typings.vsoNodeApi.testInterfacesMod.AttachmentType.IntermediateCollectorData with Double = js.native
  
  @js.native
  sealed trait RunConfig extends AttachmentType
  /* 5 */ val RunConfig: typings.vsoNodeApi.testInterfacesMod.AttachmentType.RunConfig with Double = js.native
  
  @js.native
  sealed trait TestImpactDetails extends AttachmentType
  /* 6 */ val TestImpactDetails: typings.vsoNodeApi.testInterfacesMod.AttachmentType.TestImpactDetails with Double = js.native
  
  @js.native
  sealed trait TmiTestResultDetail extends AttachmentType
  /* 9 */ val TmiTestResultDetail: typings.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestResultDetail with Double = js.native
  
  @js.native
  sealed trait TmiTestRunDeploymentFiles extends AttachmentType
  /* 7 */ val TmiTestRunDeploymentFiles: typings.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunDeploymentFiles with Double = js.native
  
  @js.native
  sealed trait TmiTestRunReverseDeploymentFiles extends AttachmentType
  /* 8 */ val TmiTestRunReverseDeploymentFiles: typings.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunReverseDeploymentFiles with Double = js.native
  
  @js.native
  sealed trait TmiTestRunSummary extends AttachmentType
  /* 10 */ val TmiTestRunSummary: typings.vsoNodeApi.testInterfacesMod.AttachmentType.TmiTestRunSummary with Double = js.native
}
