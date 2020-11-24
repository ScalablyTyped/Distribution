package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/rectangle", "IndexedVariable")
@js.native
class IndexedVariable protected () extends Variable {
  def this(index: Double, w: Double) = this()
  
  var index: Double = js.native
}
