package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DemandOption extends StObject {
  
  var demandOption: java.lang.String | `true`
}
object DemandOption {
  
  inline def apply(demandOption: java.lang.String | `true`): DemandOption = {
    val __obj = js.Dynamic.literal(demandOption = demandOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemandOption]
  }
  
  extension [Self <: DemandOption](x: Self) {
    
    inline def setDemandOption(value: java.lang.String | `true`): Self = StObject.set(x, "demandOption", value.asInstanceOf[js.Any])
  }
}
