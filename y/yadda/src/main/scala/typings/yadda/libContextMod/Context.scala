package typings.yadda.libContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var properties: Properties
  def merge(other: Properties): Context
}

object Context {
  @scala.inline
  def apply(merge: Properties => Context, properties: Properties): Context = {
    val __obj = js.Dynamic.literal(merge = js.Any.fromFunction1(merge), properties = properties)
  
    __obj.asInstanceOf[Context]
  }
}

