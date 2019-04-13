package typings
package twitLib.twitMod.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[twitLib.Anon_Code]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[twitLib.Anon_Code]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors)
  
    __obj.asInstanceOf[Errors]
  }
}

