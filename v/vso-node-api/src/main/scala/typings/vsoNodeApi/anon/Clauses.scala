package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clauses extends StObject {
  
  var all: scala.Double
  
  var clauses: scala.Double
  
  var minimal: scala.Double
  
  var none: scala.Double
  
  var wiql: scala.Double
}
object Clauses {
  
  @scala.inline
  def apply(
    all: scala.Double,
    clauses: scala.Double,
    minimal: scala.Double,
    none: scala.Double,
    wiql: scala.Double
  ): Clauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clauses]
  }
  
  @scala.inline
  implicit class ClausesMutableBuilder[Self <: Clauses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClauses(value: scala.Double): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimal(value: scala.Double): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiql(value: scala.Double): Self = StObject.set(x, "wiql", value.asInstanceOf[js.Any])
  }
}
