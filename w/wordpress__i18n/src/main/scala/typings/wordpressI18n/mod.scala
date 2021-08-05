package typings.wordpressI18n

import typings.std.Record
import typings.wordpressI18n.createI18nMod.I18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/i18n", "__")
  @js.native
  val __ : js.Any = js.native
  
  inline def createI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")().asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Record[String, js.Any]): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any]).asInstanceOf[I18n]
  inline def createI18n(initialData: Record[String, js.Any], initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  
  @JSImport("@wordpress/i18n", "isRTL")
  @js.native
  val isRTL: js.Any = js.native
  
  @JSImport("@wordpress/i18n", "_n")
  @js.native
  val n: js.Any = js.native
  
  @JSImport("@wordpress/i18n", "_nx")
  @js.native
  val nx: js.Any = js.native
  
  @JSImport("@wordpress/i18n", "setLocaleData")
  @js.native
  val setLocaleData: js.Any = js.native
  
  inline def sprintf(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@wordpress/i18n", "_x")
  @js.native
  val x: js.Any = js.native
}
