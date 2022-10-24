package typings.yarnpkgParsers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsGlobPattern extends StObject {
  
  def isGlobPattern(arg: String): Boolean
}
object IsGlobPattern {
  
  inline def apply(isGlobPattern: String => Boolean): IsGlobPattern = {
    val __obj = js.Dynamic.literal(isGlobPattern = js.Any.fromFunction1(isGlobPattern))
    __obj.asInstanceOf[IsGlobPattern]
  }
  
  extension [Self <: IsGlobPattern](x: Self) {
    
    inline def setIsGlobPattern(value: String => Boolean): Self = StObject.set(x, "isGlobPattern", js.Any.fromFunction1(value))
  }
}
