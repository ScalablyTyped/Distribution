package typings
package urlDashParseLib.urlDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object URLParseNs {
  type QueryParser = js.Function1[/* query */ java.lang.String, js.Object]
  type StringifyQuery = js.Function1[/* query */ js.Object, java.lang.String]
  type URLPart = urlDashParseLib.urlDashParseLibStrings.auth | urlDashParseLib.urlDashParseLibStrings.hash | urlDashParseLib.urlDashParseLibStrings.host | urlDashParseLib.urlDashParseLibStrings.hostname | urlDashParseLib.urlDashParseLibStrings.href | urlDashParseLib.urlDashParseLibStrings.origin | urlDashParseLib.urlDashParseLibStrings.password | urlDashParseLib.urlDashParseLibStrings.pathname | urlDashParseLib.urlDashParseLibStrings.port | urlDashParseLib.urlDashParseLibStrings.protocol | urlDashParseLib.urlDashParseLibStrings.query | urlDashParseLib.urlDashParseLibStrings.slashes | urlDashParseLib.urlDashParseLibStrings.username
}
