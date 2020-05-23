package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignterms extends js.Object {
  var assign_terms: String
  var delete_terms: String
  var edit_terms: String
  var manage_terms: String
}

object Assignterms {
  @scala.inline
  def apply(assign_terms: String, delete_terms: String, edit_terms: String, manage_terms: String): Assignterms = {
    val __obj = js.Dynamic.literal(assign_terms = assign_terms.asInstanceOf[js.Any], delete_terms = delete_terms.asInstanceOf[js.Any], edit_terms = edit_terms.asInstanceOf[js.Any], manage_terms = manage_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignterms]
  }
}

