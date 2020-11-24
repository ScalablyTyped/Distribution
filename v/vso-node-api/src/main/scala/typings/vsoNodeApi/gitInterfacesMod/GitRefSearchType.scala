package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefSearchType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefSearchType")
@js.native
object GitRefSearchType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefSearchType with Double] = js.native
  
  @js.native
  sealed trait Contains extends GitRefSearchType
  /* 2 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  @js.native
  sealed trait Exact extends GitRefSearchType
  /* 0 */ @js.native
  object Exact extends TopLevel[Exact with Double]
  
  @js.native
  sealed trait StartsWith extends GitRefSearchType
  /* 1 */ @js.native
  object StartsWith extends TopLevel[StartsWith with Double]
}
