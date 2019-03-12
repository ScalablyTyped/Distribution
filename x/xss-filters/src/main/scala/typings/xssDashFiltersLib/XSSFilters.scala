package typings
package xssDashFiltersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSSFilters extends js.Object {
  def inDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def inHTMLComment(s: java.lang.String): java.lang.String
  def inHTMLData(s: java.lang.String): java.lang.String
  def inSingleQuotedAttr(s: java.lang.String): java.lang.String
  def inUnQuotedAttr(s: java.lang.String): java.lang.String
  def uriComponentInDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def uriComponentInHTMLComment(s: java.lang.String): java.lang.String
  def uriComponentInHTMLData(s: java.lang.String): java.lang.String
  def uriComponentInSingleQuotedAttr(s: java.lang.String): java.lang.String
  def uriComponentInUnQuotedAttr(s: java.lang.String): java.lang.String
  def uriFragmentInDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def uriFragmentInHTMLComment(s: java.lang.String): java.lang.String
  def uriFragmentInHTMLData(s: java.lang.String): java.lang.String
  def uriFragmentInSingleQuotedAttr(s: java.lang.String): java.lang.String
  def uriFragmentInUnQuotedAttr(s: java.lang.String): java.lang.String
  def uriInDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def uriInHTMLComment(s: java.lang.String): java.lang.String
  def uriInHTMLData(s: java.lang.String): java.lang.String
  def uriInSingleQuotedAttr(s: java.lang.String): java.lang.String
  def uriInUnQuotedAttr(s: java.lang.String): java.lang.String
  def uriPathInDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def uriPathInHTMLComment(s: java.lang.String): java.lang.String
  def uriPathInHTMLData(s: java.lang.String): java.lang.String
  def uriPathInSingleQuotedAttr(s: java.lang.String): java.lang.String
  def uriPathInUnQuotedAttr(s: java.lang.String): java.lang.String
  def uriQueryInDoubleQuotedAttr(s: java.lang.String): java.lang.String
  def uriQueryInHTMLComment(s: java.lang.String): java.lang.String
  def uriQueryInHTMLData(s: java.lang.String): java.lang.String
  def uriQueryInSingleQuotedAttr(s: java.lang.String): java.lang.String
  def uriQueryInUnQuotedAttr(s: java.lang.String): java.lang.String
}

object XSSFilters {
  @scala.inline
  def apply(
    inDoubleQuotedAttr: java.lang.String => java.lang.String,
    inHTMLComment: java.lang.String => java.lang.String,
    inHTMLData: java.lang.String => java.lang.String,
    inSingleQuotedAttr: java.lang.String => java.lang.String,
    inUnQuotedAttr: java.lang.String => java.lang.String,
    uriComponentInDoubleQuotedAttr: java.lang.String => java.lang.String,
    uriComponentInHTMLComment: java.lang.String => java.lang.String,
    uriComponentInHTMLData: java.lang.String => java.lang.String,
    uriComponentInSingleQuotedAttr: java.lang.String => java.lang.String,
    uriComponentInUnQuotedAttr: java.lang.String => java.lang.String,
    uriFragmentInDoubleQuotedAttr: java.lang.String => java.lang.String,
    uriFragmentInHTMLComment: java.lang.String => java.lang.String,
    uriFragmentInHTMLData: java.lang.String => java.lang.String,
    uriFragmentInSingleQuotedAttr: java.lang.String => java.lang.String,
    uriFragmentInUnQuotedAttr: java.lang.String => java.lang.String,
    uriInDoubleQuotedAttr: java.lang.String => java.lang.String,
    uriInHTMLComment: java.lang.String => java.lang.String,
    uriInHTMLData: java.lang.String => java.lang.String,
    uriInSingleQuotedAttr: java.lang.String => java.lang.String,
    uriInUnQuotedAttr: java.lang.String => java.lang.String,
    uriPathInDoubleQuotedAttr: java.lang.String => java.lang.String,
    uriPathInHTMLComment: java.lang.String => java.lang.String,
    uriPathInHTMLData: java.lang.String => java.lang.String,
    uriPathInSingleQuotedAttr: java.lang.String => java.lang.String,
    uriPathInUnQuotedAttr: java.lang.String => java.lang.String,
    uriQueryInDoubleQuotedAttr: java.lang.String => java.lang.String,
    uriQueryInHTMLComment: java.lang.String => java.lang.String,
    uriQueryInHTMLData: java.lang.String => java.lang.String,
    uriQueryInSingleQuotedAttr: java.lang.String => java.lang.String,
    uriQueryInUnQuotedAttr: java.lang.String => java.lang.String
  ): XSSFilters = {
    val __obj = js.Dynamic.literal(inDoubleQuotedAttr = js.Any.fromFunction1(inDoubleQuotedAttr), inHTMLComment = js.Any.fromFunction1(inHTMLComment), inHTMLData = js.Any.fromFunction1(inHTMLData), inSingleQuotedAttr = js.Any.fromFunction1(inSingleQuotedAttr), inUnQuotedAttr = js.Any.fromFunction1(inUnQuotedAttr), uriComponentInDoubleQuotedAttr = js.Any.fromFunction1(uriComponentInDoubleQuotedAttr), uriComponentInHTMLComment = js.Any.fromFunction1(uriComponentInHTMLComment), uriComponentInHTMLData = js.Any.fromFunction1(uriComponentInHTMLData), uriComponentInSingleQuotedAttr = js.Any.fromFunction1(uriComponentInSingleQuotedAttr), uriComponentInUnQuotedAttr = js.Any.fromFunction1(uriComponentInUnQuotedAttr), uriFragmentInDoubleQuotedAttr = js.Any.fromFunction1(uriFragmentInDoubleQuotedAttr), uriFragmentInHTMLComment = js.Any.fromFunction1(uriFragmentInHTMLComment), uriFragmentInHTMLData = js.Any.fromFunction1(uriFragmentInHTMLData), uriFragmentInSingleQuotedAttr = js.Any.fromFunction1(uriFragmentInSingleQuotedAttr), uriFragmentInUnQuotedAttr = js.Any.fromFunction1(uriFragmentInUnQuotedAttr), uriInDoubleQuotedAttr = js.Any.fromFunction1(uriInDoubleQuotedAttr), uriInHTMLComment = js.Any.fromFunction1(uriInHTMLComment), uriInHTMLData = js.Any.fromFunction1(uriInHTMLData), uriInSingleQuotedAttr = js.Any.fromFunction1(uriInSingleQuotedAttr), uriInUnQuotedAttr = js.Any.fromFunction1(uriInUnQuotedAttr), uriPathInDoubleQuotedAttr = js.Any.fromFunction1(uriPathInDoubleQuotedAttr), uriPathInHTMLComment = js.Any.fromFunction1(uriPathInHTMLComment), uriPathInHTMLData = js.Any.fromFunction1(uriPathInHTMLData), uriPathInSingleQuotedAttr = js.Any.fromFunction1(uriPathInSingleQuotedAttr), uriPathInUnQuotedAttr = js.Any.fromFunction1(uriPathInUnQuotedAttr), uriQueryInDoubleQuotedAttr = js.Any.fromFunction1(uriQueryInDoubleQuotedAttr), uriQueryInHTMLComment = js.Any.fromFunction1(uriQueryInHTMLComment), uriQueryInHTMLData = js.Any.fromFunction1(uriQueryInHTMLData), uriQueryInSingleQuotedAttr = js.Any.fromFunction1(uriQueryInSingleQuotedAttr), uriQueryInUnQuotedAttr = js.Any.fromFunction1(uriQueryInUnQuotedAttr))
  
    __obj.asInstanceOf[XSSFilters]
  }
}

