package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.LanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue")
@js.native
class HttpLanguageRangeWithQualityHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue {
  /**
    * Initializes a new instance of the HttpLanguageRangeWithQualityHeaderValue class with language-range information.
    * @param languageRange The value of the language-range information used in the Accept-Language HTTP header.
    */
  def this(languageRange: String) = this()
  /**
    * Initializes a new instance of the HttpLanguageRangeWithQualityHeaderValue class with language-range and quality information.
    * @param languageRange The value of the language-range information used in the Accept-Language HTTP header.
    * @param quality The value of the qvalue or quality factor used in the Accept-Language HTTP header.
    */
  def this(languageRange: String, quality: Double) = this()
}
object HttpLanguageRangeWithQualityHeaderValue {
  
  /**
    * Converts a string to an HttpLanguageRangeWithQualityHeaderValue instance.
    * @param input A string that represents the language-range and quality factor information used in the Accept-Encoding HTTP header.
    * @return An HttpLanguageRangeWithQualityHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpLanguageRangeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): LanguageRangeWithQualityHeaderValue = js.native
}
