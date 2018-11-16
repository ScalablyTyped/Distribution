package typings
package yallistLib.yallistMod.YallistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node[T] extends js.Object {
  var list: js.UndefOr[yallistLib.yallistMod.Yallist[T]] = js.undefined
  var next: Node[T] | scala.Null
  var prev: Node[T] | scala.Null
  var value: T
}

