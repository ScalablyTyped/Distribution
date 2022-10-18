package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceControlTypes extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceControlTypes & Double] = js.native
  
  @js.native
  sealed trait Git
    extends StObject
       with SourceControlTypes
  /* 2 */ val Git: typings.vsoNodeApi.interfacesCoreInterfacesMod.SourceControlTypes.Git & Double = js.native
  
  @js.native
  sealed trait Tfvc
    extends StObject
       with SourceControlTypes
  /* 1 */ val Tfvc: typings.vsoNodeApi.interfacesCoreInterfacesMod.SourceControlTypes.Tfvc & Double = js.native
}
