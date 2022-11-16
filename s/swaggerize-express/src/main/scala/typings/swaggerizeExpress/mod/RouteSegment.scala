package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RouteSegment = {[urlSegment: string] : swaggerize-express.swaggerize-express.RouteSegment | express.express.RequestHandler</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary * / any, any, any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query * / any, std.Record<string, any>> | std.Array<express.express.RequestHandler</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary * / any, any, any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query * / any, std.Record<string, any>>>}
}}}
to avoid circular code involving: 
- swaggerize-express.swaggerize-express.RouteSegment
*/
trait RouteSegment
  extends StObject
     with /* urlSegment */ StringDictionary[
      RouteSegment | (RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]) | (js.Array[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ])
    ]
object RouteSegment {
  
  inline def apply(): RouteSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSegment]
  }
}
