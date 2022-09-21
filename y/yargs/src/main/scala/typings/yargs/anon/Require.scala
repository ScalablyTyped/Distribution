package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Require extends StObject {
  
  var require: java.lang.String | `true`
}
object Require {
  
  inline def apply(require: java.lang.String | `true`): Require = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
  
  extension [Self <: Require](x: Self) {
    
    inline def setRequire(value: java.lang.String | `true`): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
  }
}
