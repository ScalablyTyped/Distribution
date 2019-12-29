package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectChangeType extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends js.Object {
  @js.native
  sealed trait Added extends ProjectChangeType
  
  @js.native
  sealed trait Deleted extends ProjectChangeType
  
  @js.native
  sealed trait Modified extends ProjectChangeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectChangeType with Double] = js.native
  /* 2 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /* 1 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  /* 0 */ @js.native
  object Modified extends TopLevel[Modified with Double]
  
}

