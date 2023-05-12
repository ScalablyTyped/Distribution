package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Clock")
@js.native
/**
  * Create a new instance of {@link THREE.Clock | Clock}
  * @param autoStart - Whether to automatically start the clock when {@link getDelta | .getDelta()} is called for the first time. Default `true`
  */
open class Clock ()
  extends typings.three.mod.Clock {
  def this(autoStart: Boolean) = this()
}
