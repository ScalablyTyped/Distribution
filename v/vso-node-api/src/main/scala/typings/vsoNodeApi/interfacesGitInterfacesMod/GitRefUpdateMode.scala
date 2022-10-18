package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefUpdateMode extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateMode")
@js.native
object GitRefUpdateMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateMode & Double] = js.native
  
  /**
    * Indicates that all ref updates must succeed or none will succeed. All ref updates will be atomically written. If any failure is encountered, previously successful updates will be rolled back and the entire operation will fail.
    */
  @js.native
  sealed trait AllOrNone
    extends StObject
       with GitRefUpdateMode
  /* 1 */ val AllOrNone: typings.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateMode.AllOrNone & Double = js.native
  
  /**
    * Indicates the Git protocol model where any refs that can be updated will be updated, but any failures will not prevent other updates from succeeding.
    */
  @js.native
  sealed trait BestEffort
    extends StObject
       with GitRefUpdateMode
  /* 0 */ val BestEffort: typings.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateMode.BestEffort & Double = js.native
}
