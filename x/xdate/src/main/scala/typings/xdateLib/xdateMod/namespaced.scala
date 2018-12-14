package typings
package xdateLib.xdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xdate", JSImport.Namespace)
@js.native
class namespaced () extends XDate {
  /**
       * constructor
       * @param {string} [dateString] - formatted date string
       */
  def this(dateString: java.lang.String) = this()
  /**
       * constructor
       * @param {number} [milliseconds] - milliseconds
       */
  def this(milliseconds: scala.Double) = this()
  /**
       * constructor
       * @param {Date} [nativeDate] - JavaScript native date
       */
  def this(nativeDate: stdLib.Date) = this()
  def this(utcmode: scala.Boolean) = this()
  /**
       * constructor
       */
  def this(xdate: XDate) = this()
  /**
       * constructor
       * @param {string} [dateString] - formatted date string
       */
  def this(dateString: java.lang.String, utcmode: scala.Boolean) = this()
  /**
       * constructor
       * @param {number} [milliseconds] - milliseconds
       */
  def this(milliseconds: scala.Double, utcmode: scala.Boolean) = this()
  /**
       * constructor
       * @param {Date} [nativeDate] - JavaScript native date
       */
  def this(nativeDate: stdLib.Date, utcmode: scala.Boolean) = this()
  /**
       * constructor
       */
  def this(xdate: XDate, utcmode: scala.Boolean) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double, minutes: scala.Double) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double, minutes: scala.Double, seconds: scala.Double) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double, minutes: scala.Double, seconds: scala.Double, milliseconds: scala.Double) = this()
  /**
       * constructor
       * @param {number} [year] - year
       * @param {number} [month] - month
       * @param {number} [date] - date
       * @param {number} [hours] - hours
       * @param {number} [minutes] - minutes
       * @param {number} [seconds] - seconds
       * @param {number} [milliseconds] - milliseconds
       */
  def this(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double, minutes: scala.Double, seconds: scala.Double, milliseconds: scala.Double, utcmode: scala.Boolean) = this()
}

@JSImport("xdate", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var defaultLocale: java.lang.String = js.native
  var formatters: xdateLib.xdateMod.formatters_info = js.native
  var locales: org.scalablytyped.runtime.StringDictionary[xdateLib.xdateMod.locale_detail] = js.native
  def UTC(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def UTC(year: scala.Double, month: scala.Double, day: scala.Double, hours: scala.Double): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hours: scala.Double,
    minutes: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double,
    ms: scala.Double
  ): scala.Double = js.native
  /*
       *Returns a milliseconds time since the epoch for the given UTC date
       */
  @JSName("UTC")
  def UTC_XDate(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double,
    milliseconds: scala.Double
  ): xdateLib.xdateMod.XDate = js.native
  //------------
  //Static function
  //------------
  /*
       *Returns the number of days in the given month
       */
  def getDaysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  /*
       *Returns the current date, as milliseconds since the epoch. You'll probably want to use new XDate() instead.
       */
  def now(): scala.Double = js.native
  /*
       *Parses a date-string and returns milliseconds since the epoch. You'll probably want to use new XDate(dateString) instead.
       */
  def parse(dateString: java.lang.String): scala.Double = js.native
  /*
       *Returns the current date with time cleared, as an XDate object
       */
  def today(): xdateLib.xdateMod.XDate = js.native
}

