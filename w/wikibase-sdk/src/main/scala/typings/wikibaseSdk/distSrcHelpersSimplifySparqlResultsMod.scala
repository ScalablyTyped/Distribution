package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlResults
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlValueRaw
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifySparqlResultsMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_sparql_results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifySparqlResults(input: SparqlResults): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySparqlResults")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
  inline def simplifySparqlResults(input: SparqlResults, options: SimplifySparqlResultsOptions): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySparqlResults")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
  
  trait SimplifySparqlResultsOptions extends StObject {
    
    val minimize: js.UndefOr[Boolean] = js.undefined
  }
  object SimplifySparqlResultsOptions {
    
    inline def apply(): SimplifySparqlResultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimplifySparqlResultsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifySparqlResultsOptions] (val x: Self) extends AnyVal {
      
      inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
    }
  }
}
