package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetOption extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "GetOption")
@js.native
object GetOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetOption & Double] = js.native
  
  /**
    * A user-specified version has been supplied.
    */
  @js.native
  sealed trait Custom
    extends StObject
       with GetOption
  /* 2 */ val Custom: typings.vsoNodeApi.buildInterfacesMod.GetOption.Custom & Double = js.native
  
  /**
    * Use the latest changeset at the time the build is started.
    */
  @js.native
  sealed trait LatestOnBuild
    extends StObject
       with GetOption
  /* 1 */ val LatestOnBuild: typings.vsoNodeApi.buildInterfacesMod.GetOption.LatestOnBuild & Double = js.native
  
  /**
    * Use the latest changeset at the time the build is queued.
    */
  @js.native
  sealed trait LatestOnQueue
    extends StObject
       with GetOption
  /* 0 */ val LatestOnQueue: typings.vsoNodeApi.buildInterfacesMod.GetOption.LatestOnQueue & Double = js.native
}
