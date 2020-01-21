package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "GLSLDataSender")
@js.native
class GLSLDataSender protected ()
  extends typings.wonderJs.glsldatasenderMod.GLSLDataSender {
  def this(program: typings.wonderJs.programMod.Program) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "GLSLDataSender")
@js.native
object GLSLDataSender extends js.Object {
  def create(program: typings.wonderJs.programMod.Program): typings.wonderJs.glsldatasenderMod.GLSLDataSender = js.native
}

