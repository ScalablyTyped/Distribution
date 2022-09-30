package typings.typeFest.anon

import typings.typeFest.literalUnionMod.LiteralUnion
import typings.typeFest.typeFestStrings.corporation
import typings.typeFest.typeFestStrings.foundation
import typings.typeFest.typeFestStrings.github
import typings.typeFest.typeFestStrings.individual
import typings.typeFest.typeFestStrings.opencollective
import typings.typeFest.typeFestStrings.patreon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUrl extends StObject {
  
  /**
  			The type of funding.
  			*/
  var `type`: js.UndefOr[
    LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
  ] = js.undefined
  
  /**
  			The URL to the funding page.
  			*/
  var url: String
}
object TypeUrl {
  
  inline def apply(url: String): TypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUrl]
  }
  
  extension [Self <: TypeUrl](x: Self) {
    
    inline def setType(
      value: LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
