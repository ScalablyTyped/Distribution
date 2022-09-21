package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "LocalizableStrings")
@js.native
open class LocalizableStrings protected ()
  extends StObject
     with ILocalizableString {
  def this(owner: ILocalizableOwner) = this()
  
  /* CompleteClass */
  override def getIsMultiple(): Boolean = js.native
  
  /* CompleteClass */
  override def getJson(): Any = js.native
  
  /* CompleteClass */
  override def getLocaleText(loc: String): String = js.native
  
  /* CompleteClass */
  override def getLocales(): js.Array[Any] = js.native
  
  def getValue(loc: String): js.Array[Any] = js.native
  
  def hasValue(): Boolean = js.native
  def hasValue(loc: String): Boolean = js.native
  
  def isEmpty: Boolean = js.native
  
  def locale: String = js.native
  
  def onValueChanged(oldValue: Any, newValue: Any): Unit = js.native
  
  var owner: ILocalizableOwner = js.native
  
  def setJson(value: Any): Unit = js.native
  
  /* CompleteClass */
  override def setLocaleText(loc: String, newValue: String): Any = js.native
  
  def setValue(loc: String, `val`: Any): Unit = js.native
  
  def text: String = js.native
  def text_=(`val`: String): Unit = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
  
  var values: Any = js.native
}
