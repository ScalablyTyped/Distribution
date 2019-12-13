package typings.stripe

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.stripeMod.IObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /**
    * describes the object the event is about. For example, an
    * invoice.created event will have a full invoice object as the value of
    * the object key.
    */
  var `object`: IObject
  var previous_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(`object`: IObject, previous_attributes: StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (previous_attributes != null) __obj.updateDynamic("previous_attributes")(previous_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

