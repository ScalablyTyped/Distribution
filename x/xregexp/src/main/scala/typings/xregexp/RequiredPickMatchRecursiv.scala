package typings.xregexp

import typings.xregexp.mod.MatchRecursiveValueNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> */
trait RequiredPickMatchRecursiv extends js.Object {
  var valueNames: MatchRecursiveValueNames
}

object RequiredPickMatchRecursiv {
  @scala.inline
  def apply(valueNames: MatchRecursiveValueNames): RequiredPickMatchRecursiv = {
    val __obj = js.Dynamic.literal(valueNames = valueNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredPickMatchRecursiv]
  }
}

