package typings.tap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tap extends Test {
  
  var Test: TestConstructor = js.native
  
  var mocha: Mocha = js.native
  
  def mochaGlobals(): Unit = js.native
}
