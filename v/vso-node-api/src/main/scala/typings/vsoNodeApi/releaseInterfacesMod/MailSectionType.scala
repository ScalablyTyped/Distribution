package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MailSectionType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailSectionType with Double] = js.native
  
  @js.native
  sealed trait Details extends MailSectionType
  /* 0 */ @js.native
  object Details extends TopLevel[Details with Double]
  
  @js.native
  sealed trait Environments extends MailSectionType
  /* 1 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  @js.native
  sealed trait Issues extends MailSectionType
  /* 2 */ @js.native
  object Issues extends TopLevel[Issues with Double]
  
  @js.native
  sealed trait ReleaseInfo extends MailSectionType
  /* 5 */ @js.native
  object ReleaseInfo extends TopLevel[ReleaseInfo with Double]
  
  @js.native
  sealed trait TestResults extends MailSectionType
  /* 3 */ @js.native
  object TestResults extends TopLevel[TestResults with Double]
  
  @js.native
  sealed trait WorkItems extends MailSectionType
  /* 4 */ @js.native
  object WorkItems extends TopLevel[WorkItems with Double]
}
