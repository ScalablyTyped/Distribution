package typings
package xmlrpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  def decodeIso8601(time: java.lang.String): stdLib.Date
  def encodeIso8601(date: stdLib.Date): java.lang.String
  def setOpts(opts: xmlrpcLib.xmlrpcMod.DateFormatterOptions): scala.Unit
}

object Anon_Date {
  @scala.inline
  def apply(
    decodeIso8601: js.Function1[java.lang.String, stdLib.Date],
    encodeIso8601: js.Function1[stdLib.Date, java.lang.String],
    setOpts: js.Function1[xmlrpcLib.xmlrpcMod.DateFormatterOptions, scala.Unit]
  ): Anon_Date = {
    val __obj = js.Dynamic.literal(decodeIso8601 = decodeIso8601, encodeIso8601 = encodeIso8601, setOpts = setOpts)
  
    __obj.asInstanceOf[Anon_Date]
  }
}

