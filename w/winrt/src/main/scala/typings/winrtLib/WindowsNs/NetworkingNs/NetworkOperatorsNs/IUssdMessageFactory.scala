package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessageFactory extends js.Object {
  def createMessage(messageText: java.lang.String): UssdMessage
}

object IUssdMessageFactory {
  @scala.inline
  def apply(createMessage: java.lang.String => UssdMessage): IUssdMessageFactory = {
    val __obj = js.Dynamic.literal(createMessage = js.Any.fromFunction1(createMessage))
  
    __obj.asInstanceOf[IUssdMessageFactory]
  }
}

