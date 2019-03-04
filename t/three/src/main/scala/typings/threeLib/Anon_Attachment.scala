package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment
  extends /* attachment */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `type`: java.lang.String
}

object Anon_Attachment {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* attachment */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

