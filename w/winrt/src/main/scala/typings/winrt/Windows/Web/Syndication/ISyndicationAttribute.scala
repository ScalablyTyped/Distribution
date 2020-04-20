package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationAttribute extends js.Object {
  var name: String
  var namespace: String
  var value: String
}

object ISyndicationAttribute {
  @scala.inline
  def apply(name: String, namespace: String, value: String): ISyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationAttribute]
  }
}

