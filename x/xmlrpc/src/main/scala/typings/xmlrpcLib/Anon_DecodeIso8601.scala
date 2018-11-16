package typings
package xmlrpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DecodeIso8601 extends js.Object {
  def decodeIso8601(time: java.lang.String): stdLib.Date
  def encodeIso8601(date: stdLib.Date): java.lang.String
  def setOpts(opts: xmlrpcLib.xmlrpcMod.DateFormatterOptions): scala.Unit
}

