package typings.webdriver.anon

import typings.got.mod.Response
import typings.node.Buffer
import typings.std.RegExp
import typings.webdriver.webdriverStrings.`object`
import typings.webdriver.webdriverStrings.boolean
import typings.webdriver.webdriverStrings.function
import typings.webdriver.webdriverStrings.number
import typings.webdriver.webdriverStrings.string
import typings.webdriver.webdriverStrings.transformResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchRequired extends StObject {
  
  var default: js.UndefOr[
    js.Function2[
      /* response */ Response[Buffer | String | js.Object], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any, 
      Response[Buffer | String | js.Object]
    ]
  ] = js.undefined
  
  var `match`: js.UndefOr[RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[js.Function1[transformResponse, Unit]] = js.undefined
}
object MatchRequired {
  
  inline def apply(`type`: string | number | `object` | boolean | function): MatchRequired = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRequired]
  }
  
  extension [Self <: MatchRequired](x: Self) {
    
    inline def setDefault(
      value: (/* response */ Response[Buffer | String | js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any) => Response[Buffer | String | js.Object]
    ): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: transformResponse => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
