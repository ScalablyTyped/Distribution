package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecDataMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse
  extends StObject
     with Format {
  
  var parse: typings.vegaTypings.typesSpecDataMod.Parse
}
object Parse {
  
  inline def apply(parse: typings.vegaTypings.typesSpecDataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    inline def setParse(value: typings.vegaTypings.typesSpecDataMod.Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
