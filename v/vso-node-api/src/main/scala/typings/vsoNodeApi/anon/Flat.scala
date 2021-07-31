package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flat extends StObject {
  
  var flat: scala.Double
  
  var oneHop: scala.Double
  
  var tree: scala.Double
}
object Flat {
  
  @scala.inline
  def apply(flat: scala.Double, oneHop: scala.Double, tree: scala.Double): Flat = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], oneHop = oneHop.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat]
  }
  
  @scala.inline
  implicit class FlatMutableBuilder[Self <: Flat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat(value: scala.Double): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneHop(value: scala.Double): Self = StObject.set(x, "oneHop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: scala.Double): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
