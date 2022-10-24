package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.CommandChainThen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Then extends StObject {
  
  var `then`: js.UndefOr[CommandChainThen] = js.undefined
}
object Then {
  
  inline def apply(): Then = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Then]
  }
  
  extension [Self <: Then](x: Self) {
    
    inline def setThen(value: CommandChainThen): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
