package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cookie extends js.Object {
  def clear(): scala.Unit
  def get(name: java.lang.String): js.Any
  def put(name: java.lang.String, value: js.Any): scala.Unit
  def remove(name: java.lang.String): scala.Unit
}

