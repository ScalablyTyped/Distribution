package typings.stylableJest

import typings.std.Partial
import typings.stylableJest.anon.GetCacheKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMod {
  
  @JSImport("@stylable/jest/dist/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTransformer(): GetCacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[GetCacheKey]
  inline def createTransformer(options: StylableJestConfig): GetCacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(options.asInstanceOf[js.Any]).asInstanceOf[GetCacheKey]
  
  trait StylableJestConfig extends StObject {
    
    var stylable: js.UndefOr[
        Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
        ]
      ] = js.undefined
  }
  object StylableJestConfig {
    
    inline def apply(): StylableJestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylableJestConfig]
    }
    
    extension [Self <: StylableJestConfig](x: Self) {
      
      inline def setStylable(
        value: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableConfig */ Any
            ]
      ): Self = StObject.set(x, "stylable", value.asInstanceOf[js.Any])
      
      inline def setStylableUndefined: Self = StObject.set(x, "stylable", js.undefined)
    }
  }
}
