package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<react.anon.Children> */
trait ReadonlyReadonlyChildren extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
}

object ReadonlyReadonlyChildren {
  @scala.inline
  def apply(children: ReactNode = null): ReadonlyReadonlyChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyReadonlyChildren]
  }
}

