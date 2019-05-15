package typings
package yaddaLib.yaddaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "Interpreter")
@js.native
class Interpreter protected ()
  extends yaddaLib.libMod.Interpreter {
  def this(libraries: js.Array[yaddaLib.libLibraryMod.^]) = this()
  def this(libraries: yaddaLib.libLibraryMod.^) = this()
}

