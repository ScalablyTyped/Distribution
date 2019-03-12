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
    decodeIso8601: java.lang.String => stdLib.Date,
    encodeIso8601: stdLib.Date => java.lang.String,
    setOpts: xmlrpcLib.xmlrpcMod.DateFormatterOptions => scala.Unit
  ): Anon_Date = {
    val __obj = js.Dynamic.literal(decodeIso8601 = js.Any.fromFunction1(decodeIso8601), encodeIso8601 = js.Any.fromFunction1(encodeIso8601), setOpts = js.Any.fromFunction1(setOpts))
  
    __obj.asInstanceOf[Anon_Date]
  }
}

