package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search args
  */
trait ISearchArgs extends js.Object {
  var term: String
}

object ISearchArgs {
  @scala.inline
  def apply(term: String): ISearchArgs = {
    val __obj = js.Dynamic.literal(term = term)
  
    __obj.asInstanceOf[ISearchArgs]
  }
}

