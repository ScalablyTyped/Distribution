package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.LanguageRangeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue")
@js.native
class HttpLanguageRangeWithQualityHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue {
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
  
  /** Gets the value of the language-range information from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  /* CompleteClass */
  var languageRange: String = js.native
  
  /** Gets the value of the qvalue or quality factor from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  /* CompleteClass */
  var quality: Double = js.native
}
object HttpLanguageRangeWithQualityHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpLanguageRangeWithQualityHeaderValue instance.
    * @param input A string that represents the language-range and quality factor information used in the Accept-Encoding HTTP header.
    * @return An HttpLanguageRangeWithQualityHeaderValue instance.
    */
  /* static member */
  @scala.inline
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue]
  
  /**
    * Determines whether a string is valid HttpLanguageRangeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @scala.inline
  def tryParse(input: String): LanguageRangeWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[LanguageRangeWithQualityHeaderValue]
}
