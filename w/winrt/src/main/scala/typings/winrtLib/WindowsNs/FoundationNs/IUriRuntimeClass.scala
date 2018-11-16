package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IUriRuntimeClass extends js.Object {
  var absoluteUri: java.lang.String
  var displayUri: java.lang.String
  var domain: java.lang.String
  var extension: java.lang.String
  var fragment: java.lang.String
  var host: java.lang.String
  var password: java.lang.String
  var path: java.lang.String
  var port: scala.Double
  var query: java.lang.String
  var queryParsed: WwwFormUrlDecoder
  var rawUri: java.lang.String
  var schemeName: java.lang.String
  var suspicious: scala.Boolean
  var userName: java.lang.String
  def combineUri(relativeUri: java.lang.String): Uri
  def equals(pUri: Uri): scala.Boolean
}

