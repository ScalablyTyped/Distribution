package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogType extends StObject
/**
  * LogType
  */
@JSGlobal("umbraco.resources.LogType")
@js.native
object LogType extends StObject {
  
  @js.native
  sealed trait Debug
    extends StObject
       with LogType
  
  @js.native
  sealed trait Info
    extends StObject
       with LogType
}
