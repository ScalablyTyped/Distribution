package typings
package superclusterLib.superclusterMod.SuperclusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default properties type, allowing any properties.
  * Try to avoid this for better typesafety by using proper types.
  */
trait AnyProps
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AnyProps {
  @scala.inline
  def apply(StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): AnyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyProps]
  }
}

