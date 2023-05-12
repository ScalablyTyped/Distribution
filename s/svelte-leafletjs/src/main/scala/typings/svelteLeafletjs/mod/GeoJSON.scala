package typings.svelteLeafletjs.mod

import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.GeoJSON__
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.GetGeoJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "GeoJSON")
@js.native
open class GeoJSON protected ()
  extends SvelteComponentTyped[GetGeoJSON, PathEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[GetGeoJSON]) = this()
  
  def getGeoJSON(): GeoJSON__[Any, GeometryObject] = js.native
}
