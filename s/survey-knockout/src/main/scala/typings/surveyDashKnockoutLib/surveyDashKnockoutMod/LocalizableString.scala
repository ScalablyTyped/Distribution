package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "LocalizableString")
@js.native
class LocalizableString protected () extends js.Object {
  def this(owner: ILocalizableOwner) = this()
  def this(owner: ILocalizableOwner, useMarkdown: scala.Boolean) = this()
  val hasHtml: scala.Boolean = js.native
  val html: java.lang.String = js.native
  val isEmpty: scala.Boolean = js.native
  val locale: java.lang.String = js.native
  var owner: ILocalizableOwner = js.native
  val pureText: js.Any = js.native
  val renderedHtml: java.lang.String = js.native
  var text: java.lang.String = js.native
  val textOrHtml: java.lang.String = js.native
  var useMarkdown: scala.Boolean = js.native
  def equals(obj: js.Any): scala.Boolean = js.native
  def getJson(): js.Any = js.native
  def getLocaleText(loc: java.lang.String): java.lang.String = js.native
  def getLocales(): js.Array[java.lang.String] = js.native
  def hasNonDefaultText(): scala.Boolean = js.native
  def onChanged(): scala.Unit = js.native
  /* protected */ def onCreating(): scala.Unit = js.native
  def onGetTextCallback(str: java.lang.String): java.lang.String = js.native
  def onRenderedHtmlCallback(html: java.lang.String): java.lang.String = js.native
  def onStrChanged(): scala.Unit = js.native
  def setJson(value: js.Any): scala.Unit = js.native
  def setLocaleText(loc: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def strChanged(): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "LocalizableString")
@js.native
object LocalizableString extends js.Object {
  var defaultLocale: java.lang.String = js.native
}

