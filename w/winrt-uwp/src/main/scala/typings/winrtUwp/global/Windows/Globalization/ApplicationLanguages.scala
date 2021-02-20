package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the language-related preferences that the app can use and maintain. */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
abstract class ApplicationLanguages ()
  extends typings.winrtUwp.Windows.Globalization.ApplicationLanguages
object ApplicationLanguages {
  
  @JSGlobal("Windows.Globalization.ApplicationLanguages")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the ranked list of current runtime language values preferred by the user. */
  /* static member */
  @JSGlobal("Windows.Globalization.ApplicationLanguages.languages")
  @js.native
  def languages: IVectorView[String] = js.native
  @scala.inline
  def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
  
  /** Gets the app's declared list of supported languages. */
  /* static member */
  @JSGlobal("Windows.Globalization.ApplicationLanguages.manifestLanguages")
  @js.native
  def manifestLanguages: IVectorView[String] = js.native
  @scala.inline
  def manifestLanguages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manifestLanguages")(x.asInstanceOf[js.Any])
  
  /** Gets or sets an override for the app's preferred language, expressed as a BCP-47 language tag. This setting is persisted. */
  /* static member */
  @JSGlobal("Windows.Globalization.ApplicationLanguages.primaryLanguageOverride")
  @js.native
  def primaryLanguageOverride: String = js.native
  @scala.inline
  def primaryLanguageOverride_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageOverride")(x.asInstanceOf[js.Any])
}
