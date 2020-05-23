package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom attribute not defined in the specification. */
trait SyndicationAttribute extends js.Object {
  /** Gets the name of the syndication attribute. */
  var name: String
  /** Gets the namespace of the attribute. */
  var namespace: String
  /** Gets or sets the value of the attribute. */
  var value: String
}

object SyndicationAttribute {
  @scala.inline
  def apply(name: String, namespace: String, value: String): SyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationAttribute]
  }
}

