package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailSectionType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends js.Object {
  @js.native
  sealed trait Details
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  @js.native
  sealed trait Environments
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  @js.native
  sealed trait Issues
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  @js.native
  sealed trait ReleaseInfo
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  @js.native
  sealed trait TestResults
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  @js.native
  sealed trait WorkItems
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType
  
  /* 0 */ val Details: Details with scala.Double = js.native
  /* 1 */ val Environments: Environments with scala.Double = js.native
  /* 2 */ val Issues: Issues with scala.Double = js.native
  /* 5 */ val ReleaseInfo: ReleaseInfo with scala.Double = js.native
  /* 3 */ val TestResults: TestResults with scala.Double = js.native
  /* 4 */ val WorkItems: WorkItems with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailSectionType with scala.Double
  ] = js.native
}

