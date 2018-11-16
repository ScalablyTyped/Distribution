package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiCompiler
  extends tapableLib.tapableMod.Tapable
     with ICompiler {
  var compilers: js.Array[Compiler] = js.native
}

