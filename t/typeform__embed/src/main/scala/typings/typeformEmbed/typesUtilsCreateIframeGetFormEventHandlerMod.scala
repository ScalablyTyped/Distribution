package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateIframeGetFormEventHandlerMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe/get-form-event-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFormHeightChangedHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHeightChangedHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getFormHeightChangedHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormHeightChangedHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getFormQuestionChangedHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormQuestionChangedHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getFormQuestionChangedHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormQuestionChangedHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getFormReadyHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormReadyHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getFormReadyHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormReadyHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getFormSubmitHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmitHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getFormSubmitHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormSubmitHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getFormThemeHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormThemeHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getFormThemeHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormThemeHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getThankYouScreenButtonClickHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThankYouScreenButtonClickHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getThankYouScreenButtonClickHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThankYouScreenButtonClickHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  inline def getWelcomeScreenHiddenHandler(embedId: String): js.Function1[/* event */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWelcomeScreenHiddenHandler")(embedId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  inline def getWelcomeScreenHiddenHandler(embedId: String, callback: callbackFn): js.Function1[/* event */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWelcomeScreenHiddenHandler")(embedId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Any, Unit]]
  
  type callbackFn = js.Function1[/* ev */ js.UndefOr[Any], Unit]
}
