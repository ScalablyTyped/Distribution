package typings.uifabricUtilities

import typings.uifabricUtilities.uifabricUtilitiesStrings.localStorage
import typings.uifabricUtilities.uifabricUtilitiesStrings.none
import typings.uifabricUtilities.uifabricUtilitiesStrings.sessionStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageMod {
  
  @JSImport("@uifabric/utilities/lib/language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLanguage(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String | Null]
  
  @scala.inline
  def getLanguage_localStorage(persistenceType: localStorage): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(persistenceType.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getLanguage_none(persistenceType: none): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(persistenceType.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getLanguage_sessionStorage(persistenceType: sessionStorage): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(persistenceType.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def setLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setLanguage(language: String, avoidPersisting: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], avoidPersisting.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setLanguage_localStorage(language: String, persistenceType: localStorage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], persistenceType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setLanguage_none(language: String, persistenceType: none): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], persistenceType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setLanguage_sessionStorage(language: String, persistenceType: sessionStorage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], persistenceType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
