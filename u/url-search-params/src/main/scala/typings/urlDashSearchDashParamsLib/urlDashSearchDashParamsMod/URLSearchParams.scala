package typings
package urlDashSearchDashParamsLib.urlDashSearchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait URLSearchParams extends js.Object {
  def append(name: java.lang.String, value: js.Any): scala.Unit
  def delete(name: java.lang.String): scala.Unit
  def entries(): stdLib.Iterator[java.lang.String]
  def get(name: java.lang.String): java.lang.String | scala.Null
  def getAll(name: java.lang.String): js.Array[java.lang.String]
  def has(name: java.lang.String): scala.Boolean
  def keys(): stdLib.Iterator[java.lang.String]
  def set(name: java.lang.String, value: js.Any): scala.Unit
  def values(): stdLib.Iterator[java.lang.String]
}

