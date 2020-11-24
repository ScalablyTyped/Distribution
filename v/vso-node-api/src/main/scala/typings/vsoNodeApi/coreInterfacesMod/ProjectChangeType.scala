package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectChangeType extends js.Object
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectChangeType with Double] = js.native
  
  @js.native
  sealed trait Added extends ProjectChangeType
  /* 2 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  @js.native
  sealed trait Deleted extends ProjectChangeType
  /* 1 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  @js.native
  sealed trait Modified extends ProjectChangeType
  /* 0 */ @js.native
  object Modified extends TopLevel[Modified with Double]
}
