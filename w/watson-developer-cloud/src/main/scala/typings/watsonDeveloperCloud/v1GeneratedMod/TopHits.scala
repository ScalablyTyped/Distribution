package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TopHits. */
trait TopHits extends StObject {
  
  var hits: js.UndefOr[TopHitsResults] = js.undefined
  
  /** Number of top hits returned by the aggregation. */
  var size: js.UndefOr[Double] = js.undefined
}
object TopHits {
  
  @scala.inline
  def apply(): TopHits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHits]
  }
  
  @scala.inline
  implicit class TopHitsMutableBuilder[Self <: TopHits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHits(value: TopHitsResults): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
