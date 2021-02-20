package typings.uifabricUtilities

import typings.uifabricUtilities.uifabricUtilitiesStrings.localStorage
import typings.uifabricUtilities.uifabricUtilitiesStrings.none
import typings.uifabricUtilities.uifabricUtilitiesStrings.sessionStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageMod {
  
  @JSImport("@uifabric/utilities/lib/language", "getLanguage")
  @js.native
  def getLanguage(): String | Null = js.native
  @JSImport("@uifabric/utilities/lib/language", "getLanguage")
  @js.native
  def getLanguage_localStorage(persistenceType: localStorage): String | Null = js.native
  @JSImport("@uifabric/utilities/lib/language", "getLanguage")
  @js.native
  def getLanguage_none(persistenceType: none): String | Null = js.native
  @JSImport("@uifabric/utilities/lib/language", "getLanguage")
  @js.native
  def getLanguage_sessionStorage(persistenceType: sessionStorage): String | Null = js.native
  
  @JSImport("@uifabric/utilities/lib/language", "setLanguage")
  @js.native
  def setLanguage(language: String): Unit = js.native
  @JSImport("@uifabric/utilities/lib/language", "setLanguage")
  @js.native
  def setLanguage(language: String, avoidPersisting: Boolean): Unit = js.native
  @JSImport("@uifabric/utilities/lib/language", "setLanguage")
  @js.native
  def setLanguage_localStorage(language: String, persistenceType: localStorage): Unit = js.native
  @JSImport("@uifabric/utilities/lib/language", "setLanguage")
  @js.native
  def setLanguage_none(language: String, persistenceType: none): Unit = js.native
  @JSImport("@uifabric/utilities/lib/language", "setLanguage")
  @js.native
  def setLanguage_sessionStorage(language: String, persistenceType: sessionStorage): Unit = js.native
}
