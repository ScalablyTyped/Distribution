package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationAttribute extends js.Object {
  var name: java.lang.String
  var namespace: java.lang.String
  var value: java.lang.String
}

object ISyndicationAttribute {
  @scala.inline
  def apply(name: java.lang.String, namespace: java.lang.String, value: java.lang.String): ISyndicationAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ISyndicationAttribute]
  }
}

