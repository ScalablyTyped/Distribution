package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search args
  */
trait ISearchArgs extends js.Object {
  var term: java.lang.String
}

object ISearchArgs {
  @scala.inline
  def apply(term: java.lang.String): ISearchArgs = {
    val __obj = js.Dynamic.literal(term = term)
  
    __obj.asInstanceOf[ISearchArgs]
  }
}

