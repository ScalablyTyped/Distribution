package typings
package twixLib.twixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twix extends js.Object {
  def asDuration(period: java.lang.String): momentLib.momentMod.Duration = js.native
  def contains(date: java.lang.String): scala.Boolean = js.native
  def contains(date: momentLib.momentMod.Moment): scala.Boolean = js.native
  def contains(date: stdLib.Date): scala.Boolean = js.native
  def count(period: java.lang.String): scala.Double = js.native
  def countInner(period: java.lang.String): scala.Double = js.native
  def difference(other: Twix): js.Array[Twix] = js.native
  def engulfs(other: Twix): scala.Boolean = js.native
  def equals(other: Twix): scala.Boolean = js.native
  def format(): java.lang.String = js.native
  def format(options: java.lang.String): java.lang.String = js.native
  def format(options: TwixFormatOptions): java.lang.String = js.native
  def humanizeLength(): java.lang.String = js.native
  def intersection(other: Twix): Twix = js.native
  def isCurrent(): scala.Boolean = js.native
  def isFuture(): scala.Boolean = js.native
  def isPast(): scala.Boolean = js.native
  def isSame(period: java.lang.String): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def iterate(duration: momentLib.momentMod.Duration): TwixIter = js.native
  def iterate(num: scala.Double, period: java.lang.String): TwixIter = js.native
  def iterate(period: java.lang.String): TwixIter = js.native
  def iterateInner(num: scala.Double, period: java.lang.String): TwixIter = js.native
  def iterateInner(period: java.lang.String): TwixIter = js.native
  def length(period: java.lang.String): scala.Double = js.native
  def overlaps(other: Twix): scala.Boolean = js.native
  def simpleFormat(): java.lang.String = js.native
  def simpleFormat(format: java.lang.String): java.lang.String = js.native
  def simpleFormat(format: java.lang.String, options: TwixSimpleFormatOptions): java.lang.String = js.native
  def split(duration: momentLib.momentMod.Duration): js.Array[Twix] = js.native
  def split(num: scala.Double, period: java.lang.String): js.Array[Twix] = js.native
  def split(other: momentLib.momentMod.Moment): js.Array[Twix] = js.native
  def split(start: momentLib.momentMod.Moment, end: momentLib.momentMod.Moment): js.Array[Twix] = js.native
  def toDate(): stdLib.Date = js.native
  def union(other: Twix): Twix = js.native
  def xor(other: Twix): js.Array[Twix] = js.native
}

