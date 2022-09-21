package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutation extends StObject {
  
  def mutation(): ActiveBrushes
}
object Mutation {
  
  inline def apply(mutation: () => ActiveBrushes): Mutation = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction0(mutation))
    __obj.asInstanceOf[Mutation]
  }
  
  extension [Self <: Mutation](x: Self) {
    
    inline def setMutation(value: () => ActiveBrushes): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
  }
}
