package typings.wordpressI18n

import typings.std.Record
import typings.wordpressI18n.createI18nMod.I18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/i18n", "__")
  @js.native
  val __ : js.Any = js.native
  
  @JSImport("@wordpress/i18n", "createI18n")
  @js.native
  def createI18n(): I18n = js.native
  @JSImport("@wordpress/i18n", "createI18n")
  @js.native
  def createI18n(initialData: js.UndefOr[scala.Nothing], initialDomain: String): I18n = js.native
  @JSImport("@wordpress/i18n", "createI18n")
  @js.native
  def createI18n(initialData: Record[String, _]): I18n = js.native
  @JSImport("@wordpress/i18n", "createI18n")
  @js.native
  def createI18n(initialData: Record[String, _], initialDomain: String): I18n = js.native
  
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
  
  @JSImport("@wordpress/i18n", "sprintf")
  @js.native
  def sprintf(format: String, args: js.Any*): String = js.native
  
  @JSImport("@wordpress/i18n", "_x")
  @js.native
  val x: js.Any = js.native
}
