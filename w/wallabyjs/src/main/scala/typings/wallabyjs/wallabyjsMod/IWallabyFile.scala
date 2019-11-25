package typings.wallabyjs.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyFile extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  def changeExt(newExt: String): Unit
  def rename(newPath: String): Unit
}

object IWallabyFile {
  @scala.inline
  def apply(changeExt: String => Unit, rename: String => Unit, content: String = null, path: String = null): IWallabyFile = {
    val __obj = js.Dynamic.literal(changeExt = js.Any.fromFunction1(changeExt), rename = js.Any.fromFunction1(rename))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyFile]
  }
}

