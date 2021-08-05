package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBehalfOf extends StObject {
  
  var onBehalfOf: scala.Double
  
  var revalidateApproverIdentity: scala.Double
}
object OnBehalfOf {
  
  inline def apply(onBehalfOf: scala.Double, revalidateApproverIdentity: scala.Double): OnBehalfOf = {
    val __obj = js.Dynamic.literal(onBehalfOf = onBehalfOf.asInstanceOf[js.Any], revalidateApproverIdentity = revalidateApproverIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOf]
  }
  
  extension [Self <: OnBehalfOf](x: Self) {
    
    inline def setOnBehalfOf(value: scala.Double): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setRevalidateApproverIdentity(value: scala.Double): Self = StObject.set(x, "revalidateApproverIdentity", value.asInstanceOf[js.Any])
  }
}
