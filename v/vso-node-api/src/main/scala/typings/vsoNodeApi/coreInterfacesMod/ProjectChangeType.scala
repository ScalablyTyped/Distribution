package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectChangeType extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectChangeType & Double] = js.native
  
  @js.native
  sealed trait Added
    extends StObject
       with ProjectChangeType
  /* 2 */ val Added: typings.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Added & Double = js.native
  
  @js.native
  sealed trait Deleted
    extends StObject
       with ProjectChangeType
  /* 1 */ val Deleted: typings.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Deleted & Double = js.native
  
  @js.native
  sealed trait Modified
    extends StObject
       with ProjectChangeType
  /* 0 */ val Modified: typings.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Modified & Double = js.native
}
