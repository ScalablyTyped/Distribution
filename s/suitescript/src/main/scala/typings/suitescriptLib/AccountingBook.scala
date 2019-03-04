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
  def apply(getId: js.Function0[scala.Double], isPrimary: js.Function0[scala.Boolean]): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = getId, isPrimary = isPrimary)
  
    __obj.asInstanceOf[AccountingBook]
  }
}

