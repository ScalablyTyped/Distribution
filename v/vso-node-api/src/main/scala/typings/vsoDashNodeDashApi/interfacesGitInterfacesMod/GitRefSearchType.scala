package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.Contains
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.Exact
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefSearchType.StartsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitRefSearchType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefSearchType")
@js.native
object GitRefSearchType extends js.Object {
  @js.native
  sealed trait Contains extends GitRefSearchType
  
  @js.native
  sealed trait Exact extends GitRefSearchType
  
  @js.native
  sealed trait StartsWith extends GitRefSearchType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefSearchType with Double] = js.native
  /* 2 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  /* 0 */ @js.native
  object Exact extends TopLevel[Exact with Double]
  
  /* 1 */ @js.native
  object StartsWith extends TopLevel[StartsWith with Double]
  
}

