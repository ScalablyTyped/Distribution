package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "LocalizableString")
@js.native
open class LocalizableString protected ()
  extends StObject
     with ILocalizableString {
  def this(owner: ILocalizableOwner) = this()
  def this(owner: ILocalizableOwner, useMarkdown: Boolean) = this()
  def this(owner: ILocalizableOwner, useMarkdown: Boolean, name: String) = this()
  def this(owner: ILocalizableOwner, useMarkdown: Unit, name: String) = this()
  
  def calculatedText: String = js.native
  
  var calculatedTextValue: String = js.native
  
  def getHtmlValue(): String = js.native
  
  /* CompleteClass */
  override def getIsMultiple(): Boolean = js.native
  
  /* CompleteClass */
  override def getJson(): Any = js.native
  
  /* CompleteClass */
  override def getLocaleText(loc: String): String = js.native
  
  /* CompleteClass */
  override def getLocales(): js.Array[Any] = js.native
  
  def hasHtml: Boolean = js.native
  
  def hasNonDefaultText(): Boolean = js.native
  
  def html: String = js.native
  
  var htmlValues: Any = js.native
  
  def isEmpty: Boolean = js.native
  
  def locale: String = js.native
  
  var localizationName: String = js.native
  
  var name: String = js.native
  
  def onChanged(): Unit = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  var onGetDefaultTextCallback: Any = js.native
  
  def onGetLocalizationTextCallback(str: String): String = js.native
  
  def onGetTextCallback(str: String): String = js.native
  
  var onSearchChanged: Any = js.native
  
  def onStrChanged(oldValue: String, newValue: String): Unit = js.native
  
  var onStringChanged: EventBase[LocalizableString] = js.native
  
  var owner: ILocalizableOwner = js.native
  
  def pureText: String = js.native
  
  def renderAs: String = js.native
  
  def renderAsData: Any = js.native
  
  def renderedHtml: String = js.native
  
  var renderedText: String = js.native
  
  var searchIndex: Double = js.native
  
  var searchText: String = js.native
  
  var searchableText: String = js.native
  
  def setFindText(text: String): Boolean = js.native
  
  def setJson(value: Any): Unit = js.native
  
  /* CompleteClass */
  override def setLocaleText(loc: String, newValue: String): Any = js.native
  
  var sharedData: LocalizableString = js.native
  
  var storeDefaultText: Boolean = js.native
  
  def strChanged(): Unit = js.native
  
  def text: String = js.native
  
  def textOrHtml: String = js.native
  
  def text_=(`val`: String): Unit = js.native
  
  var useMarkdown: Boolean = js.native
  
  var values: Any = js.native
}
/* static members */
object LocalizableString {
  
  @JSImport("survey-knockout", "LocalizableString")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "LocalizableString.SerializeAsObject")
  @js.native
  def SerializeAsObject: Boolean = js.native
  inline def SerializeAsObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerializeAsObject")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "LocalizableString.defaultRenderer")
  @js.native
  def defaultRenderer: String = js.native
  inline def defaultRenderer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "LocalizableString.editableRenderer")
  @js.native
  def editableRenderer: String = js.native
  inline def editableRenderer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editableRenderer")(x.asInstanceOf[js.Any])
}
