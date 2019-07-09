package typings
package tensorflowLib.tensorflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  def createSession(): Session
  def delete(): js.Any
}

object Graph {
  @scala.inline
  def apply(createSession: () => Session, delete: () => js.Any): Graph = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction0(createSession), delete = js.Any.fromFunction0(delete))
  
    __obj.asInstanceOf[Graph]
  }
}

