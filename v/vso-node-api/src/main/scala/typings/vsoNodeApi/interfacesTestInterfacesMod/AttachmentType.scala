package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "AttachmentType")
@js.native
object AttachmentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType & Double] = js.native
  
  @js.native
  sealed trait AfnStrip
    extends StObject
       with AttachmentType
  /* 1 */ val AfnStrip: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.AfnStrip & Double = js.native
  
  @js.native
  sealed trait BugFilingData
    extends StObject
       with AttachmentType
  /* 2 */ val BugFilingData: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.BugFilingData & Double = js.native
  
  @js.native
  sealed trait CodeCoverage
    extends StObject
       with AttachmentType
  /* 3 */ val CodeCoverage: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.CodeCoverage & Double = js.native
  
  @js.native
  sealed trait ConsoleLog
    extends StObject
       with AttachmentType
  /* 11 */ val ConsoleLog: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.ConsoleLog & Double = js.native
  
  @js.native
  sealed trait GeneralAttachment
    extends StObject
       with AttachmentType
  /* 0 */ val GeneralAttachment: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.GeneralAttachment & Double = js.native
  
  @js.native
  sealed trait IntermediateCollectorData
    extends StObject
       with AttachmentType
  /* 4 */ val IntermediateCollectorData: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.IntermediateCollectorData & Double = js.native
  
  @js.native
  sealed trait RunConfig
    extends StObject
       with AttachmentType
  /* 5 */ val RunConfig: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.RunConfig & Double = js.native
  
  @js.native
  sealed trait TestImpactDetails
    extends StObject
       with AttachmentType
  /* 6 */ val TestImpactDetails: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.TestImpactDetails & Double = js.native
  
  @js.native
  sealed trait TmiTestResultDetail
    extends StObject
       with AttachmentType
  /* 9 */ val TmiTestResultDetail: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.TmiTestResultDetail & Double = js.native
  
  @js.native
  sealed trait TmiTestRunDeploymentFiles
    extends StObject
       with AttachmentType
  /* 7 */ val TmiTestRunDeploymentFiles: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunDeploymentFiles & Double = js.native
  
  @js.native
  sealed trait TmiTestRunReverseDeploymentFiles
    extends StObject
       with AttachmentType
  /* 8 */ val TmiTestRunReverseDeploymentFiles: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunReverseDeploymentFiles & Double = js.native
  
  @js.native
  sealed trait TmiTestRunSummary
    extends StObject
       with AttachmentType
  /* 10 */ val TmiTestRunSummary: typings.vsoNodeApi.interfacesTestInterfacesMod.AttachmentType.TmiTestRunSummary & Double = js.native
}
