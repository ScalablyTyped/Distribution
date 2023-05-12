package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.i18n.DetectLanguageReturnResult
import typings.thunderbirdWebextBrowser.messenger.i18n.LanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18n {
  
  @JSGlobal("messenger.i18n")
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectLanguage(text: String): js.Promise[DetectLanguageReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DetectLanguageReturnResult]]
  
  inline def getAcceptLanguages(): js.Promise[js.Array[LanguageCode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptLanguages")().asInstanceOf[js.Promise[js.Array[LanguageCode]]]
  
  inline def getMessage(messageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessage(messageName: String, substitutions: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUILanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUILanguage")().asInstanceOf[String]
}
