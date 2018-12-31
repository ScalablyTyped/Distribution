package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TldExistsHost extends js.Object {
  var extractHostname: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]
  var fromUserSettings: js.Function1[/* options */ Anon_ExtractHostnameRules, Anon_TldExists]
  var getDomain: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]
  var getPublicSuffix: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]
  var getSubdomain: js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]
  var isValid: js.Function1[/* host */ java.lang.String, scala.Boolean]
  var isValidHostname: js.Function1[/* host */ java.lang.String, scala.Boolean]
  var parse: js.Function1[/* host */ java.lang.String, Anon_PublicSuffixTldExists]
  var tldExists: js.Function1[/* host */ java.lang.String, scala.Boolean]
}

