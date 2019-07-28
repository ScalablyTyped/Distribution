package typings.vscodeDashLanguageserverDashProtocol

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueSetArrayCodeActionKind extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[CodeActionKind]
}

object Anon_ValueSetArrayCodeActionKind {
  @scala.inline
  def apply(valueSet: js.Array[CodeActionKind]): Anon_ValueSetArrayCodeActionKind = {
    val __obj = js.Dynamic.literal(valueSet = valueSet)
  
    __obj.asInstanceOf[Anon_ValueSetArrayCodeActionKind]
  }
}

