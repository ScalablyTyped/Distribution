package typings.tsconfigPathsWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuer extends StObject {
  
  val issuer: String
}
object Issuer {
  
  inline def apply(issuer: String): Issuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issuer] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
