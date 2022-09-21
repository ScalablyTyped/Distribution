package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Apps.SecretsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofApps extends StObject {
  
  val Secret: TypeofSecret
  
  val SecretCreateParams: TypeofSecretCreateParams
  
  val SecretDeleteWhereParams: TypeofSecretDeleteWherePa
  
  val SecretFindParams: TypeofSecretFindParams
  
  val SecretListParams: TypeofSecretListParams
  
  var SecretsResource: Instantiable0[typings.stripe.mod.Stripe.Apps.SecretsResource]
}
object TypeofApps {
  
  inline def apply(
    Secret: TypeofSecret,
    SecretCreateParams: TypeofSecretCreateParams,
    SecretDeleteWhereParams: TypeofSecretDeleteWherePa,
    SecretFindParams: TypeofSecretFindParams,
    SecretListParams: TypeofSecretListParams,
    SecretsResource: Instantiable0[SecretsResource]
  ): TypeofApps = {
    val __obj = js.Dynamic.literal(Secret = Secret.asInstanceOf[js.Any], SecretCreateParams = SecretCreateParams.asInstanceOf[js.Any], SecretDeleteWhereParams = SecretDeleteWhereParams.asInstanceOf[js.Any], SecretFindParams = SecretFindParams.asInstanceOf[js.Any], SecretListParams = SecretListParams.asInstanceOf[js.Any], SecretsResource = SecretsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofApps]
  }
  
  extension [Self <: TypeofApps](x: Self) {
    
    inline def setSecret(value: TypeofSecret): Self = StObject.set(x, "Secret", value.asInstanceOf[js.Any])
    
    inline def setSecretCreateParams(value: TypeofSecretCreateParams): Self = StObject.set(x, "SecretCreateParams", value.asInstanceOf[js.Any])
    
    inline def setSecretDeleteWhereParams(value: TypeofSecretDeleteWherePa): Self = StObject.set(x, "SecretDeleteWhereParams", value.asInstanceOf[js.Any])
    
    inline def setSecretFindParams(value: TypeofSecretFindParams): Self = StObject.set(x, "SecretFindParams", value.asInstanceOf[js.Any])
    
    inline def setSecretListParams(value: TypeofSecretListParams): Self = StObject.set(x, "SecretListParams", value.asInstanceOf[js.Any])
    
    inline def setSecretsResource(value: Instantiable0[SecretsResource]): Self = StObject.set(x, "SecretsResource", value.asInstanceOf[js.Any])
  }
}
