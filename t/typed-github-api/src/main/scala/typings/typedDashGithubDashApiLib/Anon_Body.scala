package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Anon_From
  var title: Anon_From
}

object Anon_Body {
  @scala.inline
  def apply(body: Anon_From, title: Anon_From): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Body]
  }
}

