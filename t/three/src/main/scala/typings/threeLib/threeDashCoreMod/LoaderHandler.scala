package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoaderHandler extends js.Object {
  var handlers: js.Array[stdLib.RegExp | AnyLoader]
  def add(regex: stdLib.RegExp, loader: AnyLoader): scala.Unit
  def get(file: java.lang.String): AnyLoader | scala.Null
}

