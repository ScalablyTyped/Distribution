package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUriRuntimeClass extends js.Object {
  var absoluteUri: String
  var displayUri: String
  var domain: String
  var extension: String
  var fragment: String
  var host: String
  var password: String
  var path: String
  var port: Double
  var query: String
  var queryParsed: WwwFormUrlDecoder
  var rawUri: String
  var schemeName: String
  var suspicious: Boolean
  var userName: String
  def combineUri(relativeUri: String): Uri
  def equals(pUri: Uri): Boolean
}

object IUriRuntimeClass {
  @scala.inline
  def apply(
    absoluteUri: String,
    combineUri: String => Uri,
    displayUri: String,
    domain: String,
    equals: Uri => Boolean,
    extension: String,
    fragment: String,
    host: String,
    password: String,
    path: String,
    port: Double,
    query: String,
    queryParsed: WwwFormUrlDecoder,
    rawUri: String,
    schemeName: String,
    suspicious: Boolean,
    userName: String
  ): IUriRuntimeClass = {
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClass]
  }
}

