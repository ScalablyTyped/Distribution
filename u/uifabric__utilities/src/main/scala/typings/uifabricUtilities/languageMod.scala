package typings.uifabricUtilities

import typings.uifabricUtilities.uifabricUtilitiesStrings.localStorage
import typings.uifabricUtilities.uifabricUtilitiesStrings.none
import typings.uifabricUtilities.uifabricUtilitiesStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  
  def getLanguage(): String | Null = js.native
  @JSName("getLanguage")
  def getLanguage_localStorage(persistenceType: localStorage): String | Null = js.native
  @JSName("getLanguage")
  def getLanguage_none(persistenceType: none): String | Null = js.native
  @JSName("getLanguage")
  def getLanguage_sessionStorage(persistenceType: sessionStorage): String | Null = js.native
  
  def setLanguage(language: String): Unit = js.native
  def setLanguage(language: String, avoidPersisting: Boolean): Unit = js.native
  @JSName("setLanguage")
  def setLanguage_localStorage(language: String, persistenceType: localStorage): Unit = js.native
  @JSName("setLanguage")
  def setLanguage_none(language: String, persistenceType: none): Unit = js.native
  @JSName("setLanguage")
  def setLanguage_sessionStorage(language: String, persistenceType: sessionStorage): Unit = js.native
}
