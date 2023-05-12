package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcHelpersTimeMod.TimeInputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersParseClaimMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/parse_claim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseClaim(datatype: Any, datavalue: Any, options: Any, claimId: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseClaim")(datatype.asInstanceOf[js.Any], datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], claimId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object parsers {
    
    @JSImport("wikibase-sdk/dist/src/helpers/parse_claim", "parsers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def commonsMedia(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("commonsMedia")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def externalId(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("external-id")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def geoShape(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("geo-shape")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def globeCoordinate(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("globe-coordinate")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def math(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("math")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def monolingualtext(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("monolingualtext")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def musicalNotation(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("musical-notation")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def quantity(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("quantity")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def string(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def tabularData(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tabular-data")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def time(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def url(datavalue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(datavalue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def wikibaseEntityid(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-entityid")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def wikibaseForm(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-form")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def wikibaseItem(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-item")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def wikibaseLexeme(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-lexeme")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def wikibaseProperty(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-property")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def wikibaseSense(datavalue: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wikibase-sense")(datavalue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object timeConverters {
    
    @JSImport("wikibase-sdk/dist/src/helpers/parse_claim", "timeConverters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def epoch(value: TimeInputValue): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    inline def iso(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def none(wikibaseTime: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(wikibaseTime.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def simpleDay(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simple-day")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
