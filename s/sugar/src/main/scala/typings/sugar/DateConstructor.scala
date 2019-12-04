package typings.sugar

import typings.sugar.sugarjs.Date.DateCreateOptions
import typings.sugar.sugarjs.Locale
import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs._NativeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConstructor extends _NativeConstructor {
  def addLocale(localeCode: java.lang.String, `def`: js.Object): Locale = js.native
  def create(): Date = js.native
  def create(d: java.lang.String): Date = js.native
  def create(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def create(d: Double): Date = js.native
  def create(d: Double, options: DateCreateOptions): Date = js.native
  def create(d: Date): Date = js.native
  def create(d: Date, options: DateCreateOptions): Date = js.native
  def getAllLocaleCodes(): Array[java.lang.String] = js.native
  def getAllLocales(): Array[Locale] = js.native
  def getLocale(): Locale = js.native
  def getLocale(localeCode: java.lang.String): Locale = js.native
  def range(): Range = js.native
  def range(start: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: Date): Range = js.native
  def range(start: Date): Range = js.native
  def range(start: Date, end: java.lang.String): Range = js.native
  def range(start: Date, end: Date): Range = js.native
  def removeLocale(localeCode: java.lang.String): Locale = js.native
  def setLocale(localeCode: java.lang.String): Locale = js.native
}

