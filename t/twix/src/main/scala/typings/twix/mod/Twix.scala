package typings.twix.mod

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Twix extends js.Object {
  
  def asDuration(period: String): Duration_ = js.native
  
  def contains(date: String): Boolean = js.native
  def contains(date: Moment): Boolean = js.native
  def contains(date: Date): Boolean = js.native
  
  def count(period: String): Double = js.native
  
  def countInner(period: String): Double = js.native
  
  def difference(other: Twix): js.Array[Twix] = js.native
  
  def engulfs(other: Twix): Boolean = js.native
  
  def equals(other: Twix): Boolean = js.native
  
  def format(): String = js.native
  def format(options: String): String = js.native
  def format(options: TwixFormatOptions): String = js.native
  
  def humanizeLength(): String = js.native
  
  def intersection(other: Twix): Twix = js.native
  
  def isCurrent(): Boolean = js.native
  
  def isFuture(): Boolean = js.native
  
  def isPast(): Boolean = js.native
  
  def isSame(period: String): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def iterate(duration: Duration_): TwixIter = js.native
  def iterate(num: Double, period: String): TwixIter = js.native
  def iterate(period: String): TwixIter = js.native
  
  def iterateInner(num: Double, period: String): TwixIter = js.native
  def iterateInner(period: String): TwixIter = js.native
  
  def length(period: String): Double = js.native
  
  def overlaps(other: Twix): Boolean = js.native
  
  def simpleFormat(): String = js.native
  def simpleFormat(format: String): String = js.native
  def simpleFormat(format: String, options: TwixSimpleFormatOptions): String = js.native
  
  def split(duration: Duration_): js.Array[Twix] = js.native
  def split(num: Double, period: String): js.Array[Twix] = js.native
  def split(other: Moment): js.Array[Twix] = js.native
  def split(start: Moment, end: Moment): js.Array[Twix] = js.native
  
  def toDate(): Date = js.native
  
  def union(other: Twix): Twix = js.native
  
  def xor(other: Twix): js.Array[Twix] = js.native
}
