package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyndicationAttribute
  extends StObject
     with ISyndicationAttribute
object SyndicationAttribute {
  
  inline def apply(name: String, namespace: String, value: String): SyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationAttribute]
  }
}
