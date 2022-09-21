package typings.vegaTypings.anon

import typings.vegaTypings.dataMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse
  extends StObject
     with Format {
  
  var parse: typings.vegaTypings.dataMod.Parse
}
object Parse {
  
  inline def apply(parse: typings.vegaTypings.dataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setParse(value: typings.vegaTypings.dataMod.Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
