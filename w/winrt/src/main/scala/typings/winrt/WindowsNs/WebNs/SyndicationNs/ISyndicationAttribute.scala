package typings.winrt.WindowsNs.WebNs.SyndicationNs

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
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
  
    __obj.asInstanceOf[ISyndicationAttribute]
  }
}

