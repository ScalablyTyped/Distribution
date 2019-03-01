package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyFile extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  def changeExt(newExt: java.lang.String): scala.Unit
  def rename(newPath: java.lang.String): scala.Unit
}

object IWallabyFile {
  @scala.inline
  def apply(
    changeExt: js.Function1[java.lang.String, scala.Unit],
    rename: js.Function1[java.lang.String, scala.Unit],
    content: java.lang.String = null,
    path: java.lang.String = null
  ): IWallabyFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeExt")(changeExt)
    __obj.updateDynamic("rename")(rename)
    if (content != null) __obj.updateDynamic("content")(content)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[IWallabyFile]
  }
}

