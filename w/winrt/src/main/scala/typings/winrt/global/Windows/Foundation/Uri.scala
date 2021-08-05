package typings.winrt.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends StObject
     with typings.winrt.Windows.Foundation.Uri {
  def this(uri: String) = this()
  def this(baseUri: String, relativeUri: String) = this()
  
  /* CompleteClass */
  var absoluteCanonicalUri: String = js.native
  
  /* CompleteClass */
  var absoluteUri: String = js.native
  
  /* CompleteClass */
  override def combineUri(relativeUri: String): typings.winrt.Windows.Foundation.Uri = js.native
  
  /* CompleteClass */
  var displayIri: String = js.native
  
  /* CompleteClass */
  var displayUri: String = js.native
  
  /* CompleteClass */
  var domain: String = js.native
  
  /* CompleteClass */
  override def equals(pUri: typings.winrt.Windows.Foundation.Uri): Boolean = js.native
  
  /* CompleteClass */
  var `extension`: String = js.native
  
  /* CompleteClass */
  var fragment: String = js.native
  
  /* CompleteClass */
  var host: String = js.native
  
  /* CompleteClass */
  var password: String = js.native
  
  /* CompleteClass */
  var path: String = js.native
  
  /* CompleteClass */
  var port: Double = js.native
  
  /* CompleteClass */
  var query: String = js.native
  
  /* CompleteClass */
  var queryParsed: typings.winrt.Windows.Foundation.WwwFormUrlDecoder = js.native
  
  /* CompleteClass */
  var rawUri: String = js.native
  
  /* CompleteClass */
  var schemeName: String = js.native
  
  /* CompleteClass */
  var suspicious: Boolean = js.native
  
  /* CompleteClass */
  var userName: String = js.native
}
/* static members */
object Uri {
  
  @JSGlobal("Windows.Foundation.Uri")
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeComponent(toEscape: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeComponent")(toEscape.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeComponent(toUnescape: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeComponent")(toUnescape.asInstanceOf[js.Any]).asInstanceOf[String]
}
