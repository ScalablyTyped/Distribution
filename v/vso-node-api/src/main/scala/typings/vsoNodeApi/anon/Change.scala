package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var change: scala.Double
  
  var changeset: scala.Double
  
  var date: scala.Double
  
  var latest: scala.Double
  
  var mergeSource: scala.Double
  
  var none: scala.Double
  
  var shelveset: scala.Double
  
  var tip: scala.Double
}
object Change {
  
  @scala.inline
  def apply(
    change: scala.Double,
    changeset: scala.Double,
    date: scala.Double,
    latest: scala.Double,
    mergeSource: scala.Double,
    none: scala.Double,
    shelveset: scala.Double,
    tip: scala.Double
  ): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: scala.Double): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeset(value: scala.Double): Self = StObject.set(x, "changeset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: scala.Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest(value: scala.Double): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeSource(value: scala.Double): Self = StObject.set(x, "mergeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShelveset(value: scala.Double): Self = StObject.set(x, "shelveset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip(value: scala.Double): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
  }
}
