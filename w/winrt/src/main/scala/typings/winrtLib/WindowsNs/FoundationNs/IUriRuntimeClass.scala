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

object IUriRuntimeClass {
  @scala.inline
  def apply(
    absoluteUri: java.lang.String,
    combineUri: java.lang.String => Uri,
    displayUri: java.lang.String,
    domain: java.lang.String,
    equals: Uri => scala.Boolean,
    extension: java.lang.String,
    fragment: java.lang.String,
    host: java.lang.String,
    password: java.lang.String,
    path: java.lang.String,
    port: scala.Double,
    query: java.lang.String,
    queryParsed: WwwFormUrlDecoder,
    rawUri: java.lang.String,
    schemeName: java.lang.String,
    suspicious: scala.Boolean,
    userName: java.lang.String
  ): IUriRuntimeClass = {
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri, combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri, domain = domain, equals = js.Any.fromFunction1(equals), extension = extension, fragment = fragment, host = host, password = password, path = path, port = port, query = query, queryParsed = queryParsed, rawUri = rawUri, schemeName = schemeName, suspicious = suspicious, userName = userName)
  
    __obj.asInstanceOf[IUriRuntimeClass]
  }
}

