package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceControlTypes extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends js.Object {
  @js.native
  sealed trait Git extends SourceControlTypes
  
  @js.native
  sealed trait Tfvc extends SourceControlTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceControlTypes with Double] = js.native
  /* 2 */ @js.native
  object Git extends TopLevel[Git with Double]
  
  /* 1 */ @js.native
  object Tfvc extends TopLevel[Tfvc with Double]
  
}

