package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceControlTypes extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceControlTypes with Double] = js.native
  
  @js.native
  sealed trait Git extends SourceControlTypes
  /* 2 */ val Git: typings.vsoNodeApi.coreInterfacesMod.SourceControlTypes.Git with Double = js.native
  
  @js.native
  sealed trait Tfvc extends SourceControlTypes
  /* 1 */ val Tfvc: typings.vsoNodeApi.coreInterfacesMod.SourceControlTypes.Tfvc with Double = js.native
}
