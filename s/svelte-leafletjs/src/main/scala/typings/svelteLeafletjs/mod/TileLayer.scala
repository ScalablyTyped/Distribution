package typings.svelteLeafletjs.mod

import typings.leaflet.mod.TileLayer_
import typings.svelte.mod.SvelteComponentTyped
import typings.svelte.typesRuntimeInternalDevMod.ComponentConstructorOptions
import typings.svelteLeafletjs.anon.GetTileLayer
import typings.svelteLeafletjs.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svelte-leafletjs", "TileLayer")
@js.native
open class TileLayer protected ()
  extends SvelteComponentTyped[GetTileLayer, TileLayerEvents, scala.Nothing] {
  def this(options: ComponentConstructorOptions[Opacity]) = this()
  
  def getTileLayer(): TileLayer_ = js.native
}
