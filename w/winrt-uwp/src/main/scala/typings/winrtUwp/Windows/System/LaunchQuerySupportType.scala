package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LaunchQuerySupportType extends StObject
/** Specifies the type of activation to query for. */
@JSGlobal("Windows.System.LaunchQuerySupportType")
@js.native
object LaunchQuerySupportType extends StObject {
  
  /** Activate by URI but do not return a result to the calling app. This is the default. */
  @js.native
  sealed trait uri
    extends StObject
       with LaunchQuerySupportType
  
  /** Activate by URI and return a result to the calling app. */
  @js.native
  sealed trait uriForResults
    extends StObject
       with LaunchQuerySupportType
}
