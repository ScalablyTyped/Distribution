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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Then] (val x: Self) extends AnyVal {
    
    inline def setThen(value: CommandChainThen): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
