package typings.vegaLite.anon

import typings.vegaLite.boxplotMod.BoxPlot
import typings.vegaTypings.encodeMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Orient extends StObject {
  
  /**
    * Orientation of the box plot. This is normally automatically determined based on types of fields on x and y channels. However, an explicit `orient` be specified when the orientation is ambiguous.
    *
    * __Default value:__ `"vertical"`.
    */
  var orient: js.UndefOr[Orientation] = js.native
  
  /**
    * Type of the mark. For box plots, this should always be `"boxplot"`.
    * [boxplot](https://vega.github.io/vega-lite/docs/boxplot.html)
    */
  var `type`: BoxPlot = js.native
}
object Orient {
  
  @scala.inline
  def apply(`type`: BoxPlot): Orient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orient]
  }
  
  @scala.inline
  implicit class OrientMutableBuilder[Self <: Orient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrient(value: Orientation): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setType(value: BoxPlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
