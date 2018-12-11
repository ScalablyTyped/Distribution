package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[java.lang.String] {
  val length: scala.Double
  var mediaText: java.lang.String
  def appendMedium(medium: java.lang.String): scala.Unit
  def deleteMedium(medium: java.lang.String): scala.Unit
  def item(index: scala.Double): java.lang.String | scala.Null
}

@JSGlobal("MediaList")
@js.native
object MediaList
  extends ScalablyTyped.runtime.Instantiable0[MediaList]

