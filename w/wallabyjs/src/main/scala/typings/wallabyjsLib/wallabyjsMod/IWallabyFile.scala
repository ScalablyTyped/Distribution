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

