package typings.vegaTypings.anon

import typings.vegaTypings.dataMod._Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse
  extends StObject
     with _Format {
  
  var parse: typings.vegaTypings.dataMod.Parse
}
object Parse {
  
  @scala.inline
  def apply(parse: typings.vegaTypings.dataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit class ParseMutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: typings.vegaTypings.dataMod.Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
