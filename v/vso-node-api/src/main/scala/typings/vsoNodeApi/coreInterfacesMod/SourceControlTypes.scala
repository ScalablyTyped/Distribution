package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceControlTypes extends js.Object
@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceControlTypes with Double] = js.native
  
  @js.native
  sealed trait Git extends SourceControlTypes
  /* 2 */ @js.native
  object Git extends TopLevel[Git with Double]
  
  @js.native
  sealed trait Tfvc extends SourceControlTypes
  /* 1 */ @js.native
  object Tfvc extends TopLevel[Tfvc with Double]
}
