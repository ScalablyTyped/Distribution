package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetOption extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "GetOption")
@js.native
object GetOption extends js.Object {
  /**
    * A user-specified version has been supplied.
    */
  @js.native
  sealed trait Custom extends GetOption
  
  /**
    * Use the latest changeset at the time the build is started.
    */
  @js.native
  sealed trait LatestOnBuild extends GetOption
  
  /**
    * Use the latest changeset at the time the build is queued.
    */
  @js.native
  sealed trait LatestOnQueue extends GetOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetOption with Double] = js.native
  /* 2 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 1 */ @js.native
  object LatestOnBuild extends TopLevel[LatestOnBuild with Double]
  
  /* 0 */ @js.native
  object LatestOnQueue extends TopLevel[LatestOnQueue with Double]
  
}

