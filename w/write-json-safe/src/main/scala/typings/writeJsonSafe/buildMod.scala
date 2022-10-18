package typings.writeJsonSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("write-json-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeJSON(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def writeJSON(
    path: String,
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeJSON(
    path: String,
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any,
    options: Options
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeJSON(path: String, content: Unit, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def writeJSONSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def writeJSONSync(
    path: String,
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeJSONSync(
    path: String,
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any,
    options: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeJSONSync(path: String, content: Unit, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WriteFileOptions * / any */ trait Options extends StObject {
    
    /**
      * Output formatted JSON. Default: `true`
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
}
