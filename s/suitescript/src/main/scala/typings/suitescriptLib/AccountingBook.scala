package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountingBook extends js.Object {
  def getId(): scala.Double
  def isPrimary(): scala.Boolean
}

object AccountingBook {
  @scala.inline
  def apply(getId: () => scala.Double, isPrimary: () => scala.Boolean): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), isPrimary = js.Any.fromFunction0(isPrimary))
  
    __obj.asInstanceOf[AccountingBook]
  }
}

