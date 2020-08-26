package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyndicationAttribute extends ISyndicationAttribute

object SyndicationAttribute {
  @scala.inline
  def apply(name: String, namespace: String, value: String): SyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationAttribute]
  }
}

