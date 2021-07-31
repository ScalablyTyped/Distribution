package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a Uri launch. */
@JSGlobal("Windows.System.LaunchUriResult")
@js.native
abstract class LaunchUriResult ()
  extends StObject
     with typings.winrtUwp.Windows.System.LaunchUriResult {
  
  /** Gets the result of the Uri launch. */
  /* CompleteClass */
  var result: ValueSet = js.native
  
  /** Gets the status of the Uri launch. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.System.LaunchUriStatus = js.native
}
