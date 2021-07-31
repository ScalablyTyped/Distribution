package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "LocalizableString")
@js.native
class LocalizableString protected () extends StObject {
  def this(owner: ILocalizableOwner) = this()
  def this(owner: ILocalizableOwner, useMarkdown: Boolean) = this()
  
  val calculatedText: String = js.native
  
  def equals(obj: js.Any): Boolean = js.native
  
  def getJson(): js.Any = js.native
  
  def getLocaleText(loc: String): String = js.native
  
  def getLocales(): js.Array[String] = js.native
  
  val hasHtml: Boolean = js.native
  
  def hasNonDefaultText(): Boolean = js.native
  
  val html: String = js.native
  
  val isEmpty: Boolean = js.native
  
  val locale: String = js.native
  
  def onChanged(): Unit = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  def onGetTextCallback(str: String): String = js.native
  
  def onStrChanged(): Unit = js.native
  
  var owner: ILocalizableOwner = js.native
  
  val pureText: String = js.native
  
  val renderedHtml: String = js.native
  
  def setJson(value: js.Any): Unit = js.native
  
  def setLocaleText(loc: String, value: String): Unit = js.native
  
  var sharedData: LocalizableString = js.native
  
  def strChanged(): Unit = js.native
  
  var text: String = js.native
  
  val textOrHtml: String = js.native
  
  var useMarkdown: Boolean = js.native
}
/* static members */
object LocalizableString {
  
  @JSImport("survey-knockout", "LocalizableString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "LocalizableString.SerializeAsObject")
  @js.native
  def SerializeAsObject: Boolean = js.native
  @scala.inline
  def SerializeAsObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeAsObject")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "LocalizableString.defaultLocale")
  @js.native
  def defaultLocale: String = js.native
  @scala.inline
  def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
}
