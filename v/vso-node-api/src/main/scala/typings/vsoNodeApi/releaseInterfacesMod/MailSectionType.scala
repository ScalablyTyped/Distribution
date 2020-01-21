package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailSectionType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends js.Object {
  @js.native
  sealed trait Details extends MailSectionType
  
  @js.native
  sealed trait Environments extends MailSectionType
  
  @js.native
  sealed trait Issues extends MailSectionType
  
  @js.native
  sealed trait ReleaseInfo extends MailSectionType
  
  @js.native
  sealed trait TestResults extends MailSectionType
  
  @js.native
  sealed trait WorkItems extends MailSectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailSectionType with Double] = js.native
  /* 0 */ @js.native
  object Details extends TopLevel[Details with Double]
  
  /* 1 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  /* 2 */ @js.native
  object Issues extends TopLevel[Issues with Double]
  
  /* 5 */ @js.native
  object ReleaseInfo extends TopLevel[ReleaseInfo with Double]
  
  /* 3 */ @js.native
  object TestResults extends TopLevel[TestResults with Double]
  
  /* 4 */ @js.native
  object WorkItems extends TopLevel[WorkItems with Double]
  
}

