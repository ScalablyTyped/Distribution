package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUriRuntimeClassWithAbsoluteCanonicalUri extends js.Object {
  var absoluteCanonicalUri: String
  var displayIri: String
}

object IUriRuntimeClassWithAbsoluteCanonicalUri {
  @scala.inline
  def apply(absoluteCanonicalUri: String, displayIri: String): IUriRuntimeClassWithAbsoluteCanonicalUri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], displayIri = displayIri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUriRuntimeClassWithAbsoluteCanonicalUri]
  }
}

