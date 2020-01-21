package typings.virtualDom.VirtualDOM

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait createProperties extends VProperties {
  var key: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
}

object createProperties {
  @scala.inline
  def apply(
    attributes: StringDictionary[String] = null,
    key: String = null,
    namespace: String = null,
    style: js.Any = null
  ): createProperties = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[createProperties]
  }
}

