package typings.vueClassComponent

import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.vueClassComponentBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectMod {
  
  @JSImport("vue-class-component/lib/reflect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyReflectionMetadata(
    to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any,
    from: VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyReflectionMetadata")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reflectionIsSupported(): `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectionIsSupported")().asInstanceOf[`false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ Any)]
}
