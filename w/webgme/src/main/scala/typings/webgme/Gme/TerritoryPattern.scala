package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pattern is a filter for nodes to load/watch.
  * 
  * The root-node (with path '') always exists in a 
  * project so it is the safest starting point. 
  * We specify the number of levels in the containment
  * hierarchy to load.
  * It can be set to any positive integer [0, Inf).
  */
@js.native
trait TerritoryPattern extends StObject {
  
  var children: Double = js.native
}
object TerritoryPattern {
  
  @scala.inline
  def apply(children: Double): TerritoryPattern = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerritoryPattern]
  }
  
  @scala.inline
  implicit class TerritoryPatternMutableBuilder[Self <: TerritoryPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
