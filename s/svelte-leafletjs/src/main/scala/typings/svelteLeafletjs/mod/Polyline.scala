package typings.svelteLeafletjs.mod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.Polyline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SvelteComponentTyped<L.PathOptions & {  latLngs :Array<L.LatLngExpression> | Array<Array<L.LatLngExpression>>,   options :L.PolylineOptions | undefined,   events :PathEventKeys | undefined,   getPolyline :(): L.Polyline | undefined}, PathEvents, never> * / any */ @JSImport("svelte-leafletjs", "Polyline")
@js.native
open class Polyline () extends StObject {
  
  def getPolyline(): Polyline_[LineString | MultiLineString, Any] = js.native
}
