package typings.svelteLeafletjs.mod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.Polyline_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.PathOptionslatLngsArrayLaAttribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "Polyline")
@js.native
open class Polyline protected ()
  extends SvelteComponentTyped[PathOptionslatLngsArrayLaAttribution, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[PathOptionslatLngsArrayLaAttribution]) = this()
  
  def getPolyline(): Polyline_[LineString | MultiLineString, Any] = js.native
}
